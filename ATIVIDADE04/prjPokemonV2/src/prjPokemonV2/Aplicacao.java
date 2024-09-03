package prjPokemonV2;

public class Aplicacao {

	public static void main(String[] args) {

		Pokemon charizard = new Pokemon();
		charizard.setNome("Charizard");
		charizard.setTipo("Fogo");
		charizard.setNivel(1);
		charizard.setHP(78);

		Pokemon scraggy = new Pokemon();
		scraggy.setNome("Scraggy");
		scraggy.setTipo("Sombrio e lutador");
		scraggy.setNivel(2);
		scraggy.setHP(60);

		PokemonFogo charmander = new PokemonFogo();
		charmander.setNome("Charmander");
		charmander.setTipo("Fogo");
		charmander.setNivel(2);
		charmander.setHP(70);
		charmander.setDefesa(120);

		PokemonFogo charmeleon = new PokemonFogo();
		charmeleon.setNome("Charmeleon");
		charmeleon.setTipo("Fogo");
		charmeleon.setNivel(1);
		charmeleon.setHP(60);
		charmeleon.setDefesa(130);

		PokemonVoador munna = new PokemonVoador();
		munna.setNome("Munna");
		munna.setTipo("Místico");
		munna.setNivel(1);
		munna.setHP(70);
		munna.setDefesa(140);

		PokemonVoador ivysaur = new PokemonVoador();
		ivysaur.setNome("Ivysaur");
		ivysaur.setTipo("Místico");
		ivysaur.setNivel(2);
		ivysaur.setHP(75);
		ivysaur.setDefesa(140);

		PokemonAgua pikachu = new PokemonAgua();
		pikachu.setNome("Pikachu");
		pikachu.setTipo("Elétrico ");
		pikachu.setNivel(2);
		pikachu.setHP(70);
		pikachu.setDefesa(150);

		PokemonAgua squirtle = new PokemonAgua();
		squirtle.setNome("Squirtle");
		squirtle.setTipo("Elétrico ");
		squirtle.setNivel(3);
		squirtle.setHP(60);
		squirtle.setDefesa(150);

		charizard.exibirInfo();

		charizard.Atacar();

		scraggy.exibirInfo();

		scraggy.Atacar();

		charmander.exibirInfo();

		charmander.Atacar();

		charmeleon.exibirInfo();

		charmeleon.Atacar();

		munna.exibirInfo();

		munna.Atacar();

		ivysaur.exibirInfo();

		ivysaur.Atacar();

		pikachu.exibirInfo();

		pikachu.Atacar();

		squirtle.exibirInfo();

		squirtle.Atacar();
	}

}