package com.Test.demo.service;

import java.util.List;

import com.Test.demo.entity.Candidat;



public interface ICandidatService {

	
List<Candidat> retrieveAllCandidats();
	
	Candidat addUser(Candidat u);
	
	void deleteUser(String id);
	
	Candidat updateCandidat(Candidat u);
	
	Candidat retrieveCandidat(String id);
	void deleteCandidatById(long id);
}
