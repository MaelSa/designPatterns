package examCorrection_2011_2012.visiteur;

public class InspecteurQualite extends Inspecteur {

	
	
	public InspecteurQualite(){
		this.name = "inspecteur Qualite";
	}
	
	
	
	public void visit(ServiceAnalyse service) {
		System.out.println(this.actionVisite(service));
	}

	public void visit(ServiceConception service) {
		System.out.println(this.actionVisite(service));
	}

	public void visit(ServiceImplementation service) {
		System.out.println(this.actionVisite(service));
	}

}
