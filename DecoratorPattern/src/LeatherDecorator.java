import models.ICar;

public class LeatherDecorator extends CarDecorator implements ICar {
    public LeatherDecorator(ICar car) {
        super(car);
    }

    @Override
    public int cost() {
        return this.car.cost() + 10;
    }
}
