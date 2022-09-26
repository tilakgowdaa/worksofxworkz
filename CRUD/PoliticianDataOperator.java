class PoliticianDataOperator{
	static String[] polticianName={null,null,null,null,null};
	static int position=0;
	
	static void save(String name){
		System.out.println("save method started");
		polticianName[position]=name;
		System.out.println("enter politicain name :"+polticianName[position]);
		System.out.println("save method ended");
		
	}
	
	static void displayDetails(){
		System.out.println("displayDetails started");
		for(int index=0;index<polticianName.length;index++){
			System.out.println("element no: "+index);
		}
		System.out.println("displayDetails ended");
	}
		

}