package businessactivities;

import businessentities.CredentialsBE;
import dataobjects.CredentialsDO;

public class AuthorizationMapperBA {


	public CredentialsDO mapToDO(final CredentialsBE credentialsBE) {
		return new CredentialsDO( 
				credentialsBE.getPassword(), 
				credentialsBE.getUsername()
				);
	}
	
	public CredentialsBE mapToBE(final CredentialsDO credentialsDO) {
		return new CredentialsBE(
				credentialsDO.getUsername(), 
				credentialsDO.getPassword()
				);
	}

}
