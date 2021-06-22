package businessactivities;

import businessentities.SchoolingBE;
import dataobjects.SchoolingDO;

public class SchoolingMapperBA {

	public SchoolingDO mapToDO(final SchoolingBE schoolingBE) {
		return new SchoolingDO(
				schoolingBE.getId(),
				schoolingBE.getDepartment(), 
				schoolingBE.getSchoolingName(), 
				schoolingBE.getGroupSize(),
				schoolingBE.getCustomerphone(),
				schoolingBE.getCustomermail(),
				schoolingBE.getStatus(),
				schoolingBE.getCreated(),
				schoolingBE.getModified()
				);
	}
	
	public SchoolingBE mapToBE(final SchoolingDO schoolingDO) {
		return new SchoolingBE(
				schoolingDO.getDepartment(), 
				schoolingDO.getSchoolingname(), 
		      	schoolingDO.getGroupsize(),
		      	schoolingDO.getCustomerphone(),
				schoolingDO.getCustomermail(),
				schoolingDO.getStatus(),
				schoolingDO.getCreated(),
				schoolingDO.getModified()
				);
	}
	
	public SchoolingBE mapToBeWithId(final SchoolingDO schoolingDO) {
		return new SchoolingBE(
				schoolingDO.getId(),
				schoolingDO.getDepartment(), 
				schoolingDO.getSchoolingname(), 
		      	schoolingDO.getGroupsize(),
		      	schoolingDO.getCustomerphone(),
				schoolingDO.getCustomermail(),
				schoolingDO.getStatus(),
				schoolingDO.getCreated(),
				schoolingDO.getModified()
				);
	}
	
}
