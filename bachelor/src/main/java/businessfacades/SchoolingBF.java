package businessfacades;

import java.util.List;
import java.util.stream.Collectors;

import businessactivities.SchoolingMapperBA;
import businessactivities.SchoolingQueryBA;
import businessentities.SchoolingBE;
import dataobjects.SchoolingDO;

public class SchoolingBF {

	final SchoolingMapperBA schoolingMapperBA = new SchoolingMapperBA();

	final SchoolingQueryBA schoolingQueryBA = new SchoolingQueryBA();

	/**
	 * maps the schooling data transfer object to a business entity and inserts it
	 * in the database
	 */
	public SchoolingDO createSchooling(final SchoolingDO schoolingDO) {
		final SchoolingBE schoolingBEToInsert = schoolingMapperBA.mapToBE(schoolingDO);
		final SchoolingBE schoolingBE = schoolingQueryBA.insertSchooling(schoolingBEToInsert);
		return schoolingMapperBA.mapToDO(schoolingBE);
	}

	/*
	 * /** takes the id of the schooling do and removes it in the database
	 */
	public void deleteSchooling(final Long id) {
		// find schoolingdo change schoolingdo save schoolingdo
		schoolingQueryBA.deleteSchooling(id);
	}

	/**
	 * returns all schooling entries in the database
	 */
	public List<SchoolingDO> searchSchoolings() {
		// return all entries of SchoolingTable
		List<SchoolingBE> beList = schoolingQueryBA.searchSchoolings();
		return beList.stream().map(be -> schoolingMapperBA.mapToDO(be)).collect(Collectors.toList());
	}

	/**
	 * updates the schooling entity
	 */
	public SchoolingDO updateSchooling(final SchoolingDO schoolingDoToUpdate) {
	// find schoolingdo update schoolingdo save schoolingdo
		final SchoolingBE schoolingBeToUpdate = schoolingMapperBA.mapToBeWithId(schoolingDoToUpdate);
		final SchoolingBE schoolingBE = schoolingQueryBA.updateSchooling(schoolingBeToUpdate);
		return schoolingMapperBA.mapToDO(schoolingBE);
	}

}
