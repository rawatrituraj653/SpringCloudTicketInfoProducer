package com.irctc.controller.rest;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.irctc.model.Ticket;

@RestController
@RequestMapping("/ticket")
public class TicketRestController {

	
	@GetMapping(value="/getTicket",produces = MediaType.APPLICATION_XML_VALUE)
	public Ticket getTicket() {
		
		return new Ticket("123738672", "Telanagana Expr", "Rituraj", 565.90);
	}
	@GetMapping(value="/getAllTicket")
	public List<Ticket> getAllTicket(){
		
		return Arrays.asList(
				new Ticket("123738672", "Telanagana Expr", "Rituraj", 565.90),
				new Ticket("123738673", "Mahamana Expr", "Rituraj", 565.90),
				new Ticket("123738674", "Janshabatdi Expr", "Rituraj", 565.90),
				new Ticket("123738675", "Sampark kranti", "Rituraj", 565.90),
				new Ticket("123738676", "Tulsi Expr", "Rituraj", 565.90),
				new Ticket("123738677", "Vandematram Expr", "Rituraj", 565.90),
				new Ticket("123738678", "Ramayan Expr", "Rituraj", 565.90),
				new Ticket("123738679", "Gareeb Rath Expr", "Rituraj", 565.90));
				
	}
	
}
