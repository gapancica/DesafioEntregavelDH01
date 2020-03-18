public class ProfessorAdjunto extends Professor {

    private Integer quantHorasMonitoria;

    public ProfessorAdjunto() {

    }

    public ProfessorAdjunto(String nome, String sobrenome, Integer tempoDeCasa, Integer codigoDeProfessor, Integer quantHorasMonitoria) {
        super(nome, sobrenome, tempoDeCasa, codigoDeProfessor);
        this.quantHorasMonitoria = quantHorasMonitoria;
    }

    public Integer getQuantHorasMonitoria() {
        return quantHorasMonitoria;
    }

    public void setQuantHorasMonitoria(Integer quantHorasMonitoria) {
        this.quantHorasMonitoria = quantHorasMonitoria;
    }
}
