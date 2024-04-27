package org.example.Manager;

public class WorkList {
    private int id;
    private String workName;

    public WorkList(int id, String workName) {
        this.id = id;
        this.workName = workName;
    }
   public WorkList(){

   }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWorkName() {
        return workName;
    }

    public void setWorkName(String workName) {
        this.workName = workName;
    }

    @Override
    public String toString() {
        return "WorkList{" +
                "id=" + id +
                ", workName='" + workName + '\'' +
                '}';
    }
}
