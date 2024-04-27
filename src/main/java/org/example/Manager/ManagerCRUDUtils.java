package org.example.Manager;
import org.example.Marketing.DBUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ManagerCRUDUtils {
    private static String INSERT_WORKLIST = "INSERT INTO workList(workName) VALUES(?);";
    private static String DELETE_WORKLIST = "DELETE FROM workList WHERE id = ?";
    private static String INSERT_WORKERSWORKLIST = "INSERT INTO workersWorkList(works) VALUES(?);";
    public static List<WorkerList> getWorkerList(String query){
        List<WorkerList> workerLists = new ArrayList<>();
        try(Connection connection = DBUtils.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query)){
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                workerLists.add(new WorkerList(id, name));
            }

        }catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return workerLists;

    }

    public static List<WorkList> getWorkList(String query){
        List<WorkList> workLists = new ArrayList<>();
        try(Connection connection = DBUtils.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query)){
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                int id = rs.getInt("id");
                String workName = rs.getString("workName");
                workLists.add(new WorkList(id, workName));
            }

        }catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return workLists;

    }
    public static List<WorkList> saveWorkList(WorkList workList){
        List<WorkList> workLists = new ArrayList<>();
        try(Connection connection = DBUtils.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_WORKLIST)){
            preparedStatement.setString(1, workList.getWorkName());
            preparedStatement.executeUpdate();

            PreparedStatement allWorkList = connection.prepareStatement("SELECT * FROM workList");
            ResultSet rs = allWorkList.executeQuery();
            while (rs.next()){
                int id = rs.getInt("id");
                String workName = rs.getString("workName");
                workLists.add(new WorkList(id, workName));
            }
        }catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return workLists;

    }

    public static List<WorkList> deleteWorkList(int workListId){
        List<WorkList> workLists = new ArrayList<>();
        try(Connection connection = DBUtils.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_WORKLIST)){
            preparedStatement.setInt(1, workListId);
            preparedStatement.executeUpdate();

            PreparedStatement allWorkList = connection.prepareStatement("SELECT * FROM workList");
            ResultSet rs = allWorkList.executeQuery();
            while (rs.next()){
                int id = rs.getInt("id");
                String workName = rs.getString("workName");
                workLists.add(new WorkList(id, workName));
            }
        }catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return workLists;

    }

    public static List<WorkersWorkList> getWorkersWorkList(String query){
        List<WorkersWorkList> workersWorkLists = new ArrayList<>();
        try(Connection connection = DBUtils.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query)){
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                int id = rs.getInt("id");
                String works = rs.getString("works");
                workersWorkLists.add(new WorkersWorkList(id, works));
            }

        }catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return workersWorkLists;

    }
    public static List<WorkersWorkList> saveWorkersWorkList(WorkersWorkList workersWorkList){
        List<WorkersWorkList> workersWorkLists = new ArrayList<>();
        try(Connection connection = DBUtils.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_WORKERSWORKLIST)){
            preparedStatement.setString(1, workersWorkList.getWorks());
            preparedStatement.executeUpdate();

            PreparedStatement allWorkersWorkList = connection.prepareStatement("SELECT * FROM workersWorkList");
            ResultSet rs = allWorkersWorkList.executeQuery();
            while (rs.next()){
                int id = rs.getInt("id");
                String works = rs.getString("works");
                workersWorkLists.add(new WorkersWorkList(id, works));
            }
        }catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return workersWorkLists;

    }
}
