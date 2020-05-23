package eld.springframework.sfddi.controllers;

import eld.springframework.sfddi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedContlrollerTest {

    PropertyInjectedContlroller controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedContlroller();

        controller.greetingService = new ConstructorGreetingService();
    }

    @Test
    void getGreeting() {

        System.out.println(controller.getGreeting());

    }
}