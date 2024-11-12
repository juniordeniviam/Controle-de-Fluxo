package exceptions;

public class ParametrosInvalidosException extends Exception {

	private static final long serialVersionUID = 1L;
	private String message = "O segundo parâmetro deve ser maior que o primeiro";
	
	@Override
	public String getMessage() {
		return message;
	}
	
}
