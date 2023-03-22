package com.bank.cards.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bank.cards.model.CardeModel;
import com.bank.cards.model.Customer;
import com.bank.cards.repository.CardRepository;

@RestController
public class CardeController {
	@Autowired
	private CardRepository cardRepository;

	@PostMapping("/cards")
	public List<CardeModel> getCardData(@RequestBody Customer customer) {

		List<CardeModel> cards = cardRepository.findByCustomerId(customer.getCustomerId());
		return cards;
	}
}
