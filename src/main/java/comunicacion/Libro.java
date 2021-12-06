package comunicacion;

public class Libro extends Escrito {
	String co_autor;
	String editorial;
	String origen;
	String edicion;
	String interpretacion;
	private String titulo;
	private String autor;
	private int paginas;
	
	//Escrito(String origen, String titulo, String autor, int paginas
	public Libro(String origen, String titulo, String autor, int paginas, String co_autor, String editorial, String edicion, String interpretacion) {
	
		super(origen, titulo, autor, paginas);
		this.co_autor=co_autor;
		this.editorial=editorial;
		this.edicion=edicion;
		this.interpretacion=interpretacion;
		
	}
	@Override
	public int palabrasTotales(int palabrasPagina) {
		
		return 2*paginas;
	}
	@Override
	String interpretacion() {
		return interpretacion;
		
	}
	@Override
	public String toString() {
		return  origen +"\n"+titulo+"\n"+autor+"\n"+paginas+"\n"+co_autor+"\n"+editorial+"\n"+edicion;
	}
	public String getCo_autor() {
		return co_autor;
	}
	public void setCo_autor(String co_autor) {
		this.co_autor = co_autor;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public String getEdicion() {
		return edicion;
	}
	public void setEdicion(String edicion) {
		this.edicion = edicion;
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
