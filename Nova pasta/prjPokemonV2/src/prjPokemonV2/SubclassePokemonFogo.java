package prjPokemonV2;

public class SubclassePokemonFogo extends Pokemon {

	// Métodos da SubClasse
	public void bolaFogo() {
		System.out.println(this.getNome() + " bola de fogooo!");
	}

	public void explosaoFogo() {
		System.out.println(this.getNome() + " explosão de fogo!!");
	}

	public void lancaChamas() {
		System.out.println(this.getNome() + " lança chamaaass!!");

	}

	@Override
	public void Atacar() {
		System.out.println("Atacou fogoo");
	}
}