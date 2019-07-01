package com.stackroute.pexercise;

import org.junit.*;

import static org.junit.Assert.*;


public class CheckPowerTest {
    CheckPower ch;

    @Before
    public void setUp(){
        System.out.println("Inside before");
        ch= new CheckPower();
    }
    @After
    public void tearDown(){
        System.out.println("After");
        ch=null;

    }
    @BeforeClass
    public static void setUpBeforeClass(){
        System.out.println("Before class");

    }
    @AfterClass
    public static void tearDownBeforeClass() {
        System.out.println("After class");
    }
    @Test
    public void givenZeroShouldReturnErrorMessage(){
            //arange

            //Act
            String result= ch.Check(0);

            //Assert
            assertEquals("Zero",result);
        }

    @Test
    public void givenNumberShouldReturnMessage(){
        //arange

        //Act
        String result= ch.Check(64);

        //Assert
        assertEquals("The number is a power of 4",result);
    }

    @Test
    public void givenNotAPowerNumberShouldReturnMessage(){
        //arange

        //Act
        String result= ch.Check(106);

        //Assert
        assertEquals("The number is not a power of 4",result);
    }

    @Test
    public void givenAPowerNumberShouldReturnMessage(){
        //arange

        //Act
        String result= ch.Check(1);

        //Assert
        assertEquals("The number is a power of 4",result);
    }


}