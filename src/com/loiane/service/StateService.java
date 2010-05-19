package com.loiane.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.loiane.model.State;

/**
 * All the business logic goes here
 * 
 * @author Loiane Groner
 * http://loianegroner.com (English)
 * http://loiane.com (Portuguese)
 */
@Service
public class StateService {

	/**
	 * Return list of all States of Brazil
	 * @return
	 */
	public List<State> getBrazilianStates(){
		
		List<State> states = new ArrayList<State>();
		
		states.add(new State("AC","Acre"));
		states.add(new State("AL","Alagoas"));
		states.add(new State("AP","Amapá"));
		states.add(new State("AM","Amazonas"));
		states.add(new State("BA","Bahia"));
		states.add(new State("CE","Ceará"));
		states.add(new State("DF","Distrito Federal"));
		states.add(new State("ES","Espírito Santo"));
		states.add(new State("GO","Goiás"));
		states.add(new State("MA","Maranhão"));
		states.add(new State("MT","Mato Grosso"));
		states.add(new State("MS","Mato Grosso do Sul"));
		states.add(new State("MG","Minas Gerais"));
		states.add(new State("PA","Pará"));
		states.add(new State("PB","Paraíba"));
		states.add(new State("PR","Paraná"));
		states.add(new State("PE","Pernambuco"));
		states.add(new State("PI","Piauí"));
		states.add(new State("RJ","Rio de Janeiro"));
		states.add(new State("RN","Rio Grande do Norte"));
		states.add(new State("RS","Rio Grande do Sul"));
		states.add(new State("RO","Rondônia"));
		states.add(new State("RR","Roraima"));
		states.add(new State("SC","Santa Catarina"));
		states.add(new State("SP","São Paulo"));
		states.add(new State("SE","Sergipe"));
		states.add(new State("TO","Tocantins"));
		
		return states;
	}
}
