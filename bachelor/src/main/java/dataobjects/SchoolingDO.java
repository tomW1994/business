package dataobjects;

import java.time.LocalDateTime;

import enums.Status;

public class SchoolingDO {

	private Long id;
	private int groupsize;
	private String schoolingname;
	private String department;
	private String customerphone;
	private String customermail;
	private Status status;
	private LocalDateTime created;
	private LocalDateTime modified;

	public SchoolingDO() {
	}

	public SchoolingDO(
			final Long id, final String department, final String schoolingname, final int groupsize,
			final String customerphone, final String customermail, final Status status, final LocalDateTime created,
			final LocalDateTime modified

	) {
		this.id = id;
		this.department = department;
		this.schoolingname = schoolingname;
		this.groupsize = groupsize;
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

	public int getGroupsize() {
		return groupsize;
	}

	public void setGroupsize(final int groupsize) {
		this.groupsize = groupsize;
	}

	public String getSchoolingname() {
		return schoolingname;
	}

	public void setSchoolingname(final String schoolingname) {
		this.schoolingname = schoolingname;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(final String department) {
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
