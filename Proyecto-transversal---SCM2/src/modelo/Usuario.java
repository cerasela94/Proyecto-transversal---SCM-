package modelo;

public class Usuario {
	private String usuario;
	private String contrase�a;
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public Usuario(String usuario, String contrase�a) {
		super();
		this.usuario = usuario;
		this.contrase�a = contrase�a;
	}
	public String getContrase�a() {
		return contrase�a;
	}
	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}
	
	
}
