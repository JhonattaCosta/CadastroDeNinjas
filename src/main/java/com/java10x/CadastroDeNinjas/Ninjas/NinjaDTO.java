package com.java10x.CadastroDeNinjas.Ninjas;
import com.java10x.CadastroDeNinjas.Missoes.MissoesModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.transaction.annotation.Transactional;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NinjaDTO {

    private Long id;
    private String nome;
    private String email;
    private String imgUrl;
    private int idade;
    private String rank;
    private MissoesModel missoes;


}
