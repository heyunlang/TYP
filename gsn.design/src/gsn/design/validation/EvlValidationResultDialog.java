package gsn.design.validation;

import java.util.Collection;

import org.eclipse.epsilon.evl.execute.UnsatisfiedConstraint;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;

/**
 * Single responsibility class to display the EVL validation results 
 * to the user via an Eclipse UI dialog.
 */
public class EvlValidationResultDialog {

    private static final String DIALOG_TITLE = "GSN EVL Validation Result";

    /**
     * Shows the validation result in a MessageDialog.
     * 
     * @param unsatisfiedConstraints a collection of unsatisfied constraints from the EVL engine
     */
    public void showResult(Collection<UnsatisfiedConstraint> unsatisfiedConstraints) {
        if (ObjectUtils.isEmpty(unsatisfiedConstraints)) {
            showSuccessDialog();
            return;
        }

        showErrorDialog(unsatisfiedConstraints);
    }

    /**
     * Displays a success dialog when no constraints are violated.
     */
    private void showSuccessDialog() {
        Display.getDefault().asyncExec(() -> {
            MessageDialog.openInformation(
                Display.getDefault().getActiveShell(),
                DIALOG_TITLE,
                "All EVL constraints passed successfully!"
            );
        });
    }

    /**
     * Displays an error dialog detailing the violated constraints.
     */
    private void showErrorDialog(Collection<UnsatisfiedConstraint> unsatisfiedConstraints) {
        StringBuilder errorMessage = new StringBuilder("The following EVL constraints were not satisfied:\n\n");

        for (UnsatisfiedConstraint constraint : unsatisfiedConstraints) {
            errorMessage.append("- ")
                        .append(constraint.getMessage())
                        .append("\n");
        }

        Display.getDefault().asyncExec(() -> {
            MessageDialog.openError(
                Display.getDefault().getActiveShell(),
                DIALOG_TITLE,
                errorMessage.toString()
            );
        });
    }
}