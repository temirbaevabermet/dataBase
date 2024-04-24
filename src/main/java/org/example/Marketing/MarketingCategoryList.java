package org.example.Marketing;

public class MarketingCategoryList {
    private int id;
    private String name;
    private  String subscribers;

    public MarketingCategoryList(int id, String name, String subscribers) {
        this.id = id;
        this.name = name;
        this.subscribers = subscribers;
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

    public String getSubscribers() {
        return subscribers;
    }

    public void setSubscribers(String subscribers) {
        this.subscribers = subscribers;
    }

    @Override
    public String toString() {
        return "MarketingCategoryList{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", subscribers='" + subscribers + '\'' +
                '}';
    }
}
