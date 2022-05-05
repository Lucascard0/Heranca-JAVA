public class Aluno extends Pessoa{
    private String curso;
    private int periodo;

    public Aluno(String nome, String cpf, String curso, int periodo) {
        super(nome, cpf);
        this.curso = curso;
        this.periodo = periodo;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public void venceuPeriodo(){
        this.periodo++;
    }

    @Override
    public void exibeDados() {
        super.exibeDados();
        System.out.println("Curso: " + this.curso);
        System.out.println("Periodo: " + this.periodo);
    }
}
