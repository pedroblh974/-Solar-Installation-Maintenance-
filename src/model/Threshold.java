
package model;

import java.util.Objects;

public class Threshold {

    private String id;
    private String equipmentId;
    private String metric;
    private Double minValue;
    private Double maxValue;
    private String unit;
    private String severity;
    private boolean active;

    // Constructor
    public Threshold(String id, String equipmentId,
                     String metric, Double minValue,
                     Double maxValue, String unit,
                     String severity, boolean active) {

        if (id == null || id.isBlank()) {
            throw new IllegalArgumentException("ID is required");
        }

        if (minValue == null || maxValue == null
                || minValue > maxValue) {
            throw new IllegalArgumentException(
                "Invalid threshold values"
            );
        }

        this.id = id;
        this.equipmentId = equipmentId;
        this.metric = metric;
        this.minValue = minValue;
        this.maxValue = maxValue;
        this.unit = unit;
        this.severity = severity;
        this.active = active;
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getEquipmentId() {
        return equipmentId;
    }

    public String getMetric() {
        return metric;
    }

    public Double getMinValue() {
        return minValue;
    }

    public Double getMaxValue() {
        return maxValue;
    }

    public String getUnit() {
        return unit;
    }

    public String getSeverity() {
        return severity;
    }

    public boolean isActive() {
        return active;
    }

    // Setters
    public void setActive(boolean active) {
        this.active = active;
    }

    public void setMinValue(Double minValue) {
        if (minValue == null || minValue > maxValue) {
            throw new IllegalArgumentException("Invalid minimum value");
        }
        this.minValue = minValue;
    }

    public void setMaxValue(Double maxValue) {
        if (maxValue == null || maxValue < minValue) {
            throw new IllegalArgumentException("Invalid maximum value");
        }
        this.maxValue = maxValue;
    }

    // Check threshold
    public boolean isExceeded(Double value) {
        if (!active || value == null) {
            return false;
        }

        return value < minValue || value > maxValue;
    }

    // toString
    @Override
    public String toString() {
        return "Threshold{" +
                "id='" + id + '\'' +
                ", equipmentId='" + equipmentId + '\'' +
                ", metric='" + metric + '\'' +
                ", minValue=" + minValue +
                ", maxValue=" + maxValue +
                ", unit='" + unit + '\'' +
                ", severity='" + severity + '\'' +
                ", active=" + active +
                '}';
    }

    // equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Threshold)) return false;

        Threshold other = (Threshold) obj;
        return Objects.equals(id, other.id);
    }

    // hashCode
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
