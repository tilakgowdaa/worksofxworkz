class MovieDataOperatorRunner{
	public static void main(String[] name){
		System.out.println("main meethod started");
		MovieDataOperator.save("KGF");
		MovieDataOperator.save("Avatar");
		MovieDataOperator.save("KGF 2");
		MovieDataOperator.save("A");
		MovieDataOperator.save("Upendra");
		MovieDataOperator.displayDetails();
		System.out.println("main meethod ended");
	}
	
	
}