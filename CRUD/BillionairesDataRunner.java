class BillionairesDataRunner{
	public static void main(String[] names){
		System.out.println("main started");
		BillionairesData.save("Elon Musk");
		BillionairesData.save("Bernard Arnault");
		BillionairesData.save("Gautam adani");
		BillionairesData.save("Jeff Bezos");
		BillionairesData.save("Bill Gates");
		BillionairesData.save("Warren Buffett");
		BillionairesData.save("Larry Ellison");
		BillionairesData.save("Larry page");
		BillionairesData.save("Mukesh Ambani");
		BillionairesData.save("Sergey Brin");
		
		BillionairesData.displayaDetails();
		
		System.out.println(BillionairesData.findName("Sergey Brin"));
		
		BillionairesData.update("Larry page","Nanuuuu");
		
		BillionairesData.update(3,"naneeee");
		
		System.out.println(BillionairesData.delete("Sergey Brin"));
		
		System.out.println(BillionairesData.delete(4,"Bill Gates"));
		
		
	}
	
	
}