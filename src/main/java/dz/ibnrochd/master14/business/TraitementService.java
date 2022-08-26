package dz.ibnrochd.master14.business;

import org.springframework.beans.factory.annotation.Autowired;
import dz.ibnrochd.master14.dao.TraitementRepository;
import dz.ibnrochd.master14.model.Traitement;


public class TraitementService implements ITraitementService {
	
	@Autowired  
	TraitementRepository TraitementRepository;  
	
	
	public void afficherTraitementAvecId(int id)   
	{  
	TraitementRepository.findById(id);  
	}  
	
	public void enregistrerTraitement(Traitement traitement)   
	{  
	TraitementRepository.save(traitement);  
	}  
	
	public void supprimerPatientAvecId(int id)   
	{  
	TraitementRepository.deleteById(id);  
	}  
	  
	public void miseAJourPatient(Traitement traitement, int id)   
	{  
	TraitementRepository.save(traitement);  
	}  

}
