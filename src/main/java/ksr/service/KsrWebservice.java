package ksr.service;

import javax.jws.WebParam;
import javax.jws.WebService;

import ksr.domain.KsrDomain;

@WebService
public interface KsrWebservice {
	
	public KsrDomain getUserDetails(@WebParam(name="name") final String name);
	public void addUser(@WebParam(name="ksrDomain") final KsrDomain ksrDomain);

}
