package org.example.SaleManager;
import java.util.List;
import java.util.Scanner;

public class SaleManager {
    Scanner scanner = new Scanner(System.in);
    public String greetings = "Greetings dear Sales Agent!\n" +
            "Please dial the menu number to work with the program, if you are finished, then dial 8:";
    public void menu(){
        System.out.println("1. Show all clients;\n" +
                "2. Search for a client;\n" +
                "3. Show available shopping vouchers;\n" +
                "4. Show sold tours;\n" +
                "5. Show the most expensive trip;\n" +
                "6. Show the cheapest tour;\n" +
                "7. Sell a trip;\n" +
                "8. Exit;");
    }
    public String getChoice(){
        String choice = "null";
        String numberRequest = "Please dial the menu number to work with the program:";
        System.out.print(numberRequest);
        String getchoice = scanner.next();
        if(getchoice.equals("1")){
            List<ClientsList> clientsLists = SaleManagerCRUDUtils.getClientsList("SELECT * FROM clientsList");
            choice = clientsLists.toString();
        }
        else if(getchoice.equals("2")){
            choice = Method.clientName();
        }
        else if(getchoice.equals("3")){
            AvailableTrip availableTrip = new AvailableTrip();
            availableTrip.setTrip("Russia");
            List<AvailableTrip> availableTrips = SaleManagerCRUDUtils.saveAvailableTrips(availableTrip);
            choice = availableTrips.toString();
        }
        else if(getchoice.equals("4")){
            List<SoldTrip> soldTrips = SaleManagerCRUDUtils.getSoldTrip("SELECT * FROM soldTrip");
            choice = soldTrips.toString();
        }
        else if(getchoice.equals("5")){
            choice = "The most expensive trip: to the USA - 2000$;";
        }
        else if(getchoice.equals("6")){
            choice = "The cheapest trip: to the Russia - 600$;";
        }
        else if(getchoice.equals("7")){
            System.out.print("Please write your sales address:");
            String adress = scanner.next();
            System.out.print("Please write the new owner of the voucher:");
            String newOwner = scanner.next();
            choice = "Sale completed successfully!";
        }
        else if(getchoice.equals("8")){
            choice = "The program is over, we look forward to your return!";
        }
        return choice;
    }
}
