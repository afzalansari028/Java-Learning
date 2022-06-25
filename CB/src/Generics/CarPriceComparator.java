package Generics;

import java.util.Comparator;

public class CarPriceComparator implements Comparator<Car1> {

	@Override
	public int compare(Car1 tcar, Car1 ocar) {
		
		return ocar.price - tcar.price;
		
		
	}

}
