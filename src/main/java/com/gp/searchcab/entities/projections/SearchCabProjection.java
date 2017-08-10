package com.gp.searchcab.entities.projections;

import java.util.Date;

import org.springframework.data.rest.core.config.Projection;

import com.gp.searchcab.entities.LocationCabTimeDetail;

@Projection(name = "searchCabProjection", types = { LocationCabTimeDetail.class })
public interface SearchCabProjection {
	
	Long getLocationcabcapacityid();
	int getBooked();
	int getCapacity();
	Date getDateforbooking();
	int getHourforbooking() ;
	int getMinutesforbooking();

}
