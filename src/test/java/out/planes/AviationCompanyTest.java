package out.planes;

import org.junit.jupiter.api.Test;
import out.planes.model.companies.Airbus;
import out.planes.model.companies.Boeing;
import out.planes.enums.Type;
import out.planes.model.abstractions.Airplane;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AviationCompanyTest {

    @Test
    public void testSorting(){
        AviationCompany aviationCompany = createAviationCompany();
        aviationCompany.airplaneList.sort(Comparator.comparing(Airplane::getFlightRange)); //сортировка
        int i = aviationCompany.sumPassengerCapacity();
        assertEquals(20000, (double) aviationCompany.airplaneList.get(0).getFlightRange());
    }

    @Test
    public void testFindByFuelConsumption() {
        AviationCompany aviationCompany = createAviationCompany();
        Airplane byFuelConsumption = aviationCompany.findByFuelConsumption(1000, 2000);
        assertEquals("738", byFuelConsumption.modelName);
    }

    private AviationCompany createAviationCompany() {
        Boeing boeing = new Boeing("738", 2000, Type.LONG_RANGE, 300, 30000D);
        Airbus airbus = new Airbus("737", 3000, Type.MIDDLE_RANGE, 300, 20000D);
        List<Airplane> list = new ArrayList<>();
        list.add(boeing);
        list.add(airbus);
        return new AviationCompany(list);
    }

}