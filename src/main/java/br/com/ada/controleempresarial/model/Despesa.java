package br.com.ada.controleempresarial.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
public class Despesa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(unique = true)
    private String numeroNF;
    private String fornecedor;
    private String categoria;
    private Double valorNF;
    private LocalDate dataDeVencimento;
    private Boolean pago;
}
