package visao;

import modelo.FabricaAbstrataHello;
import modelo.FabricaHello;

public class Cliente {

	public static void main(String[] args) {
		
		FabricaAbstrataHello factory = new FabricaHello();

        double option = Math.random();

        if (option > 0.5) {
        	factory.criarHelloTela();
        	System.out.println("Escrito na tela.");
        }
        	
        if (option <= 0.5) {
        	factory.criarHelloDocumento();
        	System.out.println("Escrito no arquivo.");
        }

	}

}
