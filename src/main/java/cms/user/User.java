package cms.user;

public abstract class User {
	protected final String nome;
	protected final String email;
	protected final String password;
	protected final int id;
	
	public User(int id, String nome, String email, String password) {
		this.nome = nome;
		this.email = email;
		this.password = password;
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getPassword() {
		return password;
	}
	
	public int getId() {
		return id;
	}

	public boolean checkPassword(String p) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
