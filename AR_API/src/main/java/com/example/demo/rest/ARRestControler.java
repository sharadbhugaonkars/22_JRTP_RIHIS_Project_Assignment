package com.example.demo.rest;


	import org.slf4j.Logger;
	import org.slf4j.LoggerFactory;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.RestController;
	import org.springframework.web.client.RestTemplate;

	@RestController
	public class ARRestControler {
		
		private static final Logger log = LoggerFactory.getLogger(ARRestControler.class);

		@Autowired
		private RestTemplate rt;
		
		@GetMapping("/showState")
		public String showMsg() {
			log.info("WE ARE AT AR_SERVICE...");
			
			//Integer ssn=5210;
			
			String resp = rt.getForEntity("http://ssawebapi-env.eba-k88bsahp.ap-south-1.elasticbeanstalk.com/ssn/{ssn}", String.class).getBody();
			
			return "FROM AR_SERVICE.."+resp;
		}
	}



