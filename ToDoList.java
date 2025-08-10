/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;


public class ToDoList {
    
    private static TaskNode head=null;
    
    public static void addTask(String a){
       TaskNode newTask=new TaskNode(a);
       
       
       if(head==null){head=newTask;}
       else{
           TaskNode current=head;
           
           while(current.next!=null){
           
               current=current.next;
           }
           
           
           current.next=newTask;
       
       
       
       }
       
     
        
    
    }
    public static void deleteTask(String a){
       
        
        if(head==null){
            
            System.out.println("NO data");
            return;
        }
        
        if(head.task.equals(a)){
            head=head.next;
            System.out.println(a+" is removed");
            return;
        
        }
        
        
        TaskNode current=head;
        
        
        while(current!=null){
            if(current.next.task.equals(a)){
                current.next=current.next.next;
                System.out.println(a+" is removed");
                return;
            
            }
        
        
            current=current.next;
        }
        
    
    
    
    
    }
    public static void printTasks(){
      TaskNode current=head;
      
        while(current!=null){
            System.out.println(current.task);
            current=current.next;
        
        }
      
    }
    public static boolean contains(String a){
    
        TaskNode current=head;
        
        while(current!=null)
        {
            if(current.task.equals(a))
            {
                System.out.println(current.task+" Found");
                
                
                return true;
            }
            
            
            current=current.next;
            


        }
    
        System.out.println("No task ");
        return false;
     
    }



}