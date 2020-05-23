package eld.springframework.sfddi.controllers;

import eld.springframework.sfddi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectedContlrollerTest {

    PropertyInjectedContlroller controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedContlroller();

        controller.greetingService = new GreetingServiceImpl();
    }

    @Test
    void getGreeting() {

        System.out.println(controller.getGreeting());

    }
}