package com.montaury.pokebagarre.metier;

import com.montaury.pokebagarre.fixtures.ConstructeurDePokemon;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PokemonTest {
    @Test
    void le_pokemon2_avec_le_moins_attaque_doit_perdre_et_meme_defense() {
        // GIVEN
        Pokemon pokemon1 = ConstructeurDePokemon.unPokemon().avecAttaque(50).construire();
        Pokemon pokemon2 = ConstructeurDePokemon.unPokemon().avecAttaque(20).construire();
        // WHEN
        boolean resultat = pokemon2.estVainqueurContre(pokemon1);
        // THEN
        assertEquals(false, resultat);
    }

    @Test
    void le_pokemon2_avec_le_plus_attaque_doit_gagner_et_meme_defense() {
        // GIVEN
        Pokemon pokemon1 = ConstructeurDePokemon.unPokemon().avecAttaque(20).construire();
        Pokemon pokemon2 = ConstructeurDePokemon.unPokemon().avecAttaque(50).construire();
        // WHEN
        boolean resultat = pokemon2.estVainqueurContre(pokemon1);
        // THEN
        assertEquals(true, resultat);
    }

    @Test
    void le_pokemon2_avec_le_moins_defense_doit_perdre_et_meme_attaque() {
        // GIVEN
        Pokemon pokemon1 = ConstructeurDePokemon.unPokemon().avecDefense(50).construire();
        Pokemon pokemon2 = ConstructeurDePokemon.unPokemon().avecDefense(20).construire();
        // WHEN
        boolean resultat = pokemon2.estVainqueurContre(pokemon1);
        // THEN
        assertEquals(false, resultat);
    }

    @Test
    void le_pokemon2_avec_le_plus_defense_doit_gagner_et_meme_attaque() {
        // GIVEN
        Pokemon pokemon1 = ConstructeurDePokemon.unPokemon().avecDefense(20).construire();
        Pokemon pokemon2 = ConstructeurDePokemon.unPokemon().avecDefense(50).construire();
        // WHEN
        boolean resultat = pokemon2.estVainqueurContre(pokemon1);
        // THEN
        assertEquals(true, resultat);
    }

    @Test
    void le_pokemon2_avec_meme_defense_doit_gagner_car_premier_et_meme_attaque() {
        // GIVEN
        Pokemon pokemon1 = ConstructeurDePokemon.unPokemon().avecAttaque(20).avecDefense(20).construire();
        Pokemon pokemon2 = ConstructeurDePokemon.unPokemon().avecAttaque(20).avecDefense(20).construire();
        // WHEN
        boolean resultat = pokemon2.estVainqueurContre(pokemon1);
        // THEN
        assertEquals(true, resultat);
    }
    @Test
    void le_pokemon2_avec_meme_defense_doit_perdre_car_pas_premier_et_meme_attaque() {
        // GIVEN
        Pokemon pokemon1 = ConstructeurDePokemon.unPokemon().avecAttaque(20).avecDefense(20).construire();
        Pokemon pokemon2 = ConstructeurDePokemon.unPokemon().avecAttaque(20).avecDefense(20).construire();
        // WHEN
        boolean resultat = pokemon1.estVainqueurContre(pokemon2);
        // THEN
        assertEquals(true, resultat);
    }

}