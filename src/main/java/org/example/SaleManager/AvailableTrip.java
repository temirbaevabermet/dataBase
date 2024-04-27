package org.example.SaleManager;

public class AvailableTrip {
    private int id;
    private String trip;

    public AvailableTrip(int id, String trip) {
        this.id = id;
        this.trip = trip;
    }

    public AvailableTrip() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTrip() {
        return trip;
    }

    public void setTrip(String trip) {
        this.trip = trip;
    }

    @Override
    public String toString() {
        return "AvailableTrips{" +
                "id=" + id +
                ", trip='" + trip + '\'' +
                '}';
    }
}
