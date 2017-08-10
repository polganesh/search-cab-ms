package com.gp.searchcab.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the locationcabcapacitytx database table.
 * 
 */
@Entity
@Table(name = "locationcabtimedetail")
public class LocationCabTimeDetail implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7666558622679104370L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long locationcabcapacityid;

	@Temporal(TemporalType.TIMESTAMP)
	private Date adddate;

	private Long adduserid;

	private int booked;

	private int capacity;

	@Temporal(TemporalType.DATE)
	private Date dateforbooking;

	@Temporal(TemporalType.TIMESTAMP)
	private Date editdate;

	private Long edituserid;

	private int hourforbooking;

	private byte isdeleted;

	private int minutesforbooking;

	private Long locationid;

	public LocationCabTimeDetail() {
	}
	
	

	public LocationCabTimeDetail(Long locationcabcapacityid, int booked, int capacity, Date dateforbooking,
			int hourforbooking, int minutesforbooking) {
		super();
		this.locationcabcapacityid = locationcabcapacityid;
		this.booked = booked;
		this.capacity = capacity;
		this.dateforbooking = dateforbooking;
		this.hourforbooking = hourforbooking;
		this.minutesforbooking = minutesforbooking;
	}



	/**
	 * @return the locationcabcapacityid
	 */
	public Long getLocationcabcapacityid() {
		return locationcabcapacityid;
	}

	/**
	 * @param locationcabcapacityid the locationcabcapacityid to set
	 */
	public void setLocationcabcapacityid(Long locationcabcapacityid) {
		this.locationcabcapacityid = locationcabcapacityid;
	}

	/**
	 * @return the adddate
	 */
	public Date getAdddate() {
		return adddate;
	}

	/**
	 * @param adddate the adddate to set
	 */
	public void setAdddate(Date adddate) {
		this.adddate = adddate;
	}

	/**
	 * @return the adduserid
	 */
	public Long getAdduserid() {
		return adduserid;
	}

	/**
	 * @param adduserid the adduserid to set
	 */
	public void setAdduserid(Long adduserid) {
		this.adduserid = adduserid;
	}

	/**
	 * @return the booked
	 */
	public int getBooked() {
		return booked;
	}

	/**
	 * @param booked the booked to set
	 */
	public void setBooked(int booked) {
		this.booked = booked;
	}

	/**
	 * @return the capacity
	 */
	public int getCapacity() {
		return capacity;
	}

	/**
	 * @param capacity the capacity to set
	 */
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	/**
	 * @return the dateforbooking
	 */
	public Date getDateforbooking() {
		return dateforbooking;
	}

	/**
	 * @param dateforbooking the dateforbooking to set
	 */
	public void setDateforbooking(Date dateforbooking) {
		this.dateforbooking = dateforbooking;
	}

	/**
	 * @return the editdate
	 */
	public Date getEditdate() {
		return editdate;
	}

	/**
	 * @param editdate the editdate to set
	 */
	public void setEditdate(Date editdate) {
		this.editdate = editdate;
	}

	/**
	 * @return the edituserid
	 */
	public Long getEdituserid() {
		return edituserid;
	}

	/**
	 * @param edituserid the edituserid to set
	 */
	public void setEdituserid(Long edituserid) {
		this.edituserid = edituserid;
	}

	/**
	 * @return the hourforbooking
	 */
	public int getHourforbooking() {
		return hourforbooking;
	}

	/**
	 * @param hourforbooking the hourforbooking to set
	 */
	public void setHourforbooking(int hourforbooking) {
		this.hourforbooking = hourforbooking;
	}

	/**
	 * @return the isdeleted
	 */
	public byte getIsdeleted() {
		return isdeleted;
	}

	/**
	 * @param isdeleted the isdeleted to set
	 */
	public void setIsdeleted(byte isdeleted) {
		this.isdeleted = isdeleted;
	}

	/**
	 * @return the minutesforbooking
	 */
	public int getMinutesforbooking() {
		return minutesforbooking;
	}

	/**
	 * @param minutesforbooking the minutesforbooking to set
	 */
	public void setMinutesforbooking(int minutesforbooking) {
		this.minutesforbooking = minutesforbooking;
	}

	/**
	 * @return the locationid
	 */
	public Long getLocationid() {
		return locationid;
	}

	/**
	 * @param locationid the locationid to set
	 */
	public void setLocationid(Long locationid) {
		this.locationid = locationid;
	}
	
	

}
