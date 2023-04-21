import static java.util.Objects.requireNonNull;

enum tela{
  ALGODON,
  JEAN,
  SEDA
}
class Prenda {
  private TipoPrenda tipoPrenda;

  public Prenda(TipoPrenda tipo, tela tela, Color principal, Color secudario){
    this.tipoPrenda = requireNonNull(tipo, "tipo de prenda es obligatorio");
    this.tela = requireNonNull(tela, "material es obligatorio");
    this.colorPrincipal = requireNonNull(principal, "color es obligatorio");
    this.colorSecundario = secudario;
  }
  public categoria categoria(){
    return tipoPrenda.getCategoria();
  }
  private tela tela;
  private Color colorPrincipal, colorSecundario;
}

class Color{
  public int red, green, blue;
}
enum categoria {
  PARTE_SUPERIOR,
  CALZADO,
  PARTE_INFERIOR,
  ACCESORIOS
}

class TipoPrenda {

  private categoria categoria;
  private String tipoPrenda;
  public void setCategoria(categoria categoria) {
    this.categoria = categoria;
  }

  public categoria getCategoria() {
    return this.categoria;
  }
}


