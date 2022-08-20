package constructor;

public class Circle {

	double radius;
	
	Circle(double r){
		radius=r;
	}
       public void findarea() {
    	  double area=3.14*radius*radius;
    System.out.println("the area is:"+area);
   }
       public static void main(String[]args)
       {
    	   Circle c1=new Circle(4);
    	   c1.findarea();
    	   Circle c2=new Circle(21);
    	   c2.findarea();
	}

}
