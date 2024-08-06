package prjCaneta;

public class Caneta {

		// TODO Auto-generated method stub
       String modelo;
       String cor;
       double ponta;
       int carga;
       boolean tampada;
       
       void status() {
            System.out.println("Modelo:" + this.modelo);
            System.out.println("Cor:" + this.cor);
            System.out.println("Carga:" + this.carga);
            
       }
       
       void rabiscar() {
    	   
       }
       
       void tampar() {
	}    this.tampada = true;
       
       void destampar() {
          this.tampada = false;
 }
