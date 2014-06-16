package ar.com.grupo1.tecnicas.Logging;



public interface Logger {
	boolean log (String message, String level);
	void setLevel(String level);
	String getLevel();
	void setFormat(String format);
	String getFormat();
	void addTarget(Target target);
	void removeTarget(Target target);
}
