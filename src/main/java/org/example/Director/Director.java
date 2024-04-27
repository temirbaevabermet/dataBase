package org.example.Director;

import org.example.Marketing.CRUDUtils;
import org.example.Marketing.MarketingCategoryList;
import org.example.Marketing.MarketingDataBase;

import java.util.List;
import java.util.Scanner;

public class Director {
    Scanner scanner = new Scanner(System.in);
    public int workerSalary = 30000;
    public String greetings = "Greetings dear Director!\n" +
            "Please dial the menu number to work with the program, if you are finished, then dial 8:";
    public void menu() {
        System.out.println("1. Show a list of all coverage areas;\n" +
                "2. Show a list of budget categories; \n" +
                "3. Show the allocated budget for a certain category of places for marketing: \n" +
                "4. Show current funds for marketing; \n" +
                "5. Show the total budget required for the salary; \n" +
                "6. Increase the employee’s salary; \n" +
                "7. Reduce an employee’s salary; \n" +
                "8. Exit;");
    }
    public String getChoice(){
        DirectorCRUDUtils directorCRUDUtils = new DirectorCRUDUtils();
        String choice = "null";
        String numberRequest = "Please dial the menu number to work with the program:";
        System.out.print(numberRequest);
        String getchoice = scanner.next();

        if(getchoice.equals("1")){
            List<CoverageArea> coverageArea = DirectorCRUDUtils.getCoverageAreaData("SELECT * FROM coverageArea");
            choice = coverageArea.toString();
        }
        else if(getchoice.equals("2")){
            List<BudgetCategory> budgetCategory = DirectorCRUDUtils.updateBudgetCategory(2, 300000);
            choice = budgetCategory.toString();
        }
        else if(getchoice.equals("3")){
            List<MarketingCategoryList> marketingCategoryList = CRUDUtils.getMarketingCategoryData("SELECT * FROM marketingCategoryList");
            choice = marketingCategoryList.toString();
        }
        else if(getchoice.equals("4")){
            MarketingDataBase marketingDataBase = new MarketingDataBase();
            int totalBudgetMarketing = marketingDataBase.marketBudget;
            String marketingbudget = String.valueOf(totalBudgetMarketing);
            choice = "Current funds for marketing:"+marketingbudget+" som;";
        }
        else if(getchoice.equals("5")){
            choice = "Total budget required for the salary: 300k som;";
        }
        else if(getchoice.equals("6")){
            System.out.print("Enter the name of the employee whose salary you want to increase:");
            String nameOfEmployee = scanner.next();
            System.out.print("Enter the amount of the salary bonus:");
            String bonusSalary = scanner.next();
            if(nameOfEmployee.equals("Egor")){
                int increaseSalary = Integer.valueOf(bonusSalary);
                workerSalary = workerSalary+increaseSalary;
            }
            choice = "The surcharge has been successfully made! Current salary for this employee after bonus:"+workerSalary+"som;";
        }
        else if(getchoice.equals("7")){
            System.out.print("Enter the name of the employee whose salary you want to reduce:");
            String nameOfEmployee = scanner.next();
            System.out.print("Enter the amount of the salary reduction:");
            String reducedSalary = scanner.next();
            if(nameOfEmployee.equals("Egor")){
                int reduceSalary = Integer.valueOf(reducedSalary);
                workerSalary = workerSalary-reduceSalary;
            }
            choice = "Salary reduction successfully completed! Current salary for this employee after salary cut:"+workerSalary+"som;";
        }
        else if(getchoice.equals("8")){
            choice = "The program is over, we look forward to your return!";
        }

        return choice;

    }
}
