private class Intervention {
    private String id;
    private String anomalyId;
    private String technician;
    private String startDate;
    private String type;
    private String description;
    private String partReplaced;
    private double cost;
    private double durationHours;

    public Intervention(String name, String id, String anomalyId, String technician, String startDate, String type, String description, String partReplaced, double cost, double durationHours) {
        this.id = id;
        this.anomalyId = anomalyId;
        this.technician = technician;
        this.startDate = startDate;
        this.type = type;
        this.description = description;
        this.partReplaced = partReplaced;
        this.cost = cost;
        this.durationHours = durationHours;
    }
    public void getid() {
        return id;
    }
    public void getanomalyId() {
        return anomalyId;
    }
    public void gettechnician() {
        return technician;
    }
    public void getstartDate() {
        return startDate;
    }
    public void gettype() {
        return type;
    }
    public void getdescription() {
        return description;
    }
    public void getpartReplaced() {
        return partReplaced;
    }
    public void getcost() {
        return cost;
    }
    public void getdurationHours() {
        return durationHours;
    }
    
}
