package com.kmpx.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.kmpx.hrpayroll.entities.Payment;

@Service
public class PaymentService {

	public Payment getPayment(long workerId, int days) {
		return new Payment("bob", 200.0, days);
	}
}
