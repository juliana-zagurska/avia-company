package out.planes;

import out.planes.model.abstractions.Airplane;

import java.util.List;

public class AviationCompany {
    List<Airplane> airplaneList;

    public AviationCompany(List<Airplane> airplanes) {
        this.airplaneList = airplanes;
    }


    public int sumPassengerCapacity() {
        int sumPassengerCapacity = 0;
        for (int i = 0; i < this.airplaneList.size(); i++) {
            sumPassengerCapacity =+ this.airplaneList.get(i).passengerCapacity;
        }
        return sumPassengerCapacity;
    }

    public double sumTonnage() {
        return this.airplaneList.stream()
                .mapToDouble(airplane->airplane.tonnage)
                .sum();
    }

    public Airplane findByFuelConsumption(double from, double to) {
        Airplane wantToFind = null;
        for (Airplane airplane: this.airplaneList) {
            if (airplane.getFuelConsumption() == from || airplane.getFuelConsumption() == to) {
                wantToFind = airplane;
            }
        }
        return wantToFind;
    }
}
