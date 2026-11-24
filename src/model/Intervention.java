public class Intervention {
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
    public String getId() {
        return id;
    }
    public String getAnomalyId() {
        return anomalyId;
    }
    public String getTechnician() {
        return technician;
    }
    public String getStartDate() {
        return startDate;
    }
    public String getType() {
        return type;
    }
    public String getDescription() {
        return description;
    }
    public String getPartReplaced() {
        return partReplaced;
    }
    public double getCost() {
        return cost;
    }
    public double getDurationHours() {
        return durationHours;
    }
    
}
