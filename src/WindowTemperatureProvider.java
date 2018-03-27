public class WindowTemperatureProvider implements TemperatureProvider{

    public int getTemperature() {
        return 23;
    }

    @Override
    public boolean isAvailable() {
        return true;
    }
}
