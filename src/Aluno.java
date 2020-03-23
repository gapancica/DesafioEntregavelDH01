import java.util.Objects;

public class Aluno {

    private String
            nome,
            sobrenome;

    private Integer
            codigoDeAluno;

    public Aluno() {

    }

    public Aluno(String nome, String sobrenome, Integer codigoDeAluno) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.codigoDeAluno = codigoDeAluno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aluno)) return false;

        Aluno aluno = (Aluno) o;

        return getCodigoDeAluno().equals(aluno.getCodigoDeAluno());
    }

    @Override
    public int hashCode() {
        return getCodigoDeAluno().hashCode();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Integer getCodigoDeAluno() {
        return codigoDeAluno;
    }

    public void setCodigoDeAluno(Integer codigoDeAluno) {
        this.codigoDeAluno = codigoDeAluno;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", codigoDeAluno=" + codigoDeAluno +
                '}';
    }

}
