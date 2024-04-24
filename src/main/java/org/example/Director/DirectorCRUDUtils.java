package org.example.Director;

import org.example.Marketing.DBUtils;
import org.example.Marketing.Marketing;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DirectorCRUDUtils {
    private static String UPDATE_BUDGETCATEGORY = "UPDATE budgetCategory SET budget = ? WHERE id = ?";
    public static List<CoverageArea> getCoverageAreaData(String query){
        List<CoverageArea> coverageArea = new ArrayList<>();
        try(Connection connection = DBUtils.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query)){
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                int id = rs.getInt("id");
                String region = rs.getString("region");
                String percentage = rs.getString("percentage");
                String clients = rs.getString("clients");
                coverageArea.add(new CoverageArea(id, region, percentage, clients));
            }

        }catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return coverageArea;

    }

    public static List<BudgetCategory> getBudgetCategoryData(String query){
        List<BudgetCategory> budgetCategories = new ArrayList<>();
        try(Connection connection = DBUtils.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query)){
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                int id = rs.getInt("id");
                String category = rs.getString("category");
                int budget = rs.getInt("budget");
                budgetCategories.add(new BudgetCategory(id, category, budget));
            }

        }catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return budgetCategories;

    }

    public  static List<BudgetCategory> updateBudgetCategory (int budgetCategoryId, int budgetCategoryBudget){
        List<BudgetCategory> updateBudget = new ArrayList<>();
        try(Connection connection = DBUtils.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_BUDGETCATEGORY)){
            preparedStatement.setInt(1, budgetCategoryBudget);
            preparedStatement.setInt(2, budgetCategoryId);
            preparedStatement.executeUpdate();

            PreparedStatement allMarketing = connection.prepareStatement("SELECT * FROM budgetCategory");
            ResultSet rs = allMarketing.executeQuery();
            while (rs.next()){
                int id = rs.getInt("id");
                String category = rs.getString("category");
                int budget = rs.getInt("budget");
                updateBudget.add(new BudgetCategory(id, category, budget));
            }
        }catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return updateBudget;

    }
}
