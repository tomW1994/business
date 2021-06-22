package businessfacades;

import java.util.List;
import java.util.stream.Collectors;

import businessactivities.JobAdmissionMapperBA;
import businessactivities.JobAdmissionQueryBA;
import businessentities.JobAdmissionBE;
import dataobjects.JobAdmissionDO;

public class JobAdmissionBF {

	final JobAdmissionMapperBA jobAdmissionMapperBA = new JobAdmissionMapperBA();

	final JobAdmissionQueryBA jobAdmissionQueryBA = new JobAdmissionQueryBA();

	/**
	 * maps the schooling data transfer object to a business entity and inserts it
	 * in the database
	 */
	public JobAdmissionDO createJobAdmission(final JobAdmissionDO jobAdmissionDO) {
		final JobAdmissionBE jobAdmissionBE = jobAdmissionMapperBA.mapToBE(jobAdmissionDO);
		return jobAdmissionMapperBA.mapToDO(jobAdmissionQueryBA.insertJobAdmission(jobAdmissionBE));
	}

	/*
	 * /** takes the id of the jobAdmission do and removes it in the database
	 */
	public void deleteJobAdmission(final Long id) {
		// find jobAdmissiondo change jobAdmission save jobAdmission
		jobAdmissionQueryBA.deleteJobAdmission(id);
	}

	/**
	 * returns all jobAdmission entries in the database
	 */
	public List<JobAdmissionDO> searchJobAdmissions() {
		// return all entries of JobAdmissionTable
		List<JobAdmissionBE> beList = jobAdmissionQueryBA.searchJobAdmissions();
		return beList.stream().map(be -> jobAdmissionMapperBA.mapToDO(be)).collect(Collectors.toList());
	}

	/**
	 * updates the jobAdmission entity
	 */
	public JobAdmissionDO updateJobAdmission(final JobAdmissionDO jobAdmissionDoToUpdate) {
	// find jobAdmission update jobAdmission save jobAdmission
		final JobAdmissionBE jobAdmissionBeToUpdate = jobAdmissionMapperBA.mapToBeWithId(jobAdmissionDoToUpdate);
		final JobAdmissionBE jobAdmissionBE = jobAdmissionQueryBA.updateJobAdmission(jobAdmissionBeToUpdate);
		return jobAdmissionMapperBA.mapToDO(jobAdmissionBE);
	}

}
