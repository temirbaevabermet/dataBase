package org.example.typeOfAccount;

import org.example.Director.BudgetCategory;
import org.example.Director.CoverageArea;
import org.example.Director.DirectorCRUDUtils;
import org.example.LoginPassword.Login;
import org.example.Marketing.MarketingDataBase;

import java.util.List;
import java.util.Scanner;

public class Account {
    public static void main(String[] args){
        DirectorCRUDUtils directorCRUDUtils = new DirectorCRUDUtils();
        List<CoverageArea> coverageArea = DirectorCRUDUtils.getCoverageAreaData("SELECT * FROM coverageArea");
        System.out.println(coverageArea);
        List<BudgetCategory> budgetCategory = DirectorCRUDUtils.getBudgetCategoryData("SELECT * FROM budgetCategory");
        System.out.println(budgetCategory);
        System.out.println(DirectorCRUDUtils.updateBudgetCategory(2, 300000));
        Login login = new Login();
        Scanner scanner = new Scanner(System.in);
        String loginRequest = "Please enter your type of account: ";
        System.out.print(loginRequest);
        String typeOfAccount = scanner.next();
        if(typeOfAccount.equals(login.marketingLogin)){
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
        /*CRUDUtils crudUtils = new CRUDUtils();
        List<Marketing> marketings = CRUDUtils.getMarketingData("SELECT * FROM marketing");
        System.out.println(marketings);
        List<MarketingCategoryList> marketingCategoryList = CRUDUtils.getMarketingCategoryData("SELECT * FROM marketingCategoryList");
        System.out.println(marketingCategoryList);
        Marketing marketing = new Marketing();
        marketing.setName("Hello");
        marketing.setBudget("World");
        System.out.println(CRUDUtils.saveMarketing(marketing));*/
    }
}
