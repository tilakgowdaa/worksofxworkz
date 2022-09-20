class TabletRunner{
public static void main(String[] args){
	
	Tablet.name="Dolo650";
	Tablet.price=3d;
	Tablet.inKannada="Dolo matre";
	Tablet.combination="bisi ragi ittu";
	Tablet.company="Micro labs";
	Tablet.priceForSheet=3d;
	Tablet.availability=true;
	Tablet.mftDate="20/09/2022";
	Tablet.expDate="20/09/2023";
	Tablet.forChildren=false;
	Tablet.rating=4;
	Tablet.perDay=3;
	Tablet.intakeWith="water";
	Tablet.Stock=3000;
	Tablet.mftPlace="pune";
	Tablet.transport="Truck";
	Tablet.homeDelivery=true;
	
	String[] ary1={"Cipla","para lab"};
	Tablet.otherCompany=ary1;
	
	String[] ary2={"nicip","paracetamol"};
	Tablet.otherTablet=ary2;
	
	double[] ary3={2.5d,3.0d,3.5d};
	Tablet.difPrices=ary3;
	
	String[] ary4={"Head ache","Fever"};
	Tablet.cures=ary4;
	
	String[] ary5={"India","UK","UAE"};
	Tablet.availableIn=ary5;
	
	String[] ary6={"Blue","white"};
	Tablet.color=ary6;
	
	String[] ary7={"Apollo","Medplus"};
	Tablet.stores=ary7;
	
	char[] ary8={'s','l'};
	Tablet.boxSize=ary8;
	
	int[] ary9={10,30,60};
	Tablet.sheetSize=ary9;
	
	String[] ary10={"Good","okay","better"};
	Tablet.reviews=ary10;
	
	String[] ary11={"round","oval"};
	Tablet.shapes=ary11;
	
	int[] ary12={8,9,7};
	Tablet.marks=ary12;
	
	Tablet.tabletDetails();
	
	
}


}