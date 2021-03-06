import java.util.ArrayList;
import java.util.List;


public class DigitalHouseManager {

    private List<Aluno> listaAlunos = new ArrayList<>();
    private List<Professor> listaProfessores = new ArrayList<>();
    private List<Curso> listaCursos = new ArrayList<>();
    private List<Matricula> listaMatriculas = new ArrayList<>();

    public void registrarCurso(String nome,
                               Integer codigoCurso,
                               Integer quantidadeMaximaDeAlunos) {
        Curso umCurso = new Curso(nome, codigoCurso, quantidadeMaximaDeAlunos);
        this.listaCursos.add(umCurso);
    }

    public void excluirCurso(Integer codigoCurso) {
        for (int i = 0; i < listaCursos.size(); i++) {
            if (listaCursos.get(i).getCodigoDeCurso().equals(codigoCurso)) {
                listaCursos.remove(i);
            }
        }
    }


    public void registrarProfessorAdjunto(String nome,
                                          String sobrenome,
                                          Integer codigoProfessor,
                                          Integer quantidadeDeHoras) {
        Professor umnProfessorAdjunto = new ProfessorAdjunto(nome, sobrenome, 0, codigoProfessor, quantidadeDeHoras);
        listaProfessores.add(umnProfessorAdjunto);
    }

    public void registrarProfessorTitular(String nome,
                                          String sobrenome,
                                          Integer codigoProfessor,
                                          String especialidade) {
        Professor umProfessorTitular = new ProfessorTitular(nome, sobrenome, 0, codigoProfessor, especialidade);
        listaProfessores.add(umProfessorTitular);
    }

    public void excluirProfessor(Integer codigoProfessor) {
        for (int i = 0; i < listaProfessores.size(); i++) {
            if (listaProfessores.get(i).getCodigoDeProfessor().equals(codigoProfessor)) {
                listaProfessores.remove(i);
            }
        }
    }

    public void matricularAluno(String nome,
                                String sobrenome,
                                Integer codigoAluno) {
        Aluno umAluno = new Aluno(nome, sobrenome, codigoAluno);
        listaAlunos.add(umAluno);
    }

    public void matricularAluno(Integer codigoAluno,
                                Integer codigoCurso) {
        Curso umCurso = null;
        Aluno umAluno = null;
        for (Curso listaCurso : listaCursos) {
            if (listaCurso.getCodigoDeCurso().equals(codigoCurso)) {
                umCurso = listaCurso;
            }
        }
        for (Aluno listaAluno : listaAlunos) {
            if (listaAluno.getCodigoDeAluno().equals(codigoAluno)) {
                umAluno = listaAluno;
            }
        }
        if (umCurso.adicionarUmAluno(umAluno)) {
            Matricula novaMatricula = new Matricula(umAluno, umCurso);
            listaMatriculas.add(novaMatricula);
            System.out.printf("O aluno " + umAluno.getNome() + " foi matriculado no curso " + umCurso.getNome() + ".\n");
        } else {
            System.out.printf("Não foi possível realizar a matrícula, pois não há vaga disponível.\n");
        }
    }

    public void alocarProfessores(Integer codigoCurso, Integer codigoProfessorTitular, Integer codigoProfessorAdjunto) {

        ProfessorTitular novoProfessorTitular;
        ProfessorAdjunto novoProfessorAdjunto;
        Curso umCurso = null;

        for (Curso listaCurso : listaCursos) {
            if (listaCurso.getCodigoDeCurso().equals(codigoCurso)) {
                umCurso = listaCurso;
            }
        }
        for (Professor listaProfessores : listaProfessores) {
            if (listaProfessores.getCodigoDeProfessor().equals(codigoProfessorTitular)) {
                novoProfessorTitular = (ProfessorTitular) listaProfessores;
                umCurso.setProfessorTitular(novoProfessorTitular);
            }
            if (listaProfessores.getCodigoDeProfessor().equals(codigoProfessorAdjunto)) {
                novoProfessorAdjunto = (ProfessorAdjunto) listaProfessores;
                umCurso.setProfessorAdjunto(novoProfessorAdjunto);
            }
        }
    }

    public void consultarCurso(Integer codigoAluno) {
        for (int i = 0; i < listaMatriculas.size(); i++) {
            if (listaMatriculas.get(i).getAluno().getCodigoDeAluno().equals(codigoAluno))
                System.out.printf(listaMatriculas.get(i).getCurso().toString()+"\n");
        }
    }

    public List<Aluno> getListaAlunos() {
        return listaAlunos;
    }

    public void setListaAlunos(List<Aluno> listaAlunos) {
        this.listaAlunos = listaAlunos;
    }

    public List<Professor> getListaProfessores() {
        return listaProfessores;
    }

    public void setListaProfessores(List<Professor> listaProfessores) {
        this.listaProfessores = listaProfessores;
    }

    public List<Curso> getListaCursos() {
        return listaCursos;
    }

    public void setListaCursos(List<Curso> listaCursos) {
        this.listaCursos = listaCursos;
    }

    public List<Matricula> getListaMatriculas() {
        return listaMatriculas;
    }

    public void setListaMatriculas(List<Matricula> listaMatriculas) {
        this.listaMatriculas = listaMatriculas;
    }
}