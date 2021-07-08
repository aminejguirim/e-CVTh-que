package com.Test.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.Test.demo.entity.Candidat;
import com.Test.demo.service.CandidatServiceImpl;



@RestController
public class CandidatController {

	
	
	@Autowired
	CandidatServiceImpl service;
	
	// http://localhost:4023/SpringMVC/servlet/add-candidat
	
		@PostMapping("/add-candidat")
		@ResponseBody
		public Candidat addCandidat(@RequestBody Candidat u) {
		Candidat candidat = service.addUser(u);
		return candidat;
		}

	// http://localhost:4023/SpringMVC/servlet/retrieve-all-candidats
		@GetMapping("/retrieve-all-candidat")
		@ResponseBody
		public List<Candidat> getCandidats() {
		List<Candidat> list = service.retrieveAllCandidats();
		return list;
		
		}
		// http://localhost:4023/SpringMVC/servlet/modify-candidat
		@PutMapping("/modify-candidat")
		@ResponseBody
		public Candidat modifyCandidat(@RequestBody Candidat candidat) {
		return service.updateCandidat(candidat);
		}
		
		// http://localhost:4023/SpringMVC/servlet/remove-candidat/{candidat-id}
		@DeleteMapping("/remove-candidat/{candidat-id}")
		@ResponseBody
		public void removeCandidat(@PathVariable("candidat-id") Long candidatId) {
		service.deleteCandidatById(candidatId);
		}		
}

