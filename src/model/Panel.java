public class Panel extends Equipment {
    private double ratedPowerW;
    private String type;
    private double voltageVmp;
    private double currentImp;
    private double openCircuitVoltage;
    private double shortCircuitCurrent;
    private double efficiency;
    private double tilt;

    public Panel(String name, double ratedPowerW, String type, double voltageVmp, double currentImp,double openCircuitVoltage, double shortCircuitCurrent, double efficiency, double tilt ,String id, String name, String model,String installationId,boolean status,String lastMaintenanceDate) {
        super(id, name, model, installationId, status, lastMaintenanceDate);
        this.ratedPowerW = ratedPowerW;
        this.type = type;
        this.voltageVmp = voltageVmp;
        this.currentImp = currentImp;
        this.openCircuitVoltage = openCircuitVoltage;
        this.shortCircuitCurrent = shortCircuitCurrent;
        this.efficiency = efficiency;
        this.tilt = tilt;
    }
    public double getRatedPowerW() {
        return ratedPowerW;
    }
    public String getType() {
        return type;
    }
    public double getVoltageVmp() {
        return voltageVmp;
    }
    public double getCurrentImp() {
        return currentImp;
    }
    public double getOpenCircuitVoltage() {
        return openCircuitVoltage;
    }
    public double getShortCircuitCurrent() {
        return shortCircuitCurrent;
    }
    public double getEfficiency() {
        return efficiency;
    }
    public double getTilt() {
        return tilt;
    }
    
} 