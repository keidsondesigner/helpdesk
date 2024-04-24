package br.com.keidsonroby.helpdesk.modules.tickets.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.keidsonroby.helpdesk.modules.tickets.entity.TicketEntity;

public interface TicketRepository extends JpaRepository<TicketEntity, Integer> {
  @Query("select c from chamados c where c.titulo like :titulo")
  List<TicketEntity> findByTitulo(String titulo);
}
