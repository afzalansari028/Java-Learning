package Generics;
import java.util.Comparator;
public class CarSpeedComparator implements Comparator<Car1>{

	public int compare(Car1 tcar, Car1 ocar) {
		
		return tcar.speed - ocar.speed;
	}

}
