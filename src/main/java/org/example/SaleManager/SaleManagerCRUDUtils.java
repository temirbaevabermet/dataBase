package org.example.SaleManager;
import org.example.Marketing.DBUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SaleManagerCRUDUtils {
    private static String INSERT_CLIENTSLIST = "INSERT INTO clientsList(name) VALUES(?);";
    private static String DELETE_CLIENTSLIST = "DELETE FROM clientsList WHERE id = ?";

    private static String INSERT_AVAILABLETRIP = "INSERT INTO availableTrip(trip) VALUES(?);";
    private static String DELETE_AVAILABLETRIP = "DELETE FROM availableTrip WHERE id = ?";

    private static String INSERT_SOLDTRIP= "INSERT INTO soldTrip(trip) VALUES(?);";
    public static List<ClientsList> getClientsList(String query){
        List<ClientsList> clientsLists = new ArrayList<>();
        try(Connection connection = DBUtils.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query)){
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                clientsLists.add(new ClientsList(id, name));
            }

        }catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return clientsLists;

    }


    public static List<ClientsList> saveClientsList(ClientsList clientsList){
        List<ClientsList> clientsLists = new ArrayList<>();
        try(Connection connection = DBUtils.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_CLIENTSLIST)){
            preparedStatement.setString(1, clientsList.getName());
            preparedStatement.executeUpdate();

            PreparedStatement allClientsList = connection.prepareStatement("SELECT * FROM clientsList");
            ResultSet rs = allClientsList.executeQuery();
            while (rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                clientsLists.add(new ClientsList(id, name));
            }
        }catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return clientsLists;
    }
    public static List<ClientsList> deleteClientsList(int clientsListId){
        List<ClientsList> clientsLists = new ArrayList<>();
        try(Connection connection = DBUtils.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_CLIENTSLIST)){
            preparedStatement.setInt(1, clientsListId);
            preparedStatement.executeUpdate();

            PreparedStatement allClientsList = connection.prepareStatement("SELECT * FROM clientsList");
            ResultSet rs = allClientsList.executeQuery();
            while (rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                clientsLists.add(new ClientsList(id, name));
            }
        }catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return clientsLists;

    }

    public static List<AvailableTrip> getAvailableTrip(String query){
        List<AvailableTrip> availableTrips = new ArrayList<>();
        try(Connection connection = DBUtils.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query)){
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                int id = rs.getInt("id");
                String trip = rs.getString("trip");
                availableTrips.add(new AvailableTrip(id, trip));
            }

        }catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return availableTrips;

    }

    public static List<AvailableTrip> saveAvailableTrips(AvailableTrip availableTrip){
        List<AvailableTrip> availableTrips = new ArrayList<>();
        try(Connection connection = DBUtils.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_AVAILABLETRIP)){
            preparedStatement.setString(1, availableTrip.getTrip());
            preparedStatement.executeUpdate();

            PreparedStatement allAvailableTrip = connection.prepareStatement("SELECT * FROM availableTrip");
            ResultSet rs = allAvailableTrip.executeQuery();
            while (rs.next()){
                int id = rs.getInt("id");
                String trip = rs.getString("trip");
                availableTrips.add(new AvailableTrip(id, trip));
            }
        }catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return availableTrips;
    }

    public static List<AvailableTrip> deleteAvailableTrip(int availableTripId){
        List<AvailableTrip> availableTrips = new ArrayList<>();
        try(Connection connection = DBUtils.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_AVAILABLETRIP)){
            preparedStatement.setInt(1, availableTripId);
            preparedStatement.executeUpdate();

            PreparedStatement allAvailableTrip = connection.prepareStatement("SELECT * FROM availableTrip");
            ResultSet rs = allAvailableTrip.executeQuery();
            while (rs.next()){
                int id = rs.getInt("id");
                String trip = rs.getString("trip");
                availableTrips.add(new AvailableTrip(id, trip));
            }
        }catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return availableTrips;

    }

    public static List<SoldTrip> getSoldTrip(String query){
        List<SoldTrip> soldTrips = new ArrayList<>();
        try(Connection connection = DBUtils.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query)){
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                int id = rs.getInt("id");
                String trip = rs.getString("trip");
                soldTrips.add(new SoldTrip(id, trip));
            }

        }catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return soldTrips;

    }

    public static List<SoldTrip> saveSoldTrips(SoldTrip soldTrip){
        List<SoldTrip> soldTrips = new ArrayList<>();
        try(Connection connection = DBUtils.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_SOLDTRIP)){
            preparedStatement.setString(1, soldTrip.getTrip());
            preparedStatement.executeUpdate();

            PreparedStatement allSoldTrip = connection.prepareStatement("SELECT * FROM soldTrip");
            ResultSet rs = allSoldTrip.executeQuery();
            while (rs.next()){
                int id = rs.getInt("id");
                String trip = rs.getString("trip");
                soldTrips.add(new SoldTrip(id, trip));
            }
        }catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return soldTrips;
    }


}
