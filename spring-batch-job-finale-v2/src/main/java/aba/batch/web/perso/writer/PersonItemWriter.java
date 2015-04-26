/**
 * 
 */
package aba.batch.web.perso.writer;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.batch.item.ItemWriter;

import aba.batch.web.perso.service.IPersonService;
import aba.batch.web.perso.vo.PersonVo;

/**
 * @author ali
 *
 */
public class PersonItemWriter implements ItemWriter<PersonVo>{

	//ATTRIBUTS
	/** appel au service*/
	private IPersonService personservice;
	
	/**Logger de la classe*/
	private Logger LOGGER = Logger.getLogger(PersonItemWriter.class);
	
	
	//METHODES
	@Override
	public void write(List<? extends PersonVo> listePersonVo) throws Exception {
		
		for (PersonVo personVo : listePersonVo) {
			
			if(personVo != null){
				personservice.ajouterDonneesPerson(personVo);
			}
			
		}
		
	}

}
