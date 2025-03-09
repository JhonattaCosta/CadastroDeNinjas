package com.java10x.CadastroDeNinjas.Ninjas;

import com.java10x.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


//@Entity tranforma uma classe em uma entidade do BD
@Entity
//@Table Da um nome a tabela do BD
@Table(name = "tb_cadastro")
//Cria automaticamente  Getters and Setters
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NinjaModel {


    /*ID A GENTE APENAS DECLARA PRO JAVA TRABALHAR PRA GENTE INCREMENTANDO O ID NO BANDO DE DADOS
     * ENTÃO A GENTE NÃO PRECISA INSTANCIAR O ID POIS VAMOS UTILIZAR ANOTATIONS PARA DEFINIR O ID E A SEQUENCIA DELE.
     *
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(unique = true)
    private String email;

    @Column(name = "img_url")
    private String imgUrl;

    @Column(name = "idade")
    private int idade;

    @Column(name = "rank")
    private String rank;

    @ManyToOne
    @JoinColumn(name = "missoes_id")
    private MissoesModel missoes;


}
