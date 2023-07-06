package com.company.bookstore.web.screens;

import com.company.bookstore.service.RegistrationService;
import com.haulmont.cuba.core.global.*;
import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.screen.*;
import com.haulmont.cuba.security.entity.User;
import com.haulmont.cuba.security.entity.UserRole;
import com.haulmont.cuba.web.app.login.LoginScreen;
import com.haulmont.cuba.web.gui.screen.ScreenDependencyUtils;
import org.slf4j.Logger;

import javax.inject.Inject;
import java.util.List;
import java.util.Objects;
import java.util.UUID;


@UiController("loginScreen")
@UiDescriptor("ext-login-screen.xml")
public class ExtLoginScreen extends LoginScreen {

    @Inject
    private Button loginButton;
    @Inject
    private Logger log;
    @Inject
    private DataManager dataManager;
    @Inject
    private Metadata metadata;
    @Inject
    private RegistrationService registrationService;
    @Inject
    private Security security;
    /*@Subscribe
    public void onAfterInit(AfterInitEvent event) {
        log.info("Событие после инициализации");
        registrationService.addGuestRoleToAnonymous();
    }*/
    @Subscribe
    public void onInit1(InitEvent event) {
        log.info("Событие после инициализации");
        registrationService.addGuestRoleToAnonymous();
    }


    @Subscribe("registerBtn")
    public void onRegisterBtnClick(Button.ClickEvent event) {

        log.info("Окно не создано");
        log.info(security.isScreenPermitted("registration-screen.xml") ? "Окно разрешено" : "Окно не разрешено");
        // Create "Register" screen with dialog mode
        RegistrationScreen registrationScreen = screens.create(RegistrationScreen.class, OpenMode.DIALOG);
        log.info("Окно создано");

        // Add a listener to be notified when the "Register" screen is closed with COMMIT_ACTION_ID
        registrationScreen.addAfterCloseListener(afterCloseEvent -> {
            CloseAction closeAction = afterCloseEvent.getCloseAction();
            if (closeAction == WINDOW_COMMIT_AND_CLOSE_ACTION) {
                // Set the new registered user credentials to login and password fields
                loginField.setValue(registrationScreen.getLogin());
                passwordField.setValue(registrationScreen.getPassword());
                // Set focus on "Submit" button
                loginButton.focus();
            }
        });

        // Show "Register" screen
        registrationScreen.show();
    }

    
}