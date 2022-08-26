
package dz.ibnrochd.master14.business;

import org.springframework.beans.factory.annotation.Autowired;

import dz.ibnrochd.master14.dao.ConsultationRepository;
import dz.ibnrochd.master14.model.Consultation;

public class ConsultationService implements IConsultationService {
	
	
	@Autowired  
	ConsultationRepository ConsultationRepository;  
	
	
	public void afficherConsultationAvecId(int id)   
	{  
	ConsultationRepository.findById(id);  
	}  
	
	public void enregistrerConsultation(Consultation consultation)   
	{  
	ConsultationRepository.save(consultation);  
	}  
	
	public void supprimerConsultationAvecId(int id)   
	{  
	ConsultationRepository.deleteById(id);  
	}  
	  
	public void miseAJourPatient(Consultation consultation, int id)   
	{  
	ConsultationRepository.save(consultation);  
	}  
	
}
