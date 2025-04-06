package com.devopscourse.first_demo_project;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppTest {
    @Test
    public void testGreet() {
        App app = new App();
        String result = app.greet("Alice");
        assertEquals("Hello, Alice!", result);
    }
}