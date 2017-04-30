public class Empregado {
   // atributo
   private String nome;
   // construtor
   public Empregado(String nome) {
      setNome(nome);
   }
   // set´s
   public void setComissao(double x) {
   }
   public void setNome(String nome) {
      this.nome = nome;
   }
   // get´s
   public String getNome() {
      return this.nome;
   }
   // salario
   // public abstract double salario();
   // toString
   public String toString() {
      return "\nNome: " + getNome();
   }
}