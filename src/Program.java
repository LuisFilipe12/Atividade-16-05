import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Aluno aluno = new Aluno();

		System.out.print("Entre com o nome do aluno: ");
		aluno.setNome(sc.nextLine());

		System.out.print("Entre com a idade do aluno: ");
		aluno.setIdade(sc.nextInt());

		System.out.print("Entre com o cpf do aluno: ");
		aluno.setCpf(sc.nextLong());

		for (int i = 0; i < 4; i++) {
			System.out.println("Entre com a nota " + (i + 1) + ": ");
			double[] nota = new double[4];
			nota[i] = sc.nextDouble();
			aluno.setMedia(nota[i]);
		}

		System.out.println(aluno);
		aluno.Medias();

		sc.close();
	}

}
