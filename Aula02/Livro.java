package prjCaneta;

public class Livro {
	 String nomeLivro, nonmeAutor;
     boolean alugado;
     
     void status() {
    	 System.out.println("Nome do livro: " + this.nomeLivro + ":" + (this.alugado ? "Alugado":"Disponivel"));
    	 
     }
     
     
     void alugar() {
    	 this.alugado = true;
    	 
      }
     
     
     void devolver() {
    	 this.alugado = false;
     }

}
