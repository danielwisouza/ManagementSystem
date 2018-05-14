
public class Comentario {
	private String comentario;
	private Usuario usuario;
	private Chamado numeroChamado;
		
	
//Construtor
public Comentario(String comentario, Usuario usuario, Chamado numeroChamado) {
		this.comentario = comentario;
		this.usuario = usuario;
		this.numeroChamado = numeroChamado;
	}

	//Adicionando Gets e sets 
	public String getcomentario(){
		return comentario;
	}
	public void setcomentario(String comentario) {
		this.comentario = comentario;
	}	 
	public Usuario getusuario(){
		return usuario;
	}
	public void setusuario(Usuario usuario) {
		this.usuario = usuario;
	}	
	public Chamado getnumeroChamado(){
		return numeroChamado;
	}
	public void setchamado(Chamado numeroChamado) {
		this.numeroChamado = numeroChamado;
	}	
}
