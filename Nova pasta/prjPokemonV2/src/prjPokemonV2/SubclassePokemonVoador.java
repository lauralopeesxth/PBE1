package prjPokemonV2;

public class SubclassePokemonVoador extends Pokemon {

	// Métodos da SubClasse
	public void voar() {
		System.out.println(this.getNome() + " está voando!!");
	}

	public void ataqueDeAsa() {
		System.out.println(this.getNome() + " ataque de asa!!");
	}

	@Override
	public void Atacar() {
		System.out.println("Atacou voando");
	}
}