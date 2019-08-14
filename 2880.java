import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String cifra = br.readLine();	
		String key = br.readLine();
		int contador = 0;
		int tamanhoKey = key.length();
		int vezes = cifra.length() - tamanhoKey +1;

		for (int inicial = 0; inicial < vezes; inicial++) {			
			for (int i = 0; i < tamanhoKey; i++) {
				if (cifra.charAt(inicial + i) == key.charAt(i)) {
					contador++;
					break;
				}
			}
		}

		System.out.println(vezes - contador);

	}

}
