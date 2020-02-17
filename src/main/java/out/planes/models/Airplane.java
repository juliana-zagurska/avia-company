package out.planes.models;

import out.planes.enums.Type;

public abstract class Airplane {

    private double FUEL_CONSUMPTION_LONG_COEF = 1;
    private double FUEL_CONSUMPTION_MIDDLE_COEF = 0.5;
    private double FUEL_CONSUMPTION_LOW_COEF = 0.2;

    public String modelName;
    public double tonnage;
    public Type type;
    public int passengerCapacity;
    public double fuelConsumption;
    public Double flightRange;


    public double calculateFuelConsumption(Type type) {
        if (type.equals(Type.LONG_RANGE)) {
          return this.tonnage* FUEL_CONSUMPTION_LONG_COEF;

        }else if (type.equals(Type.MIDDLE_RANGE)) {
            return this.tonnage*FUEL_CONSUMPTION_MIDDLE_COEF;
        }
        return this.tonnage*FUEL_CONSUMPTION_LOW_COEF;
    }



}
