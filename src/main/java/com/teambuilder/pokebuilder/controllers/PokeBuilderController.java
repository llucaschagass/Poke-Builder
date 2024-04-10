package com.teambuilder.pokebuilder.controllers;

import com.teambuilder.pokebuilder.models.Pokemon;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PokeBuilderController {

    @GetMapping("/team")
    public String getTeam(Model model) {
        List<Pokemon> team = new ArrayList<>();

        // Criando instâncias dos meus Pokémon favoritos
        Pokemon charizard = new Pokemon("Charizard", "Fogo", "Voador");
        Pokemon greninja = new Pokemon("Greninja", "Água", "Sombrio");
        Pokemon sceptile = new Pokemon("Sceptile", "Planta", null);
        Pokemon staraptor = new Pokemon("Staraptor", "Normal", "Voador");
        Pokemon raichu = new Pokemon("Raichu", "Elétrico", null);
        Pokemon lucario = new Pokemon("Lucario", "Lutador", "Metal");

        // Adicionando Pokémon à lista
        team.add(charizard);
        team.add(greninja);
        team.add(sceptile);
        team.add(staraptor);
        team.add(raichu);
        team.add(lucario);

        // Adicionando a lista de Pokémon ao modelo
        model.addAttribute("team", team);

        // Retorna o nome da view
        return "team";
    }
}