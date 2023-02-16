package com.patient.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.patient.request.Patient;
import com.patient.util.CommonRestApiUrl;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/api")
public class PatientController {
	
	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	ObjectMapper objectMapper;
	
	@Autowired
	private CommonRestApiUrl commonRestApiUrl;
	
	@PostMapping("/excel/upload")
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public void uploadFile(@RequestParam("file") @RequestBody MultipartFile file) {

	    	Resource multipartFile = file.getResource();

	    	LinkedMultiValueMap<String, Object> parts = new LinkedMultiValueMap<>();
	    	parts.add("file", multipartFile);

	    	HttpHeaders httpHeaders = new HttpHeaders();
	    	httpHeaders.setContentType(MediaType.MULTIPART_FORM_DATA);

	    	HttpEntity<LinkedMultiValueMap<String, Object>> httpEntity = new 
	    	HttpEntity<>(parts, httpHeaders);

	    restTemplate.exchange("http://localhost:8084/api/excel/upload", HttpMethod.POST, httpEntity, Object.class)
				.getBody();
	
	}
	
	@GetMapping("/allpatients")
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public String getAllPatients() {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>(headers);

		return restTemplate.exchange("http://localhost:8084/api/allpatients", HttpMethod.GET, entity, String.class)
				.getBody();
	}
	@GetMapping("/patientbyname/{name}")
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public String getPatientByName(@PathVariable String name) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

		HttpEntity<Patient> entity = new HttpEntity<Patient>(headers);

		return restTemplate.exchange("http://localhost:8084/api/patientbyname/"+name, HttpMethod.GET, entity, String.class)
				.getBody();
	}
	
	@GetMapping("/patientbyid/{id}")
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public String getPatientById(@PathVariable Long id) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

		HttpEntity<Patient> entity = new HttpEntity<Patient>(headers);

		return restTemplate.exchange("http://localhost:8084/api/patientbyid/"+id, HttpMethod.GET, entity, String.class)
				.getBody();
	}

	@PatchMapping("/patient/update/{id}")
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public String updatePatient(@RequestBody Patient patient, @PathVariable Long id) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

		HttpEntity<Patient> entity = new HttpEntity<Patient>(patient, headers);

		return restTemplate
				.exchange("http://localhost:8084/api/patient/update/"+id, HttpMethod.PATCH, entity, String.class)
				.getBody();
	}

	@PatchMapping("/patient/status/update/{id}")
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public String updatePatientStatus(@RequestBody Patient patient, @PathVariable Long id) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

		HttpEntity<Patient> entity = new HttpEntity<Patient>(patient, headers);

		return restTemplate.exchange("http://localhost:8084/api/patient/status/update/"+id, HttpMethod.PATCH, entity,
				String.class).getBody();
	}

	@DeleteMapping("/delete/patient/{id}")
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public String deletePatient(@PathVariable Long id) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<Patient> entity = new HttpEntity<Patient>(headers);

		return restTemplate.exchange("http://localhost:8084/api/delete/patient/"+id, HttpMethod.DELETE, entity, String.class)
				.getBody();
	}

}
