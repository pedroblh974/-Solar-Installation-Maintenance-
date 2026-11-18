public class Battery extends Equipment {
    private double capacity;
    private double normalVoltage;
    private double maxChargeCurrent;
    private double maxDischargeCurrent;
    private double depthOfDischarge;
    private int cycleCount;
    private int maxCycleCount;
    private double stateOfHealth;   

    public Battery(String id, String name, String model, String installationId,boolean status, String lastMaintenanceDate,double capacity, double normalVoltage,double maxChargeCurrent, double maxDischargeCurrent,double depthOfDischarge, int cycleCount,int maxCycleCount, double stateOfHealth){
        super(id, name, model, installationId, status, lastMaintenanceDate);
        this.capacity = capacity;
        this.normalVoltage = normalVoltage;
        this.maxChargeCurrent = maxChargeCurrent;
        this.maxDischargeCurrent = maxDischargeCurrent;
        this.depthOfDischarge = depthOfDischarge;
        this.cycleCount = cycleCount;
        this.maxCycleCount = maxCycleCount;
        this.stateOfHealth = stateOfHealth;
    }

        public double getCapacity() {
        return capacity;
    }

    public double getNormalVoltage() {
        return normalVoltage;
    }

    public double getMaxChargeCurrent() {
        return maxChargeCurrent;
    }

    public double getMaxDischargeCurrent() {
        return maxDischargeCurrent;
    }

    public double getDepthOfDischarge() {
        return depthOfDischarge;
    }

    public int getCycleCount() {
        return cycleCount;
    }

    public int getMaxCycleCount() {
        return maxCycleCount;
    }

    public double getStateOfHealth() {
        return stateOfHealth;
    }
    
    
}
