package com.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    private NinjaService ninjaService;


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
    @GetMapping("/listar")
    public List<NinjaModel> listarNinjas(){
        return ninjaService.listarNinjas();
    }
    //Procurar Ninjas por ID
    @GetMapping("/listar/{id}")
    public NinjaModel listarNinjasPorId(@PathVariable Long id){
        return ninjaService.listarNinjasPorId(id);
    }
    //Alterar Dados do NInjas
    @PutMapping("/alterarID")
    public String alterarNinjaPorID(){
        return "Alterar Ninja por ID";
    }

    //Deletar Ninja
    @DeleteMapping("/deletarID")
    public String deletaNinjaPorID(){
        return "Deletar ninja por ID";
    }

    //Constructor
    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }
}
