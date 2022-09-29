package dz.ibnrochd.master14.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dz.ibnrochd.master14.dao.TraitementRepository;
import dz.ibnrochd.master14.model.Traitement;

@Service
public class TraitementService implements ITraitementService {
	
	@Autowired  
	TraitementRepository TraitementRepository;  
	
	
	public List<Traitement> afficherTousTraitements()   
	{  
	return TraitementRepository.findAll();  
	}  
	
	

}
