public class Comissionado extends Mensalista {
   // atributo
   private double comissao;
   // construtor
   public Comissionado(String nome, double salario, double comissao) {
      super(nome, salario);
      setComissao(comissao);
   }
   // salario
   public double salario(){
      return super.salario() + this.comissao;
   }
   // set´s
   public void setComissao(double c) {
      this.comissao = c;
   }
   // get´s
   public double getComissao(){
      return this.comissao;
   }
   // toString
   public String toString() {
      return super.toString() +
             "\nComissão: R$ " + getComissao();
   }
}