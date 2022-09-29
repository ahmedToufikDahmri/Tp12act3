
package dz.ibnrochd.master14.view;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import dz.ibnrochd.master14.business.IPatientService;
import dz.ibnrochd.master14.business.ITraitementService;
import dz.ibnrochd.master14.model.Patient;
import dz.ibnrochd.master14.model.Traitement;


@Controller
public class MyController  {
	
	
	@Autowired
	private IPatientService pr;
	@Autowired
	private ITraitementService tr;


	

  
//	private  static List<Patient> patients = new ArrayList<Patient>();
//	static {
//		patients.add(new Patient(0, "Bill", "Gates", "messageErreur", null, "messageErreur", "messageErreur"));
//		patients.add(new Patient(1, "Bill", "Gates", "messageErreur", null, "messageErreur", "messageErreur"));
//	}
	
    /**
     * error message
     */


	@Value ("${error.message}")
	private String messageErreur;	
	
    /**
     * lien index
     */

	   @RequestMapping(value = "/index")
	   public String index() {
	      return "index";
	   }
	   
	    /**
	     * affiche la list des patients
	     */
		
		@GetMapping(path =  "/patientsList" )
		public String patients(Model model) {

			 List<Patient> patients = pr.afficherTousPatients();
			 
			 model.addAttribute("patientsList", patients);

			return "patientsList";
		}
		
		
	    /**
	     * affiche la list des traitements
	     */
		
		@GetMapping(path =  "/traitementsList" )
		public String traitements(Model model) {

			 List<Traitement> traitements = tr.afficherTousTraitements();
			 
			 model.addAttribute("traitementsList", traitements);

			return "traitementsList";
		}
		
	    /**
	     * formulaire pour ajouter des Patients
	     */
		
		@GetMapping ( "/ajouterPatient" )
		public String ajouterPatient(Model model) {
			model.addAttribute("patient",new Patient(0, "votre nom", "votre prenom", "H", null, "000 00 00 00", "votre adresse"));
			return "ajouterPatient";
		}
		
		
	    /**
	     * cree un Patient
	     */
		@PostMapping (path="/save")
		public String save(Model model, Patient patient) {
			
			pr.enregistrerPatient(patient);
			return "redirect:/patientsList";
		}
		
	    /**
	     * modifier un Patient
	     */
		@GetMapping ( "/update" )
		public String update(Model model, int id) {
			Patient patient= pr.afficherPatientAvecId(id);
			model.addAttribute("patient", patient);

			return "modifierPatient";
		}
			
		
		
	    /**
	     * supprimer un Patient
	     */
		@GetMapping("/delete")
		public String delete (int id) {
			pr.supprimerPatientAvecId(id);
			return "redirect:/patientsList";
			
		}
		
	    /**
	     * rediriger requête par defaut vers index
	     */
		@GetMapping("/")
		public String home() {
			return "redirect:/index";
		}
		
		
	
	
	
}
