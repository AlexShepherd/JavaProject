import java.util.ArrayList;


public class Goblin extends Person {


    public Goblin() {

        super("Goblin");
        {
            ArrayList<String> goblinSayings = new ArrayList<String>();
            goblinSayings.add("STOP!");
            goblinSayings.add("GIVE ME YOUR GEAR!");
            goblinSayings.add("GIVE ME THE GEAR OR DIE!");

            setThingsToSay(goblinSayings);
        }
    }
    public Goblin(String name) {
        super(name);
    }

    public void setGoblin(String name) {

        setName(name);
    }

    private void setName(String name) {
    }
}
