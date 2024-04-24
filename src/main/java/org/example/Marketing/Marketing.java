package org.example.Marketing;

public class Marketing {
    private int id;
    private String name;
    private  String budget;

    @Override
    public String toString() {
        return "Marketing{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", budget='" + budget + '\'' +
                '}';
    }

    public Marketing(int id, String name, String budget) {
        this.id = id;
        this.name = name;
        this.budget = budget;
    }
    public Marketing() {

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

    public String getBudget() {
        return budget;
    }

    public void setBudget(String budget) {
        this.budget = budget;
    }



}