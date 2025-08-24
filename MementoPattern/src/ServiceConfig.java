import models.IServiceConfig;

public class ServiceConfig implements IServiceConfig {
    int length;
    int height;

    public ServiceConfig (int length, int height) {
        this.length = length;
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public IServiceConfig copyOf() {
        return new ServiceConfig(length, height);
    }
}
