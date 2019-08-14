import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int qtdCasos = Integer.parseInt(scanner.nextLine());
		scanner.nextLine();

		StringBuilder result = new StringBuilder();

		for (int i = 0; i < qtdCasos; i++) {
			Map<String, Integer> trees = new TreeMap<>();
			final AtomicInteger qtdTrees = new AtomicInteger();

			if (i != 0) {
				result.append("\n");
			}

			String tree;

			do {
				tree = scanner.nextLine();
				if (tree == null || tree.isEmpty()) {
					break;
				}

				Integer value = trees.get(tree);

				if (value != null) {
					trees.put(tree, value + 1);
				} else {
					trees.put(tree, 1);
				}

				qtdTrees.getAndIncrement();
			} while (scanner.hasNext());

			trees.forEach((k, v) -> {
				result.append(String.format("%s %.4f\n", k, (v * 100.0 / qtdTrees.get())));
			});

		}

		System.out.print(result);

	}

}
