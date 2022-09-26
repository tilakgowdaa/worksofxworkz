class FoodItemsDataOperatorRunner{
	public static void main(String[] name){
		
		System.out.println("main method started");
		FoodItemsDataOperator.save("idli");
		FoodItemsDataOperator.save("sambar");
		FoodItemsDataOperator.save("vada");
		FoodItemsDataOperator.save("chutney");
		FoodItemsDataOperator.save("dosa");
		System.out.println("main method ended");
		
		FoodItemsDataOperator.displayDetails();
	}
	
	
}