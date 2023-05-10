package com.kosmo.hospital.service;

import com.kosmo.hospital.entity.Doctor;
import com.kosmo.hospital.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    public List<Doctor> getAllDoctors(){
        return (List<Doctor>) doctorRepository.findAll();
    }
}
