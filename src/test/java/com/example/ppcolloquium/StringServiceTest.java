package com.example.ppcolloquium;

import org.junit.Assert;

import org.junit.jupiter.api.Test;

class StringServiceTest {

    StringService stringService = new StringService();
    @Test
    void stringConcatenation() {
       String result = stringService.stringConcatenation("hello, ","Anton");
        Assert.assertEquals("hello, Anton", result);
    }

    @Test
    void stringRepater() {
        String result = stringService.stringRepater("hello",2);
        Assert.assertEquals("hellohello",result);
    }
}