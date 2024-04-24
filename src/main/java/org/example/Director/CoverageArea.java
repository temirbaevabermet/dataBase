package org.example.Director;

public class CoverageArea {
    private int id;
    private String region;
    private  String percentage;
    private String clients;

    public CoverageArea(int id, String region, String percentage, String clients) {
        this.id = id;
        this.region = region;
        this.percentage = percentage;
        this.clients = clients;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getPercentage() {
        return percentage;
    }

    public void setPercentage(String percentage) {
        this.percentage = percentage;
    }

    public String getClients() {
        return clients;
    }

    public void setClients(String clients) {
        this.clients = clients;
    }

    @Override
    public String toString() {
        return "CoverageArea{" +
                "id=" + id +
                ", region='" + region + '\'' +
                ", percentage='" + percentage + '\'' +
                ", clients='" + clients + '\'' +
                '}';
    }
}
