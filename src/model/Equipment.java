
public class Equipment {

    private String id;
    private String name;
    private String model;
    private String installationId;
    private boolean status;
    private String lastMaintenanceDate;

    public Equipment(String id, String name, String model,String installationId,boolean status,String lastMaintenanceDate) {
        this.id = id;
        this.name = name;
        this.model = model;
        this.installationId = installationId;
        this.status = status;
        this.lastMaintenanceDate = lastMaintenanceDate;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public String getInstallationId() {
        return installationId;
    }

    public boolean isStatus() {
        return status;
    }

    public String getLastMaintenanceDate() {
        return lastMaintenanceDate;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    public void setLastMaintenanceDate(String lastMaintenanceDate) {
    this.lastMaintenanceDate = lastMaintenanceDate;
    }
}

