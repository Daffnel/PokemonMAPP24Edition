package Data;

import Pokemon.Pokemon;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class FileHandling {

    public static ArrayList<Pokemon> readPokemonData() throws IOException {
        Gson gson = new Gson();

        ArrayList<Pokemon> pokemonList = null;
        try (FileReader reader = new FileReader("pokemon.json")) {
            Type pokemonListType = new TypeToken<ArrayList<Pokemon>>() {
            }.getType();
            pokemonList = gson.fromJson(reader, pokemonListType);
                    } catch (IOException e) {
            e.printStackTrace();
        }

        return pokemonList;

    }
}

