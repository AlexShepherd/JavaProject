import java.util.HashMap;

public class Map {

    String name;
    private HashMap<String, Room> map;

    public Map() {
        map = new HashMap<String, Room>();
    }

    public void addRoom(Room room)
    {
        map.put(room.getName(), room);
    }
    public Room getRoom(String name)
    {
        return map.get(name);
    }
}
