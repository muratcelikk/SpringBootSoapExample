package com.cal.services;

import org.springframework.stereotype.Component;

/**
 * @author Murat Çelik 23:39:55 22 Tem 2021
 *
 */
@Component
public class CustomerRepository {
	
	public UsageSummary GetSummaryByRegion(String region, Size size) {
		UsageSummary summary = new UsageSummary();

		summary.setAvgCustomerSatisfaction(76.50F);
		summary.setNumberOfRepresentetive(12);
		summary.setTotalTransactionVolume(15000000.99F);
		summary.setSize(size);
		summary.setEvaluation("Daha agresif satış stratejilerine ihtiyacımız var");

		return summary;
	}
}
