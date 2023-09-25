public class Personagem {
  // variáveis de instâncias
  // instância => sinônimo de objeto
  String nome;
  int energia;
  int sono;
  int fome;

  // tipo de retorno
  // nome
  // lista de parâmetros
  // corpo

  void cacar() {
    System.out.println(nome + " está caçando");
  }

  void comer() {
    System.out.printf("%s está comendo\n", nome);
  }

  void dormir() {
    System.out.printf("%s está dormindo\n", nome);
  }
}