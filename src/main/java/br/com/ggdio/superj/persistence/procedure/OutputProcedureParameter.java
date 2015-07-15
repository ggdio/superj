package br.com.ggdio.superj.persistence.procedure;

import javax.persistence.ParameterMode;

/**
 * Parameter for outputing values on stored procedure
 * @author Guilherme Dio
 *
 */
public final class OutputProcedureParameter extends ProcedureParameter {

	public OutputProcedureParameter(Class<?> type) {
		super.type = type;
		super.mode = ParameterMode.OUT;
		super.value = "";
	}

}