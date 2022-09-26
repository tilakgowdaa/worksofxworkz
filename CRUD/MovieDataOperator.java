class MovieDataOperator{
	static String[] mobileName={null,null,null,null,null};
	static int position=0;
	
	static void save(String name){
		System.out.println("save method started");
		mobileName[position]=name;
		System.out.println("enter the mobileName : "+mobileName[position]);
		position++;
		System.out.println("save method ended");
		
	}
	
	static void displayDetails(){
		System.out.println("displayDetails started");
		for(int index=0;index<mobileName.length;index++){
			System.out.println("Element name :"+mobileName[index]);
			System.out.println("Element no :"+index);
		}
		System.out.println("displayDetails ended");
		
	}
	
	
}