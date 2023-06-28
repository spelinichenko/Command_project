package com.company.bookstore.web.screens;

import com.company.bookstore.service.RegistrationService;
import com.haulmont.cuba.core.global.Messages;
import com.haulmont.cuba.core.global.validation.MethodParametersValidationException;
import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.components.PasswordField;
import com.haulmont.cuba.gui.components.TextField;
import com.haulmont.cuba.gui.screen.Screen;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;

import javax.inject.Inject;

@UiController("bookstore_RegistrationScreen")
@UiDescriptor("registration-screen.xml")
public class RegistrationScreen extends Screen {

    @Inject
    private TextField<String> loginField;
    @Inject
    private PasswordField passwordField;

    @Inject
    private RegistrationService registrationService;
    @Inject
    private Notifications notifications;
    @Inject
    private Messages messages;

    @Subscribe("okBtn")
    public void onOkBtnClick(Button.ClickEvent event) {
        try {
            registrationService.userRegistration(getLogin(), getPassword());

            notifications.create(Notifications.NotificationType.TRAY)
                    .withCaption("Created user " + getLogin())
                    .show();

            close(WINDOW_COMMIT_AND_CLOSE_ACTION);
        } catch (MethodParametersValidationException e) {
            notifications.create(Notifications.NotificationType.TRAY)
                    .withCaption(
                            messages.getMessage(
                                    "com.company.sample.validation",
                                    "UserExistsValidator.message"))
                    .show();
        }
    }

    @Subscribe("cancelBtn")
    public void onCancelBtnClick(Button.ClickEvent event) {
        close(WINDOW_CLOSE_ACTION);
    }
    
    /**
     * @return entered login
     */
    public String getLogin() {
        return loginField.getValue();
    }

    /**
     * @return entered password
     */
    public String getPassword() {
        return passwordField.getValue();
    }
}