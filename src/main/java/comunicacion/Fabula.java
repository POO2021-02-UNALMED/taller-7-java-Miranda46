package comunicacion;

public class Fabula extends Escrito {
	String ensenanza;
	String origen;
	String interpretacion;
	private String titulo;
	private String autor;
	private int paginas;
	
	//Escrito(String origen, String titulo, String autor, int paginas
	public Fabula(String origen, String titulo, String autor, int paginas, String ensenanza, String interpretacion) {
	
		super(origen, titulo, autor, paginas);
		this.ensenanza=ensenanza;
		this.interpretacion=interpretacion;
		
		
	}
	@Override
	public int palabrasTotales(int palabrasPagina) {
		
		return 2*palabrasPagina*paginas;
	}
	@Override
	public String interpretacion() {
		return interpretacion;
		
	}
	@Override
	public String toString() {
		return origen +"\n"+titulo+"\n"+autor+"\n"+paginas+"\n"+ensenanza;
	}
	public String getEnsenanza() {
		return ensenanza;
	}
	public void setEnsenanza(String ensenanza) {
		this.ensenanza = ensenanza;
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
