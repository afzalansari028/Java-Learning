package Generics;

import java.util.Comparator;

public class CarColorComparator implements Comparator<Car1> {

	@Override
	public int compare(Car1 tcar, Car1 ocar) {
		 
		return tcar.color.compareTo(ocar.color);
	}

}
