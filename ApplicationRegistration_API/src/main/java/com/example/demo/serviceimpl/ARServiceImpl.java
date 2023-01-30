package com.example.demo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entity.Citizen;
import com.example.demo.repo.UserRepository;
import com.example.demo.service.ARService;
@Service
public class ARServiceImpl implements ARService {
	
	@Autowired
	private UserRepository repo; 
	
	@Autowired
	private RestTemplate rt;

	@Override
	public String getState(Citizen citizen) {
		// TODO Auto-generated method stub
		String ssn = citizen.getSsn();
		String getState = rt.getForObject("http://ssawebapi-env.eba-k88bsahp.ap-south-1.elasticbeanstalk.com/ssn/{ssn}", String.class,ssn);
		if(getState.equals("Rhode Island")) {
		repo.save(citizen);
		return "Citizen onboarding Success & can Apply for the Plan  :"+getState;
		}else {
		return "Citizen onboarding Failed !!!!!!" +getState;
	}
}
	}


