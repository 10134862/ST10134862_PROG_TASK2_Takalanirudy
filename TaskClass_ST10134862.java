/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Class;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Itumeleng for Forex
 */
public class TaskClass_ST10134862 {

    private static int Option;

    public static void main(String[] args) {
        //TODO code application logic here
        String name=JOptionPane.showInputDialog(null,"Please enter your Name);
        JOptionPane.showMessageDialog(Null,"Your name is" +Name);
        
        Scanner input= new Scanner(System.in);
        System.out.println("Option 1- Add tasks \n Option 2- Show report \n Option 3- Quit");
        int option= input.nextInt();
        
        if(Option == 1);
        System.out.println("How many tasks would you like to add?");
        int product= input.nextInt();
        
        if(Option == 2);
        System.out.println("Coming soon!");
        int report= input.nextInt();
        
        if(Option == 3);
        System.out.println("Quit"); 
        int result= input.nextInt();
    
    }
    
    private String taskName;
    public void setTaskName(String taskName){
        this.taskName = taskName;
    }
    public String getTaskName(){
        return "Add login feature";
    }
    
    private int taskNumber;
    public void setTaskNumber(int taskNumber){
        this.taskNumber = taskNumber;
    }
    public String getTaskNumber(){
        return "Tasks should start with the number 0";
    }
    
    private String taskDescription;
    public void setTaskDescription(String taskDescription){
        this.taskDescription = taskDescription;
    }
    public String getTaskDescription(){
        return "Description should not exceed 50 characters in length";
    }
    
    private String developerDetails;
    public void setDeveloperDetails(String developerDetails){
        this.developerDetails = developerDetails;
    }
    public String getDeveloperDetails(){
        return this.developerDetails;
    }
    
    private int taskDuration;
    public void setTaskDuration(int taskDuration){
        this.taskDuration = taskDuration;
    }
    public int taskDuration(){
        return this.taskDuration;
    }
    
    private String taskID;
    public void setTaskID(String taskID){
        this.taskID = taskID;
    }
    public String taskID(){
        return this.taskID;
    }
    
    private String taskStatus;
    public void setTaskStatus(String taskStatus){
        this.taskStatus = taskStatus;
    }
    public String taskStatus(){
        return this.taskStatus;
    }
    
    /**
     * 
     */
    public static void checkTaskDescription() {
        if(taskDescription.length() <=50);
        System.out.println("Password successfully captured");
    }
    else
    {
    System.out.println("Password should not exceed 50 characters");
    }
   
    
    public String createTaskID(){
        if(TaskID.substring(0,2)+":" TaskNumber+":" +(DeveloperSurname.substring(DeveloperSurname.length()-3),(DeveloperSurname.length)toUpperCase());
        System.out.println("taskId successfully captured");
        return null;
    }
    else
    {
        System.out.println("taskID error");
    }
    
    public boolean printTaskDetails(){
        if TaskDetails("DeveloperName + \n TaskNumber \n + DeveloperSurname \n +TaskName \n +TaskDescription \n +TaskID \n +TaskDuration");
        return true;
    }
    else
}
        return false;
        
}

public boolean returnTotalHours(){
return TaskDuration;
        }
}

