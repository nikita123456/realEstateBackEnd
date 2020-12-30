package model;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public class TenantDetailsRequest {
	private String name;
	private String email;
	enum TITLE {
		  MR,
		  MS,
		  MRS
		}
	private String fName;
	private String mName;
	private String lName;
	private String date;
	private String gender;
	private List<String> contactno;
	MultipartFile picUpload;

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<String> getContactno() {
		return contactno;
	}

	public void setContactno(List<String> contactno) {
		this.contactno = contactno;
	}

	public MultipartFile getPicUpload() {
		return picUpload;
	}

	public void setPicUpload(MultipartFile picUpload) {
		this.picUpload = picUpload;
	}
	
	

}
