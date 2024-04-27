package org.example.Worker;

import org.example.Director.Director;

import java.util.List;
import java.util.Scanner;

public class Worker {
    Scanner scanner = new Scanner(System.in);
    public String doneTasks = "null";
    public String greetings = "Greetings dear, Employee Egor!\n" +
            "Please dial the menu number to work with the program, if you are finished, then dial 5:";
    public void menu(){
        System.out.println("1. Show a list of tasks assigned to me;\n" +
                "2. Complete the order:\n" +
                "3. Show a list of completed instructions;\n" +
                "4. Show salary;\n" +
                "5. Exit;");
    }
    public String getChoice(){
        String choice = "null";
        String numberRequest = "Please dial the menu number to work with the program:";
        System.out.print(numberRequest);
        String getchoice = scanner.next();
        if(getchoice.equals("1")){
            List<ToDoList> toDoListLists = WorkerCRUDUtils.getToDoList("SELECT * FROM toDoList");
            choice = toDoListLists.toString();
        }
        else if(getchoice.equals("2")){
            List<ToDoList> toDoListLists = WorkerCRUDUtils.getToDoList("SELECT * FROM toDoList");
            System.out.println(toDoListLists);
            System.out.print("Please write down the id of the task you are going to do:");
            int task = scanner.nextInt();
            List<ToDoList> toDoListLis = WorkerCRUDUtils.deleteToDoList(task);
            choice = toDoListLis.toString();
        }
        else if(getchoice.equals("3")){
            DoneWork doneWork = new DoneWork();
            doneWork.setWorks("Print monthly report");
            List<DoneWork> doneWorks = WorkerCRUDUtils.saveDoneWork(doneWork);
            choice = doneWorks.toString();
        }
        else if(getchoice.equals("4")){
            Director director = new Director();
            String workersalary = String.valueOf(director.workerSalary);
            choice = "Your salary:"+workersalary+";";
        }
        else if(getchoice.equals("5")){
            choice = "The program is over, we look forward to your return!";
        }
        return choice;
    }
}
