package prjPokemonV2;

public class SubclassePokemonAgua extends Pokemon {
	// Métodos da SubClasse
	public void surfar() {
		System.out.println(this.getNome() + " está surfando!!");
	}

	public void canhaoAgua() {
		System.out.println(this.getNome() + "  canhão de água!!");
	}

	@Override
	public void Atacar() {
		System.out.println("Atacou água");
	}
}