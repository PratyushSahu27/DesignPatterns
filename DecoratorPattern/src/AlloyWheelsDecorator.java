import models.ICar;

public class AlloyWheelsDecorator extends CarDecorator implements ICar {
    public AlloyWheelsDecorator(ICar car) {
        super(car);
    }

    @Override
    public int cost() {
        return this.car.cost() + 15;
    }
}
