package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String args[]) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try{

            secondChallenge.probablyIWillThrowException(2.0, 1.0);
git
        } catch (Exception e){

            System.out.println("Something went wrong!");

        } finally {

            System.out.println("Cos tam...");

        }
    }
}
