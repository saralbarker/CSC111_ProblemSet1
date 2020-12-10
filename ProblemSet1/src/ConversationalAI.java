/*
 * @file ConversationalAI.java
 * @brief Using JavaScript Scanner object to have conversation with user.
 * @author Sara Barker
 * @date 9/4/2018
 */

import java.util.Scanner;

public class ConversationalAI {

    public static void main(String [] args) {
          Scanner keyboard = new Scanner(System.in);
//        String name;
//        System.out.println ("What is your name?");
//        name = keyboard.next ();
//
//        System.out.println ("Hello " + name + "!" + " Nice to meet you. What are you planning on studying here at Wake?");
//
//        keyboard.nextLine ();
//
//        String subject;
//        subject = keyboard.nextLine ();
//
//        System.out.println ("Wow! " + subject + " " + "seems like a very interesting field of study, good luck at \"Work\" Forest!");
//
//        String res;
//        System.out.println ("Which hall do you live in on campus?");
//        res = keyboard.next ();
//        System.out.println ("Make sure to keep you dorm room in " + res + " nice and tidy!");
//        keyboard.nextLine ();
//
//        String club;
//        System.out.println ("Which club are you planning on joining at Wake?");
//        club = keyboard.next ();
//        System.out.println ("Yay, that's great!" + " The " + club + " club sounds like a great fit. You should consider creating your own club as well! Wake encourages students, just like you, to advocate and take on leadership roles in our community!");
//        keyboard.nextLine ();
//
//        System.out.println("Good bye, " + name + "!");

        //seperate labs listed above and below...

        System.out.println("We are expecting a hurricane in North Carolina? Answer in either true/false.");
        keyboard.nextLine();

        if (true) {
            System.out.println("Stay safe!");
        }

        else {
            System.out.println("Lucky you!");
        }
    }
}
