import java.util.ArrayList;
class EquipmentRepository {
    ArrayList<Equipment> equipmentList = new ArrayList<>();

    public void addEquipment(Equipment equipment) {
        equipmentList.add(equipment);
    }

    public Equipment getEquipmentById(String id) {
        for (Equipment equipment : equipmentList) {
            if (equipment.getId().equals(id)) {
                return equipment;
            }
        }
        return null;

    public List<Equipment> getAllEquipment() {
        return new ArrayList<>(equipmentList);
    }

    public void removeEquipment(String id) {
        equipmentList.removeIf(equipment -> equipment.getId().equals(id));
    }
}