public class TesteEmpregado{
   public static void main(String[] args){
      Empregado emp1 = new Empregado("Joao da Silva");
      System.out.println(emp1);
      
      Empregado emp2 = new Mensalista("Jose Pereira", 3500.00);
      System.out.println(emp2);
      
      Empregado emp3 = new Comissionado("Maria Pereira", 1500.00, 5000.00);
      System.out.println(emp3);

      Horista h1 = new Horista("Zé das Couves", 200, 85);
      System.out.println(h1);
      
      Tarefeiro t1 = new Tarefeiro("Zé Pequeno", 10, 1500);
      System.out.println(t1);

   }

}