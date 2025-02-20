package com.java10x.CadastroDeNinjas.Ninjas;

import com.java10x.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;


//@Entity tranforma uma classe em uma entidade do BD
@Entity
//@Table Da um nome a tabela do BD
@Table(name = "tb_cadastro")
public class NinjaModel {


    /*ID A GENTE APENAS DECLARA PRO JAVA TRABALHAR PRA GENTE INCREMENTANDO O ID NO BANDO DE DADOS
     * ENTÃO A GENTE NÃO PRECISA INSTANCIAR O ID POIS VAMOS UTILIZAR ANOTATIONS PARA DEFINIR O ID E A SEQUENCIA DELE.
     *
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String email;

    private int idade;

    //@ManyToOne um ninja tem uma unica missao
    @ManyToOne
    @JoinColumn(name = "missoes_id")//Foreing Key ou chave estrangeira
    private MissoesModel missoes;

    public NinjaModel() {
    }

    public NinjaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
