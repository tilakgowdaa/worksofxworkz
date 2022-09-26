class TempleDataOperator{
	static String[] templeName={null,null,null,null,null};
	static int position=0;
	
	static void save(String name){
		System.out.println("save method started");
		templeName[position]=name;
		System.out.println("enter the temple name : "+templeName[position]+", position : "+position);
		position++;
		System.out.println("save method ended");
	}
	//static int index=0;
	static void displayDetails(){
		
		System.out.println("displayDetails started");
		
		for(int index=0;index<templeName.length;index++){
		System.out.println("Element name :"+templeName[index]);
		System.out.println("Element no:"+index);
		}
		System.out.println("displayDetails ended");
	}
	
	
} 