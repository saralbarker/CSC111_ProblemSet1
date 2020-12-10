/*
 * @file HomepageGenerator.java
 * @brief Using JavaScript to prompt user for information and generate HTML code.
 * @author Sara Barker
 * @date 9/4/2018
 */

import java.util.Scanner;

public class HomepageGenerator {
    public static void main(String[] args) {
        String name;
        String bio;
        String year;
        String hobby_one;
        String hobby_two;
        String hobby_three;
        Scanner frodo = new Scanner(System.in);

        System.out.println("Please enter full name.");
        name = frodo.nextLine();

        System.out.println("Please tell us a little bit about yourself and your involvement at WFU.");
        bio = frodo.nextLine();

        System.out.println("What year will you be graduating?");
        year = frodo.nextLine();

        System.out.println("Please list your first hobby of choice.");
        hobby_one = frodo.nextLine();

        System.out.println("Please list your second hobby of choice.");
        hobby_two = frodo.nextLine();

        System.out.println("Please list your third hobby of choice. After, press \"Enter\" twice to generate your HTML code!");
        hobby_three = frodo.nextLine();

       frodo.nextLine ();

        System.out.println("<html>");
        System.out.println("<body>");
        System.out.println("<h1>" + name + "</h1>");
        System.out.println("<h2>" + bio + "</h2>");
        System.out.println("<h2>" + "Year of Graduation: " + year + "</h2>");

        System.out.println("<h1>" + "Selected Hobbies: " + "</h1>");
        System.out.println("<li>" + hobby_one + "</li>");
        System.out.println("<li>" + hobby_two + "</li>");
        System.out.println("<li>" + hobby_three + "</li>");

        System.out.println("</body>");
        System.out.println("</html>");
    }
}
