package org.example.Manager;

import org.example.Director.CoverageArea;
import org.example.Director.DirectorCRUDUtils;

import java.util.List;
import java.util.Scanner;

public class Manager {
    Scanner scanner = new Scanner(System.in);
    public String greetings = "Greetings dear Manager!\n" +
            "Please dial the menu number to work with the program, if you are finished, then dial 6:";
    public void menu(){
        System.out.println("1. Show list of employees;\n" +
                "2. Show to-do list;\n" +
                "3. Show a list of instructions to employees;\n" +
                "4. Show a list of all coverage areas;\n" +
                "5. Show the amount of vouchers;\n" +
                "6. Exit;");
    }
    public String getChoice(){
        String choice = "null";
        String numberRequest = "Please dial the menu number to work with the program:";
        System.out.print(numberRequest);
        String getchoice = scanner.next();
        if(getchoice.equals("1")){
            List<WorkerList> workerList = ManagerCRUDUtils.getWorkerList("SELECT * FROM workerList");
            choice = workerList.toString();
        }
        else if(getchoice.equals("2")){
            List<WorkList> workList = ManagerCRUDUtils.deleteWorkList(1);
            choice = workList.toString();
        }
        else if(getchoice.equals("3")){
            WorkersWorkList workersWorkList = new WorkersWorkList();
            workersWorkList.setWorks("Print monthly report");
            List<WorkersWorkList> workersWorkLists = ManagerCRUDUtils.saveWorkersWorkList(workersWorkList);
            choice = workersWorkLists.toString();
        }
        else if(getchoice.equals("4")){
            List<CoverageArea> coverageArea = DirectorCRUDUtils.getCoverageAreaData("SELECT * FROM coverageArea");
            choice = coverageArea.toString();
        }
        else if(getchoice.equals("5")){
            System.out.println("1.Show total amount\n" +
                    "2.Show the amount for vouchers");
            System.out.print("Choose one category: ");
            String chooseVoucher = scanner.next();
            String choosedVoucher = "null";
            if(chooseVoucher.equals("1")){
                choosedVoucher = "Total amount of vouchers: 100;";
            }
            else if(chooseVoucher.equals("2")){
                System.out.println("1.For 1st quarter;\n" +
                        "2. For the 2nd quarter;\n" +
                        "3. For the 3rd quarter;\n" +
                        "4. For the 4th quarter;");
                System.out.print("Choose one quarter:");
                String chooseQuarter = scanner.next();
                if(chooseQuarter.equals("1")){
                    choosedVoucher = "For 1st quarter: 40;";
                }
                else if(chooseQuarter.equals("2")){
                    choosedVoucher = "For the 2nd quarter: 25;";
                }
                else if(chooseQuarter.equals("3")){
                    choosedVoucher = "For the 3rd quarter: 15;";
                }
                else if(chooseQuarter.equals("4")){
                    choosedVoucher = "For the 4th quarter: 20;";
                }
            }
            choice = choosedVoucher;
        }
        else if(getchoice.equals("6")){
            choice = "The program is over, we look forward to your return!";
        }
        return choice;
    }
}
