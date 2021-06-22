package businessfacades;

import java.util.List;
import java.util.stream.Collectors;

import businessactivities.AuthorizationMapperBA;
import businessactivities.AuthorizationQueryBA;
import businessactivities.JobAdmissionMapperBA;
import businessactivities.JobAdmissionQueryBA;
import businessentities.CredentialsBE;
import businessentities.JobAdmissionBE;
import dataobjects.CredentialsDO;
import dataobjects.JobAdmissionDO;

public class AuthorizationBF {

	final AuthorizationMapperBA authorizationMapperBA = new AuthorizationMapperBA();

	final AuthorizationQueryBA authorizationQueryBA = new AuthorizationQueryBA();

	/**
	 * maps the schooling data transfer object to a business entity and inserts it
	 * in the database
	 */
	public boolean createAuthorization(final CredentialsDO credentialsDO) {
		final CredentialsBE credentialsBE = authorizationMapperBA.mapToBE(credentialsDO);
		return authorizationQueryBA.insertCredentials(credentialsBE);
	}

	/*
	 * /** takes the id of the jobAdmission do and removes it in the database
	 */
	public void deleteCredentials(final Long id) {
		// find jobAdmissiondo change jobAdmission save jobAdmission
		authorizationQueryBA.deleteAuthorization(id);
	}

	/**
	 * returns all jobAdmission entries in the database
	 */
	public boolean checkCredentials(CredentialsDO credentials) {
		// return all entries of JobAdmissionTable
		if(authorizationQueryBA.checkCredentials(credentials) == 1) {
			return true;
		}
		return false;
	}

	/**
	 * updates the jobAdmission entity
	 */
	public CredentialsDO updateJobAdmission(final CredentialsDO credentialsDoToUpdate) {
	// find jobAdmission update jobAdmission save jobAdmission
		final CredentialsBE credentialsBeToUpdate = authorizationMapperBA.mapToBeWithId(credentialsDoToUpdate);
		final CredentialsBE credentialsBE = authorizationQueryBA.updateCredentials(credentialsBeToUpdate);
		return authorizationMapperBA.mapToDO(credentialsBE);
	}

}
