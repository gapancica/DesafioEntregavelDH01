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


}
