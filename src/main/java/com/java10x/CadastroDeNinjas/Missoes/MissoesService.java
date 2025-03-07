package com.java10x.CadastroDeNinjas.Missoes;

import com.java10x.CadastroDeNinjas.Ninjas.NinjaModel;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class MissoesService {

    private MissoesRepository missoesRepository;

    //Listar Todas as Missoes
    public List<MissoesModel> listarMissoes(){
        return missoesRepository.findAll();
    }

    //Listar Missão por id
    public MissoesModel listarMissoesPorId(Long id){
        Optional<MissoesModel> missoesPorId = missoesRepository.findById(id);
        return missoesPorId.orElse(null);
    }

    //Criar Missão
    public MissoesModel criarMissao(MissoesModel missoes){
        return missoesRepository.save(missoes);
    }

    //Deletar Missão - Tem que ser void
    public void deletarMissao(Long id){
        missoesRepository.deleteById(id);
    }

    //Constructor

    public MissoesService(MissoesRepository missoesRepository) {
        this.missoesRepository = missoesRepository;
    }
}
