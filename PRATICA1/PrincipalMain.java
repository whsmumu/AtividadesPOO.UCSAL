package PRATICA1;
public class PrincipalMain {
public static void main(String[] args) {
	classes();
}
	public static void classes (){
		
	Computador pc = new Computador();
	pc.setPlaca("B450M");
	pc.setProcessador("Ryzen 3500x");
	pc.setArmazenamento("1TB");
	System.out.println(pc.getProcessador()+"\n"+pc.getPlaca()+"\n"+pc.getArmazenamento());

	System.out.println(" ");

	
	Computador pc2 = new Computador();
	pc2.setPlaca("B550M");
	pc2.setProcessador("Intel 9900k");
	pc2.setArmazenamento("2TB");
	System.out.println(pc2.getProcessador()+"\n"+pc2.getPlaca()+"\n"+pc2.getArmazenamento());

	System.out.println(" ");

	Professor professor = new Professor();
	professor.setNome("João");
	professor.setIdade(30);
	professor.setId(324861);
	System.out.println(professor.getNome()+"\n"+professor.getIdade()+"\n"+professor.getId());

	System.out.println(" ");

	Laboratorio lab = new Laboratorio();
	lab.setSala(414);
	lab.setLami("Lami 2");
	lab.setOcupado("Ocupado");
	System.out.println(lab.getSala()+"\n"+lab.getLami()+"\n"+lab.getOcupado());

	System.out.println(" ");

	SalaDeAula sala = new SalaDeAula();
	sala.setTurma("T2");
	sala.setQntdAlunos(30);
	System.out.println(sala.getTurma()+"\n"+ sala.getQntdAlunos());

	System.out.println(" ");

	Disciplina disciplina = new Disciplina();
	disciplina.setMateria("POO");
	disciplina.setProfessor("Joao");
	System.out.println(disciplina.getMateria()+"\n"+disciplina.getProfessor());

	System.out.println(" ");

	Curso curso = new Curso();
	curso.setNome("Engenharia De Software");
	curso.setDuracao("4 anos");
	curso.setMaterias("Logica De programação, Programação Orientada a objetos, Sistemas operacionais, Processo de software");
	System.out.println(curso.getNome()+"\n"+curso.getMaterias()+"\n"+curso.getDuracao());
	}
}