package PRATICA4;

public class Executor {
    public static void main(String[] args) {
        Executor executor = new Executor();
        executor.imprimir(executor.setarTurma());
        
    }
    private Turma setarTurma(){
        Turma turma = new Turma();
        turma.setTurno("Matutino");
        turma.setSemestre(2);
        turma.setDisciplina(setarDisciplina());
        turma.setProfessor(setarProfessor());
        turma.setAlunos(setarAlunos());
        return turma;
    }
    private Disciplina setarDisciplina(){
        Disciplina disciplina = new Disciplina();
        disciplina.setCurso("Engenharia de Software");
        return disciplina;
    }
    private Professor setarProfessor(){
        Professor professor = new Professor();
        professor.setNome("João");
        professor.setMateria("Poo");
        professor.setId(14322);
        return professor;
    }
    private Alunos[] setarAlunos(){
        Alunos[] alunos = new Alunos[5];
        for (int i = 0; i < alunos.length; i++) {
           Alunos al = new Alunos();
           al.setNome("Aluno0" + (i+1));
           al.setMatricula("20002886"+(i+1));
           alunos[i] = al;
        }
        return alunos;
    }
    private void imprimir(Turma turma){
        System.out.println("Curso: " + turma.getDisciplina().getCurso()+
        "\n" + "Semestre: " + turma.getSemestre()+
        "\n" + "Turno: " + turma.getTurno()+
        "\n" + "Professor: " + turma.getProfessor().getNome() + 
        "\n" + "Materia: " + turma.getProfessor().getMateria() +
        "\n" + "ID: "+ turma.getProfessor().getId());

        for (int i = 0; i < turma.getAlunos().length; i++) {
            System.out.println(turma.getAlunos()[i].getNome() + " " + turma.getAlunos()[i].getMatricula());
        }
    }
}