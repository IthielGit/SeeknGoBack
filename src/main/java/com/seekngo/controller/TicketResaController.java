package com.seekngo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seekngo.entities.TicketResa;
import com.seekngo.service.TicketResaService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/reservation")
public class TicketResaController {
	
	@Autowired
	private TicketResaService ticketResaService;
	
	@GetMapping("/list")
	public Iterable<TicketResa> getTicketResa(){
		return ticketResaService.listTicket();
	}
	
	@PostMapping("/save")
	private long save(@RequestBody TicketResa ticketResa) {
//		System.out.println(TicketResa.getName());
		ticketResaService.saveReservation(ticketResa);
		return ticketResa.getIdTicketResa();
	}
	
	@RequestMapping("/ticketresa/{id}")
	private TicketResa getTicketResa(@PathVariable(name = "id") int TicketResaID) {
		return ticketResaService.getTicketResaByID(TicketResaID);
	}
	
	@PutMapping("/delete/{id}")
	private void deleteTicketResa(@PathVariable("id") int id) {
		System.out.println(id);
		ticketResaService.deleteReservation(id);
	}
	
}
