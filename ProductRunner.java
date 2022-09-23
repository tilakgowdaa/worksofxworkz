class ProductRunner{
	public static void main(String[] items){
	
	if(items.length==5)
		{	
		String name=items[0];
		String type=items[1];
		String price=items[2];
		String quality=items[3];
		String quantity=items[4];
		
		
		
			System.out.println("entered to store");
		
		System.out.println("product name:"+items[0]);
		System.out.println("product type:"+items[1]);
		int ref1=Integer.parseInt(price);
		System.out.println("Price:"+ref1);
		System.out.println("quality:"+quality);
		int ref2=Integer.parseInt(quantity);
		System.out.println("quality:"+ref2);
		int total=ref1*ref2;
		System.out.println("Total price:"+total);
		}
	else{
			System.out.println("need minimum 5 details like name,type,price,quality,quantity");
		}
		
		System.out.println("exit from store");
		
		
		
		
	}
	
	
}