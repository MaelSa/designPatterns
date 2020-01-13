package examCorrection_2011_2012.visiteur;

public abstract class Service {
	
	protected String name;
	
	public String getName(){
		return this.name;
	}
	
	public abstract void accept(Inspecteur visiteur);
}
