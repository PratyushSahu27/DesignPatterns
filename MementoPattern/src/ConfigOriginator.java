import models.IMemento;
import models.IOriginator;
import models.IServiceConfig;

public class ConfigOriginator implements IOriginator {
    IServiceConfig serviceConfig;

    public ConfigOriginator(IServiceConfig serviceConfig) {
        this.serviceConfig = serviceConfig;
    }

    @Override
    public IMemento createMemento() {
        return new Memento(serviceConfig);
    }

    @Override
    public void restoreMemento(IMemento memento) {
        serviceConfig = memento.getState().copyOf();
    }

    public void setServiceConfig(IServiceConfig serviceConfig) {
        this.serviceConfig = serviceConfig;
    }

    public IServiceConfig getServiceConfig() {
        return serviceConfig;
    }
}
