package Chapter5;

public class Earth {
	//��� ����
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SURFACE_AREA;
	static { //Math.PI�� �ڹٿ��� �����ϴ� ����̴�.
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	}
}
