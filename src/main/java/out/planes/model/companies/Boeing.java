package out.planes.model.companies;

import out.planes.model.abstractions.Airplane;
import out.planes.flightInterfaces.FlightInterface;
import out.planes.enums.Type;
import out.planes.view.AirPlaneSound;

public class Boeing extends Airplane implements FlightInterface {

    public Boeing (String modelName,
                   double tonnage,
                   Type type,
                   int passengerCapacity,
                   Double flightRange) {

        this.modelName = modelName;
        this.tonnage = tonnage;
        this.type = type;
        this.passengerCapacity = passengerCapacity;
        this.fuelConsumption = calculateFuelConsumption(type);
        this.flightRange = flightRange;

    }

    @Override
    public void fly() {
        System.out.println(AirPlaneSound.BOEING_SOUND);
    }

    @Override
    public void run() {
        System.out.println("");
    }

    @Override
    public void brake() {

    }


    @Override
    public Double getFlightRange() {
        return this.flightRange;
    }

    @Override
    public double getFuelConsumption() {
        return this.fuelConsumption;
    }
}

