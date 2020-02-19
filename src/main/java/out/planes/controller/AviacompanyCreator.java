package out.planes.controller;

import out.planes.AviationCompany;
import out.planes.enums.Type;
import out.planes.model.abstractions.Airplane;
import out.planes.model.companies.Airbus;
import out.planes.model.companies.Boeing;

import java.util.ArrayList;
import java.util.List;

public class AviacompanyCreator {

    public AviationCompany createAviationcompany() {
        Boeing boeing = new Boeing("Boeing-737", 3000, Type.LOW_RANGE, 200, 3600D);
        Boeing boeingJumboJet = new Boeing("Boeing-747", 6000, Type.LONG_RANGE, 500, 10000D);
        Boeing boeingDreamLiner = new Boeing("Boeing-738", 3000, Type.MIDDLE_RANGE, 300, 7600D);
        Airbus airbusBig = new Airbus("Airbus-380", 8000, Type.LOW_RANGE, 800, 10000D);
        List<Airplane> airplaneList = new ArrayList<Airplane>() {{
            add(boeing);
            add(boeingJumboJet);
            add(boeingDreamLiner);
            add(airbusBig);
        }};
        return new AviationCompany(airplaneList);
    }
}
