public class Tarefeiro extends Empregado {
   // atributos
   private int    qtdeTarefas;
   private double valorTarefa;
   // construtor
   public Tarefeiro(String nome, int qt, double vt) {
      super(nome);
      this.qtdeTarefas = qt;
      this.valorTarefa = vt;
   }
   // salario
   public double salario() {
      return this.qtdeTarefas * this.valorTarefa;
   }
   // toString
   public String toString() {
      return super.toString() + 
             "\nQuantidade de tarefas: "   + this.qtdeTarefas +
             "\nValor de cada tarefa: R$ " + this.valorTarefa +
             "\nSalário: R$ "              + salario();
   }
}