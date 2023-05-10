package com.kosmo.hospital.service;

import com.kosmo.hospital.entity.Consultorios;
import com.kosmo.hospital.repository.ConsultorioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsultorioService {

    @Autowired
    private ConsultorioRepository consultorioRepository;

    public List<Consultorios> getConsultorios(){
        return (List<Consultorios>) consultorioRepository.findAll();
    }
}
