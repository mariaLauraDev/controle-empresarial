package br.com.ada.controleempresarial.model;

import br.com.ada.controleempresarial.model.enums.UnidadeFederativa;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String telefone;
    @Column(unique = true)
    private String cpf;
    private String email;
    private LocalDate dataContratacao;
    private String cep;
    private String logradouro;
    private String numeroCasa;
    private String bairro;
    private UnidadeFederativa uf;

}
