package org.example.SaleManager;

public class ClientsList {
    private int id;
    private String name;

    public ClientsList(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public ClientsList() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ClientsList{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
