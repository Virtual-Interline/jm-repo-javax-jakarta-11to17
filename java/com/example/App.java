package com.example;

import javax.ws.rs.GET;

public class App {
    public static void main(String[] args) {
        System.out.println(message());
    }

    public static String message() {
        return "javax sample";
    }
}
