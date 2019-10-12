package modelo;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FabricaHello extends FabricaAbstrataHello {

	@Override
	public void criarHelloTela() {
		System.out.println("Hello World!!");
		
	}

	@Override
	public void criarHelloDocumento() {
		
		Path hello_txt = Paths.get("output.txt");  // Cria o arquivo txt
        
		try (PrintWriter writer = new PrintWriter(Files.newBufferedWriter(hello_txt, Charset.defaultCharset())))
		{
            writer.println("Hello World!!");

		} catch (IOException e) {
			e.printStackTrace();
		} 
		
	}
}
