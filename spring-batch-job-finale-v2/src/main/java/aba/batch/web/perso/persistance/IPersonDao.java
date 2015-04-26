/**
 * 
 */
package aba.batch.web.perso.persistance;

import aba.batch.web.perso.vo.PersonVo;

/**
 * @author ali
 *
 */
public interface IPersonDao {
	
	PersonVo ajouterDonneesPerson(PersonVo personAjouter);

}
