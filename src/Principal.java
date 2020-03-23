public class Principal {
    public static void main(String[] args) {
        DigitalHouseManager escolaDH = new DigitalHouseManager();

        escolaDH.registrarProfessorTitular("Peterson", "Nascimento", 9001, "Java");
        escolaDH.registrarProfessorTitular("Pérola", "Cintilante", 9002, "Kotlin");

        escolaDH.registrarProfessorAdjunto("Stephan", "Brown", 8001, 40);
        escolaDH.registrarProfessorAdjunto("Roger", "Klotz", 8002, 56);

        escolaDH.registrarCurso("Full Stack", 20001, 3);
        escolaDH.registrarCurso("Adroid", 20002, 2);

        escolaDH.alocarProfessores(20001, 9001, 8001);
        escolaDH.alocarProfessores(20002, 9002, 8002);

        escolaDH.matricularAluno("Audrey", "Lamarc", 10001);
        escolaDH.matricularAluno("Robson", "Gusmão", 10002);
        escolaDH.matricularAluno(10001,20001);
        escolaDH.matricularAluno(10002, 20001);

        escolaDH.matricularAluno("Chaves", "D'Avila", 10003);
        escolaDH.matricularAluno("Francisco", "Falcão", 10004);
        escolaDH.matricularAluno("Joana", "Carobrese", 10005);
        escolaDH.matricularAluno(10003, 20002);
        escolaDH.matricularAluno(10004, 20002);
        escolaDH.matricularAluno(10005, 20002);
    }
}
