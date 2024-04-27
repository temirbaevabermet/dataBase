package org.example.Worker;

public class ToDoList {
    private int id;
    private String works;

    public ToDoList(int id, String works) {
        this.id = id;
        this.works = works;
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
        return "ToDoList{" +
                "id=" + id +
                ", works='" + works + '\'' +
                '}';
    }
}
