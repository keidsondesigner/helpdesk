package br.com.keidsonroby.helpdesk.modules.tickets.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.keidsonroby.helpdesk.modules.tickets.entity.TicketEntity;

public interface TicketRepository extends JpaRepository<TicketEntity, Integer> {}
