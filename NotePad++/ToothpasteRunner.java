class ToothpasteRunner{
	public static void main(String[] paste)
	{
		Toothpaste.setName("Max White");
		Toothpaste.setColor("White");
		Toothpaste.setPrice(50D);
		Toothpaste.setSize('M');
		Toothpaste.setWeight(200);
		Toothpaste.setFlavour("Charcoal");
		Toothpaste.setCompany("Colgate");
		Toothpaste.setMftDate("21/09/2022");
		Toothpaste.setExpDate("21/09/2023");
		Toothpaste.setTransport("Truck");
		Toothpaste.setAvailable(true);
		Toothpaste.setMftPlace("Bangaluru");
		Toothpaste.setPackSize("Medium");
		Toothpaste.setCapColor("Red");
		Toothpaste.setSmellsGood(true);
		
	
		String ref=Toothpaste.getName();
		System.out.println(ref);
		
		String ref1=Toothpaste.getColor();
		System.out.println(ref1);
		
		double ref2=Toothpaste.getPrice();
		System.out.println(ref2);
		
		char ref3=Toothpaste.getSize();
		System.out.println(ref3);
		
		int ref4=Toothpaste.getWeight();
		System.out.println(ref4);
		
		String ref5=Toothpaste.getFlavour();
		System.out.println(ref5);
		
		String ref6=Toothpaste.getCompany();
		System.out.println(ref6);
		
		String ref7=Toothpaste.getMftDate();
		System.out.println(ref7);
		
		String ref8=Toothpaste.getExpDate();
		System.out.println(ref8);
		
		String ref9=Toothpaste.getTransport();
		System.out.println(ref9);
		
		boolean ref10=Toothpaste.isAvailable();
		System.out.println(ref10);
		
		String ref11=Toothpaste.getMftPlace();
		System.out.println(ref11);
		
		String ref12=Toothpaste.getPackSize();
		System.out.println(ref12);
		
		String ref13=Toothpaste.getCapColor();
		System.out.println(ref13);
		
		boolean ref14=Toothpaste.isSmellsGood();
		System.out.println(ref14);
		
	
	}


}