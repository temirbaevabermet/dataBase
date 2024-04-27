package org.example.SaleManager;

public class SoldTrip {
    private int id;
    private String trip;

    public SoldTrip(int id, String trip) {
        this.id = id;
        this.trip = trip;
    }

    public SoldTrip() {

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
        return "SoldTrip{" +
                "id=" + id +
                ", trip='" + trip + '\'' +
                '}';
    }
}
