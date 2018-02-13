package com.jpk.main;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SimpleEnumTest {

    private static final int HIGH_LVL = 3;
    private static final int MEDIUM_LVL = 2;
    private static final int LOW_LVL = 1;
    private SimpleEnum seh;

    @Before
    public void setUp() {
        seh = SimpleEnum.HIGH;
    }

    @Test
    public void InvokingEnumClassHighValue_ShouldReturnEnumInstance() {
        assertTrue(seh instanceof Enum);
    }

    @Test
    public void InvokongEnumLevelHIGH_shouldReturnLvlCode1() {
        seh = SimpleEnum.HIGH;
        assertEquals(HIGH_LVL, seh.getLevelCode());
        seh = SimpleEnum.MEDIUM;
        assertEquals(MEDIUM_LVL, seh.getLevelCode());
        seh = SimpleEnum.LOW;
        assertEquals(LOW_LVL, seh.getLevelCode());
    }
}