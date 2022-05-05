public class Main {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa ("Lucas", "111.111.111.11");
        pessoa1.exibeDados();
        System.out.println("----------------------------------");

        Funcionario funcionario1 = new Funcionario ("Carlos", "222.222.222.22", "Carga", "Carregador", 1980);
        funcionario1.exibeDados();
        System.out.println("----------------------------------");
        funcionario1.aumentaSalario(300);
        funcionario1.exibeDados();
        System.out.println("----------------------------------");

        Aluno aluno1 = new Aluno("Rafael", "333.333.333.33", "Sistemas de informação", 5);
        aluno1.exibeDados();
        System.out.println("----------------------------------");
        aluno1.venceuPeriodo();
        aluno1.exibeDados();

    }
}