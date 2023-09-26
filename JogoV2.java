public class JogoV2 {
  public static void main(String[] args) throws Exception {
    var p = new Personagem();

    p.nome = "Raí";

    // loop infinity
    while (true) {
      p.cacar();
      p.comer();
      p.dormir();
      p.exibirEstado();

      System.out.println("*****************");

      // espera para repetir o código 8000 milisegundos => 8 segundos 
      Thread.sleep(8000);
    }
  }
}
