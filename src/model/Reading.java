package model;
public class Reading {
    private String id;
    private String equipmentId;
    private String metric;
    private double value;
    private String unit;
    private String dateTime;
    private String source;
    private String operator;

    public Reading(String id, String equipmentId, String metric, double value, String unit, String dateTime, String source, String operator) {
        this.id = id;
        this.equipmentId = equipmentId;
        this.metric = metric;
        this.value = value;
        this.unit = unit;
        this.dateTime = dateTime;
        this.source = source;
        this.operator = operator;
    }

    public String getId() {
        return id;
    }

    public String getEquipmentId() {
        return equipmentId;
    }

    public String getMetric() {
        return metric;
    }

    public double getValue() {
        return value;
    }

    public String getUnit() {
        return unit;
    }

    public String getDateTime() {
        return dateTime;
    }

    public String getSource() {
        return source;
    }

    public String getOperator() {
        return operator;
    }
}