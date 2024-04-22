package org.example;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CRUDUtils {
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
    
}
