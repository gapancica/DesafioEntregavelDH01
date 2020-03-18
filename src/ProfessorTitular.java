public class ProfessorTitular extends Professor {

    private String especialidade;

    public ProfessorTitular() {

    }

    public ProfessorTitular(String nome, String sobrenome, Integer tempoDeCasa, Integer codigoDeProfessor, String especialidade) {
        super(nome, sobrenome, tempoDeCasa, codigoDeProfessor);
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
