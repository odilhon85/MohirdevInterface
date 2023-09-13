package uz.devior.converter;

public class Converter implements BaseConverter {

    @Override
    public double fromCelsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    @Override
    public double fromCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}
