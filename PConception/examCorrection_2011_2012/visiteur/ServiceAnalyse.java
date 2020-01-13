package examCorrection_2011_2012.visiteur;

public class ServiceAnalyse extends Service {

	public ServiceAnalyse(){
		this.name = "Service Analyse";
	}
	
	@Override
	public void accept(Inspecteur visiteur) {
		visiteur.visit(this);
	}

}
