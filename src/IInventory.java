// ---------------------------------------------------------------------------
// File name: IInventory.java
// Project name: Game Project
// ---------------------------------------------------------------------------
// Creator’s name and email: Roberto Hernandez, hernandezr@etsu.edu
// Course-Section: CSCI-1260-900
// Creation Date: 11-4-2020
// Date of Last Modification: 11-4-2020
// ---------------------------------------------------------------------------

/**
 * Class Name: IInventory <br>
 * Class Purpose: interface for Person inventory<br>
 *
 * <hr>
 * Date created: 11-4-2020
 * Date last modified: 11-4-2020
 * @author Roberto Hernandez
 */
    public interface IInventory
    {
        public void pickup(Equipment equipment);
        public void transferAllEquipmentFrom(IInventory other);
        public int countArmor();
        public int countWeapons();
        public int countConsumables();
        public int countEquipment();
        public String getEquipmentList();
        public String getEquipmentInfo(int index);
        public Equipment getEquipment(int index);
        public void dropEquipment(int index);
        public void dropAllEquipment();
    }
