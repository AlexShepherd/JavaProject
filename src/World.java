// ---------------------------------------------------------------------------
// File name: World.java
// Project name: Game Project
// ---------------------------------------------------------------------------
// Creator’s name and email: Alex Shepherd, shepherdap@etsu.edu
// Course-Section: CSCI-1260-900
// Creation Date: 10-13-2020
// Date of Last Modification: 11/15/20
// ---------------------------------------------------------------------------

import java.util.ArrayList;

public class World
{
    public ArrayList<Chest> chests;
    public ArrayList<Barrel> barrels;
    public ArrayList<Actor> people;
    public Actor player;

    public World()
    {
        chests = new ArrayList<>();
        barrels = new ArrayList<>();
        people = new ArrayList<>();
        for (int i = 0; i < 3; i++)
        {
            makeChest();
            makeBarrel();
            makeGoblin();
        }
        player = new Human("Player");
    }

    public void makeChest()
    {
        Chest chest = new Chest();
        chest.pickup(EquipmentManager.makeRandomArmor());
        chest.pickup(EquipmentManager.makeRandomWeapon());
        chest.pickup(EquipmentManager.makeRandomConsumable());
        chests.add(chest);
    }

    public void makeBarrel()
    {
        Barrel barrel = new Barrel();
        barrel.pickup(EquipmentManager.makeRandomArmor());
        barrel.pickup(EquipmentManager.makeRandomWeapon());
        barrel.pickup(EquipmentManager.makeRandomConsumable());
        barrels.add(barrel);
    }

    public void makeHuman()
    {
        Human human = new Human("Bob");
        people.add(human);
    }

    public void makeGoblin()
    {
        Goblin goblin = new Goblin();
        people.add(goblin);
    }

    public String listChests()
    {
        String chestList = "\n";
        for (int i = 0; i < chests.size(); i++)
        {
            chestList += i + ". Chest";
            chestList += chests.get(i).getEquipmentList();
        }
        return chestList;
    }

    public String listBarrels()
    {
        String barrelList = "\n";
        for (int i = 0; i < barrels.size(); i++)
        {
            barrelList += i + ". Barrel";
            barrelList += barrels.get(i).getEquipmentList();
        }
        return barrelList;
    }

    public String listPeople()
    {
        return people.stream().map(person -> person.toString()).reduce("", (acc, s) -> acc + (s + "\n"));
    }

    public String listTargets()
    {
        return listPeople() + listBarrels();
    }

    public String speakTo(Actor actor)
    {
        return actor.saySomething();
    }

    public int attack(IHitable target)
    {
        return player.attack(target);
    }
    public void transferEquipment(IInventory source, IInventory destination)
    {
        int amount = source.countEquipment();
        for (int i = 0; i < amount; i++)
        {
            destination.pickup(source.getEquipment(i));
        }
        source.dropAllEquipment();
    }

    public String peekInside(IInventory inventory)
    {
        return inventory.getEquipmentList();
    }

    public String getPersonInfo(Actor actor)
    {
        return actor.toString();
    }

    public String getPlayerInfo()
    {
        return player.toString();
    }

    public String listPlayerInventory()
    {
        return player.getEquipmentList();
    }

    public boolean equipEquipment(Equipment eqmt)
    {
        return player.equip(eqmt);
    }

    public boolean useEquipment(Equipment eqmt, Actor target)
    {
        if(eqmt instanceof Weapon) return ((Weapon) eqmt).use(target);
        if(eqmt instanceof Armor) return ((Armor) eqmt).use(target);
        if(eqmt instanceof Consumable) return ((Consumable)eqmt).use(target);
        return false;
    }
}
