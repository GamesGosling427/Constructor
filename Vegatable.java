package constructor;

public class Vegatable {
		int price;
		double weight;
		String name;
		Vegatable(String n,double w,int p)
		{
			name=n;
			price=p;
			weight=w;
		}
	      public  void displayvegatable()
	   {
		System.out.println("name is:"+name);
		System.out.println("weight is :"+weight);
		System.out.println("price is:"+price);
		System.out.println("==============");
	}

	}

