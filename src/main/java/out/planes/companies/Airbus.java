package out.planes.companies;

import out.planes.models.Airplane;
import out.planes.flyghtInterfaces.FlightInterface;
import out.planes.enums.Type;

public class Airbus extends Airplane implements FlightInterface, Comparable<Airbus> {

    public Airbus (String modelName,
                   double tonnage,
                   Type type,
                   int passengerCapacity,
                   double fuelConsumption
    ) {

        this.modelName = modelName;
        this.tonnage = tonnage;
        this.passengerCapacity = passengerCapacity;
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public void fly() {
        System.out.println("I can touch the sky" + tonnage*fuelConsumption);
    }

    @Override
    public int compareTo(Airbus o) {
        return this.type.compareTo(o.type);
    }


}
