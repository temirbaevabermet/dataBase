package org.example;

import java.util.List;

public class App {
    public static void main(String[] args){
        List<Marketing> marketings = CRUDUtils.getMarketingData("SELECT * FROM marketing");
        System.out.println(marketings);
    }
}
