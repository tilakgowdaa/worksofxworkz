class Vehicle{
	
	static double transport(String source,String destination){
		
		System.out.println("Through="+source);
		System.out.println("Place="+destination);
		return 320.0;
	}
	static double transport(String source,String destination,boolean onTime){
		System.out.println("Through="+source);
		System.out.println("Place="+destination);
		System.out.println("OnTime="+onTime);
		return 330.0;
	}
	static boolean transport(String destination){
		System.out.println("Destination="+destination);
		return true;
	}
	static boolean transport(String destination,boolean onTime){
		System.out.println("Place="+destination);
		System.out.println("OnTime="+onTime);
		return false;
	}
	static boolean transport(boolean onTime){
		System.out.println("OnTime="+onTime);
		return true;
	}
	
	
}