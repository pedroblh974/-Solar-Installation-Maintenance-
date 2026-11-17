private class Battery extends Equipment {
    private double capacity;
    private double normalVoltage;
    private double maxChargeCurrent;
    private double maxDischargeCurrent;
    private double depthOfDischarge;
    private double cycleCount;
    private double maxcycleCount;
    private double stateofhealth;

    public Battery(String name, double capacity, double normalVoltage, double maxChargeCurrent, double maxDischargeCurrent, double depthOfDischarge, double cycleCount, double maxcycleCount, double stateofhealth) {
        super(name);
        this.capacity = capacity;
        this.normalVoltage = normalVoltage;
        this.maxChargeCurrent = maxChargeCurrent;
        this.maxDischargeCurrent = maxDischargeCurrent;
        this.depthOfDischarge = depthOfDischarge;
        this.cycleCount = cycleCount;
        this.maxcycleCount = maxcycleCount;
        this.stateofhealth = stateofhealth;
    }
    public void getcapacity() {
        return capacity;
    } 
    public void getnormalVoltage() {
        return normalVoltage;
    } 
    public void getmaxChargeCurrent() {
        return maxChargeCurrent;
    }
    public void getmaxDischargeCurrent() {
        return maxDischargeCurrent;
    }
    public void getdepthOfDischarge() {
        return depthOfDischarge;
    }
    public void getcycleCount() {
        return cycleCount;
    }
    public void getmaxcycleCount() {
        return maxcycleCount;
    }
    public void getstateofhealth() {
        return stateofhealth;
    }
    
    
}
