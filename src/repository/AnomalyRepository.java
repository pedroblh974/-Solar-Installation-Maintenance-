import java.util.ArrayList;
class AnomalyRepository {
    ArrayList<Anomaly> anomalyList = new ArrayList<>();

    public void addInstallation(Anomaly anomaly) {
        anomalyList.add(anomaly);
    }

    public Anomaly getAnomalyById(String id) {
        for (Anomaly anomaly : anomalyList) {
            if (anomaly.getId().equals(id)) {
                return anomaly;
            }
        }
        return null;
    }

    public List<Anomaly> getAllAnomalys() {
        return new ArrayList<>(anomalyList);
    }
    public void removeAnomaly(String id) {
        anomalyList.removeIf(anomaly -> anomaly.getId().equals(id));
    }
    
}