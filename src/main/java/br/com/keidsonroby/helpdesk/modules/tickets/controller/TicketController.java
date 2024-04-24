package br.com.keidsonroby.helpdesk.modules.tickets.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
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
  public ResponseEntity<Object> createCliente(@Valid @RequestBody TicketEntity ticketEntity, BindingResult bindingResult) {
      if(bindingResult.hasErrors()) {
        return ResponseEntity.badRequest().body(bindingResult.getAllErrors());
      }
      var ticketSalvo = this.ticketService.salvar(ticketEntity);
      return ResponseEntity.ok(ticketSalvo);
  }

}
