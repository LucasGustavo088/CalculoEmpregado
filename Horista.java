import java.text.DecimalFormat;
public class Horista extends Empregado {
   // atributos
   private int    horasTrabalhadas;
   private double valorHora;
   // construtor
   public Horista(String nome, int ht, double vh) {
      super(nome);
      this.horasTrabalhadas = ht;
      this.valorHora        = vh;
   }
   // salario
   public double salario() {
      return this.horasTrabalhadas * this.valorHora;
   }
   // toString
   public String toString() {
      DecimalFormat df2 = new DecimalFormat("#,##0.00");
 
      return super.toString() +
             "\nHoras Trabalhadas: " + this.horasTrabalhadas +
             "\nValor da Hora: R$ "  + df2.format(this.valorHora) +
             "\nSalário: R$ "        + df2.format(salario());
   }
}