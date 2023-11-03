import java.util.List;

public class Impressao {
    public void impLab(List<Laboratorio> list){
        Base base = new Base();
        System.out.println(base.laboratorio(5));
    }

    public void impProf(List<Professor> list){
        Base base = new Base();
        System.out.println(base.professor(3));
    }

    public void impAluno(List<Aluno> list){
        Base base = new Base();
        System.out.println(base.alunos(20));
    }
}