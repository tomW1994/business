package dataobjects;

import java.time.LocalDateTime;
import java.util.ArrayList;

import enums.Status;

public class JobAdmissionDO {

	private Long id;
	private String department;
	private String jobname;
	private ArrayList<String> focalpoints;
	private int salary;
	private String location;
	private String departmentinformation;
	private String jobinformation;
	private String customerphone;
	private String customermail;
	private Status status;
	private LocalDateTime created;
	private LocalDateTime modified;

	public JobAdmissionDO() {
		
	}
	
	public JobAdmissionDO(
			Long id, String department, String jobname, ArrayList<String> focalpoints, int salary, String location,
			String departmentinformation, String jobinformation, String customerphone,
			String customermail, final Status status, final LocalDateTime created,
			final LocalDateTime modified
			) {
		this.id = id;
		this.department = department;
		this.jobname = jobname;
		this.focalpoints = focalpoints;
		this.salary = salary;
		this.location = location;
		this.departmentinformation = departmentinformation;
		this.jobinformation = jobinformation;
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
	public ArrayList<String> getFocalpoints() {
		return focalpoints;
	}
	public void setFocalpoints(ArrayList<String> focalpoints) {
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
	public String getDepartmentinformation() {
		return departmentinformation;
	}

	public void setDepartmentinformation(String departmentinformation) {
		this.departmentinformation = departmentinformation;
	}

	public String getJobinformation() {
		return jobinformation;
	}

	public void setJobinformation(String jobinformation) {
		this.jobinformation = jobinformation;
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
