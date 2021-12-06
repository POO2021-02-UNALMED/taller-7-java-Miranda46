package comunicacion;

public class Periodico extends Escrito {
	String fecha;
	String origen;
	String interpretacion;
	String primicia;
	private String titulo;
	private String autor;
	private int paginas;
	
	//Escrito(String origen, String titulo, String autor, int paginas
	public Periodico(String origen, String titulo, String autor, int paginas, String fecha, String primicia, String interpretacion) {
	
		super(origen, titulo, autor, paginas);
		this.fecha=fecha;
		this.primicia=primicia;
		this.interpretacion=interpretacion;
		
		
	}
	@Override
	public int palabrasTotales(int palabrasPagina) {
		
		return 10*palabrasPagina;
	}
	@Override
	public String interpretacion() {
		return interpretacion;
		
	}
	@Override
	public String toString() {
		return origen +"\n"+titulo+"\n"+autor+"\n"+paginas+"\n"+fecha+"\n"+primicia;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public String getInterpretacion() {
		return interpretacion;
	}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	public String getPrimicia() {
		return primicia;
	}
	public void setPrimicia(String primicia) {
		this.primicia = primicia;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getPaginas() {
		return paginas;
	}
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	
}
