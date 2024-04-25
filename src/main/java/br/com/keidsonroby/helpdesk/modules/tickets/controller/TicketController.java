package br.com.keidsonroby.helpdesk.modules.tickets.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.keidsonroby.helpdesk.modules.tickets.entity.TicketEntity;
import br.com.keidsonroby.helpdesk.modules.tickets.service.TicketService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/tickets")
public class TicketController {

  @Autowired
  private TicketService ticketService;

  @PostMapping
  public ResponseEntity<Object> createTicket(@Valid @RequestBody TicketEntity ticketEntity, BindingResult bindingResult) {
      if(bindingResult.hasErrors()) {
        return ResponseEntity.badRequest().body(bindingResult.getAllErrors());
      }
      var ticketSalvo = this.ticketService.salvar(ticketEntity);
      return ResponseEntity.ok(ticketSalvo);
  }

  @GetMapping
  public ResponseEntity<Object> getAllTickets() {
    var tickets = this.ticketService.listaTickets();
    return ResponseEntity.ok(tickets);
  }

  @GetMapping("/{id}")
  public ResponseEntity<Object> getTicketPorId(@PathVariable Integer id) {
    var ticket = this.ticketService.buscaPorId(id);
    return ResponseEntity.ok(ticket);
  }

  @GetMapping("/busca")
  public ResponseEntity<Object> getTicketPorTitulo(@RequestParam String titulo) {
    var ticket = this.ticketService.buscaPorTitulo(titulo);
    return ResponseEntity.ok(ticket);
  }

  @PutMapping
  public ResponseEntity<Object> putTicket(@RequestBody TicketEntity ticketEntity, BindingResult bindingResult) {
    if(bindingResult.hasErrors()) {
      return ResponseEntity.badRequest().body(bindingResult.getAllErrors());
    }
    var ticketAtualizado = this.ticketService.atualizar(ticketEntity);
    return ResponseEntity.ok(ticketAtualizado);
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Object> deleteTicket(@PathVariable Integer id) {
    var ticket = this.ticketService.buscaPorId(id);
    this.ticketService.deletaTicket(ticket);
    return ResponseEntity.ok("Item deletado" + " " + ticket);
  }

}
