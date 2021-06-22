package businessentities;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import enums.Status;

@Entity
@Table(name = "schooling", schema = "public")
public class SchoolingBE {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private int groupsize;

	private String schoolingname;

	private String department;
	
	private String customerphone;
	
	private String customermail;
	
	private LocalDateTime created;
	
	private LocalDateTime modified;
	
	@Enumerated(EnumType.STRING)
	private Status status;
	
	public SchoolingBE() {
	}

	public SchoolingBE(final String department, final String schoolingname, final int groupsize,
	final String customerphone, final String customermail, final Status status, 
	final LocalDateTime created, final LocalDateTime modified
	) {
		this.department = department;
		this.schoolingname = schoolingname;
		this.groupsize = groupsize;
		this.customerphone = customerphone;
		this.customermail = customermail;
		this.status = status;
		this.created = created;
		this.modified = modified;
	}
	
	public SchoolingBE(final Long id, final String department, final String schoolingname, final int groupsize,
	final String customerphone, final String customermail, final Status status, 
	final LocalDateTime created, final LocalDateTime modified
	) {
		this.id = id;
		this.department = department;
		this.schoolingname = schoolingname;
		this.groupsize = groupsize;
		this.customerphone = customerphone;
		this.customermail = customermail;
		this.status = status;
		this.created = created;
		this.modified = modified;
	}

	/*
	 * getter and setter
	 */

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getGroupSize() {
		return groupsize;
	}

	public void setGroupSize(int groupsize) {
		this.groupsize = groupsize;
	}

	public String getSchoolingName() {
		return schoolingname;
	}

	public void setSchoolingName(String schoolingname) {
		this.schoolingname = schoolingname;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartmentId(String department) {
		this.department = department;
	}

	public String getCustomerphone() {
		return customerphone;
	}

	public void setCustomerphone(String customerphone) {
		this.customerphone = customerphone;
	}
	
	public String getCustomermail() {
		return customermail;
	}

	public void setCustomermail(String customermail) {
		this.customermail = customermail;
	}	

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	
	public LocalDateTime getCreated() {
		return created;
	}

	public void setCreated(LocalDateTime created) {
		this.created = created;
	}

	public LocalDateTime getModified() {
		return modified;
	}

	public void setModified(LocalDateTime modified) {
		this.modified = modified;
	}
}
