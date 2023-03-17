/*
12) Write a Java program and create user-defined exception on voting center
voter age is greater than 18.
*/

import java.util.Scanner;
class InvalidAgeException extends Exception {
public InvalidAgeException(String message) {
super(message);
}
}
class VotingCenter {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter voter's age: ");
int age = input.nextInt();
try {
if (age < 18) {
throw new InvalidAgeException("Invalid age. Voter must be at least 18 years old.");
}
else {
System.out.println("Valid age. Voter is eligible to vote.");
}
}
catch (InvalidAgeException ex) {
System.out.println("Error: " + ex.getMessage());
}
}
}
