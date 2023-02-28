/*
Name: Nathaniel Balauro
Class: CS&145
Assingment: Lab 5: Towers of Hanoi
Purpose: This program is to create and solve the Towers of Hanoi puzzle by
         using and implementing recursion.
*/           

public class TowersOfHanoiNB {

   static void towersOfHanoi(int i, char fromRod, char toRod, char helpRod) {
        
      if (i == 1) {
         System.out.println("Move disk 1 from rod " +  fromRod + " to rod " + toRod);
      return;
      }
      
      towersOfHanoi(i-1, fromRod, helpRod, toRod);
      
      System.out.println("Move disk " + i + " from rod " +  fromRod + " to rod " + toRod);
      
      towersOfHanoi(i-1, helpRod, toRod, fromRod);
   
   } // end of towersOfHanoi Method


   public static void main(String args[])
   {
      int i = 5; 
      towersOfHanoi(i, 'A', 'C', 'B');
      
   } // end of main

} // end of TowersOfHanoiNB class