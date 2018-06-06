package project.medicaldetails;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DetailsController {

	@Autowired
	private DetailsRepositary detailsrepository;
	//private DetailsService detailservice;
	
	@RequestMapping(value="/details", produces=MediaType.APPLICATION_XML_VALUE)
	public List<Medicaldetails> gtAllDetail(){
		List<Medicaldetails> details=new ArrayList<>();
		detailsrepository.findAll().forEach(details::add);
		return details;
		
		//return detailservice.getAllDetails();
}
	 @RequestMapping(value="/details/{Mrn}", produces=MediaType.APPLICATION_XML_VALUE)
	    public Medicaldetails getDetail(@PathVariable Long Mrn){
		 return detailsrepository.findOne(Mrn);	
		 //return detailservice.getDetails(Mrn);
	    }
	    @RequestMapping(method=RequestMethod.POST, value="/details",produces=MediaType.APPLICATION_XML_VALUE)
	    public Medicaldetails addDetail(@RequestBody Medicaldetails details){
	    	return detailsrepository.save(details);
	    	
	    }
	    @RequestMapping(method=RequestMethod.PUT, value="/details/{Mrn}",produces=MediaType.APPLICATION_XML_VALUE)
	    public void updateDetail(@RequestBody Medicaldetails details,@PathVariable Long Mrn){
	    	detailsrepository.save(details);
	    	//detailservice.updateDetails(Mrn,details);
	    }
	    @RequestMapping(method=RequestMethod.DELETE, value="/details/{Mrn}")
	    public void deleteDetail(@PathVariable Long Mrn){
	    	detailsrepository.delete(Mrn);
	    	//detailservice.deleteDetails(Mrn);
	    }
}
