import java.util.ArrayList;
class InstallationRepository {
    ArrayList<Installation> installationList = new ArrayList<>();

    public void addInstallation(Installation installation) {
        installationList.add(installation);
    }

    public Installation getInstallationById(String id) {
        for (Installation installation : installationList) {
            if (installation.getId().equals(id)) {
                return installation;
            }
        }
        return null;
    }

    public List<Installation> getAllInstallations() {
        return new ArrayList<>(installationList);
    }
    public void removeInstallation(String id) {
        installationList.removeIf(installation -> installation.getId().equals(id));
    }
    
}