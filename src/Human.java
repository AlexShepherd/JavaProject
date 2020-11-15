import java.util.ArrayList;


public class Human extends Person {

    public Human() {

        super("Villager");
        {
            ArrayList<String> humanSayings = new ArrayList<String>();
            humanSayings.add("Hello!");
            humanSayings.add("Can I help you?");
            humanSayings.add("You look strong!");
            setThingsToSay(humanSayings);
        }
    }
    public Human(String name) {
        super(name);
    }

    public void setHuman(String name) {
        setName(name);
    }

    private void setName(String name) {
    }
}
