package constructor;

public class Square {

	double width;
	double height;
	Square(double w,double h)
	{
		 width=w;
	     height=h;
	  
	}
       public void findarea() {
    	  double area=width*height;
    System.out.println("the area is:"+area);
   }
       public static void main(String[]args)
       {
    	   Square s1=new Square(13,5);
    	   s1.findarea();
    	   Square s2=new Square(23,2);
    	   s2.findarea();
       }
}
