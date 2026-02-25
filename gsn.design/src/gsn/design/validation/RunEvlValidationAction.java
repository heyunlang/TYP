package gsn.design.validation;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;

public class RunEvlValidationAction implements IExternalJavaAction {

    @Override
    public boolean canExecute(Collection<? extends EObject> selection) {
        return true;
    }

    @Override
    public void execute(Collection<? extends EObject> selection, Map<String, Object> parameters) {
        System.out.println("EVL validation triggered!");
    }
}
