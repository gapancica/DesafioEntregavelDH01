public class Curso {

    private String nome;
    private Integer codigoDeCurso;

    public Curso() {

    }

    public Curso(String nome, Integer codigoDeCurso) {
        this.nome = nome;
        this.codigoDeCurso = codigoDeCurso;
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
}
