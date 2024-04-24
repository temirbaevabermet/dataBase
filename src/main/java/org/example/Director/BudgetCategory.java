package org.example.Director;

public class BudgetCategory {
    private int id;
    private String category;
    private  int budget;

    public BudgetCategory(int id, String category, int budget) {
        this.id = id;
        this.category = category;
        this.budget = budget;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    @Override
    public String toString() {
        return "BudgetCategory{" +
                "id=" + id +
                ", category='" + category + '\'' +
                ", budget=" + budget +
                '}';
    }
}
