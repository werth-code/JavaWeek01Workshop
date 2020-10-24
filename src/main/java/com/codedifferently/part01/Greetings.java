// package com.codedifferently.part01;

// public class Greetings {
//     public static void main(String[] args) {

//         System.out.println("What's your name?  ");
//         String name = System.console().readLine();

//         if(name.equalsIgnoreCase("hakim") || name.equalsIgnoreCase("Rasheeda")) {
//             System.out.println("Hi " + name);
//         }
//     } 
// }

package com.codedifferently.part01;

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        System.out.println("What's Your Name  ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        if(name.equalsIgnoreCase("hakim") || name.equalsIgnoreCase("Rasheeda")) {
            System.out.println("Hi " + name);
        }
    }

}