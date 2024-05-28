// import java.util.Scanner

import java.util.Scanner;

public class uinput{

    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        System.out.println("Enter your numbrt");
        int number = a.nextInt();

        int i = a.nextInt();

        System.out.println("Table of "+number);

        for(int i = 1; i<=10; i++){
            System.out.println(number*i);
        }

        

        // System.out.println("Enter your phone: ");
        // double phone = a.nextFloat();
        // System.out.println("Your phone is " + phone);

        // System.out.println("Enter your age: ");
        // byte age = a.nextByte();
        // System.out.println("Your age is " + age);


        // System.out.println("Do you have a laptop: ");
        // boolean laptop = a.nextBoolean();

        // if (laptop){
        //     System.out.println("You have laptop: ");
        // }
        // else{
        //     System.out.println("You don't have laptop: ");
        // }

        // java.util.Scanner a = new java.util.Scanner(System.in);
        // System.out.println("Enter your name: ");
        // String name = a.nextLine();
        // System.out.println("Your name is " + name);

        // System.out.println("Enter your Password: ");
        // String password = a.nextLine();
        // System.out.println("Your Password is " + password);

        // if (name.equals("Mukesh") && password.equals("admin")){
        //     System.out.println("Authorised user");
        // }
        // else{
        //     System.out.println("Unauthorised user");
        // }


        // if (name.equals("Mukesh") || name.equals("")){
        //     if (password.equals("admin")){
        //         System.out.println("Authorised user");
        //     }
        //     System.out.println("Authorised user");
        // }
        // else{
        //     System.out.println("Unauthorised user");
        // }

        // System.out.println("Enter your age: ");
        // int age = a.nextInt();

        // if (age>=18){
        //     System.out.println("You Can Vote");
        // }
        // else{
        //     System.out.println("You Can't Vote");
        // }
    }
}