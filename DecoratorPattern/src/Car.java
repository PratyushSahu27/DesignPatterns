import models.ICar;

public class Car implements ICar {
    @Override
    public int cost() {
        return 100;
    }
}
