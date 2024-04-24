package org.example.Marketing;

import java.util.List;
import java.util.Scanner;

public class MarketingDataBase {
    Scanner scanner = new Scanner(System.in);
    public int marketBudget = 150000;
    public String greetings = "Greetings dear Marketer!\n" +
            "Please dial the menu number to work with the program, if you are finished, then dial 5:";

    public void menu(){
        System.out.println("1. Show a list of categories for marketing;\n" +
                "2. Show the allocated budget for a certain category of places for marketing;\n" +
                "3. Show the total budget for marketing;\n" +
                "4. Spend budget on promotion;\n" +
                "5. Exit;");
    }
    public String getChoice(){
        CRUDUtils crudUtils = new CRUDUtils();
        String choice = "null";
        String numberRequest = "Please dial the menu number to work with the program:";
        System.out.print(numberRequest);
        String getchoice = scanner.next();
        if(getchoice.equals("1")){
            List<MarketingCategoryList> marketingCategoryList = CRUDUtils.getMarketingCategoryData("SELECT * FROM marketingCategoryList");
            choice = marketingCategoryList.toString();
        }
        else if(getchoice.equals("2")){
            List<Marketing> marketings = CRUDUtils.getMarketingData("SELECT * FROM marketing");
            choice = marketings.toString();
        }
        else if(getchoice.equals("3")){
            choice = "Total budget for marketing:"+marketBudget+" som;";
        }
        else if(getchoice.equals("4")){
            System.out.println("1. Instagram\n" +
                    "2. Facebook\n" +
                    "3. YouTube");
            System.out.print(" Select a name for promotion:");
            String choosePromotion = scanner.next();
            String choosedPromotion = "null";
            Marketing marketing = new Marketing();
            if(choosePromotion.equals("1")){
                String expenseRequest = "Enter the amount of expense you want to spend from your budget:";
                System.out.print(expenseRequest);
                String expense = scanner.next();
                int expense1 = Integer.valueOf(expense);
                if(expense1>150000){
                    choosedPromotion = "Sorry, but the indicated expense exceeds the total budget!";
                }
                else{
                    marketBudget = marketBudget-expense1;
                    choosedPromotion = "Operation completed successfully!";
                }

            }
            if(choosePromotion.equals("2")){
                String expenseRequest = "Enter the amount of expense you want to spend from your budget:";
                System.out.print(expenseRequest);
                String expense = scanner.next();
                int expense1 = Integer.valueOf(expense);
                if(expense1>150000){
                    choosedPromotion = "Sorry, but the indicated expense exceeds the total budget!";
                }
                else{
                    marketBudget = marketBudget-expense1;
                    choosedPromotion = "Operation completed successfully!";
                }

            }
            if(choosePromotion.equals("3")){
                String expenseRequest = "Enter the amount of expense you want to spend from your budget:";
                System.out.print(expenseRequest);
                String expense = scanner.next();
                int expense1 = Integer.valueOf(expense);
                if(expense1>150000){
                    choosedPromotion = "Sorry, but the indicated expense exceeds the total budget!";
                }
                else{
                    marketBudget = marketBudget-expense1;
                    choosedPromotion = "Operation completed successfully!";
                }

            }
            choice = choosedPromotion;

        }
        else if(getchoice.equals("5")){
            choice = "The program is over, we look forward to your return!";
        }
        return choice;
    }
}
