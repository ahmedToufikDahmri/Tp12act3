package dz.ibnrochd.master14.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dz.ibnrochd.master14.dao.PatientRepository;
import dz.ibnrochd.master14.model.Patient;

@Service
public class PatientService implements IPatientService {
	
	@Autowired  
	PatientRepository PatientRepository;  
	
	public List<Patient> afficherTousPatients()   
	{  
	 return PatientRepository.findAll();  
	} 
	
	public  Patient afficherPatientAvecId(int id)   
	{  
		return PatientRepository.findById(id).orElse(null);  
	}  
	
	public void enregistrerPatient(Patient patient)   
	{  
	PatientRepository.save(patient);  
	}  
	
	public void supprimerPatientAvecId(int id)   
	{  
	PatientRepository.deleteById(id);  
	}  
	
//	public void miseAJourPatient(Patient patient, int id)   
//	{  
//	PatientRepository.save(patient);  
//	}  
	
	
	
	
}
