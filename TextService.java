package com.example.service;

import com.example.model.User;
import org.apache.commons.lang3.StringUtils;

public class TextService {

    public String formatUser(User user) {
        String name = StringUtils.capitalize(user.getName().toLowerCase());
        String role = StringUtils.upperCase(user.getRole());

        return "User: " + name + " | Role: " + role;
    }
}
