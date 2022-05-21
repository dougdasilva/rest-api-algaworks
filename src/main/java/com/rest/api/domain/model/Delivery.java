package com.rest.api.domain.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Delivery {

	private Long id;
	private Client client;
	private BigDecimal tax;
	private Recipient recipient;
	private StatusDelivery statusDelivery;
	private LocalDateTime date;
	private LocalDateTime date;
	
}
