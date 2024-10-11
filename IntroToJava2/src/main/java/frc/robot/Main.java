// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

//Imports the Java Scanner
import java.util.Scanner;
import edu.wpi.first.wpilibj.RobotBase;

/**
 * Do NOT add any static variables to this class, or any initialization at all. Unless you know what
 * you are doing, do not modify this file except to change the parameter class to the startRobot
 * call.
 */
public final class Main {
  private Main() {}

  /**
   * Main initialization function. Do not perform any initialization here.
   *
   * <p>If you change your main robot class, change the parameter type.
   */
  public static void main(String... args) {
    //RobotBase.startRobot(Robot::new);

    /*This is every thing we did in workshop 2
     *Conditions = > < >= <= == !
     *Conditional operators if else else if
     *Arrays int array[] = {1, 2, 8, 10} String[] array = new String[2]
     *For loops and while loops while(condition) for(int i = 0; i < 8; i++)
     *Switch case switch(i)
     *              case 1:
     *                code
     *                break;
     *              case 2:
     *                code
     *              case 3:
     *                code
     *                break;
     * Comment code with // or /* */
     
    //This is how you comment 1 line of code

    /* This 
     * is
     * how
     * you
     * do
     * multiple
     * lines
     */


    //Creates a scanner object
    Scanner myScanner = new Scanner(System.in);

    //Varible for while loop to end
    String answer = "yes";

    //Example of while loop
    while(answer.equals("yes")){

      //The function to make the madlib
      madlibGenerator(myScanner);

      //Asks the user if they want to redo the program
      System.out.println(" Do you want to restart the program? yes or no");

      //gets the user input to see if they want to exit or not
      answer = myScanner.nextLine();
      
      //If "yes" then restart the program else end the program
      if (answer.equals("yes")){
        System.out.println("Restarting");
      }
      else{
        System.out.println("Ending");
      }
    }
  }

  //Example of a function
  public static void madlibGenerator(Scanner myScanner){
    //An array of strings
    String words[] = new String[5];
    //A for loop to get 5 responses from the user
    for (int i = 0; i < 5; i++){
     //Switch case to help organize how we get user input
     switch(i){
       case 0: //adjectives (case 0 will also have what case 2 has because there is no break)
       case 2:
         System.out.println("Give me an adjective");
         break;
       case 1: //Give me a name
         System.out.println("Give me a name");
         break;
       case 3: //nouns
       case 4:
         System.out.println("Give me a noun");
         break;
     }

    //Stores the inputs into an array
     words[i] = myScanner.nextLine();
   }
    //Outputting the Madlib
    System.out.print("some part of the MadLib that my ");
    System.out.print(words[0]); //print the adjective
    System.out.print(" mentor ");
    System.out.print(words[1]); //name of my mentor
    System.out.print(" wanted me to add ");
    System.out.print(words[2]); //print another adjective
    System.out.print(" to my ");
    System.out.print(words[3]); //print the noun
    System.out.print(" to my ");
    System.out.print(words[4]); //print the noun

  }
}
