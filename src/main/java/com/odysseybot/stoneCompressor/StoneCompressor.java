package com.odysseybot.stoneCompressor;

import org.bukkit.Bukkit;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.List;

public final class StoneCompressor extends JavaPlugin {

    public static String pluginName = "StoneCompressor";
    List<ShapedRecipe> stoneRecipesList = new ArrayList<>();

    @Override
    public void onEnable() {
        sendMessageToConsole("["+pluginName+"] Recipes successfully initialized and enabled.");
    }

    @Override
    public void onDisable() {
        UpdateRecipes(true);
        sendMessageToConsole("["+pluginName+"] Recipes successfully removed and disabled.");
    }

    public void onLoad(){
        sendMessageToConsole("["+pluginName+"] Creating compressor recipes");
        Recipes.CreateRecipes(this);
        sendMessageToConsole("["+pluginName+"] Adding compressor recipes");
        UpdateRecipes(false);
        sendMessageToConsole("["+pluginName+"] Compressor recipes creation complete");

    }

    private void UpdateRecipes(boolean remove) {
        if (remove) {
            for(ShapedRecipe recipe : stoneRecipesList) {
                Bukkit.removeRecipe(recipe.getKey());
            }
        }
        else {
            for(ShapedRecipe recipe : stoneRecipesList) {
                Bukkit.addRecipe(recipe);
            }
        }
    }

    public void sendMessageToConsole(String message){
        Bukkit.getConsoleSender().sendMessage(message);
    }
}
