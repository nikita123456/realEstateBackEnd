package com.realestate;

import model.TenantDetailsRequest;
import model.TenantDetailsResponse;

public interface RealEstateService {
	public TenantDetailsResponse saveTenureDetails(TenantDetailsRequest tenantDetailsRequest);
}
