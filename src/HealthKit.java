public class HealthKit extends Consumable {

    public HealthKit(String name, int price, double durability) {
        super(name, price, durability);
    }

    public HealthKit() {
        super("Health Kit", 50, 1);
    }

    @Override
    public boolean use(Person person) {
        if (person.getCurrentHealth() == person.getMaxHealth()) {
            return false;
        }
        person.heal(5);
        return true;
    }
}
