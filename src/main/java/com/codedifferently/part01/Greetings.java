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
    // public static void main(String[] args) {
    //     System.out.println("What's Your Name  ");
    //     Scanner scanner = new Scanner(System.in);
    //     String name = scanner.next();

    //     if(name.equalsIgnoreCase("hakim") || name.equalsIgnoreCase("Rasheeda")) {
    //         System.out.println("Hi " + name);
    //     }
    // }

    public static void main(String[] args) {
        Menu foodMenu = new Menu(new String[] {"coke", "pepsi", "sprite"});
        Menu carWashMenu = new Menu(new String[] {"wax", "wash"});
        String cat = foodMenu.getCategory(2);
        String cat1 = carWashMenu.getCategory(0);
        System.out.println(cat);
        System.out.println(cat1);
    }

}