import java.util.Scanner;

public class Aluno extends Pessoa {

	Scanner sc = new Scanner(System.in);
	
	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}

	public double[] notas;
	public double media;

	public Aluno() {
		super();
	}

	public Aluno(String nome, int idade, long cpf, double[] notas, double media) {
		super(nome, idade, cpf);
		
		this.media = media;
		this.notas = notas;
	}
	
	public double Media(double[] valor) {
      for(int i = 0; i < valor.length; i++) {
			
			this.notas[i] = valor[i];
			media  += notas[i];
	}
	return media / 4;
	}
	public void Medias() {
		if(media >= 7.0 && media < 9.9) {
			System.out.println("Aluno Aprovado! media: " + media);
		}else if(media == 10.0) {
			System.out.println("Aluno aprovado com honra! media: " + media);
		}else if(media < 7.0 && media >= 6.0) {
			System.out.println("Aluno de recuperação! media: " + media);
			System.out.println("Entre com a nota de recuperação: ");
			media = sc.nextDouble();
			if(media < 6.0) {
				System.out.println("Aluno Reprovado! media: " + media );
			}else {
				System.out.println("Aluno Aprovado! media: " + media );
			}
		}else {
			System.out.println("Aluno Repovado! media: " + media);
		}
	
	}
	@Override
	public String toString() {
		return super.toString() + "\n";
	}
}
