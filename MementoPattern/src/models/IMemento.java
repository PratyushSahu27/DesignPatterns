package models;

public interface IMemento {
    public void setState(IServiceConfig config);

    public IServiceConfig getState();
}
