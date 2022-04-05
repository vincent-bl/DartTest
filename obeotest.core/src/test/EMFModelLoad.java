package test;

import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import dart.DartPackage;
import dart.Project;

public class EMFModelLoad {
	public Project load() {
        // Initialize the model
		DartPackage.eINSTANCE.eClass();
        
        // Register the XMI resource factory for the .dartspec extension
        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("dartspec", new XMIResourceFactoryImpl());
        

        // Obtain a new resource set
        ResourceSet resSet = new ResourceSetImpl();

        // Get the resource
        Resource resource = resSet.getResource(URI
                .createURI("resources/dartlang.dartspec"), true);
        // Get the first model element and cast it to the right type, in my
        // example everything is hierarchical included in this first node
        Project myProject = (Project) resource.getContents().get(0);
        return myProject;
    }

}
