package PRATICA4;

public class Turma {
    private int semestre;
    private String turno;
    private Professor professor;
    private Disciplina disciplina;
    private Alunos [] alunos;
    public int getSemestre() {
        return semestre;
    }
    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    public String getTurno() {
        return turno;
    }
    public void setTurno(String turno) {
        this.turno = turno;
    }
    public Professor getProfessor() {
        return professor;
    }
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    public Disciplina getDisciplina() {
        return disciplina;
    }
    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
    public Alunos[] getAlunos() {
        return alunos;
    }
    public void setAlunos(Alunos[] alunos) {
        this.alunos = alunos;
    }
    
}
