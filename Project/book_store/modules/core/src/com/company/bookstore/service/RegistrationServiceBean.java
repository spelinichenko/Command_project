package com.company.bookstore.service;

import com.company.bookstore.entity.User;
import com.haulmont.cuba.core.global.*;
import com.haulmont.cuba.security.entity.Role;
import com.haulmont.cuba.security.entity.UserRole;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

@Service(RegistrationService.NAME)
public class RegistrationServiceBean implements RegistrationService {

    private static final String DEFAULT_ROLE_ID = "3ec31528-dc0e-c341-7727-7b46771ae9ff";

    @Inject
    private DataManager dataManager;

    @Inject
    private Metadata metadata;

    @Inject
    private PasswordEncryption passwordEncryption;

    @Override
    public RegistrationResult userRegistration(String login, String password) {
        Role customerRole = dataManager.load(LoadContext.create(Role.class).setId(DEFAULT_ROLE_ID));

        com.company.bookstore.entity.User user = metadata.create(User.class);
        user.setLogin(login);
        user.setPassword(password);
        user.setBalance(0.0);

        UserRole userRole = metadata.create(UserRole.class);
        userRole.setUser(user);
        userRole.setRole(customerRole);

        dataManager.commit(new CommitContext(user, userRole));

        return new RegistrationResult(user);
    }
}