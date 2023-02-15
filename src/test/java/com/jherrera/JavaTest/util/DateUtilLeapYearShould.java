package com.jherrera.JavaTest.util;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class DateUtilLeapYearShould {
    @Test
    public void return_true_when_year_is_divisible_by_400() {
        assertThat(DateUtil.isLoapYears(1600), is(true));
        assertThat(DateUtil.isLoapYears(2000), is(true));
        assertThat(DateUtil.isLoapYears(2400), is(true));
    }

    @Test
    public void return_true_when_year_is_divisible_by_4_but_not_by_100() {
        assertThat(DateUtil.isLoapYears(1996), is(true));
        assertThat(DateUtil.isLoapYears(2004), is(true));
        assertThat(DateUtil.isLoapYears(2008), is(true));
    }

    @Test
    public void return_false_when_year_is_divisible_by_100_but_not_by_400() {
        assertThat(DateUtil.isLoapYears(1700), is(false));
        assertThat(DateUtil.isLoapYears(1800), is(false));
        assertThat(DateUtil.isLoapYears(1900), is(false));
    }

    @Test
    public void return_false_when_year_is_not_divisible_by_4() {
        assertThat(DateUtil.isLoapYears(2017), is(false));
        assertThat(DateUtil.isLoapYears(2019), is(false));
        assertThat(DateUtil.isLoapYears(2018), is(false));
    }


}