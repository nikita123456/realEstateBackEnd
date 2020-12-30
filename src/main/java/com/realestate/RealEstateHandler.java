package com.realestate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import model.BankDetailsRequest;
import model.BankDetailsResponse;
import model.TenantDetailsRequest;
import model.TenantDetailsResponse;

@RestController
public class RealEstateHandler {

	@Autowired(required = true)
	RealEstateServiceImplementation realEstateService;

	@GetMapping("/saveNewTenureDetails")
	@ResponseBody
	public TenantDetailsResponse saveNewTenureDetails(@RequestParam(value = "emailId") String emailId) {

		TenantDetailsResponse res = new TenantDetailsResponse();
		try {
			res = realEstateService.saveNewTenureDetails(emailId);
		}
		// catch{} //UserDefineException
		catch (Exception e) {
			throw e;
		}
		// Performance logs
		return res;
	}

	@PostMapping("/saveNewTenureDetails")
	@ResponseBody
	public TenantDetailsResponse saveNewTenureDetails(@RequestBody TenantDetailsRequest tenantDetailsRequest) {
		TenantDetailsResponse res = new TenantDetailsResponse();
		res = realEstateService.saveTenureDetails(tenantDetailsRequest);

		// Performance logs
		return res;
	}

	@PostMapping("/saveTenureDetails")
	@ResponseBody
	public TenantDetailsResponse saveTenureDetails(@RequestBody TenantDetailsRequest tenantDetailsRequest) {
		TenantDetailsResponse res = new TenantDetailsResponse();
		res = realEstateService.saveTenureDetails(tenantDetailsRequest);

		// Performance logs
		return res;
	}

	@PostMapping("/saveBankDetails")
	@ResponseBody
	public BankDetailsResponse saveBankDetails(@RequestBody BankDetailsRequest bankDetailsRequest) {
		BankDetailsResponse res = new BankDetailsResponse();
		res = realEstateService.saveBankDetails(bankDetailsRequest);

		// Performance logs
		return res;
	}

}
