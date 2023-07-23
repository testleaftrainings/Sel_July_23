package week1.day2;

public class LearnMethods {
	
	//am rt mn(){}
	
	String food="Roti";
	
	void windowShopping() {
		System.out.println("Scanned through pdts");
	}
		
	private int orderFood(String foodItem, int count) {
		System.out.println(foodItem);
		int s=count+1;
		return s ;
	}
	
	public boolean orderMore() {
	
		return true;
		//to get the output out of the method and use it as input for other methods
		
	}
	//default value
	
    //String =null
	//int=0
	//float=0.0
	//boolean=false
	public static void main(String[] args) {
	//Instatiation -Creating object for the class
		//classname ref/object=new classname();
		LearnMethods table=new LearnMethods();//constructor -->creates memory for the object
		table.windowShopping();
		//ctrl 2 l
		int orderFood = table.orderFood("FriedRice", 4);
		System.out.println(table.orderFood("FriedRice", 4));
		int orderFood2 = table.orderFood("Dosa", orderFood);
		System.out.println(orderFood2);
		table.orderMore();
		System.out.println(table.food);

	}

}
