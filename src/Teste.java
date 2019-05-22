public class Teste {
    public static void main(String[] args) {

        ProfessorTitular professorTitular1 = new ProfessorTitular();
        professorTitular1.setNome("Charles");
        professorTitular1.setSobrenome("Xavier");
        professorTitular1.setCodigoDeProfessor(1111);
        professorTitular1.setEspecialidade("Full Stack");
        professorTitular1.setTempoDeCasa(0);

        ProfessorTitular professorTitular2 = new ProfessorTitular();
        professorTitular2.setNome("Tony");
        professorTitular2.setSobrenome("Stark");
        professorTitular2.setCodigoDeProfessor(8888);
        professorTitular2.setEspecialidade("Android");
        professorTitular2.setTempoDeCasa(0);

        ProfessorAdjunto professorAdjunto1 = new ProfessorAdjunto();
        professorAdjunto1.setNome("Scott");
        professorAdjunto1.setSobrenome("Summers");
        professorAdjunto1.setCodigoDeProfessor(2222);
        professorAdjunto1.setQtdHorasDeMonitoria(3);
        professorAdjunto1.setTempoDeCasa(0);

        ProfessorAdjunto professorAdjunto2 = new ProfessorAdjunto();
        professorAdjunto2.setNome("Steve");
        professorTitular2.setSobrenome("Rogers");
        professorAdjunto2.setCodigoDeProfessor(9999);
        professorAdjunto2.setQtdHorasDeMonitoria(4);
        professorAdjunto2.setTempoDeCasa(0);

        Curso curso1 = new Curso();
        curso1.setNome("Full Stack");
        curso1.setCodigoDeCurso(20001);
        curso1.setQtdMaximaDeAlunos(3);

        Curso curso2 = new Curso();
        curso2.setNome("Android");
        curso2.setCodigoDeCurso(20002);
        curso2.setQtdMaximaDeAlunos(2);

        DigitalHouseManager digitalHouseManager = new DigitalHouseManager();

        digitalHouseManager.alocarProfessores(20001, 1111, 2222);
        digitalHouseManager.alocarProfessores(20002, 8888, 9999);

        Aluno aluno1 = new Aluno("Kurt", "Wagner", 1414);
        Aluno aluno2 = new Aluno("Kitty", "Pride", 4141);
        Aluno aluno3 = new Aluno("Peter","Parker", 1234);
        Aluno aluno4 = new Aluno("Wanda", "Maximoff", 2341);
        Aluno aluno5 = new Aluno("Rocket", "Raccoon", 3412);

        digitalHouseManager.matricularAluno(1414,20001);
        digitalHouseManager.matricularAluno(4141, 20001);
        digitalHouseManager.matricularAluno(1234, 20002);
        digitalHouseManager.matricularAluno(2341, 20002);
        digitalHouseManager.matricularAluno(3412, 20002);


        


    }
}
