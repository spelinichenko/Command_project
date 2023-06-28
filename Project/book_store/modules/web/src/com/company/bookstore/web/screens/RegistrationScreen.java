package com.company.bookstore.web.screens;

import com.haulmont.cuba.gui.components.PasswordField;
import com.haulmont.cuba.gui.components.TextField;
import com.haulmont.cuba.gui.screen.Screen;
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