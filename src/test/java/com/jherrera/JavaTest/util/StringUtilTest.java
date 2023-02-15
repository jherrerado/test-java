package com.jherrera.JavaTest.util;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtilTest {
    @Test
    public void any_string_is_not_empty() {
        assertEquals(false, StringUtil.isEmpty("[a-zA-Z' '1-9]+"));
    }

    @Test
    public void text_without_string_is_an_empty_string() {
        assertTrue(StringUtil.isEmpty(""));
    }

    @Test
    public void null_is_an_empty_string() {
        assertTrue(StringUtil.isEmpty(null));
    }

}