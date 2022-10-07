package Aeronaves;

public class Approve {
    private boolean approved;
    private String description;


    public Approve() {
        super();
    }

    public Approve(boolean approved, String description) {
        super();
        this.approved = approved;
        this.description = description;
    }
    public boolean isApproved() {
        return approved;
    }
    public void setApproved(boolean approved) {
        this.approved = approved;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}
