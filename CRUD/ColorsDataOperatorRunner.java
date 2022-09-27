class ColorsDataOperatorRunner{
	public static void main(String[] name){
		
		System.out.println("main method started");
		ColorsDataOperator.save("red");
		ColorsDataOperator.save("white");
		ColorsDataOperator.save("black");
		ColorsDataOperator.save("pink");
		ColorsDataOperator.save("blue");
		ColorsDataOperator.save("purple");
		ColorsDataOperator.save("brown");
		ColorsDataOperator.displayDetails();
		boolean ref=ColorsDataOperator.find("red");
		System.out.println(ref);
		System.out.println("main method ended");
		
		
	}
	
	
}