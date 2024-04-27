package org.example.typeOfAccount;
import org.example.Director.Director;
import org.example.LoginPassword.Login;
import org.example.Manager.*;
import org.example.Marketing.MarketingDataBase;
import org.example.SaleManager.*;
import org.example.Worker.DoneWork;
import org.example.Worker.ToDoList;
import org.example.Worker.Worker;
import org.example.Worker.WorkerCRUDUtils;

import java.util.List;
import java.util.Scanner;

public class Account {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Login login = new Login();
        String loginRequest = "Please enter your type of account: ";
        System.out.print(loginRequest);
        String typeOfAccount = scanner.next();
        if(typeOfAccount.equals(login.directorLogin)){
            Director director = new Director();
            String passwordRequest = "Please enter your password: ";
            System.out.print(passwordRequest);
            String password1 = scanner.next();
            if(password1.equals(login.directorPassword)){
                System.out.println(director.greetings);
                director.menu();
                String choice = director.getChoice();
                System.out.println(choice);
            }
            else {
                System.out.println("Sorry, but password entered incorrectly, please try again!");
            }
        }
        else if(typeOfAccount.equals(login.managerLogin)){
            Manager manager = new Manager();
            String passwordRequest = "Please enter your password: ";
            System.out.print(passwordRequest);
            String password2 = scanner.next();
            if(password2.equals(login.managerPassword)){
                System.out.println(manager.greetings);
                manager.menu();
                String choice = manager.getChoice();
                System.out.println(choice);
            }
            else {
                System.out.println("Sorry, but password entered incorrectly, please try again!");
            }
        }
        else if(typeOfAccount.equals(login.marketingLogin)){
            MarketingDataBase marketingDataBase = new MarketingDataBase();
            String passwordRequest = "Please enter your password: ";
            System.out.print(passwordRequest);
            String password3 = scanner.next();
            if(password3.equals(login.marketingPassword)){
                System.out.println(marketingDataBase.greetings);
                marketingDataBase.menu();
                String choice = marketingDataBase.getChoice();
                System.out.println(choice);
            }
            else {
                System.out.println("Sorry, but password entered incorrectly, please try again!");
            }
        }
        else if(typeOfAccount.equals(login.saleManagerLogin)){
            SaleManager saleManager = new SaleManager();
            String passwordRequest = "Please enter your password: ";
            System.out.print(passwordRequest);
            String password4 = scanner.next();
            if(password4.equals(login.saleManagerPassword)){
                System.out.println(saleManager.greetings);
                saleManager.menu();
                String choice = saleManager.getChoice();
                System.out.println(choice);
            }
            else {
                System.out.println("Sorry, but password entered incorrectly, please try again!");
            }
        }
        else if(typeOfAccount.equals(login.workerLogin)){
            Worker worker = new Worker();
            String passwordRequest = "Please enter your password: ";
            System.out.print(passwordRequest);
            String password5 = scanner.next();
            if(password5.equals(login.workerPassword)){
                System.out.println(worker.greetings);
                worker.menu();
                String choice = worker.getChoice();
                System.out.println(choice);
            }
            else {
                System.out.println("Sorry, but password entered incorrectly, please try again!");
            }
        }
        else{
            System.out.println("Sorry, but we do not find this type of account, please try again!");
        }

        /*List<ClientsList> clientsLists = SaleManagerCRUDUtils.getClientsList("SELECT * FROM clientsList");
        System.out.println(clientsLists);

        ClientsList clientsList = new ClientsList();
        clientsList.setName("Temirbaeva Bermet");
        System.out.println(SaleManagerCRUDUtils.saveClientsList(clientsList));

        System.out.println(SaleManagerCRUDUtils.deleteClientsList(2));*/

    }
}
