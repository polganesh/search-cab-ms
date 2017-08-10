/**
 * 
 */
package com.gp.searchcab.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import com.gp.searchcab.entities.LocationCabTimeDetail;


/**
 * Repository for Working with Location Cab Capacity
 * 
 * @author Ganesh Pol
 *
 */
@RepositoryRestResource(collectionResourceRel = "locationcabtimedetail", path = "locationcabtimedetail")
public interface LocationCabTimeDetailRepository extends JpaRepository<LocationCabTimeDetail, Long> {

	@Query("	SELECT new com.gp.searchcab.entities.LocationCabTimeDetail(locationcabcapacityid,booked,capacity,dateforbooking,hourforbooking,minutesforbooking) "
			+ "	FROM LocationCabTimeDetail lcctx"
			+ "	WHERE lcctx.dateforbooking =:fromDate "
			+ " AND lcctx.locationid=:locationId "
			+ "	AND lcctx.hourforbooking >=:hourforbooking  "
			+ " AND lcctx.isdeleted =:isdeleted")
	// @PreAuthorize("hasRole('ROLE_USER')")
	List<LocationCabTimeDetail> getCabForLocationAfterTimeSlot(
			@Param("fromDate") @DateTimeFormat(iso = ISO.DATE) Date fromDate, @Param("locationId") Long locationId,
			@Param("isdeleted") Byte isdeleted,@Param("hourforbooking")Integer hourforbooking);

	
		// ----------------Blocked activities
	
	@RestResource(exported=true)
	@Override
	default void delete(Iterable<? extends LocationCabTimeDetail> arg0) {
		// TODO Auto-generated method stub
		
	}
	
	@RestResource(exported=true)
	@Override
	default void delete(LocationCabTimeDetail arg0) {
		// TODO Auto-generated method stub
		
	}

	@RestResource(exported=true)
	@Override
	default void delete(Long arg0) {
		// TODO Auto-generated method stub
		
	}

	@RestResource(exported=true)
	@Override
	default void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@RestResource(exported=true)
	@Override
	default boolean exists(Long arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@RestResource(exported=true)
	@Override
	default <S extends LocationCabTimeDetail> S save(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@RestResource(exported=true)
	@Override
	default void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@RestResource(exported=true)
	@Override
	default void deleteInBatch(Iterable<LocationCabTimeDetail> arg0) {
		// TODO Auto-generated method stub
		
	}

	@RestResource(exported=true)
	@Override
	default <S extends LocationCabTimeDetail> List<S> save(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@RestResource(exported=true)
	@Override
	default <S extends LocationCabTimeDetail> S saveAndFlush(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
