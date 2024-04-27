package org.example.Worker;

import org.example.Marketing.DBUtils;
import org.example.SaleManager.ClientsList;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class WorkerCRUDUtils {
    private static String DELETE_TODOLIST = "DELETE FROM toDoList WHERE id = ?";
    private static String INSERT_DONEWORK = "INSERT INTO doneWork(works) VALUES(?);";
    public static List<ToDoList> getToDoList(String query){
        List<ToDoList> toDoLists = new ArrayList<>();
        try(Connection connection = DBUtils.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query)){
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                int id = rs.getInt("id");
                String works = rs.getString("works");
                toDoLists.add(new ToDoList(id, works));
            }

        }catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return toDoLists;

    }
    public static List<ToDoList> deleteToDoList(int toDoListtId){
        List<ToDoList> toDoListLists = new ArrayList<>();
        try(Connection connection = DBUtils.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_TODOLIST)){
            preparedStatement.setInt(1, toDoListtId);
            preparedStatement.executeUpdate();

            PreparedStatement allToDoList = connection.prepareStatement("SELECT * FROM toDoList");
            ResultSet rs = allToDoList.executeQuery();
            while (rs.next()){
                int id = rs.getInt("id");
                String works = rs.getString("works");
                toDoListLists.add(new ToDoList(id, works));
            }
        }catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return toDoListLists;

    }

    public static List<DoneWork> saveDoneWork(DoneWork doneWork){
        List<DoneWork> doneWorks = new ArrayList<>();
        try(Connection connection = DBUtils.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_DONEWORK)){
            preparedStatement.setString(1, doneWork.getWorks());
            preparedStatement.executeUpdate();

            PreparedStatement allClientsList = connection.prepareStatement("SELECT * FROM doneWork");
            ResultSet rs = allClientsList.executeQuery();
            while (rs.next()){
                int id = rs.getInt("id");
                String works = rs.getString("works");
                doneWorks.add(new DoneWork(id, works));
            }
        }catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return doneWorks;
    }
}
