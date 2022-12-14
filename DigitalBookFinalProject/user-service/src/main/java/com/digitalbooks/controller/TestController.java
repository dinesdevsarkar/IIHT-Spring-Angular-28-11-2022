package com.digitalbooks.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/test")
public class TestController {
	@GetMapping("/all")
	public String allAccess() {
		return "All Public Access.";
	}

	@GetMapping("/user")
	@PreAuthorize("hasRole('GUEST') or hasRole('AUTHOR') or hasRole('READER')")
	public String userAccess() {
		return "All User Access.";
	}

	@GetMapping("/author")
	@PreAuthorize("hasRole('AUTHOR')")
	public String moderatorAccess() {
		return "Author Access.";
	}

	@GetMapping("/reader")
	@PreAuthorize("hasRole('READER')")
	public String adminAccess() {
		return "Reader Access.";
	}
}
