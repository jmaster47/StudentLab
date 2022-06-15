/*
* Name: Jadon Oliver
* Program Name: Student Lab
* Date: 6/13/21
* Extra Thing: allows for user input everywhere
*/
import java.io.Console;
import java.text.*; //imports text
import java.util.Scanner; //imports scanner
import java.util.Random;
import java.time.LocalDate;
import java.io.*;  //all imports
import java.util.Arrays;
import java.awt.*;
import javax.swing.*;
import java.lang.Math;
import java.util.*;

class Main {
  public static void main(String[] args) {

    Scanner reply = new Scanner(System.in); //scanner

    int quiz = 0;

    System.out.println("Please enter your name: ");
    String name = reply.nextLine();

    Student myStudent = new Student(name);

    

    //adds the quizes
    System.out.println("Please enter quiz grade");
    quiz = reply.nextInt(); 
    myStudent.addQuiz(quiz);
    
    System.out.println("Please enter quiz grade");
    quiz = reply.nextInt(); 
    myStudent.addQuiz(quiz);

    System.out.println("Please enter quiz grade");
    quiz = reply.nextInt(); 
    myStudent.addQuiz(quiz);

    System.out.println("Please enter quiz grade");
    quiz = reply.nextInt(); 
    myStudent.addQuiz(quiz);

    int t = myStudent.getTotalScore();
    double a = myStudent.getAverageScore();

    //output
    System.out.println("The total score is " + t + "\nThe average score is " + a);
  }
}