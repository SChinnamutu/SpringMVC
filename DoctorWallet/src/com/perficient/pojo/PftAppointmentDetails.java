package com.perficient.pojo;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="PPI_MY_APPOINT_DETAIL")
public class PftAppointmentDetails {

	@Id
	@Column(name="PMAD_ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	
	/*@Id
	@Column(name="PMAD_ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private BigDecimal id;
*/	
	
	@Column(name="PMAD_DOCTOR_ID")
	private int doctorId;
	
	@Column(name="PMAD_DOCTOR_NAME")
	private String doctorName;
	
	@Column(name="PMAD_APPOINT_DATE")
	private Date appointmentDate;
	
	@Column(name="PMAD_LOCATION")
	private String doctorLocation;
	
	@Column(name="PMAD_FIXED_TIME")
	private String fixedTime;
	

	@Column(name="PMAD_RAISED_DATE")
	private Date raisedDate;
	
	@Column(name="PMAD_STATUS")
	private String status;
	
	@Column(name="PMAD_USER_ID")
	private BigDecimal pmadUserId;
	
	

	 /*@ManyToOne(fetch= FetchType.EAGER)
	 @JoinColumn(name="PMAD_DOCTOR_ID")
	 private PftDoctorDetails pftDoctorDetails;
	
	
	public PftDoctorDetails getPftDoctorDetails() {
		return pftDoctorDetails;
	}

	public void setPftDoctorDetails(PftDoctorDetails pftDoctorDetails) {
		this.pftDoctorDetails = pftDoctorDetails;
	}
*/
	public Date getRaisedDate() {
		return raisedDate;
	}

	public void setRaisedDate(Date raisedDate) {
		this.raisedDate = raisedDate;
	}
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public BigDecimal getPmadUserId() {
		return pmadUserId;
	}

	public void setPmadUserId(BigDecimal pmadUserId) {
		this.pmadUserId = pmadUserId;
	}

	/*public BigDecimal getId() {
		return id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}*/

	public int getDoctorId() {
		return doctorId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public Date getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(Date appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public String getDoctorLocation() {
		return doctorLocation;
	}

	public void setDoctorLocation(String doctorLocation) {
		this.doctorLocation = doctorLocation;
	}

	public String getFixedTime() {
		return fixedTime;
	}

	public void setFixedTime(String fixedTime) {
		this.fixedTime = fixedTime;
	}
	
	
	
}
