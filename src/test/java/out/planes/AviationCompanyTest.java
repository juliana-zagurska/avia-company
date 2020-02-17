package out.planes;

import org.junit.jupiter.api.Test;
import out.planes.companies.Airbus;
import out.planes.companies.Boeing;
import out.planes.enums.Type;
import out.planes.models.Airplane;
import sun.jvm.hotspot.utilities.Assert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AviationCompanyTest {

    @Test
    public void testSmt(){
        Boeing boeing = new Boeing("737", 2000, Type.MIDDLE_RANGE, 300, 30000D);
        Boeing boeing2 = new Boeing("738", 2000, Type.MIDDLE_RANGE, 300, 20000D);
        List<Boeing> list = new ArrayList<>();
        List<Airbus> list2 = new ArrayList<>();
        list.add(boeing);
        list.add(boeing2);
        AviationCompany aviationCompany = new AviationCompany(list, list2);
        Collections.sort(list);
        int i = aviationCompany.sumPassengerCapacity();
        assertTrue(i == 600); }

}