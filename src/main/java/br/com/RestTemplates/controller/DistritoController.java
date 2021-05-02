package br.com.RestTemplates.controller;


import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import br.com.RestTemplates.entity.Distritos;
import br.com.RestTemplates.repository.DistritoRepository;



@RestController
@RequestMapping("/myapp")
public class DistritoController {
	
	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private DistritoRepository distritoRepository;
	
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<List<Distritos>> getDistritos(Distritos distritos){
		String url = "https://servicodados.ibge.gov.br/api/v1/localidades/distritos";
		Distritos[] objects = restTemplate.getForObject(url, Distritos[].class);
		for(Distritos dt : objects) {
			dt.toString();
			System.out.println(dt);
 		 distritoRepository.save(dt);
		}
		return ResponseEntity.status(HttpStatus.OK).body(Arrays.asList());
	} 
	
//	@RequestMapping(value="/novo", method = RequestMethod.POST)
//	public ResponseEntity<Distritos> create(@RequestBody Distritos distritos) {
//		List<Distritos> dis = new ArrayList<>() ;
//		dis.add(distritos);
//		dis.forEach(a -> distritoRepository.save(distritos));
//		
//		
//		return ResponseEntity.ok().body(distritos) ;
//	}
	

}
