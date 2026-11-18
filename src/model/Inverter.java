public class Inverter extends Equipment {
    private String type;
    private double ratedPowerKw;
    private double maxInputVoltage;
    private double maxInputCurrent; 
    private double outputVoltage; 
    private double efficiency;
    private double frequencyHz;
    private int phases;                         

    public Inverter(String type, double ratedPowerKw, double maxInputVoltage, double maxInputCurrent, double outputVoltage, double efficiency, double frequencyHz, int phases) {
        super();
        this.type = type;   
        this.ratedPowerKw = ratedPowerKw;
        this.maxInputVoltage = maxInputVoltage;
        this.maxInputCurrent = maxInputCurrent;
        this.outputVoltage = outputVoltage;
        this.efficiency = efficiency;
        this.frequencyHz = frequencyHz;
        this.phases = phases;
    }

    
    public double getEfficiency() {
        return efficiency;
    }

    public double getRatedPowerKw() {
        return ratedPowerKw;
    }

    public double getMaxInputVoltage() {
        return maxInputVoltage;
    }

    public double getMaxInputCurrent() {
        return maxInputCurrent;
    }

    public double getOutputVoltage() {
        return outputVoltage;
    }

    public double getFrequencyHz() {
        return frequencyHz;
    }

    public int getPhases() {
        return phases;
    }

    public String getType() {
        return type;
    }

    
}