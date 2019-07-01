package com.stackroute.pexercise;

import org.junit.*;

import static org.junit.Assert.*;

public class MemberVariablesTest {

    MemberVariables m;

    @Before
    public void setUp(){
        System.out.println("Inside before");
        m= new MemberVariables();
    }
    @After
    public void tearDown(){
        System.out.println("After");
        m =null;

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
        String result= m.Display();

        //Assert
        assertEquals("Name:Harry Potter\nAge:30\nSalary:2500.3",result);
    }

}