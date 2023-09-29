package one.digitalinovation.laboojava.entidade;

import one.digitalinovation.laboojava.entidade.constantes.Materias;

public class Caderno extends Produto {
	private Materias tipo;

	public Materias getTipo() {
		return tipo;
	}

	public void setTipo(Materias tipo) {
		this.tipo = tipo;
	}
	
	@Override
    public double calcularFrete() {
        return (getPreco() * getQuantidade()) + tipo.getFator();
    }

	@Override
	public String toString() {
		return "Caderno " + 
				"[tipo=" + tipo + 
				", getCodigo()=" + getCodigo() + 
				", getPreco()=" + getPreco() + 
				"]";
	}
}
