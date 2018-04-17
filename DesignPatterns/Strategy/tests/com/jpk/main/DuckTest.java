package com.jpk.main;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.jpk.flying.NotFlying;

public class DuckTest
{
    private Duck duck, duck1, duck2;

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    private static final String PRINT_OUT_STRING_RESPONSE = "Actually I'm not flying";


    @Before
    public void setUpStreams()
    {
        System.setOut( new PrintStream( outContent ) );
    }

    @Before
    public void setUpObjects()
    {
        duck = new Duck();
        duck1 = new Duck( new NotFlying() );
        duck2 = new DecoyDuck( new NotFlying() );
    }

    @After
    public void cleanUpStreams()
    {
        System.setOut( null );
    }

    @Test
    public void testingCreationOfNewObjectDuck_ShouldBeNotNull()
    {
        assertNotNull( duck );
    }

    @Test
    public void testingCreationOfNewObjectDuckWithFlyingBehavior_ShouldBeNotNull()
    {
        assertNotNull( duck1 );
    }

    @Test
    public void testingFlyingMethodInFlyingBehaviorShouldRetireAcidlyImNotFlying()
    {
        duck1.doFlying();
        assertEquals(PRINT_OUT_STRING_RESPONSE, outContent.toString() );
    }

    @Test
    public void testingCreationOfDecoyDuckWithFlyingBehavior_shouldReturnRetireAcidlyImNotFlying()
    {
        duck2.doFlying();
        assertEquals(PRINT_OUT_STRING_RESPONSE, outContent.toString() );
    }
}
