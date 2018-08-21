
package com.roomservice.notification.dao;

import java.util.List;
import java.util.Random;

import org.apache.log4j.Logger;
import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.roomservice.notification.entity.OpportunitySubject;
import com.roomservice.notification.service.LifeCycle;

public class MongoDao {

	private final static Logger LOG = Logger.getLogger(MongoDao.class);
	public static final String MONGO_URI = "mongodb://localhost";
	public static final String MONGO_DATABASE = "roomservice";

	public static MongoDao instance;

	private MongoCollection<Document> bookingCollection;
	private MongoCollection<Document> opportunityCollection;
	private MongoDatabase roomServiceDataBase;
	private MongoClient mongoClient;

	private Random random = new Random();
	private static float PRINT_THRESHOLD = 0.10f;

	public static MongoDao getInstance() {

		if (instance == null) {

			synchronized (MongoDao.class) {

				if (instance == null) {
					instance = new MongoDao();
				}
			}
		}

		return instance;
	}

	private MongoDao() {
		mongoClient = new MongoClient(new MongoClientURI(MONGO_URI));
		roomServiceDataBase = mongoClient.getDatabase(MONGO_DATABASE);
		bookingCollection = roomServiceDataBase.getCollection("booking");
		opportunityCollection = roomServiceDataBase.getCollection("opportunity");
	}

	public void updateBooking(LifeCycle lifeCycle, String reservationId) {
		Document filter = new Document("reservationId", reservationId);
		Document document = new Document("lifeCycle", lifeCycle.name());
		bookingCollection.updateOne(filter, new Document("$set", document));
	}

	public boolean importOpportunity(List<OpportunitySubject> subjects) {
		
		boolean isValid = false;
		for (OpportunitySubject subject : subjects) {
			
			LOG.trace("Inserting Opportunity Entry: " + subject);

			try {
				Document document = new Document("entity_type", subject.getEntityType())
						.append("entity_id", subject.getEntityId())
						.append("opportunity_id", subject.getOpportunityId())
						.append("arrival", subject.getArrival())
						.append("departure", subject.getDeparture())
						.append("num_of_nights", subject.getNumOfNights())
						.append("board", subject.getBoard())
						.append("price", subject.getPrice())
						.append("operator", subject.getOperator().name())
						.append("filter", subject.getFilter().name())
						.append("currency", subject.getCurrency().name())
						.append("is_pay_at_the_hotel", subject.isPayAtTheHotel())
						.append("is_on_request", subject.isOnRequest())
						.append("is_show_special_deals", subject.isShowSpecialDeals())
						.append("is_get_package_rates", subject.isGetPackageRates())
						.append("country_code", subject.getCountryCode())
						.append("default_currency", subject.getDefaultCurrency())
						.append("adults_count", subject.getAdultsCount())
						.append("is_push", subject.isPush())
						.append("hotel_code", subject.getPushInfo().getHotelCode())
						.append("booking_limit", subject.getPushInfo().getBookingLimit())
						.append("inv_type_code", subject.getPushInfo().getInvTypeCode())
						.append("rate_plan_code", subject.getPushInfo().getRatePlanCode())
						.append("push_price", subject.getPushInfo().getPrice())
						.append("status", subject.getPushInfo().getStatus())
						.append("active", subject.isActive());

				opportunityCollection.insertOne(document);
				isValid = true;

			} catch (Exception ex) {
				ex.printStackTrace();
				isValid = false;
			}
		}
		
		return isValid;

	}

}
