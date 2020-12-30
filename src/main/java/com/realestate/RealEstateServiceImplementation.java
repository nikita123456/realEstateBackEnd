package com.realestate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import model.BankDetailsRequest;
import model.BankDetailsResponse;
import model.TenantDetailsRequest;
import model.TenantDetailsResponse;


@Service
public class RealEstateServiceImplementation implements RealEstateService{


	public TenantDetailsResponse saveTenureDetails(TenantDetailsRequest tenantDetailsRequest) {
		// TODO Auto-generated method stub
		
		//call the dao
		TenantDetailsResponse tenantDetailsResponse=new TenantDetailsResponse();
		tenantDetailsResponse.setId(1);
		return tenantDetailsResponse;
	}

	public TenantDetailsResponse saveNewTenureDetails(String emailId) {
		// TODO Auto-generated method stub
		TenantDetailsResponse tenantDetailsResponse=new TenantDetailsResponse();
		tenantDetailsResponse.setId(1);
		return tenantDetailsResponse;
	}

	public BankDetailsResponse saveBankDetails(BankDetailsRequest bankDetailsRequest) {
		// TODO Auto-generated method stub
		return new BankDetailsResponse();
	}

}
