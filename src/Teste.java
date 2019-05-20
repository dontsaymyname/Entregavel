public class Teste {
    public static void main(String[] args) {

        ProfessorTitular professorTitular1 = new ProfessorTitular();
        professorTitular1.setNome("Charles");
        professorTitular1.setSobrenome("Xavier");
        professorTitular1.setCodigoDeProfessor(1111);
        professorTitular1.setEspecialidade("Android");
        professorTitular1.setTempoDeCasa(0);

        ProfessorTitular professorTitular2 = new ProfessorTitular();
        professorTitular2.setNome("Tony");
        professorTitular2.setSobrenome("Stark");
        professorTitular2.setCodigoDeProfessor(8888);
        professorTitular2.setEspecialidade("Full Stack");
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

        


    }
}
