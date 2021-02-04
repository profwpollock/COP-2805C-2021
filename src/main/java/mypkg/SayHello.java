// Git collaborative COP-2805C (Java II) project.
// $Id$

package mypkg;

/** Class used for COP-2805C git and GitHub project.
*/
public class SayHello
{
    /** Displays greetings for all students.
      * When done, displays a count of students who edited this file.
      * @param args - Unused
      */
    public static void main ( String [] args )
    {
        int counter = 0;


        System.out.println( "Howdy!  My name is Wayne Pollock." );
        counter++;

        // (1) Add your own output below these comments that includes your name.
        // (2) Place "counter++;" command after your contribution, to keep count.
        // (3) Keep the existing println statement at the very end.

        System.out.println("Hey! My name is Waylan Corey,");
        counter++;
        
        System.out.println("Greetings and Salutations! My name is Stan Smoczyk");
        counter++;

        System.out.println("\nHi! This is Phillip Govinda.");
        System.out.println("I like programming and maths jokes.\n");
        counter++;

        System.out.println("Hey everybody! My name is Matthew Maynard.");
        counter++;

        System.out.println("\nHola! My name is Yadimar Torres.");
        System.out.println("I love to do crafts and watching shows.\n");
        counter++;

        System.out.println("\nHello, everyone! My name is Brianna MacKenzie.");
        System.out.println("GitHub and IntelliJ do NOT like to play nicely, but persistence pays off in the end.");
        System.out.println("Stubborn is a good quality... right?\n");
        counter++;

        System.out.println("Hello everyone, it's Matt Cannon coming at you from IntelliJ");
        counter++;
        
        System.out.println( "Number of students who edited this file: "
            + counter );
    }
}
