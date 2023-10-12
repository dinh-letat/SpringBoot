package model;

public class WelcomeMessage {
	private String message;
	private String author;
	private String createAt;
	public WelcomeMessage() {
		this.message = "Welcome!!!";
		this.author = "Le Tat Dinh";
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getCreateAt() {
		return createAt;
	}
	public void setCreateAt(String createAt) {
		this.createAt = createAt;
	}
	
	
}
