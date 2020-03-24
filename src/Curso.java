import java.util.ArrayList;
import java.util.List;

public class Curso {

    private String
            nome;

    private Integer
            codigoDeCurso,
            quantMaxAlunos;

    private ProfessorTitular
            professorTitular;

    private ProfessorAdjunto
            professorAdjunto;

    private List<Aluno> alunosMatriculados = new ArrayList<>();


    public Curso() {

    }

    public Curso(Integer codigoDeCurso){

    }

    public Curso(String nome,
                 Integer codigoDeCurso,
                 Integer quantMaxAlunos,
                 ProfessorTitular professorTitular,
                 ProfessorAdjunto professorAdjunto,
                 List<Aluno> alunosMatriculados) {
        this.nome = nome;
        this.codigoDeCurso = codigoDeCurso;
        this.quantMaxAlunos = quantMaxAlunos;
        this.professorTitular = professorTitular;
        this.professorAdjunto = professorAdjunto;
        this.alunosMatriculados = alunosMatriculados;
    }

    public Curso(String nome,
                 Integer codigoDeCurso,
                 Integer quantMaxAlunos) {
        this.nome = nome;
        this.codigoDeCurso = codigoDeCurso;
        this.quantMaxAlunos = quantMaxAlunos;
    }

    public Boolean adicionarUmAluno(Aluno umAluno) {
        if (this.quantMaxAlunos > 0){
            this.alunosMatriculados.add(umAluno);
            this.quantMaxAlunos-=1;
            return true;
        } else {
            return false;
        }
    }

    public void excluirUmAluno(Aluno umAluno) {
        if (this.alunosMatriculados.equals(umAluno)) {
            this.alunosMatriculados.remove(umAluno);
            System.out.println("O aluno "+umAluno+" foi removido.\n");

        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Curso)) return false;

        Curso curso = (Curso) o;

        return getCodigoDeCurso().equals(curso.getCodigoDeCurso());
    }

    @Override
    public int hashCode() {
        return getCodigoDeCurso().hashCode();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCodigoDeCurso() {
        return codigoDeCurso;
    }

    public void setCodigoDeCurso(Integer codigoDeCurso) {
        this.codigoDeCurso = codigoDeCurso;
    }

    public Integer getQuantMaxAlunos() {
        return quantMaxAlunos;
    }

    public void setQuantMaxAlunos(Integer quantMaxAlunos) {
        this.quantMaxAlunos = quantMaxAlunos;
    }

    public ProfessorTitular getProfessorTitular() {
        return professorTitular;
    }

    public void setProfessorTitular(ProfessorTitular professorTitular) {
        this.professorTitular = professorTitular;
    }

    public ProfessorAdjunto getProfessorAdjunto() {
        return professorAdjunto;
    }

    public void setProfessorAdjunto(ProfessorAdjunto professorAdjunto) {
        this.professorAdjunto = professorAdjunto;
    }

    public List<Aluno> getAlunosMatriculados() {
        return alunosMatriculados;
    }

    public void setAlunosMatriculados(List<Aluno> alunosMatriculados) {
        this.alunosMatriculados = alunosMatriculados;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nome='" + nome + '\'' +
                ", codigoDeCurso=" + codigoDeCurso +
                ", quantMaxAlunos=" + quantMaxAlunos +
                ", professorTitular=" + professorTitular +
                ", professorAdjunto=" + professorAdjunto +
                ", alunosMatriculados=" + alunosMatriculados +
                '}';
    }
}
