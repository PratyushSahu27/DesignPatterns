import models.ICar;

public class SUVCar implements ICar {
    @Override
    public int cost() {
        return 200;
    }
}
