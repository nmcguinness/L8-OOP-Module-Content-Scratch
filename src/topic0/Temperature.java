package topic0;

public class Temperature {

    //class variable (all temp objects refer to same value)
    private static final double ABSOLUTE_ZER0_CELSIUS = 273.15;

    //instance variable (every temp object has one!)
    private double valueInCelsius;

    public double toCelsius(){
        return valueInCelsius;
    }
    public double toFahrenheit(){
        return valueInCelsius * 1.8 + 32;
    }

    public double toKelvin(){
        return valueInCelsius + ABSOLUTE_ZER0_CELSIUS;
    }

    public Temperature(double value){
        if(value < -ABSOLUTE_ZER0_CELSIUS)
            throw new IllegalArgumentException("topic0.Temperature value cannot < abs zero");
        this.valueInCelsius = value;
    }

    @Override
    public String toString(){
        return String.format("%.2f", valueInCelsius) + "°C";
    }
}
