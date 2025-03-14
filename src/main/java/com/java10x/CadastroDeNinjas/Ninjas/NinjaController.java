package com.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    private NinjaService ninjaService;


    //Adicionar Ninja
    @PostMapping("/criar")
    public NinjaDTO criarNinja(@RequestBody NinjaDTO ninja){
        return ninjaService.criarNinja(ninja) ;
    }

    //Procurar Ninjas
    @GetMapping("/listar")
    public List<NinjaDTO> listarNinjas(){
        return ninjaService.listarNinjas();
    }

    //Procurar Ninjas por ID
    @GetMapping("/listar/{id}")
    public NinjaDTO listarNinjasPorId(@PathVariable Long id){
        return ninjaService.listarNinjasPorId(id);
    }

    //Alterar Dados do NInjas
    @PatchMapping("/atualizar/{id}")
    public NinjaDTO atualizarNinja(@PathVariable Long id, @RequestBody NinjaDTO ninjaAtualizado){
        return ninjaService.atualizarNinja(id, ninjaAtualizado);
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
