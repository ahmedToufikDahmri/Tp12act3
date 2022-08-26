package dz.ibnrochd.master14;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import dz.ibnrochd.master14.dao.PatientRepository;
import dz.ibnrochd.master14.dao.ConsultationRepository;
import dz.ibnrochd.master14.dao.TraitementRepository;
import dz.ibnrochd.master14.dao.LigneConsultationRepository;
import dz.ibnrochd.master14.dao.RendezVousRepository;
import dz.ibnrochd.master14.model.Consultation;
import dz.ibnrochd.master14.model.LigneConsultation;
import dz.ibnrochd.master14.model.Patient;
import dz.ibnrochd.master14.business.PatientService;
import dz.ibnrochd.master14.business.IPatientService;



@SpringBootApplication
public class Sb002Application implements CommandLineRunner {
	
	@Autowired
	PatientRepository patientRepository;
	@Autowired
	ConsultationRepository consultationRepository;
	@Autowired
	TraitementRepository traitementRepository;
	@Autowired
	LigneConsultationRepository ligneConsultationRepository;
	@Autowired
	RendezVousRepository rendezVousRepository;


	
	// TODO : déclarer les autres repository de la même façon que PatientRepository
	

	public static void main(String[] args) {
		SpringApplication.run(Sb002Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		// TODO : récupérer la liste de tous les patients puis afficher leurs noms


		 List<Patient> p = patientRepository.findAll();
		 System.out.println(p);
		 
		// TODO : rechercher les patients ayant le nom "Yahi" puis leurs prénoms

		 List<Patient> p2 = patientRepository.findByNom( "Yahi" );
		 System.out.println(p2);

		 
		// TODO : créer un nouveau patient (valeurs au choix)  PUIS enregistrer-le

	    patientRepository.save(new Patient (5,"ahmed","dahmri","m",new Date(2002-02-05),"055778899","alger"));

		
	//	 TODO : rechercher la consultation ayant id=3 
	    Consultation c1;
		c1=consultationRepository.getOne(3);
		System.out.println(c1);
		
		
		// Optional<Consultation> c = consultationRepository.findById(3);
		// System.out.println(c);

		// TODO : parcourir les lignes de la consultation trouvée et afficher les noms des médicaments

		//List<LigneConsultation> lc = ligneConsultationRepository.findAll();
    	//System.out.println( lc.getTraitement().getNom);
		 		


		List <LigneConsultation> lc = ligneConsultationRepository.findAll();

	//	System.out.println(lc);
		
		for  (LigneConsultation lc0 : lc){

    	System.out.println(lc0.getTraitement());
		}
		
		
		

				
		

		
	}




}
