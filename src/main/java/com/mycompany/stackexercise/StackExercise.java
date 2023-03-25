/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.stackexercise;

import java.util.Stack;

/**
 *
 * @author Cha
 */

        
public class StackExercise {
    public static boolean balanceCheck(String parenthesis){
        
        Stack<Character> stackCheck = new Stack<>(); 
        
        for(int i=0;i<parenthesis.length();i++){
           char c = parenthesis.charAt(i);
           
           if(c=='('){
               stackCheck.push(c);
           }
           else if(c==')'){
               if(stackCheck.empty()||stackCheck.peek()==')'){
                   return false;
               }
               else{
                   stackCheck.pop();
               }
           }
            
        }
        return stackCheck.empty();
    } 
    

    public static void main(String[] args) {
        /*Exercise 1: Check if a string of parentheses is balanced, meaning each opening parenthesis has a 
        corresponding closing parenthesis in the correct order. The output of each check should be either 
        true or false. Use the following examples to be evaluated:
        parentheses1 = ( ( ( ) ) )
        parentheses2 = ( ( ) ( ) )
        parentheses3 = ( ( )
        parentheses4 = ( ) )
        */
        System.out.println("Exercise 1");
        
        String parentheses1 = "( ( ( ) ) )";
        String parentheses2 = "( ( ) ( ) )";
        String parentheses3 = "( ( )";
        String parentheses4 = "( ) )";
                
        System.out.println("Checking of the balanced parenthesis:");
        System.out.println("parenthesis 1: "+balanceCheck(parentheses1));
        System.out.println("parenthesis 2: "+balanceCheck(parentheses2));
        System.out.println("parenthesis 3: "+balanceCheck(parentheses3));
        System.out.println("parenthesis 4: "+balanceCheck(parentheses4));
        
        /*Exercise 2: Write a series of code that:
        Pushes three elements onto the stack - Alice, Bob, Charlie
        Pops the pushed elements
        Prints the popped elements using system.out.println (observe how LIFO is applied)
        Checks if the stack is empty (this should return true)*/
        
        System.out.println();
        System.out.println("Exercise 2");
        
        Stack<String> names = new Stack<>();
        
        String n1 = "Alice";
        String n2 = "Bob";
        String n3 = "Charlie";
        
        names.push(n1);
        names.push(n2);
        names.push(n3);
       
        System.out.println(names);
        for(int i = 0; i<3;i++){
            
            System.out.println("Popped: "+names.peek());
            names.pop();
            System.out.println(names);
                            
            
        }
        System.out.println(names.empty());
       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
