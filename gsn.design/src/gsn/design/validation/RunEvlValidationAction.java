package gsn.design.validation;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.epsilon.evl.execute.UnsatisfiedConstraint;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;

/**
 * Entry point for the Sirius External Java Action.
 * 
 * Extracts the Resource from the current selection, triggers the EVL 
 * validation engine, and delegates the result to the UI dialog.
 */
public class RunEvlValidationAction implements IExternalJavaAction {

    @Override
    public boolean canExecute(Collection<? extends EObject> selection) {
        return !ObjectUtils.isEmpty(selection);
    }

    @Override
    public void execute(Collection<? extends EObject> selection, Map<String, Object> parameters) {
        if (ObjectUtils.isEmpty(selection)) {
            System.err.println("No selection available for EVL validation.");
            return;
        }

        EObject selectedObject = extractFirstElement(selection);
        
        if (selectedObject == null) {
            System.err.println("Selected element is null.");
            return;
        }

        Resource resource = selectedObject.eResource();
        
        if (resource == null) {
            System.err.println("Resource is null. Cannot perform EVL validation.");
            return;
        }

        try {
            EvlValidator validator = new EvlValidator();
            Collection<UnsatisfiedConstraint> unsatisfiedConstraints = validator.validate(resource);
            
            EvlValidationResultDialog resultDialog = new EvlValidationResultDialog();
            resultDialog.showResult(unsatisfiedConstraints);
            
        } catch (Exception e) {
            System.err.println("Error executing EVL validation action: " + e.getMessage());
            e.printStackTrace();
            throw new RuntimeException("Error executing EVL validation action", e);
        }
    }

    /**
     * Extracts the first EObject from the given selection collection.
     */
    private EObject extractFirstElement(Collection<? extends EObject> selection) {
        return selection.iterator().next();
    }
}