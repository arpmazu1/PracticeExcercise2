package com.stackroute.pexercise;

import org.junit.*;

import static org.junit.Assert.*;

public class EvenNumberTest {
    @Before
    public void setUp(){
        System.out.println("Inside before");

    }
    @After
    public void tearDown(){
        System.out.println("After");


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
    public void givenEvenNumberShouldReturnTrueMessage(){
        //Assert
        assertEquals(true,EvenNumber.isEven(4));
    }

    @Test
    public void givenOddNumberShouldReturnFalseMessage(){
        //Assert
        assertEquals(false,EvenNumber.isEven(5));
    }

    @Test
    public void givenZer0ShouldReturnTrueMessage(){
        //Assert
        assertEquals(true,EvenNumber.isEven(0));
    }

    @Test
    public void givenOneShouldReturnFalseMessage(){
        //Assert
        assertEquals(false,EvenNumber.isEven(1));
    }

}