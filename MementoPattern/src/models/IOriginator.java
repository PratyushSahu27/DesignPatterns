package models;

public interface IOriginator {
    public IMemento createMemento();

    public void restoreMemento(IMemento memento);

    public void setServiceConfig(IServiceConfig serviceConfig);

    public IServiceConfig getServiceConfig();

}
