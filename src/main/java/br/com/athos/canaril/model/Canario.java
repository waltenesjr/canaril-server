package br.com.athos.canaril.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "CANARIO")
public class Canario {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String anel;

    @Column
    private String gaiola;

    @Column
    private Date dataAnilhamento;

    @Column
    private String sexo;

    @Column
    private String caracteristica;

    @Column
    private String pai;

    @Column
    private String mae;

    @Column
    private String situacao;
}