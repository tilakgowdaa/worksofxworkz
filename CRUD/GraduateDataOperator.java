class GraduateDataOperator{
	static String[] graduateName={null,null,null,null,null};
	static int position=0;
	
	static void save(String name){
		System.out.println("save method started");
		graduateName[position]=name;
		System.out.println("enter the graduate name : "+graduateName[position]+", position : "+position);
		position++;
		System.out.println("save method ended");
	}
	
	static void displayDetails(){
		
		System.out.println("displayDetails started");
		
		for(int index=0;index<graduateName.length;index++){
		System.out.println("Element name :"+graduateName[index]);
		System.out.println("Element no:"+index);
		}
		System.out.println("displayDetails ended");
	}
	
	
} 