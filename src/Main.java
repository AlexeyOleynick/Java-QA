public class Main {
    public static void main(String[] args) {

        WindowTemperatureProvider windowTemperatureProvider = new WindowTemperatureProvider();

        WeatherService weatherService = new WeatherService(windowTemperatureProvider);
        System.out.println(weatherService.getTemperature());
        System.out.println(weatherService.getTemperature());
        System.out.println();

        weatherService.setTemperatureProvider(new RandomTemperatureProvider(0, 100));
        System.out.println(weatherService.getTemperature());
        System.out.println(weatherService.getTemperature());
        System.out.println(weatherService.getTemperature());
        System.out.println();

        weatherService.setTemperatureProvider(new RandomTemperatureProvider(10, 20));
        System.out.println(weatherService.getTemperature());
        System.out.println(weatherService.getTemperature());
        System.out.println(weatherService.getTemperature());
        System.out.println();

        weatherService.setTemperatureProvider(windowTemperatureProvider);
        System.out.println(weatherService.getTemperature());
    }
}