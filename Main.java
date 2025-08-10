/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        ToDoList tdl=new ToDoList();
        Scanner scan=new Scanner(System.in);
       while(true){
        System.out.println("1. Add Task");
        System.out.println("2. Delete Task");
        System.out.println("3. Print Task");
        System.out.println("4. Search Task");
        System.out.println("5. Exit");
        System.out.print("Choose Action: ");
        int input=scan.nextInt();
        
        scan.nextLine();
        
        
        
        if(input==1){
            System.out.print("Input task:");
            String task=scan.nextLine();
            tdl.addTask(task);
            }
        if(input==2){
            System.out.print("Input task:");
            String task=scan.nextLine();
            tdl.deleteTask(task);
            }
        if(input==3){tdl.printTasks();}
        if(input==4){
            System.out.print("Input task:");
            String task=scan.nextLine();
            tdl.contains(task);}
        
        
       }
        
        
                
        
        
        
    }
}
