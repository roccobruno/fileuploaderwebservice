package com.giovanni.uploadservice;

import javax.jws.WebParam;
import javax.jws.WebService;

import com.giovanni.uploadbean.FileUploader;


	
	@WebService
	public interface UploadSEI {
	    
	    void uploadFile(@WebParam(name="Dfile") FileUploader Dfile);
	}
