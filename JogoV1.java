public class JogoV1 {
  public static void main(String[] args) {
    // 1. construir um objeto personagem
    var p = new Personagem();

    // 2. dar um nome para ele
    p.nome = "Raí";

    // 3. caçar
    p.cacar();

    // 4. comer
    p.comer();

    // 5. dormir
    p.dormir();
  }
}
