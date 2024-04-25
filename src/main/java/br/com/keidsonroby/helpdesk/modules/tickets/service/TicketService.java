package br.com.keidsonroby.helpdesk.modules.tickets.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.keidsonroby.helpdesk.modules.tickets.entity.TicketEntity;
import br.com.keidsonroby.helpdesk.modules.tickets.repository.TicketRepository;

@Service
public class TicketService {
  
  @Autowired
  private TicketRepository ticketRepository;

  public TicketEntity salvar(TicketEntity ticketEntity) {
    return this.ticketRepository.save(ticketEntity);
  }

  public List<TicketEntity> listaTickets() {
    var ticket = this.ticketRepository.findAll();
    return ticket;
  }

  public TicketEntity buscaPorId(Integer id) {
    return this.ticketRepository.findById(id).get();
  }

  public List<TicketEntity> buscaPorTitulo(String titulo) {
    var ticket = this.ticketRepository.findByTitulo(titulo);
    return ticket;
  }

  public TicketEntity atualizar(TicketEntity ticketEntity) {
    return this.ticketRepository.save(ticketEntity);
  }

  public void deletaTicket(TicketEntity ticketEntity) {
    this.ticketRepository.delete(ticketEntity);
  }
}
