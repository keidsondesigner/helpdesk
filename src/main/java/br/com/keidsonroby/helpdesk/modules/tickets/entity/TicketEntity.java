package br.com.keidsonroby.helpdesk.modules.tickets.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity(name = "chamados")
public class TicketEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @NotNull(message = "O campo [titulo], não foi informado.")
  @NotBlank(message = "O campo [titulo] é obrigatório.")
  private String titulo;

  @NotNull(message = "O campo [descricao], não foi informado.")
  @NotBlank(message = "O campo [descricao] é obrigatório.")
  private String descricao;

  @NotNull(message = "O campo [prioridade], não foi informado.")
  @NotBlank(message = "O campo [prioridade] é obrigatório.")
  private String prioridade;

  @NotNull(message = "O campo [status], não foi informado.")
  @NotBlank(message = "O campo [status] é obrigatório.")
  private String status;

  @CreationTimestamp
  private LocalDateTime createdAt;

}
