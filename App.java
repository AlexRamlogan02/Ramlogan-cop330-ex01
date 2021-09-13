package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Alexandra Ramlogan
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scan  = new Scanner(System.in);
        String input;
        String greeting;
        System.out.print( "Hello! What's your name? : ");
        input = scan.next();
        greeting = "Nice to meet you " +input +"! You seem really cool!";
        System.out.print(greeting);
    }
}
