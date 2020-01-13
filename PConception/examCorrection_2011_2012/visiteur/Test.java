package examCorrection_2011_2012.visiteur;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Inspecteur inspecteurQualite = new InspecteurQualite();
		Inspecteur inspecteurConformite = new InspecteurConformite();
		Inspecteur inspecteurSecurite = new InspecteurSecurite();
		
		Service serviceAnalyse = new ServiceAnalyse();
		Service serviceConception = new ServiceConception();
		Service serviceImplementation = new ServiceImplementation();
		
		serviceAnalyse.accept(inspecteurQualite);
		serviceAnalyse.accept(inspecteurConformite);
		serviceAnalyse.accept(inspecteurSecurite);
		
		serviceConception.accept(inspecteurQualite);
		serviceConception.accept(inspecteurConformite);
		serviceConception.accept(inspecteurSecurite);
		
		serviceImplementation.accept(inspecteurQualite);
		serviceImplementation.accept(inspecteurConformite);
		serviceImplementation.accept(inspecteurSecurite);
	}

}
