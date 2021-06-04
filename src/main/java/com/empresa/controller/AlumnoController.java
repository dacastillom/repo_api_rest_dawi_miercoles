package com.empresa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.entity.Alumno;
import com.empresa.service.AlumnoService;

@RestController  //Antes era @Controller
@RequestMapping("/rest/alumno") //toda la ruta del proyecto
public class AlumnoController {
	
	@Autowired
	private AlumnoService service;
	
	
	
	@GetMapping
	@ResponseBody  //responseEntity los datos se convierten en Json.
	public ResponseEntity<List<Alumno>> listaAlumno(){
		List<Alumno> lista = service.listaAlumno();
		return ResponseEntity.ok(lista);
	}

	
	
	
}
