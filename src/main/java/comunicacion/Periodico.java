package comunicacion;

public class Periodico extends Escrito {
	String fecha;
	String primicia;
	String interpretacion;
	
	public Periodico(String origen, String titulo, String autor, int paginas, String fecha, String primicia,
			String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.fecha = fecha;
		this.primicia = primicia;
		this.interpretacion = interpretacion;
	}
	@Override
	public int palabrasTotales(int palabrasPagina) {
		
		return 10*palabrasPagina*getPaginas();
	}
	@Override
	public String interpretacion() {
		return interpretacion;
		
	}
	@Override
	public String toString() {
		return getOrigen() +"\n"+getTitulo()+"\n"+getAutor()+"\n"+getPaginas()+"\n"+getFecha()+"\n"+primicia;
	}
	public String getFecha() {
		return getFecha();
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
	
	
}
