package examCorrection_2011_2012.visiteur;

public class ServiceConception extends Service {

	public ServiceConception(){
		this.name = "Service Conception";
	}
	
	@Override
	public void accept(Inspecteur visiteur) {
		visiteur.visit(this);
	}



}
