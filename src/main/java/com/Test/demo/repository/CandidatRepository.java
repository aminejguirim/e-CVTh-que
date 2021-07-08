package com.Test.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.Test.demo.entity.Candidat;



public interface CandidatRepository extends CrudRepository<Candidat,Long> {

}
