package model;

public class Usuario {
	private int Id;
	private String Nome;
	private int valorComanda;
	private boolean Pago;
	
	public Usuario() {
		this.Id = -1;
		this.Nome = "";
		this.valorComanda = "";
		this.Pago = FALSE;
	}
	
	public Usuario(int Id, String Nome, String valorComanda, char Pago) {
		this.Id = Id;
		this.Nome = Nome;
		this.valorComanda = valorComanda;
		this.Pago = Pago;
	}

	public int getId() {
		return Id;
	}

	public void setId(int Id) {
		this.Id = Id;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String Nome) {
		this.Nome = Nome;
	}

	public int valorComada() {
		return valorComanda;
	}

	public void setvalorComanda(String valorComanda) {
		this.valorComanda = valorComanda;
	}

	public boolean getPago() {
		return Pago;
	}

	public void setPago(char Pago) {
		this.Pago = Pago;
	}

	@Override
	public String toString() {
		return "Usuario [Id=" + Id + ", Nome=" + Nome + ", valorComanda=" + valorComanda + ", Pago=" + Pago + "]";
	}	
}
