package out.planes;

import out.planes.models.Airplane;

import java.util.List;

public class AviationCompany<T extends Airplane> {
    List<T> airplaneList;
    List<T> anotherList;

    public AviationCompany(List<T> airplanes, List<T> anotherList) {
        this.airplaneList = airplanes;
        this.anotherList = anotherList;
    }

    public Airplane getAirplaneByFuelConsumption(double fuelConsumption) {
        Airplane airplane = null;
        for (Airplane value : this.airplaneList) {
            if (value.fuelConsumption == fuelConsumption) {
                airplane = value;
            }
        }
        return airplane;
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
}
