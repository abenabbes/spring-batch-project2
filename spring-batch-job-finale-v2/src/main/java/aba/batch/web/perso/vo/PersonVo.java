/**
 * 
 */
package aba.batch.web.perso.vo;

/**
 * @author ali
 *
 */
public class PersonVo {

	// ATTRIBUTS
	private int id;
    private String name;
    private String prenom;
    private int civilite;
    
    // GETTERS && SETTERS
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getCivilite() {
		return civilite;
	}
	public void setCivilite(int civilite) {
		this.civilite = civilite;
	}
	
	// toString
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PersonVo [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", prenom=");
		builder.append(prenom);
		builder.append(", civilite=");
		builder.append(civilite);
		builder.append(", getId()=");
		builder.append(getId());
		builder.append(", getName()=");
		builder.append(getName());
		builder.append(", getPrenom()=");
		builder.append(getPrenom());
		builder.append(", getCivilite()=");
		builder.append(getCivilite());
		builder.append(", getClass()=");
		builder.append(getClass());
		builder.append(", hashCode()=");
		builder.append(hashCode());
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
    
}
