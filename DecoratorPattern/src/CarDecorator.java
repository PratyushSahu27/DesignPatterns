import models.ICar;

public abstract class CarDecorator implements ICar {
    protected ICar car;

    public CarDecorator (ICar car) {
        this.car = car;
    }
}
