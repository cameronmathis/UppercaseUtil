package com.uppercase.util;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UpperCaseUtilTest {

    // Success Paths

    @Test
    public void transform_test001() {
        String expected = "TEST";

        String actual = UppercaseUtil.transform("test");

        assertEquals(expected, actual);
    }

    @Test
    public void transform_test002() {
        String expected = "TEST1";

        String actual = UppercaseUtil.transform("test1");

        assertEquals(expected, actual);
    }

    @Test
    public void transform_test003() {
        String expected = "1";

        String actual = UppercaseUtil.transform("1");

        assertEquals(expected, actual);
    }

    @Test
    public void transform_test004() {
        String expected = null;

        String actual = UppercaseUtil.transform(null);

        assertEquals(expected, actual);
    }
}
