package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String email,password;

        Scanner input = new Scanner(System.in);

        System.out.println("Would you like to make an Email: \n");
        String answer = input.next();

            System.out.println("Please ENter your name: \n");
            String name = input.next();
            System.out.println("Please enter your surname");
            String lastname = input.next();
            person user = new person(name,lastname);
             email = user.createEmail();
            System.out.println("Your email is: " + email);
            System.out.println("Please enter a password to use");
             password = input.next();
            user.password(password);


        System.out.println("Account succesfully created");
        System.out.println("To log in type login");
        String ans = input.next();
        if(ans.toLowerCase().equalsIgnoreCase("login")){
            System.out.println("What is your email");
            String em = input.next();
            System.out.println("Password");
            String pa = input.next();
            String result = user.login(em,pa);
            System.out.println(result);


        }


    }

    static class person {
        String name;
        String lastname;
        String email;
        String password;


        person(String name, String lastname) {
            this.name = name;
            this.lastname = lastname;

        }



        public String createEmail(){
            this.email = this.name +"."+this.lastname + "@gmail.com";
            return this.email;
        }
        public void password(String pass){
            this.password = pass;
        }

        public String login(String email, String password){
            if(email.toLowerCase().equalsIgnoreCase(this.email.toLowerCase()) && password.toLowerCase().equalsIgnoreCase(this.password.toLowerCase())){
                return "You have succesfully logged in";
            }else{
                return "Login denied";
            }
        }
    }



}
