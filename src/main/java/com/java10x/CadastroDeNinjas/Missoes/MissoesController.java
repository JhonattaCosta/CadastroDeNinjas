package com.java10x.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("missoes")
public class MissoesController {

    private MissoesService missoesService;

    //Criar Missões
    @PostMapping("/criar")
    public MissoesModel criarMissao(@RequestBody MissoesModel missoesModel) {
        return missoesService.criarMissao(missoesModel);
    }

    //Listar Missoes
    @GetMapping("/listar")
    public List<MissoesModel> listarMissoes(){
        return missoesService.listarMissoes();
    }

    //Listar Missão por id
    @GetMapping("/listar/{id}")
    public MissoesModel listarNinjaPorId(@PathVariable long id){
        return missoesService.listarMissoesPorId(id);
    }

    //Alterar Missão
    @PutMapping("/alterar")
    public String alterarMissao() {
        return "Missão alterada com sucesso";
    }

    //Deletar Missão por Id
    @DeleteMapping("/deletar/{id}")
    public void deletarMissao(@PathVariable Long id) {
        missoesService.deletarMissao(id);
    }

    //Constructor
    public MissoesController(MissoesService missoesService) {
        this.missoesService = missoesService;
    }
}
