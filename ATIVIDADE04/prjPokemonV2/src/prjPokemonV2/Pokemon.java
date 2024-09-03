package prjPokemonV2;

public class Pokemon {
	// Atributos
	private String nome;
	private String tipo;
	private int nivel;
	private int HP;
	private int defesa;

	// Construtores
	public Pokemon() {
	}

	public Pokemon(String nome, String tipo, int nivel, int HP, int defesa) {
		this.nome = nome;
		this.tipo = tipo;
		this.nivel = nivel;
		this.HP = HP;
		this.defesa = defesa;
	}

	// Métodos
	public void Atacar() {
		if (this.HP <= 20) {
			System.out.println(this.nome + " perdeu -20 de vida");
		} else {
			this.HP -= 10;
		}
	}

	public void Evoluir() {
		if (this.nivel >= 2) {
			System.out.println(this.nome + " ,você evoluiu!!!");
		} else {
			this.nivel += 2;
			this.nivel += 2;
		}
	}

	public void exibirInfo() {
		System.out.println("Nome: " + this.nome);
		System.out.println("HP: " + this.HP);

	}

	// Métodos Setters
	public void setNivel(int nivel) {
		if (nivel > 0) {
			this.nivel = nivel;
		} else {
			this.nivel = 10;
		}
	}

	// Getters and Setters

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getNivel() {
		return nivel;
	}

	public int getHP() {
		return HP;
	}

	public void setHP(int hP) {
		HP = hP;
	}

	public int getDefesa() {
		return defesa;
	}

	public void setDefesa(int defesa) {
		this.defesa = defesa;
	}
}