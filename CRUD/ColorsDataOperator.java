class ColorsDataOperator{
	static String[] colorsName={null,null,null,null,null,null,null};
	static int position=0;
	
	static void save(String name){
		System.out.println("save method started");
		if(name!=null && name.length()>=3){
			if(position>=7){
				System.err.println("colors exceeded");
				return;
			}
		colorsName[position]=name;
		System.out.println("enter the graduate name : "+colorsName[position]+", position : "+position);
		position++;
		System.out.println("save method ended");
		}
		else{
			System.out.println("enter minimum character");
		}
	}
	
	static void displayDetails(){
		
		System.out.println("displayDetails started");
		
		for(int index=0;index<colorsName.length;index++){
		System.out.println("Element name :"+colorsName[index]);
		System.out.println("Element no:"+index);
		}
		System.out.println("displayDetails ended");
	}
	
	static boolean find(String color){
		for(int value=0;value<colorsName.length;value++){
			if(colorsName[value]==color)					
				return true;				
			}
			return;
	}
	
	
} 