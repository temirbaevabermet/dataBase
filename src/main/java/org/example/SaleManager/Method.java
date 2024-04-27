package org.example.SaleManager;

import java.util.List;
import java.util.Scanner;

public class Method {
    public static String clientName(){
        Scanner scanner = new Scanner(System.in);
        SaleManager saleManager = new SaleManager();
        System.out.print("Enter the client name to search:");
        String[] clientsList1 = new String[] {"Dylan" , "Junaid" , "Trey" , "Julius" , "Amie"};
        String clientnameRequest = scanner.next();
        String clientNameSurname = "null";
        int a = 0;
        for(int i=0; i<clientsList1.length; i++){
            if(clientsList1[i].equals(clientnameRequest)){
                a++;

            }

        }
        if(a>0){
            clientNameSurname = "The client was found!";
        }
        else{
            clientNameSurname = "Sorry, but client did not found!";
        }

        return clientNameSurname;
    }
}
