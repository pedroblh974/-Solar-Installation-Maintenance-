private class Anomaly {
    private String id ;
    private String equipmentId;
    private String readingId ;
    private String thresholdId ;
    private String description ;
    private String severity ;
    private String detectionDate;
    private String closureDate;
    private String status;

    public Anomaly(String name, String id, String equipmentId, String readingId, String thresholdId, String description, String severity, String detectionDate, String closureDate, String status) {
        this.id = id;
        this.equipmentId = equipmentId;
        this.readingId = readingId;
        this.thresholdId = thresholdId;
        this.description = description;
        this.severity = severity;
        this.detectionDate = detectionDate;
        this.closureDate = closureDate;
        this.status = status;
    }
    public void getid() {
        return id;
    }
    public void getequipmentId() {
        return equipmentId;
    }
    public void getreadingId() {
        return readingId;
    }
    public void getthresholdId() {
        return thresholdId;
    }
    public void getdescription() {
        return description;
    }
    public void getseverity() {
        return severity;
    }
    public void getdetectionDate() {
        return detectionDate;
    }
    public void getclosureDate() {
        return closureDate;
    }
    public void getstatus() {
        return status;
    }
    
}