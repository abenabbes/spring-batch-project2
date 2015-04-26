/**
 * 
 */
package aba.batch.web.perso.reader;

import org.apache.log4j.Logger;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.LineMapper;
import org.springframework.core.io.Resource;

import aba.batch.web.perso.utils.VariablesUtils;

/**
 * Cette classe hérite de la classe {@link FlatFileItemReader} du spring batch.<br>
 * @param <T> the class for the class {@link LineMapper} to convert each line into.<br>
 * 
 * --------------------------------------------<br>
 * @author ali.<br>
 * --------------------------------------------<br>
 * 
 */
public class PersonItemReader<T> extends FlatFileItemReader<T>{

	//ATTRIBUTS 
	/** Resource de fichier à lire*/
	private Resource file;
	
	/**Logger de la classe*/
	private Logger LOGGER = Logger.getLogger(PersonItemReader.class);
		
	//METHODES 
	
	/**
	 * Méthode qui permet de verifier si le fichier à lire existe <br>
	 * et est ce qu'on peut le lire ou pas.
	 * @return VRAI si on peut lire est existe FALSE sinon.
	 */
	 public boolean canReadFile(){
	        return file.exists() && file.isReadable(  );
	  }
	 
	 @Override
	 protected void doOpen() throws Exception{
	   LOGGER.debug( "PersonItemReader - ouverture de fichier" + file);
		 
	   //SI on arrive pas à lire le file ALORS on log une errue
	   //SINON on appel la méthode doOpen de l'implémentation du spring-batch.
	   if (!canReadFile()){
		   LOGGER.error( "PersonItemReader - Error de chargement du file " + file +
	          " : Le file n'existe pas ou bien on ne peut pas ouvrir le file." + VariablesUtils.FILE_NOT_FOUND_ERROR );
	   }
	   
	   // appel la méthode doOpen de l'implémentation du spring-batch
	    super.doOpen(  );
	   }
	
	//GETTERS && SETTERS
	
	/**
	 * Setter de file.
	 * @param file
	 */
	public void setFile(Resource file) {
		this.file = file;
	}
}
