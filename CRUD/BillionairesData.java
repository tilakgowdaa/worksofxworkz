class BillionairesData{
	static String[] billionairesName={null,null,null,null,null,null,null,null,null,null};
	static int position=0;
	
	static void save (String name){
		if(name!=null && name.length()>4){
			if(position>=10){
				System.err.println("name exceed");
				return;
			}
			billionairesName[position]=name;
			System.out.println("save started");
			System.out.println("billionairesName : "+billionairesName[position]);
			position++;
			System.out.println("save ended");
			}
		else{
			System.out.println("enter the valid name");
		}
	}
	
	static void displayaDetails(){
		System.out.println("displayaDetails staarted");
		for(int bond=0;bond<billionairesName.length;bond++){
			System.out.println("element :"+billionairesName[bond]);
		}
		System.out.println("displayaDetails ended");
		
	}
	
	static boolean findName(String billionaire){
		System.out.println("findName started");
		if(billionaire!=null && billionaire.length()>4){
			for(int value=0;value<billionairesName.length;value++){
				if(billionairesName[value]==billionaire)
				return true;
			}
		}
		else{
			System.out.println("enter valid name");
		}
		System.out.println("findName ended");
	 return false;		
	}
	
	static String update(String oldName,String newName){
		System.out.println("update started");
		if(newName!=null && newName.length()>4){
			for(int index=0;index<billionairesName.length;index++){
				if(billionairesName[index]==oldName){
					System.out.println("name found :"+oldName+" position :"+index);
					billionairesName[index]=newName;
					System.out.println("updated name :"+billionairesName[index]+" position :"+index);
				}
			}
		}
		else{
			System.out.println("enter valid name");
		}
		
		System.out.println("update ended");	
		return null;
	}
	
	static String update(int index,String newName){
		System.out.println("update started");
		if(newName!=null && newName.length()>4){
			System.out.println("name found :"+billionairesName[index]+" Position :"+index);
			billionairesName[index]=newName;
			System.out.println("updated name :"+billionairesName[index]+" Position :"+index);
			return newName;
		}
		else{
			System.out.println("enter valid data");
		}
		System.out.println("update ended");
		return null;
	}
	
	static boolean delete(String billionaire){
		System.out.println("delete started");
		if(billionaire.length()>4){
		for(int index=0;index<billionairesName.length;index++){
			if(billionairesName[index]==billionaire){
				System.out.println("deleted name :"+billionairesName[index]);
				billionairesName[index]=null;
				return true;
				
			}
		}
		}
		else{
				System.out.println("enter valid details");
			}
		return false;
	}
	
	
	static boolean delete(int index,String billionaire){
		System.out.println("delete started");
		if(billionairesName[index]==billionaire){
			System.out.println("deleted name :"+billionairesName[index]);
			billionairesName[index]=null;
			return true;
		}
		else{
			System.out.println("enter valid details");
		}
		return false;
	}


}