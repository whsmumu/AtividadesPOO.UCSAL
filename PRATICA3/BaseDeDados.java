package PRATICA3;

public class BaseDeDados {
  public Alunos[] ObterAunos (int quantidade){
     Alunos [] vetorAlunos = new Alunos[quantidade];

        Alunos objeto = new Alunos();
        objeto.setNome("João");
        objeto.setMatricula(12345);
        objeto.setId("A5F9G2H");
        vetorAlunos[0] = objeto;

        objeto = new Alunos();
        objeto.setNome("Pedro");
        objeto.setMatricula(67890);
        objeto.setId("P8Q7R2W");
        vetorAlunos[1] = objeto;
        
        objeto = new Alunos();
        objeto.setNome("Jose");
        objeto.setMatricula(45678);
        objeto.setId("X3V6M1N");
        vetorAlunos[2] = objeto;
        
        objeto = new Alunos();
        objeto.setNome("Maria");
        objeto.setMatricula(90123);
        objeto.setId("D4C8K9J");
        vetorAlunos[3] = objeto;
        
        objeto = new Alunos();
        objeto.setNome("Ana");
        objeto.setMatricula(23456);
        objeto.setId("L2T7Z0Y");
        vetorAlunos[4] = objeto;
        
        objeto = new Alunos();
        objeto.setNome("Murilo");
        objeto.setMatricula(78901);
        objeto.setId("E1B6F3X");
        vetorAlunos[5] = objeto;
        
        objeto = new Alunos();
        objeto.setNome("Caio");
        objeto.setMatricula(34567);
        objeto.setId("G9H4R7U");
        vetorAlunos[6] = objeto;
        
        objeto = new Alunos();
        objeto.setNome("Eduardo");
        objeto.setMatricula(01234);
        objeto.setId("M5N1P8Q");
        vetorAlunos[7] = objeto;
        
        objeto = new Alunos();
        objeto.setNome("Lucas");
        objeto.setMatricula(56789);
        objeto.setId("Y2W6V4T");
        vetorAlunos[8] = objeto;
        
        objeto = new Alunos();
        objeto.setNome("Mirella");
        objeto.setMatricula(89012);
        objeto.setId("K7J3D0C");
        vetorAlunos[9] = objeto;
        
        objeto = new Alunos();
        objeto.setNome("Joana");
        objeto.setMatricula(34567);
        objeto.setId("U4R9G2H");
        vetorAlunos[10] = objeto;
        
        objeto = new Alunos();
        objeto.setNome("Debora");
        objeto.setMatricula(23456);
        objeto.setId("B8F7E6A");
        vetorAlunos[11] = objeto;
        
        objeto = new Alunos();
        objeto.setNome("Brenda");
        objeto.setMatricula(78901);
        objeto.setId("Q3Z5L1X");
        vetorAlunos[12] = objeto;
        
        objeto = new Alunos();
        objeto.setNome("Luiz");
        objeto.setMatricula(45678);
        objeto.setId("T6Y2V8W");
        vetorAlunos[13] = objeto;
        
        objeto = new Alunos();
        objeto.setNome("Marcos");
        objeto.setMatricula(01234);
        objeto.setId("N1M4C8K");
        vetorAlunos[14] = objeto;
    
        objeto = new Alunos();
        objeto.setNome("Ubirajara");
        objeto.setMatricula(56789);
        objeto.setId("J7D3H9G");
        vetorAlunos[15] = objeto;
        
        objeto = new Alunos();
        objeto.setNome("Bruno");
        objeto.setMatricula(90123);
        objeto.setId("W0P5Q2R");
        vetorAlunos[16] = objeto;
        
        objeto = new Alunos();
        objeto.setNome("Gabriel");
        objeto.setMatricula(23456);
        objeto.setId("Z6X1B7F");
        vetorAlunos[17] = objeto;
        
        objeto = new Alunos();
        objeto.setNome("Junior");
        objeto.setMatricula(78901);
        objeto.setId("H9U4E3D");
        vetorAlunos[18] = objeto;
        
        objeto = new Alunos();
        objeto.setNome("Rafael");
        objeto.setMatricula(67890);
        objeto.setId("V2T6N5M");
        vetorAlunos[19] = objeto;

        imprimir(vetorAlunos);
        
        return vetorAlunos;
} 
     private void imprimir(Alunos [] vetorAlunos){
        for (int i = 0; i < vetorAlunos.length; i++) {
            System.out.println("Nome do aluno: "+ vetorAlunos[i].getNome());
            System.out.println("Matricula do aluno: "+vetorAlunos[i].getMatricula());
            System.out.println("Id do aluno: "+vetorAlunos[i].getId());
            System.out.println();
        }
     }
}