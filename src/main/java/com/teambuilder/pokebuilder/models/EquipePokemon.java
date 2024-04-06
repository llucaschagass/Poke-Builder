package com.teambuilder.pokebuilder.models;

import java.util.List;

public class EquipePokemon {
    private String nomeEquipe;
    private List<Pokemon> membros;

    // Construtor
    public EquipePokemon(String nomeEquipe, List<Pokemon> membros) {
        this.nomeEquipe = nomeEquipe;
        this.membros = membros;
    }

    // Getters e Setters
    public String getNomeEquipe() {
        return nomeEquipe;
    }

    public void setNomeEquipe(String nomeEquipe) {
        this.nomeEquipe = nomeEquipe;
    }

    public List<Pokemon> getMembros() {
        return membros;
    }

    public void setMembros(List<Pokemon> membros) {
        this.membros = membros;
    }

    // Método para adicionar um Pokémon à equipe
    public void adicionarPokemon(Pokemon pokemon) {
        membros.add(pokemon);
    }

    // Método para remover um Pokémon da equipe
    public void removerPokemon(Pokemon pokemon) {
        membros.remove(pokemon);
    }
}
