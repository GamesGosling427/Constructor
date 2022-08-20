package constructor;

public class Triangle {
			double base;
			double height;
			
		Triangle(double b,double h){
				base=b;
				height=h;
			}
		public void findarea() {
			double area=0.5*base*height;
			System.out.println("the area is:"+area);
		}
		public void findperimeter() {
			double perimeter=base+height;
			System.out.println("perimeter is:"+perimeter);
		}
		public static void main(String[]args)
		{
			Triangle t1=new Triangle(12.1,32.1);
			t1.findarea();
			Triangle t2=new Triangle(12,54);
			t2.findarea();
			Triangle t3=new Triangle(12.2,12.2);
			t3.findperimeter();
		}
	}


