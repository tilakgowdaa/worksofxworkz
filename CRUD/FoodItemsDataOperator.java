class FoodItemsDataOperator{
	static String[] foodName={null,null,null,null,null};
	static int position=0;
	
	static void save(String name){
		System.out.println("save method started");
		foodName[position]=name;
		System.out.println("enter the food name : "+foodName[position]+", position : "+position);
		position++;
		System.out.println("save method ended");
	}
	
	static void displayDetails(){
		
		System.out.println("displayDetails started");
		
		for(int index=0;index<foodName.length;index++){
		System.out.println("Element name :"+foodName[index]);
		System.out.println("Element no:"+index);
		}
		System.out.println("displayDetails ended");
	}
	
	
} 