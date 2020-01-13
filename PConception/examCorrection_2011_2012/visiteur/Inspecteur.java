package examCorrection_2011_2012.visiteur;

public abstract class Inspecteur {

	protected String name;
	
	public String actionVisite(Service service){
		return "L'"+this.name+" visite le "+service.getName();
	}
	
	public abstract void visit(ServiceAnalyse service);

	public abstract void visit(ServiceConception service);

	public abstract void visit(ServiceImplementation service);
	
}
