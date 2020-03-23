import java.util.ArrayList;
import java.util.List;


public class DigitalHouseManager {

    List<Aluno> listaAlunos = new ArrayList<>();
    List<Professor> listaProfessores = new ArrayList<>();
    List<Curso> listaCursos = new ArrayList<>();
    List<Matricula> listaMatriculas = new ArrayList<>();

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
        for (int curso = 0; curso < listaCursos.size(); curso++) {
            if (listaCursos.get(curso).getCodigoDeCurso().equals(codigoCurso)) {
                umCurso = listaCursos.get(curso);
            }
        }
        for (int aluno = 0; aluno < listaAlunos.size(); aluno++) {
            if (listaAlunos.get(aluno).getCodigoDeAluno().equals(codigoAluno)) {
                umAluno = listaAlunos.get(aluno);
            }
        }
        if (umCurso.adicionarUmAluno(umAluno)) {
            Matricula novaMatricula = new Matricula(umAluno, umCurso);
            listaMatriculas.add(novaMatricula);
            System.out.printf("O aluno " + umAluno.getNome() + " foi matriculado no curso " + umCurso.getNome() + ".\n");
        } else {
            System.out.printf("Não foi possível realizar a matrícula, pois não há vaga disponível.");
        }
    }

    public void alocarProfessores(Integer codigoCurso, Integer codigoProfessorTitular, Integer codigoProfessorAdjunto) {

        ProfessorTitular novoProfessorTitular = null;
        ProfessorAdjunto novoProfessorAdjunto = null;
        Curso umCurso = null;

        for (int i = 0; i < listaCursos.size(); i++) {
            if (listaCursos.get(i).getCodigoDeCurso().equals(codigoCurso)) {
                umCurso = listaCursos.get(i);
            }
        }
            for (int i1 = 0; i1 < listaProfessores.size(); i1++) {
                if (listaProfessores.get(i1).getCodigoDeProfessor().equals(codigoProfessorTitular)) {
                    novoProfessorTitular = (ProfessorTitular) listaProfessores.get(i1);
                }
                if (listaProfessores.get(i1).getCodigoDeProfessor().equals(codigoProfessorAdjunto)) {
                    novoProfessorAdjunto = (ProfessorAdjunto) listaProfessores.get(i1);
                }
            }

            umCurso.setProfessorTitular(novoProfessorTitular);
            umCurso.setProfessorAdjunto(novoProfessorAdjunto);

    }

    public void consultarCurso(Integer codigoAluno) {
        for (int i = 0; i < listaMatriculas.size(); i++) {
            if (listaMatriculas.get(i).getAluno().getCodigoDeAluno().equals(codigoAluno))
                System.out.printf(listaMatriculas.get(i).getCurso().toString());
        }
    }
}