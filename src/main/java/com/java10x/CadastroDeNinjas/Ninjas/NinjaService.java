package com.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {

    private NinjaRepository ninjaRepository;

    //Listar Todos os Ninjas
    public List<NinjaModel> listarNinjas(){
        return ninjaRepository.findAll();
    }

    //Listar Ninjas por ID
    public NinjaModel listarNinjasPorId(long id){
        Optional<NinjaModel> ninjaPorId = ninjaRepository.findById(id);
        return ninjaPorId.orElse(null);
    }

    //Cria um novo ninja
    public NinjaModel criarNinja(NinjaModel ninja){
        return ninjaRepository.save(ninja);
    }

    //Deletar ninja por ID - Tem que ser um metodo void
    public void deletarNinjaPorId(Long id){
        ninjaRepository.deleteById(id);
    }

    //Constructor
    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

}
