package com.stackroute.pexercise;

import org.junit.*;

import static org.junit.Assert.*;

public class CheckPalindromeTest {
    CheckPalindrome pal;
    @Before
    public void setUp(){
        System.out.println("Inside before");
        pal= new CheckPalindrome();
    }
    @After
    public void tearDown(){
        System.out.println("After");
        pal=null;

    }
    @BeforeClass
    public static void setUpBeforeClass(){
        System.out.println("Before class");

    }
    @AfterClass
    public static void tearDownBeforeClass(){
        System.out.println("After class");


    }
    @Test
    public void givenPalindromeNumberShouldReturnCorrectMessage(){
        //arange

        //Act
        String result= pal.palindrome("apa");

        //Assert
        assertEquals("Palindrome",result);
    }
    @Test
    public void givenNullShouldReturnErrorMessage(){
        //arange

        //Act
        String result= pal.palindrome(null );

        //Assert
        assertEquals("null",result);
    }
    @Test
    public void givenNonPalindromeNumberShouldReturnErrorMessage(){
        //arange

        //Act
        String result= pal.palindrome("arpita" );

        //Assert
        assertEquals("Not Palindrome",result);
    }

    @Test
    public void givenNumberShouldReturnCorrectMessage(){
        //arange

        //Act
        String result= pal.palindrome("1234321" );

        //Assert
        assertEquals("Palindrome",result);
    }

}