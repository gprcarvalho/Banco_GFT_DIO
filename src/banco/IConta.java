package banco;

public interface IConta {
	
	
public void sacar(double valor);
		
	
	
public void depositar(double valor);
		
	
	
public void transferir(Conta contaDestino);

public void imprimirExtrato();



void transferir(double valor, IConta contaDestino);
		
	


}
