package project.medicaldetails;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(name = "Medicaldetails")
public class Medicaldetails implements Serializable {
	
	@Id 
	@Column(name="Mrn")
	private Long  Mrn;
	
	@Column(name="zip")
	private Integer zip;
	@Column(name="fullname")
	private String fullname;
	@Column(name="email")
	private String email;
	@Column(name="address")
	private String address;
	@Column(name="city")
	private String city;
	@Column(name="state")
	private String state;
	@Column(name="birthdate")
	private String birthdate;
	@Column(name="sex")
	private String sex;
	@Column(name="comultant")
	private String consultant;
	@Column(name="history")
	private String history;
	@Column(name="medication")
	private String medication;
	
	public Medicaldetails()
	{
		
	}
	public Medicaldetails(Long  Mrn,Integer zip, String fullname, String email, String address, String city,String state,String birthdate,String sex,String consultant,String history,String medication) {
		super();
		this.Mrn = Mrn;
		this.fullname = fullname;
		this.email = email;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip= zip;
		this.birthdate = birthdate;
		this.sex = sex;
		this.consultant = consultant;
		this.medication= medication;
		
	}
	
	public Long getMrn() {
		return Mrn;
	}

	public void setMrn(Long mrn) {
		Mrn = mrn;
	}
	
	public Number getZip() {
		return zip;
	}
	
	public void setZip(Integer zip) {
		this.zip = zip;
	}

	public String getFullname() {
		return fullname;
	}
	
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public String getBirthdate() {
		return birthdate;
	}
	
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
	
	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public String getConsultant() {
		return consultant;
	}
	
	public void setConsultant(String consultant) {
		this.consultant = consultant;
	}
	
	public String getHistory() {
		return history;
	}
	
	public void setHistory(String history) {
		this.history = history;
	}
	
	public String getMedication() {
		return medication;
	}
	
	public void setMedication(String medication) {
		this.medication = medication;
	}
	
}
