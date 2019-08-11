package com.ashoka.partner.service;

import java.util.Date;
import java.util.UUID;

import com.lynk.partner.service.TransportPartnerService;

public class AshokaTransportPartnerService implements TransportPartnerService {
	@Override
	public String hire(String source, String destination, Date hireDate, String purpose, String person, String mobile,
			String emailAddress) {

		return "ASKTPS-" + UUID.randomUUID().toString();
	}
}