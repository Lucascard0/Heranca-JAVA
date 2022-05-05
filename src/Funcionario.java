public class Funcionario extends Pessoa {
    private String departamento;
    private String funcao;
    private float salario;

    public Funcionario(String nome, String cpf, String departamento, String funcao, float salario) {
        super(nome, cpf);
        this.departamento = departamento;
        this.funcao = funcao;
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void aumentaSalario(float valor){
        this.salario = valor + this.salario;

    }

    @Override
    public void exibeDados() {
        super.exibeDados();
        System.out.println("Departamento: " + this.departamento);
        System.out.println("Funcao: " + this.funcao);
        System.out.println("Salario: " + this.salario);
    }
}