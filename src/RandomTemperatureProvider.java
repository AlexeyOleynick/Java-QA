public class RandomTemperatureProvider implements TemperatureProvider {

    private int min;
    private int max;

    public RandomTemperatureProvider(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public boolean isAvailable() {
        return true;
    }

    @Override
    public int getTemperature() {
        return min + (int) (Math.random() * ((max - min) + 1));
    }
}
