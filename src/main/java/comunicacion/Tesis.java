package comunicacion;

public class Tesis extends Escrito {
	String[] argumentos;
	String conclusion;
	String referencias;
	String origen;
	String interpretacion;
	String idea;
	private String titulo;
	private String autor;
	private int paginas;
	
	//Escrito(String origen, String titulo, String autor, int paginas
	public Tesis(String origen, String titulo, String autor, int paginas, String idea, String[] argumentos, String conclusion, String referencias, String interpretacion) {
	
		super(origen, titulo, autor, paginas);
		this.conclusion=conclusion;
		this.idea=idea;
		this.referencias=referencias;
		this.interpretacion=interpretacion;
		
		
	}
	@Override
	public int palabrasTotales(int palabrasPagina) {
		
		return 5*paginas;
	}
	@Override
	public String interpretacion() {
		return interpretacion;
		
	}
	@Override
	public String toString() {
		return origen +"\n"+titulo+"\n"+autor+"\n"+paginas+"\n"+idea+"\n"+argumentos+"\n"+conclusion+"\n"+referencias;
	}
	public String[] getArgumentos() {
		return argumentos;
	}
	public void setArgumentos(String[] argumentos) {
		this.argumentos = argumentos;
	}
	public String getConclusion() {
		return conclusion;
	}
	public void setConclusion(String conclusion) {
		this.conclusion = conclusion;
	}
	public String getReferencias() {
		return referencias;
	}
	public void setReferencias(String referencias) {
		this.referencias = referencias;
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
	public String getIdea() {
		return idea;
	}
	public void setIdea(String idea) {
		this.idea = idea;
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
