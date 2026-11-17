private class  Threshold {
    private String id ;
    private String equipmentId;
    private String metric;
    private double minValue;
    private double maxValue;
    private String unit;
    private String severity;
    private boolean active;



    public Threshold(String name, String id, String equipmentId, String metric, double minValue, double maxValue, String unit, String severity, boolean active) {
        this.id = id;
        this.equipmentId = equipmentId;
        this.metric = metric;
        this.minValue = minValue;
        this.maxValue = maxValue;
        this.unit = unit;
        this.severity = severity;
        this.active = active;
    }
    public void getid() {
        return id;
    }
    public void getequipmentId() {
        return equipmentId;
    }
    public void getmetric() {
        return metric;
    }
    public void getminValue() {
        return minValue;
    }
    public void getmaxValue() {
        return maxValue;
    }
    public void getunit() {
        return unit;
    }
    public void getseverity() {
        return severity;
    }
    public void getactive() {
        return active;
    }
    
}