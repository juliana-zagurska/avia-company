package out.planes;

import out.planes.companies.Boeing;
import out.planes.enums.Type;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Boeing boeing = new Boeing("737", 2000, Type.MIDDLE_RANGE, 300, 30000D);
        Boeing boeing2 = new Boeing("738", 2000, Type.MIDDLE_RANGE, 300, 20000D);
        List<Boeing> list = new ArrayList<>();
        list.add(boeing);
        list.add(boeing2);
        Collections.sort(list);
        list.forEach(s-> System.out.println(s.flightRange));

    }
}
