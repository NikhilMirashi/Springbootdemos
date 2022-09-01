package com.hotelapp.service;

import java.util.List;

import com.hotelapp.model.Category;
import com.hotelapp.model.Cuisine;
import com.hotelapp.model.Hotel;
import com.hotelapp.model.Type;

public interface IHotelService {

	//inbuilt
	
	Hotel addHotel(Hotel hotel);
	void updateHotel(Hotel hotel);
	void deleteHotel(int hotelId);
	List<Hotel> getAll();
	Hotel getById(int hotelId);
	
	
	//Derived Queries
	List<Hotel> getByCity(String city);
	List<Hotel> getByType(String type);
	List<Hotel> getByRating(double rating);
	
	
	//customeQueries
	List<Hotel> getByItemName(String itemName);
	List<Hotel> getByItemNameCategory(String itemName,Category category);
	List<Hotel> getByCuisine(Cuisine cuisine);
	List<Hotel> getByCategory(Category category);
	List<Hotel> getByCuisineType(Cuisine cuisine,Type type);
	List<Hotel> getByItemNameLessPrice(String itemName,double price);
	
	
}
