class TempleDataOperatorRunner{
	public static void main(String[] name){
		
		System.out.println("main method started");
		TempleDataOperator.save("tirumala temple");
		TempleDataOperator.save("sharada temple");
		TempleDataOperator.save("ganesha temple");
		TempleDataOperator.save("basava temple");
		TempleDataOperator.save("lakshmi temple");
		System.out.println("main method ended");
		
		TempleDataOperator.displayDetails();
	}
	
	
}