public class Personagem {
  // variáveis de instâncias
  // instância => sinônimo de objeto
  String nome;
  private int energia = 10;
  private int sono = 0;
  private int fome = 0;

  // constructor padrão (lista de parâmeros vazia)
  Personagem() {
    System.out.println("Construindo um personagem...");
  }

  // constructor 
  Personagem(int energia, int sono, int fome){
    if (energia >= 0 && energia <=10) {
      this.energia = energia;
    }
    this.sono = fome > 10 || fome < 0 ? this.fome : fome;
    this.fome = sono >= 10 && sono <= 0 ? this.sono : sono;
  }

  Personagem(String nome) {
    this.nome = nome;
  }

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