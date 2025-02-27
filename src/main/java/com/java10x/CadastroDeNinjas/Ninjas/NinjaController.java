package com.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/boasvindas")
    public String boasVindas(){
        return "Essa é minha primeira mensagem nessa rota";
    }

    //Adicionar Ninja
    @PostMapping("/adicionar ")
    public String criarNinja(){
        return "Ninja Criado";
    }
    //Procurar Ninjas
    @GetMapping("/todos")
    public String mostrarTodosOsNinjas(){
        return "Ninjas";
    }
    //Procurar Ninjas por ID
    @GetMapping("/todosID")
    public String mostrarTodosOsNinjasID(){
        return "Ninjas ID";
    }
    //Alterar Dados do NInjas
    @PutMapping("/alterarID")
    public String alterarNinjaPorID(){
        return "Alterar Ninja por ID";
    }

    //Deletar Ninja
    @DeleteMapping("/DeletarID")
    public String deletaNinjaPorID(){
        return "Deletar ninja por ID";
    }

}
