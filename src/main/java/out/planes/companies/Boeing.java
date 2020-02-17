package out.planes.companies;

import out.planes.models.Airplane;
import out.planes.flyghtInterfaces.FlightInterface;
import out.planes.enums.Type;

public class Boeing extends Airplane implements FlightInterface, Comparable<Boeing> {

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
        System.out.println("I can fly " + tonnage*fuelConsumption);
    }


    @Override
    public int compareTo(Boeing o) {
        return this.flightRange.compareTo(o.flightRange);
    }



}

