package com.jherrera.JavaTest;

import com.jherrera.JavaTest.util.PasswordUtil;
import org.junit.Test;

import static com.jherrera.JavaTest.util.PasswordUtil.SecurityLevel.*;
import static org.junit.Assert.*;

public class PasswordUtilTest {

    @Test
    public void weak_when_has_less_than_8_letters() {
        assertEquals(WEAK, PasswordUtil.assessPassword("1234"));
    }

    @Test
    public void weak_when_has_only_letters() {
        assertEquals(WEAK, PasswordUtil.assessPassword("hello world"));
    }

    @Test
    public void medium_when_has_letters_and_numbers() {
        assertEquals(MEDIUM, PasswordUtil.assessPassword("joshua123"));
    }

    @Test
    public void strong_when_has_letters_numberes_and_symbols() {
        assertEquals(STRONG, PasswordUtil.assessPassword("@joshuaHerrera///"));
    }

}