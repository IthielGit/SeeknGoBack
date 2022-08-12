package com.seekngo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seekngo.entities.Province;
import com.seekngo.entities.TicketResa;
import com.seekngo.repository.TicketResaRepository;

@Service
public class TicketResaService  {
	
	@Autowired
	private TicketResaRepository ticketResaRepository;
	
	
	public List<TicketResa>listTicket(){
		return ticketResaRepository.findAll();
	}
	
//	public List<TicketResa>listByPartenaire(int id){
//		return ticketResaRepository.findByPartenaire(id);
//	}
	
	public TicketResa saveReservation(TicketResa ticketResa) {
		return ticketResaRepository.save(ticketResa);
	}

	public TicketResa getTicketResaByID(long id) {
		return ticketResaRepository.findById(id).get();
	}

	public void updateReservation(TicketResa ticketResa, long id) {
		ticketResaRepository.save(ticketResa);
	}

	public void deleteReservation(long id) {
		ticketResaRepository.deleteById(id);
	}
}
