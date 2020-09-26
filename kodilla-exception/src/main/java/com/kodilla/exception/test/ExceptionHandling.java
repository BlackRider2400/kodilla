package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();
        try{
            System.out.println(secondChallenge.probablyIWillThrowException(1, 1.25));
        }catch (Exception e){
            System.out.println("Error while printing. Error: " + e);
        } finally {
            System.out.println("End");
        }
    }
}
