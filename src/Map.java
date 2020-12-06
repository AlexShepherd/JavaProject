import java.util.HashMap;

public class Map {

    private HashMap<String, Room> map;

    public Map() {
        map = new HashMap<>();
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
