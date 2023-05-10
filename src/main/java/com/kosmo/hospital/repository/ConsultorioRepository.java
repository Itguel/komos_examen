package com.kosmo.hospital.repository;

import com.kosmo.hospital.entity.Consultorios;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsultorioRepository extends CrudRepository<Consultorios, Integer> {
}
