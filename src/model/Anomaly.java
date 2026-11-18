package model;
public class Anomaly {
    public static final String STATUS_ACTIVE = "ACTIVE";
    public static final String STATUS_CLOSED = "CLOSED";
    private final String id ;
    private final String equipmentId;
    private final String readingId ;
    private final String thresholdId ;
    private String description ;
    private String severity ;
    private String detectionDate;
    private String closureDate;
    private String status;
    public Anomaly(String id, String equipmentId, String readingId,
        String thresholdId, String description, String severity,
        String detectionDate, String closureDate, String status) {

    if (isBlank(id) || isBlank(equipmentId)) {
        throw new IllegalArgumentException("Anomaly must have an id and an equipment id");
    }

    if (isBlank(readingId)) {
        throw new IllegalArgumentException("Anomaly must reference a reading");
    }

    if (isBlank(thresholdId)) {
        throw new IllegalArgumentException("Anomaly must reference a threshold");
    }

    if (!STATUS_ACTIVE.equals(status) && !STATUS_CLOSED.equals(status)) {
        throw new IllegalArgumentException("Invalid anomaly status: " + status);
    }

    if (STATUS_ACTIVE.equals(status) && closureDate != null) {
        throw new IllegalArgumentException("Active anomaly cannot have a closure date");
    }

    if (STATUS_CLOSED.equals(status) && isBlank(closureDate)) {
        throw new IllegalArgumentException("Closed anomaly must have a closure date");
    }

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
    private static boolean isBlank(String s) {
        return s == null || s.isBlank();
    }
    public String getId() {
    return id;
    }
    public String getEquipmentId() {
        return equipmentId;
    }
    public String getReadingId() {
        return readingId;
    }
    public String getThresholdId() {
        return thresholdId;
    }
    public String getDescription() {
        return description;
    }
    public String getSeverity() {
        return severity;
    }
    public String getDetectionDate() {
        return detectionDate;
    }
    public String getClosureDate() {
        return closureDate;
    }
    public String getStatus() {
        return status;  
    }
     public boolean isActive() {
        return STATUS_ACTIVE.equals(status);
    }

  
    public boolean isSameProblem(String equipmentId, String thresholdId) {
        return this.equipmentId.equals(equipmentId)
            && this.thresholdId.equals(thresholdId);
    }

    public void close(String closureDate) {
        if (!isActive()) {
            throw new IllegalStateException("Anomaly " + id + " is already closed");
        }
        if (isBlank(closureDate)) {
            throw new IllegalArgumentException("Closure date is required");
        }
        this.closureDate = closureDate;
        this.status = STATUS_CLOSED;
    }
        @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return id.equals(((Anomaly) o).id);
    }

    @Override
    public int hashCode() {
       return id.hashCode();
    }

    @Override
        public String toString() {
            return "Anomaly {"
                    + "id=" + id + ", "
                    + "equipmentId=" + equipmentId + ", "
                    + "severity=" + severity + ", "
                    + "status=" + status + "}";
        }
        public String toDetailedString() {
            return "Anomaly{"
                + "\n id='" + id + "'"
                + "\n equipmentId='" + equipmentId + "'"
                + "\n readingId='" + readingId + "'"
                + "\n thresholdId='" + thresholdId + "'"
                + "\n description='" + description + "'"
                + "\n severity='" + severity + "'"
                + "\n detectionDate='" + detectionDate + "'"
                + "\n closureDate='" + (closureDate == null ? "-" : closureDate) + "'"
                + "\n status='" + status + "'"
                + "\n}";
        }
}