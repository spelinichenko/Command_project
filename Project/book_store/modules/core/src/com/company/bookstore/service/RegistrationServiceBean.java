package com.company.bookstore.service;

import com.company.bookstore.core.role.CustomerRole;
import com.company.bookstore.entity.User;
import com.haulmont.cuba.core.global.*;
import com.haulmont.cuba.security.entity.Group;
import com.haulmont.cuba.security.entity.UserRole;
import org.slf4j.Logger;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.time.LocalDate;
import java.util.UUID;

@Service(RegistrationService.NAME)
public class RegistrationServiceBean implements RegistrationService {

    private static final String COMPANY_GROUP_ID = "0fa2b1a5-1d68-4d69-9fbd-dff348347f93";
    private static final String ANONYMOUS_UUID = "a405db59-e674-4f63-8afe-269dda788fe8";

    @Inject
    private DataManager dataManager;

    @Inject
    private Metadata metadata;

    @Inject
    private Logger log;

    @Inject
    private PasswordEncryption passwordEncryption;

    @Override
    public RegistrationResult userRegistration(String login, String password,
                                               String lastName, String firstName, String middleName,
                                               LocalDate dateOfBirth) {

        Group group = dataManager.load(LoadContext.create(Group.class).setId(UUID.fromString(COMPANY_GROUP_ID)));
        log.info("Начало регистрации");
        User user = metadata.create(User.class);
        user.setLogin(login);
        user.setPassword(passwordEncryption.getPasswordHash(user.getId(), password));
        user.setBalance(0.0);
        user.setLastName(lastName);
        user.setFirstName(firstName);
        user.setMiddleName(middleName);
        user.setDayOfBirth(dateOfBirth);
        user.setGroup(group);

        log.info("Предконец регистрации");
        dataManager.commit(new CommitContext(user));

        log.info("Конец регистрации");
        return new RegistrationResult(user);
    }

    @Override
    public void addGuestRoleToAnonymous() {
        log.info("Начало инициализации");
        com.haulmont.cuba.security.entity.User anonymous = dataManager.load(LoadContext.create(com.haulmont.cuba.security.entity.User.class).setId(UUID.fromString(ANONYMOUS_UUID)));
        log.info("Получение пользователя");
        assert anonymous != null;
        log.info("Пользователь получен: " + anonymous.getName());
        UserRole userRole = metadata.create(UserRole.class);
        log.info("Создание UserRole");
        log.info("Получение ролей пользователя");
        Long count = dataManager.loadValue("select count(s) from sec$UserRole s where " +
                "s.user = :userId and s.roleName = :roleName", Long.class)
                .parameter("userId", anonymous)
                .parameter("roleName", "Guest")
                .one();
        if (count == 1) {
            log.info("Роль существует");
            return;
        }
        log.info("Роль не существует");
        userRole.setUser(anonymous);
        userRole.setRoleName("Guest");
        dataManager.commit(new CommitContext(userRole));
    }
}