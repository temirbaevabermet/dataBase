package org.example.Manager;

public class WorkersWorkList {
    private int id;
    private String works;

    public WorkersWorkList(int id, String works) {
        this.id = id;
        this.works = works;
    }

    public WorkersWorkList() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWorks() {
        return works;
    }

    public void setWorks(String works) {
        this.works = works;
    }

    @Override
    public String toString() {
        return "WorkersWorkList{" +
                "id=" + id +
                ", works='" + works + '\'' +
                '}';
    }
}
