package examCorrection_2011_2012.visiteur;

public class InspecteurSecurite extends Inspecteur {

	public InspecteurSecurite(){
		this.name = "inspecteur Securité";
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
