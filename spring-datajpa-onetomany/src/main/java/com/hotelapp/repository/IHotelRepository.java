package com.hotelapp.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hotelapp.model.Category;
import com.hotelapp.model.Cuisine;
import com.hotelapp.model.Hotel;
import com.hotelapp.model.Type;

public interface IHotelRepository extends JpaRepository<Hotel, Integer> {

	List<Hotel> findByCity(String city);

	List<Hotel> findByType(String type, Sort sort);

	List<Hotel> findByRating(double rating);
	
	//native querry
	@Query(value = "select * from hotel h inner join item i on h.hotelid=i.hotel_id where i.cuisine=?1",
			nativeQuery = true)
	List<Hotel> findByCuisine(Cuisine cuisine);

	// Custome Querries

	@Query("from Hotel h inner join h.itemList i where i.itemName=?1")
	List<Hotel> findByItemName(String itemName);

	@Query("from Hotel h inner join h.itemList i where i.itemName=?1 or i.category=?2")
	List<Hotel> findByItemNameCategory(String itemName, Category Category);

//	@Query("from Hotel h inner join h.itemList i where i.cuisine=?1")
//	List<Hotel> findByCuisine(Cuisine cuisine);

	@Query("from Hotel h inner join h.itemList i where i.cuisine=?1 or i.itemType=?2")
	List<Hotel> findByCuisineType(Cuisine cuisine, Type type);

	@Query("from Hotel h inner join h.itemList i where i.itemName=?1 or i.price<?2")
	List<Hotel> findByItemNameLessPrice(String itemName, double price);

	// named querry we can use everywhere
	@Query(name = "readByCat")
	List<Hotel> findByCategory(Category category);

}
