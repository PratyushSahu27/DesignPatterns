import models.ICar;

public class LEDLightsDecorator extends CarDecorator implements ICar {
    public LEDLightsDecorator(ICar car) {
        super(car);
    }

    @Override
    public int cost() {
        return car.cost() + 30;
    }
}
