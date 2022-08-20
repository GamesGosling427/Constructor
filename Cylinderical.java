package constructor;

public class Cylinderical {

	double radius;
	double height;

	Cylinderical(double r, double h) {
		radius = r;
		height = h;
		
	}

	public void findarea() {
		double area = 3.14 * (radius * radius) * height;
		System.out.println("the area is:" + area);
	}

	public static void main(String[] args) {
		Cylinderical c1 = new Cylinderical(2, 1);
		c1.findarea();
		Cylinderical c2 = new Cylinderical(21, 33);
		c2.findarea();
	}

}
