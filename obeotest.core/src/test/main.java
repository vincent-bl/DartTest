package test;

import dart.Package;
import dart.Project;

public class main {

	public static void main(String[] args) {
		EMFModelLoad loader = new EMFModelLoad();
		Project myProjectLoaded = loader.load();
		
		// Accessing the model information
        System.out.println(myProjectLoaded.getName());
        
        //4 - Afficher dans la sortie standard le nombre d'�l�ments dans le mod�le
        for (Package pack : myProjectLoaded.getPackages()) {
        	pack.getAssets().size();
		}
        

        //5 - Afficher dans la sortie standard le label de tous les �l�ments du mod�le

	}

}
