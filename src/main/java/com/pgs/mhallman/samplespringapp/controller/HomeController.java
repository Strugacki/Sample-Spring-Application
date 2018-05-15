package com.pgs.mhallman.samplespringapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/home")
public class HomeController {

	@GetMapping(path = "index")
	public ResponseEntity getIndex() {
		return ResponseEntity.status(HttpStatus.OK).body("Hello World!");
	}

}
