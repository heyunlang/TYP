package gsn.design.validation;

import java.net.URI;
import java.util.Collection;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.evl.EvlModule;
import org.eclipse.epsilon.evl.IEvlModule;
import org.eclipse.epsilon.evl.execute.UnsatisfiedConstraint;

/**
 * Single responsibility class to handle the initialization and execution 
 * of the Epsilon EVL engine for GSN validation.
 */
public class EvlValidator {

    private static final String EVL_SCRIPT_URI = "platform:/plugin/GsnEditor/validationGsn.evl";
    private static final String MODEL_NAME = "GSN";

    /**
     * Executes the EVL script against the given EMF Resource.
     * 
     * @param resource the EMF Resource to validate
     * @return a collection of unsatisfied constraints, if any
     * @throws RuntimeException if engine setup or execution fails
     */
    public Collection<UnsatisfiedConstraint> validate(Resource resource) {
        if (resource == null) {
            throw new IllegalArgumentException("Resource cannot be null for EVL validation.");
        }

        IEvlModule evlModule = createEvlModule();
        
        try {
            parseScript(evlModule);
            EmfModel emfModel = createEmfModel(resource);
            
            evlModule.getContext().getModelRepository().addModel(emfModel);
            evlModule.execute();
            
            return evlModule.getContext().getUnsatisfiedConstraints();
        } catch (Exception e) {
            throw new RuntimeException("Failed to execute EVL validation: " + e.getMessage(), e);
        } finally {
            evlModule.getContext().getModelRepository().dispose();
            evlModule.getContext().dispose();
        }
    }

    /**
     * Instantiates the EVL Module.
     */
    private IEvlModule createEvlModule() {
        return new EvlModule();
    }

    /**
     * Parses the EVL script.
     */
    private void parseScript(IEvlModule evlModule) throws Exception {
        URI scriptUri = new URI(EVL_SCRIPT_URI);
        boolean parseSuccess = evlModule.parse(scriptUri);
        
        if (!parseSuccess) {
            throw new RuntimeException("Failed to parse EVL script at: " + EVL_SCRIPT_URI);
        }
    }

    /**
     * Wraps the EMF Resource into an EmfModel.
     */
    private EmfModel createEmfModel(Resource resource) {
        EmfModel emfModel = new EmfModel();
        emfModel.setName(MODEL_NAME);
        emfModel.setResource(resource);
        emfModel.setReadOnLoad(false);
        emfModel.setStoredOnDisposal(false);
        return emfModel;
    }
}