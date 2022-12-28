package com.xworkz.Place;

import java.util.Collection;
import java.util.LinkedList;

public class PlaceRunner {

	public static void main(String[] args) {
		PlaceDTO dto=new PlaceDTO("Bangalore", "Karnataka", "India");
		PlaceDTO dto1=new PlaceDTO("Mumbai", "Maharashtra", "India");
		PlaceDTO dto2=new PlaceDTO("Chennai", "Tamil Nadu", "India");
		
		Collection<PlaceDTO> collection=new LinkedList<PlaceDTO>();
		collection.add(dto1);
		collection.add(dto2);
		collection.add(dto);
		
		boolean contain=collection.contains(dto);
		
	}

}
