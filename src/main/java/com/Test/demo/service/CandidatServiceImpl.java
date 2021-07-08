package com.Test.demo.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Test.demo.entity.Candidat;
import com.Test.demo.repository.CandidatRepository;





@Service
public class CandidatServiceImpl implements ICandidatService {

	@Autowired
	CandidatRepository candidatRepository;
	
	private static final Logger L = LogManager.getLogger(CandidatServiceImpl.class);

	public List<Candidat> retrieveAllCandidats() {
		
			List<Candidat> candidats = (List<Candidat>) candidatRepository.findAll();
			for (Candidat candidat : candidats) {
				L.info("candidat :" + candidat);
			}
			return candidats ;
	}

	public Candidat addUser(Candidat u) {
		// TODO Auto-generated method stub
		return candidatRepository.save(u);
	}

	public void deleteUser(String id) {
		// TODO Auto-generated method stub
		candidatRepository.deleteById(Long.parseLong(id));
	}

	public Candidat updateUser(Candidat u) {
		// TODO Auto-generated method stub
		return candidatRepository.save(u);
	}

	public Candidat retrieveCandidat(String id) {
		// TODO Auto-generated method stub
		return (Candidat) candidatRepository.findAll();
	}

	public void deleteCandidatById(long id) {
		// TODO Auto-generated method stub
		this.deleteCandidatById(id);
	}

	public Candidat updateCandidat(Candidat u) {
		// TODO Auto-generated method stub
		return candidatRepository.save(u);
	}

	
	
	

	
}
