package POO;

public class Aluno {
	private String nome;
	private String curso;
	private float nota1;
	private float nota2;
	private float media;
	
	public Aluno(String nome, String curso, float nota1, float nota2) {
		super();
		this.nome = nome;
		this.curso = curso;
		this.nota1 = nota1;
		this.nota2 = nota2;
		media = (nota1+nota2)/2;
		System.out.println("Nome: "+nome+".");
		System.out.println("Curso: "+curso+".");
		System.out.println("Média: "+media+".");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public float getNota1() {
		return nota1;
	}

	public void setNota1(float nota1) {
		if(nota1 > 0) {
			this.nota1 = nota1;
		}else {
			System.out.println("A nota não pode ser inferior a 0.");
		}
		
	}

	public float getNota2() {
		return nota2;
	}

	public void setNota2(float nota2) {
		if(nota2 > 0) {
			this.nota2 = nota2;
		}else {
			System.out.println("A nota não pode ser inferior a 0.");
		}
		
	}

	public float getMedia() {
		return media;
	}

	

	
}
