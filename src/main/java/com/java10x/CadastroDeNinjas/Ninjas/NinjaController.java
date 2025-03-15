package com.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    private NinjaService ninjaService;


    //Adicionar Ninja
    @PostMapping("/criar")
    public ResponseEntity<String> criarNinja(@RequestBody NinjaDTO ninja){
        NinjaDTO novoNinja = ninjaService.criarNinja(ninja) ;
        return ResponseEntity.status(HttpStatus.CREATED)
                .body("Ninja criado com sucesso " + novoNinja.getNome() + "(ID): "+ novoNinja.getId());
    }

    //Procurar Ninjas
    @GetMapping("/listar")
    public ResponseEntity<List<NinjaDTO>> listarNinjas(){
        List<NinjaDTO> ninjas = ninjaService.listarNinjas();
        return ResponseEntity.ok(ninjas);
    }

    //Procurar Ninjas por ID
    @GetMapping("/listar/{id}")
    public ResponseEntity<?> listarNinjasPorId(@PathVariable Long id){
        NinjaDTO ninja = ninjaService.listarNinjasPorId(id);
        if(ninja != null){
            return ResponseEntity.ok(ninja);

        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Ninja com o id: " + id + " não foi encontrado!");
        }

    }

    //Alterar Dados do NInjas
    @PatchMapping("/atualizar/{id}")
    public ResponseEntity<?> atualizarNinja(@PathVariable Long id, @RequestBody NinjaDTO ninjaAtualizado){
        NinjaDTO ninja = ninjaService.listarNinjasPorId(id);
        if(ninja != null){
            return ResponseEntity.status(HttpStatus.ACCEPTED)
                    .body(ninjaService.atualizarNinja(id, ninjaAtualizado));
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Ninja com o id: " + id +" não foi encontrado!");
        }
    }

    //Deletar Ninja
    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<String> deletarNinjaPorId(@PathVariable Long id){
        NinjaDTO ninja = ninjaService.listarNinjasPorId(id);
        if (ninja != null){
            ninjaService.deletarNinjaPorId(id);
            return ResponseEntity.ok("Ninja com o id: " + id + " Deletado com sucesso!");
        }else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("O ninja  com o id: " + id + " não foi encontrado!");
        }

    }

    //Constructor
    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }
}
