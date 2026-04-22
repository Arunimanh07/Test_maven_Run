package com.example;

import com.example.service.TextService;
import com.example.model.User;

public class App {
    public static void main(String[] args) {
        TextService service = new TextService();

        User user1 = new User("alice", "developer");
        User user2 = new User("BOB", "tester");

        System.out.println(service.formatUser(user1));
        System.out.println(service.formatUser(user2));
    }
}
