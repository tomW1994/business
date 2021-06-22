package businessactivities;

import businessentities.JobAdmissionBE;
import dataobjects.JobAdmissionDO;

public class JobAdmissionMapperBA {


	public JobAdmissionDO mapToDO(final JobAdmissionBE jobAdmissionBE) {
		return new JobAdmissionDO(
				jobAdmissionBE.getId(), 
				jobAdmissionBE.getDepartment(), 
				jobAdmissionBE.getJobname(), 
				jobAdmissionBE.getFocalpoints(),
				jobAdmissionBE.getSalary(),
				jobAdmissionBE.getLocation(),
				jobAdmissionBE.getDepartmentinformation(),
				jobAdmissionBE.getJobinformation(),
				jobAdmissionBE.getCustomerphone(),
				jobAdmissionBE.getCustomermail(),
				jobAdmissionBE.getStatus(),
				jobAdmissionBE.getCreated(),
				jobAdmissionBE.getModified()
				);
	}
	
	public JobAdmissionBE mapToBE(final JobAdmissionDO jobAdmissionDO) {
		return new JobAdmissionBE(
				jobAdmissionDO.getDepartment(), 
				jobAdmissionDO.getJobname(), 
		      	jobAdmissionDO.getFocalpoints(),
		      	jobAdmissionDO.getSalary(),
		      	jobAdmissionDO.getLocation(),
		      	jobAdmissionDO.getDepartmentinformation(),
		      	jobAdmissionDO.getJobinformation(),
		      	jobAdmissionDO.getCustomerphone(),
		      	jobAdmissionDO.getCustomermail(),
		      	jobAdmissionDO.getStatus(),
		      	jobAdmissionDO.getCreated(),
		      	jobAdmissionDO.getModified()
				);
	}
	
	public JobAdmissionBE mapToBeWithId(final JobAdmissionDO jobAdmissionDO) {
		return new JobAdmissionBE(
				jobAdmissionDO.getId(),
				jobAdmissionDO.getDepartment(), 
				jobAdmissionDO.getJobname(), 
		      	jobAdmissionDO.getFocalpoints(),
		      	jobAdmissionDO.getSalary(),
		      	jobAdmissionDO.getLocation(),
		      	jobAdmissionDO.getDepartmentinformation(),
		      	jobAdmissionDO.getJobinformation(),
		      	jobAdmissionDO.getCustomerphone(),
		      	jobAdmissionDO.getCustomermail(),
		      	jobAdmissionDO.getStatus(),
		      	jobAdmissionDO.getCreated(),
		      	jobAdmissionDO.getModified()
				);
	}
}
