package org.example.Marketing;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CRUDUtils {
    private static String INSERT_MARKETING = "INSERT INTO marketing(name, budget) VALUES(?, ?);";
    public static List<Marketing> getMarketingData(String query){
        List<Marketing> marketing = new ArrayList<>();
        try(Connection connection = DBUtils.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query)){
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String budget = rs.getString("budget");
                marketing.add(new Marketing(id, name, budget));
            }

        }catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    return marketing;

    }
    public static List<MarketingCategoryList> getMarketingCategoryData(String query){
        List<MarketingCategoryList> marketingCategoryList = new ArrayList<>();
        try(Connection connection = DBUtils.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query)){
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String subscribers = rs.getString("subscribers");
                marketingCategoryList.add(new MarketingCategoryList(id, name, subscribers));
            }

        }catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return marketingCategoryList;

    }


    public static List<Marketing> saveMarketing(Marketing marketing){
        List<Marketing> marketings = new ArrayList<>();
        try(Connection connection = DBUtils.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_MARKETING)){
            preparedStatement.setString(1, marketing.getName());
            preparedStatement.setString(2, marketing.getBudget());
            preparedStatement.executeUpdate();

            PreparedStatement allMarketing = connection.prepareStatement("SELECT * FROM marketing");
            ResultSet rs = allMarketing.executeQuery();
            while (rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String budget = rs.getString("budget");
                marketings.add(new Marketing(id, name, budget));
            }
        }catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return marketings;

    }


}
