package com.roomservice.notification.service;

import com.roomservice.notification.dao.MongoDao;
import com.roomservice.notification.entity.ReservationNotification;

public class NotificationService {

	public static NotificationService instance;

	public static NotificationService getInstance() {

		if (instance == null) {

			synchronized (MongoDao.class) {

				if (instance == null) {
					instance = new NotificationService();
				}
			}
		}

		return instance;
	}
	
	public void handleNotification(ReservationNotification notification) {
		
		NotificationStatusEnum statusEnum = NotificationStatusEnum.valueOf(notification.getResStatus().toUpperCase());
		String reservationId = notification.getHotelReservations().getHotelReservation().getUniqueID().getID();
		
		switch (statusEnum) {
		
		case COMMIT:
			
			MongoDao.getInstance().updateBooking(LifeCycle.PUBLISHED, reservationId);
			break;
			
		case MODIFY:
			
			MongoDao.getInstance().updateBooking(LifeCycle.MODIFY, reservationId);
			break;
			
		case CANCEL:
			
			MongoDao.getInstance().updateBooking(LifeCycle.CANCEL, reservationId);
			break;
			
		default:
			
			throw new UnsupportedOperationException();
		}
		
		
	}

}
