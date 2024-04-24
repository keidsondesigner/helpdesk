package br.com.keidsonroby.helpdesk.modules.tickets.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
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

  @NotNull(message = "O campo [data], não foi informado.")
  @NotBlank(message = "O campo [data] é obrigatório.")
  @Column(name = "created_at")
  private LocalDateTime createdAt;

}
