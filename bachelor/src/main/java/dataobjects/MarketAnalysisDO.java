package dataobjects;

import java.time.LocalDateTime;
import java.util.List;

import enums.Status;

public class MarketAnalysisDO {

	private Long id;
	private String department;
	private String jobname;
	private List<String> focalpoints;
	private int salary;
	private String location;
	private String customerphone;
	private String customermail;
	private Status status;
	private LocalDateTime created;
	private LocalDateTime modified;

	public MarketAnalysisDO() {
		
	}
	
	public MarketAnalysisDO(
			Long id, String department, String jobname, List<String> focalpoints, int salary, String location,
			String customerphone, String customermail, final Status status, 
			final LocalDateTime created,final LocalDateTime modified
			) {
		this.id = id;
		this.department = department;
		this.jobname = jobname;
		this.focalpoints = focalpoints;
		this.salary = salary;
		this.location = location;
		this.customerphone = customerphone;
		this.customermail = customermail;
		if (status == null) {
			this.status = Status.OFFEN;
		} else {
			this.status = status;
		}
		this.created = created;
		this.modified = modified;
	}

	public Long getId() {
		return id;
	}
	
	public void setId(final Long id) {
		this.id = id;
	}

	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getJobname() {
		return jobname;
	}
	public void setJobname(String jobname) {
		this.jobname = jobname;
	}
	public List<String> getFocalpoints() {
		return focalpoints;
	}
	public void setFocalpoints(List<String> focalpoints) {
		this.focalpoints = focalpoints;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
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
