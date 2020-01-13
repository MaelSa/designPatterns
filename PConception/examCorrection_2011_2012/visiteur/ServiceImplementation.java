package examCorrection_2011_2012.visiteur;

public class ServiceImplementation extends Service {

	public ServiceImplementation(){
		this.name = "Service Implementation";
	}
	
	@Override
	public void accept(Inspecteur visiteur) {
		visiteur.visit(this);
	}

}
