package dz.ibnrochd.master14.business;

import org.springframework.beans.factory.annotation.Autowired;
import dz.ibnrochd.master14.dao.PatientRepository;
import dz.ibnrochd.master14.model.Patient;


public class PatientService implements IPatientService {
	
	@Autowired  
	PatientRepository PatientRepository;  
	
	
	public void afficherPatientAvecId(int id)   
	{  
	 PatientRepository.findById(id);  
	}  
	
	public void enregistrerPatient(Patient patient)   
	{  
	PatientRepository.save(patient);  
	}  
	
	public void supprimerPatientAvecId(int id)   
	{  
	PatientRepository.deleteById(id);  
	}  
	
	public void miseAJourPatient(Patient patient, int id)   
	{  
	PatientRepository.save(patient);  
	}  
	
	
	
	
}
