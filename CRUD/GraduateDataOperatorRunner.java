class GraduateDataOperatorRunner{
	public static void main(String[] name){
		
		System.out.println("main method started");
		GraduateDataOperator.save("raj");
		GraduateDataOperator.save("kumar");
		GraduateDataOperator.save("puneeth");
		GraduateDataOperator.save("shivu");
		GraduateDataOperator.save("raghav");
		System.out.println("main method ended");
		
		GraduateDataOperator.displayDetails();
	}
	
	
}