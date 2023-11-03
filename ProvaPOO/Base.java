import java.util.ArrayList;
import java.util.List;

public class Base {
    public List<Laboratorio> laboratorio(int tamanho){
    List<Laboratorio> listLab = new ArrayList<Laboratorio>();
    Laboratorio lab;
    for (int i = 0; i < tamanho; i++) {
        lab = new Laboratorio();
        Equipamentos eqp = new Equipamentos();
        lab.setId(000+(i+1));
        lab.setSigla("LAB 000"+(i+1));
        lab.setConjunto(eqp);
        
        eqp.setId(000+(i+1));
        eqp.setDescricao("EQ 000"+(i+1));
        listLab.add(lab);
    }
    return listLab;
    }

    public List<Professor> professor(int tamanho){
        Professor prof;
        List<Professor> listProf = new ArrayList<Professor>();
        for (int j = 0; j <tamanho; j++) {
            prof = new Professor();
            prof.setNome("PROF 000"+(j+1));
            prof.setCurso("C 000"+(j+1));
            prof.setId(000+(j+1));
            listProf.add(prof);   
        }
        
        return listProf;
    }

    public List<Aluno> alunos(int tamanho){
        Aluno al;
        List<Aluno> listAln = new ArrayList<Aluno>();
        for (int i = 0; i < tamanho; i++) {
             al = new Aluno();
             al.setNome("ALN 000" +(i+1));
             al.setMatricula("M 000" +(i+1));
             al.setId(000+(i+1));
             listAln.add(al); 
        }
        return listAln;
    } 
}