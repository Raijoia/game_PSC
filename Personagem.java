public class Personagem {
  // variáveis de instâncias
  // instância => sinônimo de objeto
  String nome;
  int energia = 10;
  int sono = 0;
  int fome = 0;

  // tipo de retorno
  // nome
  // lista de parâmetros
  // corpo

  void cacar() {
    if (energia >= 2) {
      System.out.println(nome + " está caçando");
      energia -= 2;
    } else {
      System.out.printf("Energia do persogem %s está baixa!! (nivel de energia menor que dois)", nome);
    }

    // definindo o minimo como 10
    fome = Math.min(fome + 1, 10);

    // ifelse ternário, verificando se o valor + 1 é maior que 10
    sono = sono + 1 > 10 ? 10 : sono + 1;
  }

  void comer() {
    if (fome >= 1) {
      System.out.printf("%s está comendo\n", nome);
      --fome;
      energia = energia + 1 > 10 ? 10 : energia + 1;
    } else {
      System.out.println(nome + " está sem fome!! (nivel de fome menor que 1)");
    }
  }

  void dormir() {
    if (sono >= 1) {
      System.out.printf("%s está dormindo\n", nome);  
      --sono;    
      energia = energia + 1 <= 10 ? energia + 1 : 10;
    } else {
      System.out.println(nome + " está sem sono!! (nivel de sono  menor que 1)");
    }
  }

  void exibirEstado(){
    System.out.printf("%s: e: %d, f: %d, s: %d\n", nome, energia, fome, sono);
  }
}