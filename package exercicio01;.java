package exercicio01;

public class Carro {

/*Atributos da Classe*/

    private String tipo;
    private String cor;
    private String placa;
    private int numPortas;


/*Métodos da Classe*/

public String get() {
    return cor;
}
public void setCor(String cor) {
    this.cor = cor;
}

/* Método Principal*/

public static void main (String[] args) {
    Carro meuCarro = new Carro();
   
    meuCarro.setCor("azul");
    System.out.print("A cor do meu carro" + meuCarro.getCor());
 }

}