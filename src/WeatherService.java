public class WeatherService {
    TemperatureProvider temperatureProvider;

    public WeatherService(TemperatureProvider temperatureProvider) {
        this.temperatureProvider = temperatureProvider;
    }

    public void setTemperatureProvider(TemperatureProvider temperatureProvider) {
        this.temperatureProvider = temperatureProvider;
    }

    public int getTemperature() {
        return temperatureProvider.getTemperature();
    }
}
