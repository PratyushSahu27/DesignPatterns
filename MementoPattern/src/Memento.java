import models.IMemento;
import models.IServiceConfig;

public class Memento implements IMemento {

    IServiceConfig serviceConfig;

    public Memento(IServiceConfig serviceConfig) {
        this.serviceConfig = serviceConfig.copyOf();

    }

    public IServiceConfig getState() {
        return serviceConfig;
    }

    public void setState(IServiceConfig serviceConfig) {
        this.serviceConfig = serviceConfig;
    }
}


