package examCorrection_2011_2012.visiteur;

public class InspecteurConformite extends Inspecteur {

	public InspecteurConformite(){
		this.name = "inspecteur Conformité";
	}
	
	@Override
	public void visit(ServiceAnalyse service) {
		System.out.println(this.actionVisite(service));
	}

	@Override
	public void visit(ServiceConception service) {
		System.out.println(this.actionVisite(service));
	}

	@Override
	public void visit(ServiceImplementation service) {
		System.out.println(this.actionVisite(service));
	}

}
