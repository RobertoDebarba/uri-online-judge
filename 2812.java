import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int qtdCasos = Integer.parseInt(br.readLine());

		StringBuilder result = new StringBuilder();

		for (int i = 0; i < qtdCasos; i++) {
			br.readLine();
			String[] numeros = br.readLine().split(" ");

			List<Integer> sortedNumbers = Arrays.stream(numeros) //
					.map(n -> Integer.parseInt(n)) //
					.filter(n -> n % 2 != 0).sorted() //
					.collect(Collectors.toList());

			if (sortedNumbers.isEmpty()) {
				result.append("\n");
				continue;
			}

			if (i != 0) {
				result.append("\n");
			}

			int size = sortedNumbers.size();
			while (true) {
				result.append(sortedNumbers.remove(size - 1));
				size--;

				if (size == 0) {
					break;
				}

				result.append(" ");
				result.append(sortedNumbers.remove(0));
				size--;

				if (size == 0) {
					break;
				}
				result.append(" ");
			}

		}

		System.out.println(result);

	}

}
