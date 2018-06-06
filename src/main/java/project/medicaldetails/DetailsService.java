//package project.medicaldetails;
//
//import java.util.ArrayList;
//import java.util.List;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//
//
//@Service
//public class DetailsService {
//
//	@Autowired
//	private DetailsRepositary detailsrepository;
//
//	public List<Medicaldetails> getAllDetails() {
//		List<Medicaldetails> details=new ArrayList<>();
//		detailsrepository.findAll().forEach(details::add);
//		return details;
//	}
//	
//	public Medicaldetails getDetails(Long Mrn) {
//		return detailsrepository.findOne(Mrn);
//	}
//
//	public void addDetails(Medicaldetails details) {
//		detailsrepository.save(details);
//		
//	}
//
//	public void updateDetails(Long Mrn, Medicaldetails details) {
//		detailsrepository.save(details);
//		
//	}
//
//	public void deleteDetails(Long Mrn) {
//		detailsrepository.delete(Mrn);
//	}
//}
