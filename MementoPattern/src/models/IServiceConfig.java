package models;

public interface IServiceConfig {
    public IServiceConfig copyOf();

    public int getHeight();

    public int getLength();

    public void setHeight(int height);

    public void setLength(int length);
}
