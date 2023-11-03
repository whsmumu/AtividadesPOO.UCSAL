public class Resultado {

    public static void main(String[] args) {
        Impressao imp = new Impressao();
        Base base = new Base();
        imp.impLab(base.laboratorio(5));
        imp.impProf(base.professor(3));
        imp.impAluno(base.alunos(20));
    }
}