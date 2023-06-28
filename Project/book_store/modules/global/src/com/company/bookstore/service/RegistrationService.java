package com.company.bookstore.service;

import com.haulmont.cuba.security.entity.User;
import org.springframework.http.converter.json.GsonBuilderUtils;

import java.io.Serializable;
import java.util.UUID;

public interface RegistrationService {
    String NAME = "bookstore_RegistrationService";

    RegistrationResult userRegistration(String login, String password);

    public static class RegistrationResult implements Serializable {

        private UUID userId;

        public RegistrationResult(User user) {
            if (user != null) {
                this.userId = user.getId();
            }
        }

        public UUID getUserId() {
            return userId;
        }
    }
}