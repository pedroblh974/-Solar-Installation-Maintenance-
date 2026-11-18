class Installation {
  private String id;
  private String name;
  private double capacity;
  private String location;
  private boolean status;


  public Installation(String id, String name, double capacity, String location) {
    this. = id;
    this.name = name;
    this.capacity = capacity;
    this.location = location;
    this.status = false;
  }
  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public double getCapacity() {
    return capacity;
  }

  public String getLocation() {
    return location;
  }

  public boolean isStatus() {
    return status;
  }
} 

    