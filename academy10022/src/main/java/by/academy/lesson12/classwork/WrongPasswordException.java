package by.academy.lesson12.classwork;

public class WrongPasswordException extends Exception{

	public WrongPasswordException() {}
	
	public WrongPasswordException(String massage) {
		super(massage);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("WrongPasswordException [");
		builder.append(getMessage());
		builder.append("]");
		return builder.toString();
	}
	
}
