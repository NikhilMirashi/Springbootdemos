package com.hotelapp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hotelapp.model.Category;
import com.hotelapp.model.Cuisine;
import com.hotelapp.model.Hotel;
import com.hotelapp.model.Item;
import com.hotelapp.model.Type;
import com.hotelapp.service.IHotelService;

@SpringBootApplication
public class SpringDatajpaOnetomanyApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringDatajpaOnetomanyApplication.class, args);
	}

	IHotelService hotelService;
	
	@Autowired
	public void setHoteService(IHotelService hoteService) {
		this.hotelService = hoteService;
	}

	@Override
	public void run(String... args) throws Exception {

		Item item1=new Item("RICE",Category.FASTFOOD,Cuisine.CHINEESE, Type.VEG, 120);
		Item item2=new Item("ALOO PARATA", Category.MAINCOURSE, Cuisine.NORTHINDIAN, Type.VEG, 180);
		Item item3=new Item("CHIKEN MASALA",Category.MAINCOURSE, Cuisine.SOUTHINDIAN, Type.NONVEG, 200);

		//Set<Item> itemList=new HashSet<>(Arrays.asList(item1,item2,item3));
		
		Item item4=new Item("DOSA",Category.FASTFOOD,Cuisine.SOUTHINDIAN, Type.VEG, 70);
		Item item5=new Item("ALOO PARATA", Category.MAINCOURSE, Cuisine.NORTHINDIAN, Type.VEG, 180);
		Item item6=new Item("DOSA",Category.MAINCOURSE, Cuisine.SOUTHINDIAN, Type.VEG, 100);
		
		Set<Item> itemList2=new HashSet<>(Arrays.asList(item4,item5,item6));
		
		Hotel hotel=new Hotel("DRAGON FIRE", Type.VEG, "BANGLORE", 4.8, itemList2);
		//hotelService.addHotel(hotel);
		
//		System.out.println();
//		hotelService.getAll().forEach(System.out::println);
		
//		System.out.println();
//		System.out.println("DOSA");
//		hotelService.getByItemName("DOSA").forEach(System.out::println);
//		
//		System.out.println();
//		System.out.println("CUISINE");
//		hotelService.getByCuisine(Cuisine.CHINEESE).forEach(System.out::println);
//		
//		System.out.println();
//		System.out.println("CATEGORY");
//		hotelService.getByCategory(Category.MAINCOURSE).forEach(System.out::println);
//		
//		System.out.println();
//		System.out.println("CUISINE AND TYPE");
//		hotelService.getByCuisineType(Cuisine.SOUTHINDIAN,Type.VEG).forEach(System.out::println);
//		
//		
//		System.out.println();
//		System.out.println("ITEAMNAME AND PRICE");
//		hotelService.getByItemNameLessPrice("DOSA",200).forEach(System.out::println);
//		
		
		//hotelService.getByCity("BANGLORE").forEach(System.out::println);
		
		hotelService.getByCuisine(Cuisine.CHINEESE).forEach(System.out::println);
	}

	

}
