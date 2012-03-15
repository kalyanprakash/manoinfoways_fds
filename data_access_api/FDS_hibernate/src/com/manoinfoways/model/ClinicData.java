package com.manoinfoways.model;
// Generated Mar 14, 2012 4:42:37 PM by Hibernate Tools 3.4.0.CR1


import java.util.HashSet;
import java.util.Set;

/**
 * ClinicData generated by hbm2java
 */
public class ClinicData  implements java.io.Serializable {


     private String clinicId;
     private String clinicName;
     private String addressLine1;
     private String addressLine2;
     private String country;
     private String location;
     private Integer zipcode;
     private Set<Voicefilesdata> voicefilesdatas = new HashSet<Voicefilesdata>(0);
     private Set<Doctordata> doctordatas = new HashSet<Doctordata>(0);
     private Set<Clinicrequirements> clinicrequirementses = new HashSet<Clinicrequirements>(0);
     private Set<Clinicconnectiondetails> clinicconnectiondetailses = new HashSet<Clinicconnectiondetails>(0);
     private Set<Clinicmetadata> clinicmetadatas = new HashSet<Clinicmetadata>(0);

    public ClinicData() {
    }

	
    public ClinicData(String clinicId) {
        this.clinicId = clinicId;
    }
    public ClinicData(String clinicId, String clinicName, String addressLine1, String addressLine2, String country, String location, Integer zipcode, Set<Voicefilesdata> voicefilesdatas, Set<Doctordata> doctordatas, Set<Clinicrequirements> clinicrequirementses, Set<Clinicconnectiondetails> clinicconnectiondetailses, Set<Clinicmetadata> clinicmetadatas) {
       this.clinicId = clinicId;
       this.clinicName = clinicName;
       this.addressLine1 = addressLine1;
       this.addressLine2 = addressLine2;
       this.country = country;
       this.location = location;
       this.zipcode = zipcode;
       this.voicefilesdatas = voicefilesdatas;
       this.doctordatas = doctordatas;
       this.clinicrequirementses = clinicrequirementses;
       this.clinicconnectiondetailses = clinicconnectiondetailses;
       this.clinicmetadatas = clinicmetadatas;
    }
   
    public String getClinicId() {
        return this.clinicId;
    }
    
    public void setClinicId(String clinicId) {
        this.clinicId = clinicId;
    }
    public String getClinicName() {
        return this.clinicName;
    }
    
    public void setClinicName(String clinicName) {
        this.clinicName = clinicName;
    }
    public String getAddressLine1() {
        return this.addressLine1;
    }
    
    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }
    public String getAddressLine2() {
        return this.addressLine2;
    }
    
    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }
    public String getCountry() {
        return this.country;
    }
    
    public void setCountry(String country) {
        this.country = country;
    }
    public String getLocation() {
        return this.location;
    }
    
    public void setLocation(String location) {
        this.location = location;
    }
    public Integer getZipcode() {
        return this.zipcode;
    }
    
    public void setZipcode(Integer zipcode) {
        this.zipcode = zipcode;
    }
    public Set<Voicefilesdata> getVoicefilesdatas() {
        return this.voicefilesdatas;
    }
    
    public void setVoicefilesdatas(Set<Voicefilesdata> voicefilesdatas) {
        this.voicefilesdatas = voicefilesdatas;
    }
    public Set<Doctordata> getDoctordatas() {
        return this.doctordatas;
    }
    
    public void setDoctordatas(Set<Doctordata> doctordatas) {
        this.doctordatas = doctordatas;
    }
    public Set<Clinicrequirements> getClinicrequirementses() {
        return this.clinicrequirementses;
    }
    
    public void setClinicrequirementses(Set<Clinicrequirements> clinicrequirementses) {
        this.clinicrequirementses = clinicrequirementses;
    }
    public Set<Clinicconnectiondetails> getClinicconnectiondetailses() {
        return this.clinicconnectiondetailses;
    }
    
    public void setClinicconnectiondetailses(Set<Clinicconnectiondetails> clinicconnectiondetailses) {
        this.clinicconnectiondetailses = clinicconnectiondetailses;
    }
    public Set<Clinicmetadata> getClinicmetadatas() {
        return this.clinicmetadatas;
    }
    
    public void setClinicmetadatas(Set<Clinicmetadata> clinicmetadatas) {
        this.clinicmetadatas = clinicmetadatas;
    }


	@Override
	public String toString() {
		return "ClinicData [clinicId=" + clinicId + ", clinicName="
				+ clinicName + ", addressLine1=" + addressLine1
				+ ", addressLine2=" + addressLine2 + ", country=" + country
				+ ", location=" + location + ", zipcode=" + zipcode + "]";
	}




}

