package projet.symbol;

import java.util.ArrayList;
import java.util.List;

public class Function extends Symbol {
    private List<Variable> parameters;  // Liste des paramètres
    private List<Variable> returnValues; // Liste des valeurs de retour
    private List<Variable> localVariables; // Variables locales

    public Function(String name) {
        super(name);
        this.parameters = new ArrayList<>();
        this.returnValues = new ArrayList<>();
        this.localVariables = new ArrayList<>();
    }

    public Function(String name, List<Variable> params, List<Variable> outputs) {
		super(name);
		this.parameters=params;
		this.returnValues=outputs;
		this.localVariables = new ArrayList<>();
	}
	public void addParameter(Variable parameter) {
        this.parameters.add(parameter);
    }

    public void addReturnValue(Variable returnValue) {
        this.returnValues.add(returnValue);
    }

    public void addLocalVariable(Variable localVariable) {
        this.localVariables.add(localVariable);
    }

    public List<Variable> getParameters() {
        return parameters;
    }

    public List<Variable> getReturnValues() {
        return returnValues;
    }

    public List<Variable> getLocalVariables() {
        return localVariables;
    }

    @Override
    public String toString() {
        return "Function{name='" + name + "', parameters=" + parameters + ", returnValues=" + returnValues + ", localVariables=" + localVariables + "}";
    }
}

