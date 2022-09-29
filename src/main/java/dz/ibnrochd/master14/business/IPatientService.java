package dz.ibnrochd.master14.business;

import java.util.List;

import org.springframework.stereotype.Service;

import dz.ibnrochd.master14.model.Patient;

public interface IPatientService {

	public List<Patient> afficherTousPatients();   
	
	
	
	public  Patient afficherPatientAvecId(int id);  
	 
	
	public void enregistrerPatient(Patient patient);  
	  
	
	public void supprimerPatientAvecId(int id);  
	
}
