import java.awt.*;

/**
 * Class Name: Weapon Cache <br>
 * Class Purpose: WeaponCache class implementing IUsable and IInventory<br>
 *
 * <hr>
 * Date created: 11-30-2020
 * Date last modified: 12-02-2020
 * @author Flavio Sanguinetti
 */

public class WeaponCache extends Container implements IUsable, IInventory {
    EquipmentManager inventory;

    public WeaponCache() {
        inventory = new EquipmentManager();
    }

    @Override
    public boolean use(Actor actor)
    {
        return false;
    }

    public void pickup(Equipment equipment) {
        inventory.addEquipment(equipment);
    }

    public void transferAllEquipmentFrom(IInventory other) {
        int otherSize = other.countEquipment();
        for (int i = 0; i < otherSize; i++) {
            pickup(other.getEquipment(i));
        }
        other.dropAllEquipment();
    }
    public int countArmor() {
        return inventory.countArmor();
    }

    public int countWeapons() {
        return inventory.countWeapons();
    }

    public int countConsumables() {
        return inventory.countConsumables();
    }

    public int countEquipment() {
        return countEquipment();
    }

    public String getEquipmentList() {
        return inventory.getEquipmentList();
    }

    public String getEquipmentInfo(int index) {
        return inventory.getEquipmentDetails(index);
    }

    public Equipment getEquipment(int index) {
        return inventory.getEquipment(index);
    }

    public void dropEquipment(int index) {
        inventory.removeEquipment(index);
    }

    public void dropAllEquipment() {
        inventory.clearAll();
    }
}
