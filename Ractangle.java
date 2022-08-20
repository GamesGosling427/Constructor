package constructor;

public class Ractangle {
	double width;
	double height;
	Ractangle(double w,int h){
		width=w;
	    height=h;
	}
       public void findarea() {
    	  double area=width*height;
    System.out.println("the area is:"+area);
   }
       public void findperimeter() {
    	   double perimeter=2*(width*height);
    	   System.out.println("the perimeter is:"+perimeter);
       }
       public static void main(String[]args)
       {
    	   Ractangle r1=new Ractangle(43,23);
    	   r1.findarea();
    	   Ractangle r2=new Ractangle(213,323);
    	   r2.findarea();
    	   Ractangle r3=new Ractangle(12,43);
    	   r3.findperimeter();
    	   
       }


}
