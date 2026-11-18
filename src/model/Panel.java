public class Panel extends Equipment {
    private double ratedPowerW;
    private String type;
    private double voltageVmp;
    private double currentImp;
    private double openCircuitVoltage;
    private double shortCircuitCurrent;
    private double efficiency;
    private double tilt;

    public Panel(String name, double ratedPowerW, String type, double voltageVmp, double currentImp,
                 double openCircuitVoltage, double shortCircuitCurrent, double efficiency, double tilt) {
        super(name);
        this.ratedPowerW = ratedPowerW;
        this.type = type;
        this.voltageVmp = voltageVmp;
        this.currentImp = currentImp;
        this.openCircuitVoltage = openCircuitVoltage;
        this.shortCircuitCurrent = shortCircuitCurrent;
        this.efficiency = efficiency;
        this.tilt = tilt;
    }
} 