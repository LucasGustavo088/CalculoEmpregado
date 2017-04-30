public class Mensalista extends Empregado{
   // atributo
   private double salario;
   // construtor
   public Mensalista(String nome, double sal) {
      super(nome);
      setSalario(sal);
   }
   // set
   public void setSalario(double s) {
      if (s < 0) this.salario = 0;
      else       this.salario = s;
   }
   // salario
   public double salario(){
      return this.salario;
   }
   // toString
   public String toString() {
      return super.toString() +
             "\nSalário: R$ " + salario();
   }
}