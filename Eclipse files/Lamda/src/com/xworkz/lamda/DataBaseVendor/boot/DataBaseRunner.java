package com.xworkz.lamda.DataBaseVendor.boot;

import java.util.Collection;
import java.util.LinkedList;import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.xworkz.lamda.DataBaseVendor.DataBaseVendorDTO;
import com.xworkz.lamda.DataBaseVendor.Size;
import com.xworkz.lamda.DataBaseVendor.Type;

public class DataBaseRunner {

	public static void main(String[] args) {
		Collection<DataBaseVendorDTO> collection = new LinkedList<DataBaseVendorDTO>();
		collection.add(new DataBaseVendorDTO("Microsoft", "Bill Gates", Size.five, 40, Type.Sql));
		collection.add(new DataBaseVendorDTO("Oracle", "Larry Ellison", Size.ten, 60000, Type.rationalDataBase));
		collection.add(new DataBaseVendorDTO("IBM", "Thomas Watson", Size.fifteen, 90000, Type.rationalDataBase));
		System.out.println("1st condition");
		 collection.stream().map(dto->dto.getDevelopedBy().toUpperCase()).collect(Collectors.toList()).forEach(dto->System.out.println(dto));

		System.out.println("2nd condition");

		collection.stream().filter((dto) -> {
			return dto.getLicenseCost() < 100 && dto.getType().equals(Type.Sql);
		}).collect(Collectors.toList()).forEach(dto -> System.out.println(dto));
		
		System.out.println("3rd condition");
		
		collection.stream().map(dto->dto.getType()).collect(Collectors.toList()).forEach(dto->System.out.println(dto));
		
	}
}
