class Equipment {
    protected String id;
    protected String name;
    protected String model;
    protected String installationId;
    protected boolean status;
    protected String lastMaintenanceDate;
    
    public Equipment(String id,String name,String model,String installationId,String lastMaintenanceDate){
        this.id = id;
        this.name = name;
        this.model = model;
        this.installationId = installationId;
        this.status = false;
        this.lastMaintenanceDate = lastMaintenanceDate;
    }
 public String getid(){
    return id;
}
public String getname(){
    retuen name;
}
public String getmodel(){
    return model;
}
public String getinstallationId (){
    return installationId ;
}
public String getstatus(){
    return status;
}
public void setstatus(boolean status){
    this.status = status;
}
public String getlastMaintenanceDate(){
    return lastMaintenanceDate;
}
}