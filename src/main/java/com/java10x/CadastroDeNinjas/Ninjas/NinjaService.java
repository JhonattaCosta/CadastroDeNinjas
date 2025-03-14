package com.java10x.CadastroDeNinjas.Ninjas;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class NinjaService {

    private NinjaRepository ninjaRepository;
    private NinjaMapper ninjaMapper;

    //Cria um novo ninja
    public NinjaDTO criarNinja(NinjaDTO ninjaDTO){
        NinjaModel ninja = ninjaMapper.map(ninjaDTO);
        ninja = ninjaRepository.save(ninja);
        return ninjaMapper.map(ninja);
    }
    //Listar Todos os Ninjas
    public List<NinjaDTO> listarNinjas(){
        List<NinjaModel> ninjas = ninjaRepository.findAll();
        return ninjas.stream()
                .map(ninjaMapper::map)
                .collect(Collectors.toList());
    }

    //Listar Ninjas por ID
    public NinjaDTO listarNinjasPorId(long id){
        Optional<NinjaModel> ninjaPorId = ninjaRepository.findById(id);
        return ninjaPorId.map(ninjaMapper::map).orElse(null);
    }

    //Alterar ninja
    public NinjaDTO atualizarNinja(Long id, NinjaDTO ninjaDTO){
        Optional<NinjaModel> ninjaExistenteOpt = ninjaRepository.findById(id);
        if (ninjaExistenteOpt.isPresent()){
            NinjaModel ninjaExistente = ninjaExistenteOpt.get();

            if (ninjaDTO.getNome() != null){
                ninjaExistente.setNome(ninjaDTO.getNome());
            }
            if(ninjaDTO.getEmail() != null){
                ninjaExistente.setEmail(ninjaDTO.getEmail());
            }
            if(ninjaDTO.getImgUrl() != null){
                ninjaExistente.setImgUrl(ninjaDTO.getImgUrl());
            }
            if(ninjaDTO.getIdade() != 0){
                ninjaExistente.setIdade(ninjaDTO.getIdade());
            }
            if(ninjaDTO.getRank() != null){
                ninjaExistente.setRank(ninjaDTO.getRank());
            }
            if(ninjaDTO.getMissoes() != null) {
                ninjaExistente.setMissoes(ninjaDTO.getMissoes());
            }
            //Salva o ninjaAtualizado
            NinjaModel ninjaSalvo = ninjaRepository.save(ninjaExistente);

            return ninjaMapper.map(ninjaSalvo);

        }
        return null;
    }

    //Deletar ninja por ID - Tem que ser um metodo void
    public void deletarNinjaPorId(Long id){
        ninjaRepository.deleteById(id);
    }

    //Constructor

    public NinjaService(NinjaRepository ninjaRepository, NinjaMapper ninjaMapper) {
        this.ninjaRepository = ninjaRepository;
        this.ninjaMapper = ninjaMapper;
    }
}
