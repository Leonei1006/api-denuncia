package br.com.apidenuncia.apidenuncia.service;

import br.com.apidenuncia.apidenuncia.domain.Data;
import br.com.apidenuncia.apidenuncia.repository.DataRepository;
import br.com.apidenuncia.apidenuncia.repository.DenunciaRepository;
import br.com.apidenuncia.apidenuncia.repository.DenuncianteRepository;
import br.com.apidenuncia.apidenuncia.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataService {

    @Autowired
    private EnderecoRepository enderecoRepository;
    @Autowired
    private DataRepository dataRepository;
    @Autowired
    private DenuncianteRepository denuncianteRepository;
    @Autowired
    private DenunciaRepository denunciaRepository;

    public Data create(Data data){
        data.setEndereco(enderecoRepository.save(data.getEndereco()));
        data.setDenunciantes(denuncianteRepository.save(data.getDenunciantes()));
        data.setDenuncia(denunciaRepository.save(data.getDenuncia()));
        return dataRepository.save(data);
    }

    public Data getData(Long id){
        return dataRepository.findById(id).get();
    }

    public List<Data> getDataAll(){
        return dataRepository.findAll();
    }
    public void deleteData(Long id){
        Data data = getData(id);
        dataRepository.delete(data);
        enderecoRepository.delete(data.getEndereco());
        denuncianteRepository.delete(data.getDenunciantes());
        denunciaRepository.delete(data.getDenuncia());
    }

    public Data updateData(Data newData, long id){
        Data data = getData(id);
        newData.setId(data.getId());
        newData.getDenunciantes().setId(data.getDenunciantes().getId());
        newData.getDenuncia().setId(data.getDenuncia().getId());
        newData.getEndereco().setId(data.getEndereco().getId());
        enderecoRepository.save(newData.getEndereco());
        denuncianteRepository.save(newData.getDenunciantes());
        denunciaRepository.save(newData.getDenuncia());
        return dataRepository.save(newData);

    }

}
