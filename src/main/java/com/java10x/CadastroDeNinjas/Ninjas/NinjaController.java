package com.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    private NinjaService ninjaService;


    //Adicionar Ninja
    @PostMapping("/criar")
    public NinjaModel criarNinja(@RequestBody NinjaModel ninja){
        return ninjaService.criarNinja(ninja) ;
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
    @DeleteMapping("/deletar/{id}")
    public void deletarNinjaPorId(@PathVariable Long id){
        ninjaService.deletarNinjaPorId(id);
    }

    //Constructor
    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }
}
