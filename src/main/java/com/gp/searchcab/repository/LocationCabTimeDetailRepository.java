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
	// /* (non-Javadoc)
	// * @see
	// org.springframework.data.repository.PagingAndSortingRepository#findAll(org.springframework.data.domain.Pageable)
	// */
	// @Override
	// @PreAuthorize("hasRole('ROLE_BLOCK_OPERATIONS')")
	// default Page<Locationcabcapacitytx> findAll(Pageable pageable) {
	// // TODO Auto-generated method stub
	// return null;
	// }
	//
	// /* (non-Javadoc)
	// * @see
	// org.springframework.data.repository.CrudRepository#delete(java.io.Serializable)
	// */
	// @Override
	// @PreAuthorize("hasRole('ROLE_BLOCK_OPERATIONS')")
	// default void delete(Long id) {
	// // TODO Auto-generated method stub
	//
	// }
	//
	// /* (non-Javadoc)
	// * @see
	// org.springframework.data.repository.CrudRepository#delete(java.lang.Object)
	// */
	// @Override
	// @PreAuthorize("hasRole('ROLE_BLOCK_OPERATIONS')")
	// default void delete(Locationcabcapacitytx entity) {
	// // TODO Auto-generated method stub
	//
	// }
	//
	// /* (non-Javadoc)
	// * @see
	// org.springframework.data.repository.CrudRepository#delete(java.lang.Iterable)
	// */
	// @Override
	// @PreAuthorize("hasRole('ROLE_BLOCK_OPERATIONS')")
	// default void delete(Iterable<? extends Locationcabcapacitytx> entities) {
	// // TODO Auto-generated method stub
	//
	// }
	//
	// /* (non-Javadoc)
	// * @see org.springframework.data.repository.CrudRepository#deleteAll()
	// */
	// @Override
	// @PreAuthorize("hasRole('ROLE_BLOCK_OPERATIONS')")
	// default void deleteAll() {
	// // TODO Auto-generated method stub
	//
	// }
	//
	// /* (non-Javadoc)
	// * @see
	// org.springframework.data.jpa.repository.JpaRepository#deleteAllInBatch()
	// */
	// @Override
	// @PreAuthorize("hasRole('ROLE_BLOCK_OPERATIONS')")
	// default void deleteAllInBatch() {
	// // TODO Auto-generated method stub
	//
	// }
	//
	// /* (non-Javadoc)
	// * @see
	// org.springframework.data.jpa.repository.JpaRepository#deleteInBatch(java.lang.Iterable)
	// */
	// @Override
	// @PreAuthorize("hasRole('ROLE_BLOCK_OPERATIONS')")
	// default void deleteInBatch(Iterable<Locationcabcapacitytx> arg0) {
	// // TODO Auto-generated method stub
	//
	// }
	//
	// /* (non-Javadoc)
	// * @see org.springframework.data.jpa.repository.JpaRepository#findAll()
	// */
	// @Override
	// @PreAuthorize("hasRole('ROLE_BLOCK_OPERATIONS')")
	// default List<Locationcabcapacitytx> findAll() {
	// // TODO Auto-generated method stub
	// return null;
	// }
	//
	// /* (non-Javadoc)
	// * @see
	// org.springframework.data.jpa.repository.JpaRepository#findAll(java.lang.Iterable)
	// */
	// @Override
	// @PreAuthorize("hasRole('ROLE_BLOCK_OPERATIONS')")
	// default List<Locationcabcapacitytx> findAll(Iterable<Long> arg0) {
	// // TODO Auto-generated method stub
	// return null;
	// }
	//
	// /* (non-Javadoc)
	// * @see
	// org.springframework.data.jpa.repository.JpaRepository#findAll(org.springframework.data.domain.Sort)
	// */
	// @Override
	// @PreAuthorize("hasRole('ROLE_BLOCK_OPERATIONS')")
	// default List<Locationcabcapacitytx> findAll(Sort arg0) {
	// // TODO Auto-generated method stub
	// return null;
	// }
	//
	// /* (non-Javadoc)
	// * @see
	// org.springframework.data.jpa.repository.JpaRepository#save(java.lang.Iterable)
	// */
	// @Override
	// @PreAuthorize("hasRole('ROLE_BLOCK_OPERATIONS')")
	// default <S extends Locationcabcapacitytx> List<S> save(Iterable<S> arg0)
	// {
	// // TODO Auto-generated method stub
	// return null;
	// }
	//
	// /* (non-Javadoc)
	// * @see
	// org.springframework.data.jpa.repository.JpaRepository#saveAndFlush(java.lang.Object)
	// */
	// @Override
	// @PreAuthorize("hasRole('ROLE_BLOCK_OPERATIONS')")
	// default <S extends Locationcabcapacitytx> S saveAndFlush(S arg0) {
	// // TODO Auto-generated method stub
	// return null;
	// }

}
