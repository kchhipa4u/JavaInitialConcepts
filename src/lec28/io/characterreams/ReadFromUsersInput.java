package lec28.io.characterreams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFromUsersInput {
    public static void main(String[] args) throws IOException {
           
           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
           
           System.out.print("enter your name : ");
           //will wait for user to enter name
           String name = br.readLine(); // syntax for String
 
           System.out.println("Your name is : " + name);
 
           System.out.print("enter your age : ");
           //will wait for user to enter age
           int age = Integer.parseInt(br.readLine()); // syntax for int
           System.out.println("Your age is : " + age);
 
           br.close(); //close BufferedReader
 
    }
 }