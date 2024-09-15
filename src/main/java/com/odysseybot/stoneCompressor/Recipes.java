package com.odysseybot.stoneCompressor;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;

public class Recipes {

    public static void CreateRecipes(StoneCompressor stc){

        AndesiteRecipes(stc);
        stc.sendMessageToConsole("["+ StoneCompressor.pluginName +"] Andesite recipes created.");
        BasaltRecipes(stc);
        stc.sendMessageToConsole("["+ StoneCompressor.pluginName +"] Basalt recipes created.");
        BlackstoneRecipes(stc);
        stc.sendMessageToConsole("["+ StoneCompressor.pluginName +"] Blackstone recipes created.");
        CalciteRecipes(stc);
        stc.sendMessageToConsole("["+ StoneCompressor.pluginName +"] Calcite recipes created.");
        CobblestoneRecipes(stc);
        stc.sendMessageToConsole("["+ StoneCompressor.pluginName +"] Cobblestone recipes created.");
        CobbledDeepslateRecipes(stc);
        stc.sendMessageToConsole("["+ StoneCompressor.pluginName +"] CobbledDeepslate recipes created.");
        DeepslateRecipes(stc);
        stc.sendMessageToConsole("["+ StoneCompressor.pluginName +"] Deepslate recipes created.");
        DioriteRecipes(stc);
        stc.sendMessageToConsole("["+ StoneCompressor.pluginName +"] Diorite recipes created.");
        EndStoneRecipes(stc);
        stc.sendMessageToConsole("["+ StoneCompressor.pluginName +"] EndStone recipes created.");
        GraniteRecipes(stc);
        stc.sendMessageToConsole("["+ StoneCompressor.pluginName +"] Granite recipes created.");
        NetherrackRecipes(stc);
        stc.sendMessageToConsole("["+ StoneCompressor.pluginName +"] Netherrack recipes created.");
        SandstoneRecipes(stc);
        stc.sendMessageToConsole("["+ StoneCompressor.pluginName +"] Sandstone recipes created.");
        StoneRecipes(stc);
        stc.sendMessageToConsole("["+ StoneCompressor.pluginName +"] Stone recipes created.");
        TuffRecipes(stc);
        stc.sendMessageToConsole("["+ StoneCompressor.pluginName +"] Tuff recipes created.");
    }

    private static void AndesiteRecipes(StoneCompressor stc){
        //Compressed Andesite
        ItemStack compressedAndesite = new ItemStack(Material.ANDESITE, 1);
        ItemMeta compressedAndesiteMeta = compressedAndesite.getItemMeta();
        compressedAndesiteMeta.setDisplayName(ChatColor.BLUE + "" + ChatColor.BOLD + "Compressed Andesite");
        compressedAndesiteMeta.setLore(List.of("Made of 9 andesite"));
        compressedAndesiteMeta.setMaxStackSize(81);
        compressedAndesite.setItemMeta(compressedAndesiteMeta);
        ShapedRecipe c_andesite = new ShapedRecipe(new NamespacedKey(stc, "compressed_andesite"), compressedAndesite);
        c_andesite.shape("xxx", "xxx", "xxx");
        c_andesite.setIngredient('x', Material.ANDESITE);
        stc.stoneRecipesList.add(c_andesite);

        //Heavily Compressed Andesite
        ItemStack hcompressedAndesite = new ItemStack(Material.ANDESITE, 1);
        ItemMeta hcompressedAndesiteMeta = hcompressedAndesite.getItemMeta();
        hcompressedAndesiteMeta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "Heavily Compressed Andesite");
        hcompressedAndesiteMeta.setLore(List.of("Made of 9 " + ChatColor.UNDERLINE + "compressed andesite"));
        hcompressedAndesiteMeta.setMaxStackSize(81);
        hcompressedAndesite.setItemMeta(hcompressedAndesiteMeta);
        ShapedRecipe hc_andesite = new ShapedRecipe(new NamespacedKey(stc, "hcompressed_andesite"), hcompressedAndesite);
        hc_andesite.shape("xxx", "xxx", "xxx");
        hc_andesite.setIngredient('x', new RecipeChoice.ExactChoice(compressedAndesite));
        stc.stoneRecipesList.add(hc_andesite);

        //Uncompressed Andesite
        ItemStack uncompressedAndesite = new ItemStack(Material.ANDESITE, 9);
        ItemMeta uncompressedAndesiteMeta = uncompressedAndesite.getItemMeta();
        uncompressedAndesiteMeta.setMaxStackSize(64);
        uncompressedAndesite.setItemMeta(uncompressedAndesiteMeta);
        ShapedRecipe uc_andesite = new ShapedRecipe(new NamespacedKey(stc, "uncompressed_andesite"), uncompressedAndesite);
        uc_andesite.shape("   ", "   ", "  x");
        uc_andesite.setIngredient('x', new RecipeChoice.ExactChoice(compressedAndesite));
        stc.stoneRecipesList.add(uc_andesite);

        //UnCompressed Heavy Andesite
        ItemStack huncompressedAndesite = new ItemStack(Material.ANDESITE, 9);
        ItemMeta huncompressedAndesiteMeta = huncompressedAndesite.getItemMeta();
        huncompressedAndesiteMeta.setDisplayName(ChatColor.BLUE + "" + ChatColor.BOLD + "Compressed Andesite");
        huncompressedAndesiteMeta.setLore(List.of("Made of 9 andesite"));
        huncompressedAndesiteMeta.setMaxStackSize(81);
        huncompressedAndesite.setItemMeta(huncompressedAndesiteMeta);
        ShapedRecipe hunc_andesite = new ShapedRecipe(new NamespacedKey(stc, "huncompressed_andesite"), huncompressedAndesite);
        hunc_andesite.shape("   ", "   ", "  x");
        hunc_andesite.setIngredient('x', new RecipeChoice.ExactChoice(hcompressedAndesite));
        stc.stoneRecipesList.add(hunc_andesite);
    }

    private static void BasaltRecipes(StoneCompressor stc){
        //Compressed Basalt
        ItemStack compressedBasalt = new ItemStack(Material.BASALT, 1);
        ItemMeta compressedBasaltMeta = compressedBasalt.getItemMeta();
        compressedBasaltMeta.setDisplayName(ChatColor.BLUE + "" + ChatColor.BOLD + "Compressed Basalt");
        compressedBasaltMeta.setLore(List.of("Made of 9 Basalt"));
        compressedBasaltMeta.setMaxStackSize(81);
        compressedBasalt.setItemMeta(compressedBasaltMeta);
        ShapedRecipe c_Basalt = new ShapedRecipe(new NamespacedKey(stc, "compressed_Basalt"), compressedBasalt);
        c_Basalt.shape("xxx", "xxx", "xxx");
        c_Basalt.setIngredient('x', Material.BASALT);
        stc.stoneRecipesList.add(c_Basalt);

        //Heavily Compressed Basalt
        ItemStack hcompressedBasalt = new ItemStack(Material.BASALT, 1);
        ItemMeta hcompressedBasaltMeta = hcompressedBasalt.getItemMeta();
        hcompressedBasaltMeta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "Heavily Compressed Basalt");
        hcompressedBasaltMeta.setLore(List.of("Made of 9 " + ChatColor.UNDERLINE + "compressed Basalt"));
        hcompressedBasaltMeta.setMaxStackSize(81);
        hcompressedBasalt.setItemMeta(hcompressedBasaltMeta);
        ShapedRecipe hc_Basalt = new ShapedRecipe(new NamespacedKey(stc, "hcompressed_Basalt"), hcompressedBasalt);
        hc_Basalt.shape("xxx", "xxx", "xxx");
        hc_Basalt.setIngredient('x', new RecipeChoice.ExactChoice(compressedBasalt));
        stc.stoneRecipesList.add(hc_Basalt);

        //Uncompressed Basalt
        ItemStack uncompressedBasalt = new ItemStack(Material.BASALT, 9);
        ItemMeta uncompressedBasaltMeta = uncompressedBasalt.getItemMeta();
        uncompressedBasaltMeta.setMaxStackSize(64);
        uncompressedBasalt.setItemMeta(uncompressedBasaltMeta);
        ShapedRecipe uc_Basalt = new ShapedRecipe(new NamespacedKey(stc, "uncompressed_Basalt"), uncompressedBasalt);
        uc_Basalt.shape("   ", "   ", "  x");
        uc_Basalt.setIngredient('x', new RecipeChoice.ExactChoice(compressedBasalt));
        stc.stoneRecipesList.add(uc_Basalt);

        //UnCompressed Heavy Basalt
        ItemStack huncompressedBasalt = new ItemStack(Material.BASALT, 9);
        ItemMeta huncompressedBasaltMeta = huncompressedBasalt.getItemMeta();
        huncompressedBasaltMeta.setDisplayName(ChatColor.BLUE + "" + ChatColor.BOLD + "Compressed Basalt");
        huncompressedBasaltMeta.setLore(List.of("Made of 9 Basalt"));
        huncompressedBasaltMeta.setMaxStackSize(81);
        huncompressedBasalt.setItemMeta(huncompressedBasaltMeta);
        ShapedRecipe hunc_Basalt = new ShapedRecipe(new NamespacedKey(stc, "huncompressed_Basalt"), huncompressedBasalt);
        hunc_Basalt.shape("   ", "   ", "  x");
        hunc_Basalt.setIngredient('x', new RecipeChoice.ExactChoice(hcompressedBasalt));
        stc.stoneRecipesList.add(hunc_Basalt);
    }

    private static void BlackstoneRecipes(StoneCompressor stc){
        //Compressed Blackstone
        ItemStack compressedBlackstone = new ItemStack(Material.BLACKSTONE, 1);
        ItemMeta compressedBlackstoneMeta = compressedBlackstone.getItemMeta();
        compressedBlackstoneMeta.setDisplayName(ChatColor.BLUE + "" + ChatColor.BOLD + "Compressed Blackstone");
        compressedBlackstoneMeta.setLore(List.of("Made of 9 Blackstone"));
        compressedBlackstoneMeta.setMaxStackSize(81);
        compressedBlackstone.setItemMeta(compressedBlackstoneMeta);
        ShapedRecipe c_Blackstone = new ShapedRecipe(new NamespacedKey(stc, "compressed_Blackstone"), compressedBlackstone);
        c_Blackstone.shape("xxx", "xxx", "xxx");
        c_Blackstone.setIngredient('x', Material.BLACKSTONE);
        stc.stoneRecipesList.add(c_Blackstone);

        //Heavily Compressed Blackstone
        ItemStack hcompressedBlackstone = new ItemStack(Material.BLACKSTONE, 1);
        ItemMeta hcompressedBlackstoneMeta = hcompressedBlackstone.getItemMeta();
        hcompressedBlackstoneMeta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "Heavily Compressed Blackstone");
        hcompressedBlackstoneMeta.setLore(List.of("Made of 9 " + ChatColor.UNDERLINE + "compressed Blackstone"));
        hcompressedBlackstoneMeta.setMaxStackSize(81);
        hcompressedBlackstone.setItemMeta(hcompressedBlackstoneMeta);
        ShapedRecipe hc_Blackstone = new ShapedRecipe(new NamespacedKey(stc, "hcompressed_Blackstone"), hcompressedBlackstone);
        hc_Blackstone.shape("xxx", "xxx", "xxx");
        hc_Blackstone.setIngredient('x', new RecipeChoice.ExactChoice(compressedBlackstone));
        stc.stoneRecipesList.add(hc_Blackstone);

        //Uncompressed Blackstone
        ItemStack uncompressedBlackstone = new ItemStack(Material.BLACKSTONE, 9);
        ItemMeta uncompressedBlackstoneMeta = uncompressedBlackstone.getItemMeta();
        uncompressedBlackstoneMeta.setMaxStackSize(64);
        uncompressedBlackstone.setItemMeta(uncompressedBlackstoneMeta);
        ShapedRecipe uc_Blackstone = new ShapedRecipe(new NamespacedKey(stc, "uncompressed_Blackstone"), uncompressedBlackstone);
        uc_Blackstone.shape("   ", "   ", "  x");
        uc_Blackstone.setIngredient('x', new RecipeChoice.ExactChoice(compressedBlackstone));
        stc.stoneRecipesList.add(uc_Blackstone);

        //UnCompressed Heavy Blackstone
        ItemStack huncompressedBlackstone = new ItemStack(Material.BLACKSTONE, 9);
        ItemMeta huncompressedBlackstoneMeta = huncompressedBlackstone.getItemMeta();
        huncompressedBlackstoneMeta.setDisplayName(ChatColor.BLUE + "" + ChatColor.BOLD + "Compressed Blackstone");
        huncompressedBlackstoneMeta.setLore(List.of("Made of 9 Blackstone"));
        huncompressedBlackstoneMeta.setMaxStackSize(81);
        huncompressedBlackstone.setItemMeta(huncompressedBlackstoneMeta);
        ShapedRecipe hunc_Blackstone = new ShapedRecipe(new NamespacedKey(stc, "huncompressed_Blackstone"), huncompressedBlackstone);
        hunc_Blackstone.shape("   ", "   ", "  x");
        hunc_Blackstone.setIngredient('x', new RecipeChoice.ExactChoice(hcompressedBlackstone));
        stc.stoneRecipesList.add(hunc_Blackstone);
    }

    private static void CalciteRecipes(StoneCompressor stc){
        //Compressed Calcite
        ItemStack compressedCalcite = new ItemStack(Material.CALCITE, 1);
        ItemMeta compressedCalciteMeta = compressedCalcite.getItemMeta();
        compressedCalciteMeta.setDisplayName(ChatColor.BLUE + "" + ChatColor.BOLD + "Compressed Calcite");
        compressedCalciteMeta.setLore(List.of("Made of 9 Calcite"));
        compressedCalciteMeta.setMaxStackSize(81);
        compressedCalcite.setItemMeta(compressedCalciteMeta);
        ShapedRecipe c_Calcite = new ShapedRecipe(new NamespacedKey(stc, "compressed_Calcite"), compressedCalcite);
        c_Calcite.shape("xxx", "xxx", "xxx");
        c_Calcite.setIngredient('x', Material.CALCITE);
        stc.stoneRecipesList.add(c_Calcite);

        //Heavily Compressed Calcite
        ItemStack hcompressedCalcite = new ItemStack(Material.CALCITE, 1);
        ItemMeta hcompressedCalciteMeta = hcompressedCalcite.getItemMeta();
        hcompressedCalciteMeta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "Heavily Compressed Calcite");
        hcompressedCalciteMeta.setLore(List.of("Made of 9 " + ChatColor.UNDERLINE + "compressed Calcite"));
        hcompressedCalciteMeta.setMaxStackSize(81);
        hcompressedCalcite.setItemMeta(hcompressedCalciteMeta);
        ShapedRecipe hc_Calcite = new ShapedRecipe(new NamespacedKey(stc, "hcompressed_Calcite"), hcompressedCalcite);
        hc_Calcite.shape("xxx", "xxx", "xxx");
        hc_Calcite.setIngredient('x', new RecipeChoice.ExactChoice(compressedCalcite));
        stc.stoneRecipesList.add(hc_Calcite);

        //Uncompressed Calcite
        ItemStack uncompressedCalcite = new ItemStack(Material.CALCITE, 9);
        ItemMeta uncompressedCalciteMeta = uncompressedCalcite.getItemMeta();
        uncompressedCalciteMeta.setMaxStackSize(64);
        uncompressedCalcite.setItemMeta(uncompressedCalciteMeta);
        ShapedRecipe uc_Calcite = new ShapedRecipe(new NamespacedKey(stc, "uncompressed_Calcite"), uncompressedCalcite);
        uc_Calcite.shape("   ", "   ", "  x");
        uc_Calcite.setIngredient('x', new RecipeChoice.ExactChoice(compressedCalcite));
        stc.stoneRecipesList.add(uc_Calcite);

        //UnCompressed Heavy Calcite
        ItemStack huncompressedCalcite = new ItemStack(Material.CALCITE, 9);
        ItemMeta huncompressedCalciteMeta = huncompressedCalcite.getItemMeta();
        huncompressedCalciteMeta.setDisplayName(ChatColor.BLUE + "" + ChatColor.BOLD + "Compressed Calcite");
        huncompressedCalciteMeta.setLore(List.of("Made of 9 Calcite"));
        huncompressedCalciteMeta.setMaxStackSize(81);
        huncompressedCalcite.setItemMeta(huncompressedCalciteMeta);
        ShapedRecipe hunc_Calcite = new ShapedRecipe(new NamespacedKey(stc, "huncompressed_Calcite"), huncompressedCalcite);
        hunc_Calcite.shape("   ", "   ", "  x");
        hunc_Calcite.setIngredient('x', new RecipeChoice.ExactChoice(hcompressedCalcite));
        stc.stoneRecipesList.add(hunc_Calcite);
    }

    private static void CobblestoneRecipes(StoneCompressor stc){
        //Compressed Cobblestone
        ItemStack compressedCobblestone = new ItemStack(Material.COBBLESTONE, 1);
        ItemMeta compressedCobblestoneMeta = compressedCobblestone.getItemMeta();
        compressedCobblestoneMeta.setDisplayName(ChatColor.BLUE + "" + ChatColor.BOLD + "Compressed Cobblestone");
        compressedCobblestoneMeta.setLore(List.of("Made of 9 Cobblestone"));
        compressedCobblestoneMeta.setMaxStackSize(81);
        compressedCobblestone.setItemMeta(compressedCobblestoneMeta);
        ShapedRecipe c_Cobblestone = new ShapedRecipe(new NamespacedKey(stc, "compressed_Cobblestone"), compressedCobblestone);
        c_Cobblestone.shape("xxx", "xxx", "xxx");
        c_Cobblestone.setIngredient('x', Material.COBBLESTONE);
        stc.stoneRecipesList.add(c_Cobblestone);

        //Heavily Compressed Cobblestone
        ItemStack hcompressedCobblestone = new ItemStack(Material.COBBLESTONE, 1);
        ItemMeta hcompressedCobblestoneMeta = hcompressedCobblestone.getItemMeta();
        hcompressedCobblestoneMeta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "Heavily Compressed Cobblestone");
        hcompressedCobblestoneMeta.setLore(List.of("Made of 9 " + ChatColor.UNDERLINE + "compressed Cobblestone"));
        hcompressedCobblestoneMeta.setMaxStackSize(81);
        hcompressedCobblestone.setItemMeta(hcompressedCobblestoneMeta);
        ShapedRecipe hc_Cobblestone = new ShapedRecipe(new NamespacedKey(stc, "hcompressed_Cobblestone"), hcompressedCobblestone);
        hc_Cobblestone.shape("xxx", "xxx", "xxx");
        hc_Cobblestone.setIngredient('x', new RecipeChoice.ExactChoice(compressedCobblestone));
        stc.stoneRecipesList.add(hc_Cobblestone);

        //Uncompressed Cobblestone
        ItemStack uncompressedCobblestone = new ItemStack(Material.COBBLESTONE, 9);
        ItemMeta uncompressedCobblestoneMeta = uncompressedCobblestone.getItemMeta();
        uncompressedCobblestoneMeta.setMaxStackSize(64);
        uncompressedCobblestone.setItemMeta(uncompressedCobblestoneMeta);
        ShapedRecipe uc_Cobblestone = new ShapedRecipe(new NamespacedKey(stc, "uncompressed_Cobblestone"), uncompressedCobblestone);
        uc_Cobblestone.shape("   ", "   ", "  x");
        uc_Cobblestone.setIngredient('x', new RecipeChoice.ExactChoice(compressedCobblestone));
        stc.stoneRecipesList.add(uc_Cobblestone);

        //UnCompressed Heavy Cobblestone
        ItemStack huncompressedCobblestone = new ItemStack(Material.COBBLESTONE, 9);
        ItemMeta huncompressedCobblestoneMeta = huncompressedCobblestone.getItemMeta();
        huncompressedCobblestoneMeta.setDisplayName(ChatColor.BLUE + "" + ChatColor.BOLD + "Compressed Cobblestone");
        huncompressedCobblestoneMeta.setLore(List.of("Made of 9 Cobblestone"));
        huncompressedCobblestoneMeta.setMaxStackSize(81);
        huncompressedCobblestone.setItemMeta(huncompressedCobblestoneMeta);
        ShapedRecipe hunc_Cobblestone = new ShapedRecipe(new NamespacedKey(stc, "huncompressed_Cobblestone"), huncompressedCobblestone);
        hunc_Cobblestone.shape("   ", "   ", "  x");
        hunc_Cobblestone.setIngredient('x', new RecipeChoice.ExactChoice(hcompressedCobblestone));
        stc.stoneRecipesList.add(hunc_Cobblestone);
    }

    private static void CobbledDeepslateRecipes(StoneCompressor stc){
        //Compressed CobbledDeepslate
        ItemStack compressedCobbledDeepslate = new ItemStack(Material.COBBLED_DEEPSLATE, 1);
        ItemMeta compressedCobbledDeepslateMeta = compressedCobbledDeepslate.getItemMeta();
        compressedCobbledDeepslateMeta.setDisplayName(ChatColor.BLUE + "" + ChatColor.BOLD + "Compressed CobbledDeepslate");
        compressedCobbledDeepslateMeta.setLore(List.of("Made of 9 CobbledDeepslate"));
        compressedCobbledDeepslateMeta.setMaxStackSize(81);
        compressedCobbledDeepslate.setItemMeta(compressedCobbledDeepslateMeta);
        ShapedRecipe c_CobbledDeepslate = new ShapedRecipe(new NamespacedKey(stc, "compressed_CobbledDeepslate"), compressedCobbledDeepslate);
        c_CobbledDeepslate.shape("xxx", "xxx", "xxx");
        c_CobbledDeepslate.setIngredient('x', Material.COBBLED_DEEPSLATE);
        stc.stoneRecipesList.add(c_CobbledDeepslate);

        //Heavily Compressed CobbledDeepslate
        ItemStack hcompressedCobbledDeepslate = new ItemStack(Material.COBBLED_DEEPSLATE, 1);
        ItemMeta hcompressedCobbledDeepslateMeta = hcompressedCobbledDeepslate.getItemMeta();
        hcompressedCobbledDeepslateMeta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "Heavily Compressed CobbledDeepslate");
        hcompressedCobbledDeepslateMeta.setLore(List.of("Made of 9 " + ChatColor.UNDERLINE + "compressed CobbledDeepslate"));
        hcompressedCobbledDeepslateMeta.setMaxStackSize(81);
        hcompressedCobbledDeepslate.setItemMeta(hcompressedCobbledDeepslateMeta);
        ShapedRecipe hc_CobbledDeepslate = new ShapedRecipe(new NamespacedKey(stc, "hcompressed_CobbledDeepslate"), hcompressedCobbledDeepslate);
        hc_CobbledDeepslate.shape("xxx", "xxx", "xxx");
        hc_CobbledDeepslate.setIngredient('x', new RecipeChoice.ExactChoice(compressedCobbledDeepslate));
        stc.stoneRecipesList.add(hc_CobbledDeepslate);

        //Uncompressed CobbledDeepslate
        ItemStack uncompressedCobbledDeepslate = new ItemStack(Material.COBBLED_DEEPSLATE, 9);
        ItemMeta uncompressedCobbledDeepslateMeta = uncompressedCobbledDeepslate.getItemMeta();
        uncompressedCobbledDeepslateMeta.setMaxStackSize(64);
        uncompressedCobbledDeepslate.setItemMeta(uncompressedCobbledDeepslateMeta);
        ShapedRecipe uc_CobbledDeepslate = new ShapedRecipe(new NamespacedKey(stc, "uncompressed_CobbledDeepslate"), uncompressedCobbledDeepslate);
        uc_CobbledDeepslate.shape("   ", "   ", "  x");
        uc_CobbledDeepslate.setIngredient('x', new RecipeChoice.ExactChoice(compressedCobbledDeepslate));
        stc.stoneRecipesList.add(uc_CobbledDeepslate);

        //UnCompressed Heavy CobbledDeepslate
        ItemStack huncompressedCobbledDeepslate = new ItemStack(Material.COBBLED_DEEPSLATE, 9);
        ItemMeta huncompressedCobbledDeepslateMeta = huncompressedCobbledDeepslate.getItemMeta();
        huncompressedCobbledDeepslateMeta.setDisplayName(ChatColor.BLUE + "" + ChatColor.BOLD + "Compressed CobbledDeepslate");
        huncompressedCobbledDeepslateMeta.setLore(List.of("Made of 9 CobbledDeepslate"));
        huncompressedCobbledDeepslateMeta.setMaxStackSize(81);
        huncompressedCobbledDeepslate.setItemMeta(huncompressedCobbledDeepslateMeta);
        ShapedRecipe hunc_CobbledDeepslate = new ShapedRecipe(new NamespacedKey(stc, "huncompressed_CobbledDeepslate"), huncompressedCobbledDeepslate);
        hunc_CobbledDeepslate.shape("   ", "   ", "  x");
        hunc_CobbledDeepslate.setIngredient('x', new RecipeChoice.ExactChoice(hcompressedCobbledDeepslate));
        stc.stoneRecipesList.add(hunc_CobbledDeepslate);
    }

    private static void DeepslateRecipes(StoneCompressor stc){
        //Compressed Deepslate
        ItemStack compressedDeepslate = new ItemStack(Material.DEEPSLATE, 1);
        ItemMeta compressedDeepslateMeta = compressedDeepslate.getItemMeta();
        compressedDeepslateMeta.setDisplayName(ChatColor.BLUE + "" + ChatColor.BOLD + "Compressed Deepslate");
        compressedDeepslateMeta.setLore(List.of("Made of 9 Deepslate"));
        compressedDeepslateMeta.setMaxStackSize(81);
        compressedDeepslate.setItemMeta(compressedDeepslateMeta);
        ShapedRecipe c_Deepslate = new ShapedRecipe(new NamespacedKey(stc, "compressed_Deepslate"), compressedDeepslate);
        c_Deepslate.shape("xxx", "xxx", "xxx");
        c_Deepslate.setIngredient('x', Material.DEEPSLATE);
        stc.stoneRecipesList.add(c_Deepslate);

        //Heavily Compressed Deepslate
        ItemStack hcompressedDeepslate = new ItemStack(Material.DEEPSLATE, 1);
        ItemMeta hcompressedDeepslateMeta = hcompressedDeepslate.getItemMeta();
        hcompressedDeepslateMeta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "Heavily Compressed Deepslate");
        hcompressedDeepslateMeta.setLore(List.of("Made of 9 " + ChatColor.UNDERLINE + "compressed Deepslate"));
        hcompressedDeepslateMeta.setMaxStackSize(81);
        hcompressedDeepslate.setItemMeta(hcompressedDeepslateMeta);
        ShapedRecipe hc_Deepslate = new ShapedRecipe(new NamespacedKey(stc, "hcompressed_Deepslate"), hcompressedDeepslate);
        hc_Deepslate.shape("xxx", "xxx", "xxx");
        hc_Deepslate.setIngredient('x', new RecipeChoice.ExactChoice(compressedDeepslate));
        stc.stoneRecipesList.add(hc_Deepslate);

        //Uncompressed Deepslate
        ItemStack uncompressedDeepslate = new ItemStack(Material.DEEPSLATE, 9);
        ItemMeta uncompressedDeepslateMeta = uncompressedDeepslate.getItemMeta();
        uncompressedDeepslateMeta.setMaxStackSize(64);
        uncompressedDeepslate.setItemMeta(uncompressedDeepslateMeta);
        ShapedRecipe uc_Deepslate = new ShapedRecipe(new NamespacedKey(stc, "uncompressed_Deepslate"), uncompressedDeepslate);
        uc_Deepslate.shape("   ", "   ", "  x");
        uc_Deepslate.setIngredient('x', new RecipeChoice.ExactChoice(compressedDeepslate));
        stc.stoneRecipesList.add(uc_Deepslate);

        //UnCompressed Heavy Deepslate
        ItemStack huncompressedDeepslate = new ItemStack(Material.DEEPSLATE, 9);
        ItemMeta huncompressedDeepslateMeta = huncompressedDeepslate.getItemMeta();
        huncompressedDeepslateMeta.setDisplayName(ChatColor.BLUE + "" + ChatColor.BOLD + "Compressed Deepslate");
        huncompressedDeepslateMeta.setLore(List.of("Made of 9 Deepslate"));
        huncompressedDeepslateMeta.setMaxStackSize(81);
        huncompressedDeepslate.setItemMeta(huncompressedDeepslateMeta);
        ShapedRecipe hunc_Deepslate = new ShapedRecipe(new NamespacedKey(stc, "huncompressed_Deepslate"), huncompressedDeepslate);
        hunc_Deepslate.shape("   ", "   ", "  x");
        hunc_Deepslate.setIngredient('x', new RecipeChoice.ExactChoice(hcompressedDeepslate));
        stc.stoneRecipesList.add(hunc_Deepslate);
    }

    private static void DioriteRecipes(StoneCompressor stc){
        //Compressed Diorite
        ItemStack compressedDiorite = new ItemStack(Material.DIORITE, 1);
        ItemMeta compressedDioriteMeta = compressedDiorite.getItemMeta();
        compressedDioriteMeta.setDisplayName(ChatColor.BLUE + "" + ChatColor.BOLD + "Compressed Diorite");
        compressedDioriteMeta.setLore(List.of("Made of 9 Diorite"));
        compressedDioriteMeta.setMaxStackSize(81);
        compressedDiorite.setItemMeta(compressedDioriteMeta);
        ShapedRecipe c_Diorite = new ShapedRecipe(new NamespacedKey(stc, "compressed_Diorite"), compressedDiorite);
        c_Diorite.shape("xxx", "xxx", "xxx");
        c_Diorite.setIngredient('x', Material.DIORITE);
        stc.stoneRecipesList.add(c_Diorite);

        //Heavily Compressed Diorite
        ItemStack hcompressedDiorite = new ItemStack(Material.DIORITE, 1);
        ItemMeta hcompressedDioriteMeta = hcompressedDiorite.getItemMeta();
        hcompressedDioriteMeta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "Heavily Compressed Diorite");
        hcompressedDioriteMeta.setLore(List.of("Made of 9 " + ChatColor.UNDERLINE + "compressed Diorite"));
        hcompressedDioriteMeta.setMaxStackSize(81);
        hcompressedDiorite.setItemMeta(hcompressedDioriteMeta);
        ShapedRecipe hc_Diorite = new ShapedRecipe(new NamespacedKey(stc, "hcompressed_Diorite"), hcompressedDiorite);
        hc_Diorite.shape("xxx", "xxx", "xxx");
        hc_Diorite.setIngredient('x', new RecipeChoice.ExactChoice(compressedDiorite));
        stc.stoneRecipesList.add(hc_Diorite);

        //Uncompressed Diorite
        ItemStack uncompressedDiorite = new ItemStack(Material.DIORITE, 9);
        ItemMeta uncompressedDioriteMeta = uncompressedDiorite.getItemMeta();
        uncompressedDioriteMeta.setMaxStackSize(64);
        uncompressedDiorite.setItemMeta(uncompressedDioriteMeta);
        ShapedRecipe uc_Diorite = new ShapedRecipe(new NamespacedKey(stc, "uncompressed_Diorite"), uncompressedDiorite);
        uc_Diorite.shape("   ", "   ", "  x");
        uc_Diorite.setIngredient('x', new RecipeChoice.ExactChoice(compressedDiorite));
        stc.stoneRecipesList.add(uc_Diorite);

        //UnCompressed Heavy Diorite
        ItemStack huncompressedDiorite = new ItemStack(Material.DIORITE, 9);
        ItemMeta huncompressedDioriteMeta = huncompressedDiorite.getItemMeta();
        huncompressedDioriteMeta.setDisplayName(ChatColor.BLUE + "" + ChatColor.BOLD + "Compressed Diorite");
        huncompressedDioriteMeta.setLore(List.of("Made of 9 Diorite"));
        huncompressedDioriteMeta.setMaxStackSize(81);
        huncompressedDiorite.setItemMeta(huncompressedDioriteMeta);
        ShapedRecipe hunc_Diorite = new ShapedRecipe(new NamespacedKey(stc, "huncompressed_Diorite"), huncompressedDiorite);
        hunc_Diorite.shape("   ", "   ", "  x");
        hunc_Diorite.setIngredient('x', new RecipeChoice.ExactChoice(hcompressedDiorite));
        stc.stoneRecipesList.add(hunc_Diorite);
    }

    private static void EndStoneRecipes(StoneCompressor stc){
        //Compressed EndStone
        ItemStack compressedEndStone = new ItemStack(Material.END_STONE, 1);
        ItemMeta compressedEndStoneMeta = compressedEndStone.getItemMeta();
        compressedEndStoneMeta.setDisplayName(ChatColor.BLUE + "" + ChatColor.BOLD + "Compressed EndStone");
        compressedEndStoneMeta.setLore(List.of("Made of 9 EndStone"));
        compressedEndStoneMeta.setMaxStackSize(81);
        compressedEndStone.setItemMeta(compressedEndStoneMeta);
        ShapedRecipe c_EndStone = new ShapedRecipe(new NamespacedKey(stc, "compressed_EndStone"), compressedEndStone);
        c_EndStone.shape("xxx", "xxx", "xxx");
        c_EndStone.setIngredient('x', Material.END_STONE);
        stc.stoneRecipesList.add(c_EndStone);

        //Heavily Compressed EndStone
        ItemStack hcompressedEndStone = new ItemStack(Material.END_STONE, 1);
        ItemMeta hcompressedEndStoneMeta = hcompressedEndStone.getItemMeta();
        hcompressedEndStoneMeta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "Heavily Compressed EndStone");
        hcompressedEndStoneMeta.setLore(List.of("Made of 9 " + ChatColor.UNDERLINE + "compressed EndStone"));
        hcompressedEndStoneMeta.setMaxStackSize(81);
        hcompressedEndStone.setItemMeta(hcompressedEndStoneMeta);
        ShapedRecipe hc_EndStone = new ShapedRecipe(new NamespacedKey(stc, "hcompressed_EndStone"), hcompressedEndStone);
        hc_EndStone.shape("xxx", "xxx", "xxx");
        hc_EndStone.setIngredient('x', new RecipeChoice.ExactChoice(compressedEndStone));
        stc.stoneRecipesList.add(hc_EndStone);

        //Uncompressed EndStone
        ItemStack uncompressedEndStone = new ItemStack(Material.END_STONE, 9);
        ItemMeta uncompressedEndStoneMeta = uncompressedEndStone.getItemMeta();
        uncompressedEndStoneMeta.setMaxStackSize(64);
        uncompressedEndStone.setItemMeta(uncompressedEndStoneMeta);
        ShapedRecipe uc_EndStone = new ShapedRecipe(new NamespacedKey(stc, "uncompressed_EndStone"), uncompressedEndStone);
        uc_EndStone.shape("   ", "   ", "  x");
        uc_EndStone.setIngredient('x', new RecipeChoice.ExactChoice(compressedEndStone));
        stc.stoneRecipesList.add(uc_EndStone);

        //UnCompressed Heavy EndStone
        ItemStack huncompressedEndStone = new ItemStack(Material.END_STONE, 9);
        ItemMeta huncompressedEndStoneMeta = huncompressedEndStone.getItemMeta();
        huncompressedEndStoneMeta.setDisplayName(ChatColor.BLUE + "" + ChatColor.BOLD + "Compressed EndStone");
        huncompressedEndStoneMeta.setLore(List.of("Made of 9 EndStone"));
        huncompressedEndStoneMeta.setMaxStackSize(81);
        huncompressedEndStone.setItemMeta(huncompressedEndStoneMeta);
        ShapedRecipe hunc_EndStone = new ShapedRecipe(new NamespacedKey(stc, "huncompressed_EndStone"), huncompressedEndStone);
        hunc_EndStone.shape("   ", "   ", "  x");
        hunc_EndStone.setIngredient('x', new RecipeChoice.ExactChoice(hcompressedEndStone));
        stc.stoneRecipesList.add(hunc_EndStone);
    }

    private static void GraniteRecipes(StoneCompressor stc){
        //Compressed Granite
        ItemStack compressedGranite = new ItemStack(Material.GRANITE, 1);
        ItemMeta compressedGraniteMeta = compressedGranite.getItemMeta();
        compressedGraniteMeta.setDisplayName(ChatColor.BLUE + "" + ChatColor.BOLD + "Compressed Granite");
        compressedGraniteMeta.setLore(List.of("Made of 9 Granite"));
        compressedGraniteMeta.setMaxStackSize(81);
        compressedGranite.setItemMeta(compressedGraniteMeta);
        ShapedRecipe c_Granite = new ShapedRecipe(new NamespacedKey(stc, "compressed_Granite"), compressedGranite);
        c_Granite.shape("xxx", "xxx", "xxx");
        c_Granite.setIngredient('x', Material.GRANITE);
        stc.stoneRecipesList.add(c_Granite);

        //Heavily Compressed Granite
        ItemStack hcompressedGranite = new ItemStack(Material.GRANITE, 1);
        ItemMeta hcompressedGraniteMeta = hcompressedGranite.getItemMeta();
        hcompressedGraniteMeta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "Heavily Compressed Granite");
        hcompressedGraniteMeta.setLore(List.of("Made of 9 " + ChatColor.UNDERLINE + "compressed Granite"));
        hcompressedGraniteMeta.setMaxStackSize(81);
        hcompressedGranite.setItemMeta(hcompressedGraniteMeta);
        ShapedRecipe hc_Granite = new ShapedRecipe(new NamespacedKey(stc, "hcompressed_Granite"), hcompressedGranite);
        hc_Granite.shape("xxx", "xxx", "xxx");
        hc_Granite.setIngredient('x', new RecipeChoice.ExactChoice(compressedGranite));
        stc.stoneRecipesList.add(hc_Granite);

        //Uncompressed Granite
        ItemStack uncompressedGranite = new ItemStack(Material.GRANITE, 9);
        ItemMeta uncompressedGraniteMeta = uncompressedGranite.getItemMeta();
        uncompressedGraniteMeta.setMaxStackSize(64);
        uncompressedGranite.setItemMeta(uncompressedGraniteMeta);
        ShapedRecipe uc_Granite = new ShapedRecipe(new NamespacedKey(stc, "uncompressed_Granite"), uncompressedGranite);
        uc_Granite.shape("   ", "   ", "  x");
        uc_Granite.setIngredient('x', new RecipeChoice.ExactChoice(compressedGranite));
        stc.stoneRecipesList.add(uc_Granite);

        //UnCompressed Heavy Granite
        ItemStack huncompressedGranite = new ItemStack(Material.GRANITE, 9);
        ItemMeta huncompressedGraniteMeta = huncompressedGranite.getItemMeta();
        huncompressedGraniteMeta.setDisplayName(ChatColor.BLUE + "" + ChatColor.BOLD + "Compressed Granite");
        huncompressedGraniteMeta.setLore(List.of("Made of 9 Granite"));
        huncompressedGraniteMeta.setMaxStackSize(81);
        huncompressedGranite.setItemMeta(huncompressedGraniteMeta);
        ShapedRecipe hunc_Granite = new ShapedRecipe(new NamespacedKey(stc, "huncompressed_Granite"), huncompressedGranite);
        hunc_Granite.shape("   ", "   ", "  x");
        hunc_Granite.setIngredient('x', new RecipeChoice.ExactChoice(hcompressedGranite));
        stc.stoneRecipesList.add(hunc_Granite);
    }

    private static void NetherrackRecipes(StoneCompressor stc){
        //Compressed Netherrack
        ItemStack compressedNetherrack = new ItemStack(Material.NETHERRACK, 1);
        ItemMeta compressedNetherrackMeta = compressedNetherrack.getItemMeta();
        compressedNetherrackMeta.setDisplayName(ChatColor.BLUE + "" + ChatColor.BOLD + "Compressed Netherrack");
        compressedNetherrackMeta.setLore(List.of("Made of 9 Netherrack"));
        compressedNetherrackMeta.setMaxStackSize(81);
        compressedNetherrack.setItemMeta(compressedNetherrackMeta);
        ShapedRecipe c_Netherrack = new ShapedRecipe(new NamespacedKey(stc, "compressed_Netherrack"), compressedNetherrack);
        c_Netherrack.shape("xxx", "xxx", "xxx");
        c_Netherrack.setIngredient('x', Material.NETHERRACK);
        stc.stoneRecipesList.add(c_Netherrack);

        //Heavily Compressed Netherrack
        ItemStack hcompressedNetherrack = new ItemStack(Material.NETHERRACK, 1);
        ItemMeta hcompressedNetherrackMeta = hcompressedNetherrack.getItemMeta();
        hcompressedNetherrackMeta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "Heavily Compressed Netherrack");
        hcompressedNetherrackMeta.setLore(List.of("Made of 9 " + ChatColor.UNDERLINE + "compressed Netherrack"));
        hcompressedNetherrackMeta.setMaxStackSize(81);
        hcompressedNetherrack.setItemMeta(hcompressedNetherrackMeta);
        ShapedRecipe hc_Netherrack = new ShapedRecipe(new NamespacedKey(stc, "hcompressed_Netherrack"), hcompressedNetherrack);
        hc_Netherrack.shape("xxx", "xxx", "xxx");
        hc_Netherrack.setIngredient('x', new RecipeChoice.ExactChoice(compressedNetherrack));
        stc.stoneRecipesList.add(hc_Netherrack);

        //Uncompressed Netherrack
        ItemStack uncompressedNetherrack = new ItemStack(Material.NETHERRACK, 9);
        ItemMeta uncompressedNetherrackMeta = uncompressedNetherrack.getItemMeta();
        uncompressedNetherrackMeta.setMaxStackSize(64);
        uncompressedNetherrack.setItemMeta(uncompressedNetherrackMeta);
        ShapedRecipe uc_Netherrack = new ShapedRecipe(new NamespacedKey(stc, "uncompressed_Netherrack"), uncompressedNetherrack);
        uc_Netherrack.shape("   ", "   ", "  x");
        uc_Netherrack.setIngredient('x', new RecipeChoice.ExactChoice(compressedNetherrack));
        stc.stoneRecipesList.add(uc_Netherrack);

        //UnCompressed Heavy Netherrack
        ItemStack huncompressedNetherrack = new ItemStack(Material.NETHERRACK, 9);
        ItemMeta huncompressedNetherrackMeta = huncompressedNetherrack.getItemMeta();
        huncompressedNetherrackMeta.setDisplayName(ChatColor.BLUE + "" + ChatColor.BOLD + "Compressed Netherrack");
        huncompressedNetherrackMeta.setLore(List.of("Made of 9 Netherrack"));
        huncompressedNetherrackMeta.setMaxStackSize(81);
        huncompressedNetherrack.setItemMeta(huncompressedNetherrackMeta);
        ShapedRecipe hunc_Netherrack = new ShapedRecipe(new NamespacedKey(stc, "huncompressed_Netherrack"), huncompressedNetherrack);
        hunc_Netherrack.shape("   ", "   ", "  x");
        hunc_Netherrack.setIngredient('x', new RecipeChoice.ExactChoice(hcompressedNetherrack));
        stc.stoneRecipesList.add(hunc_Netherrack);
    }

    private static void SandstoneRecipes(StoneCompressor stc){
        //Compressed Sandstone
        ItemStack compressedSandstone = new ItemStack(Material.SANDSTONE, 1);
        ItemMeta compressedSandstoneMeta = compressedSandstone.getItemMeta();
        compressedSandstoneMeta.setDisplayName(ChatColor.BLUE + "" + ChatColor.BOLD + "Compressed Sandstone");
        compressedSandstoneMeta.setLore(List.of("Made of 9 Sandstone"));
        compressedSandstoneMeta.setMaxStackSize(81);
        compressedSandstone.setItemMeta(compressedSandstoneMeta);
        ShapedRecipe c_Sandstone = new ShapedRecipe(new NamespacedKey(stc, "compressed_Sandstone"), compressedSandstone);
        c_Sandstone.shape("xxx", "xxx", "xxx");
        c_Sandstone.setIngredient('x', Material.SANDSTONE);
        stc.stoneRecipesList.add(c_Sandstone);

        //Heavily Compressed Sandstone
        ItemStack hcompressedSandstone = new ItemStack(Material.SANDSTONE, 1);
        ItemMeta hcompressedSandstoneMeta = hcompressedSandstone.getItemMeta();
        hcompressedSandstoneMeta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "Heavily Compressed Sandstone");
        hcompressedSandstoneMeta.setLore(List.of("Made of 9 " + ChatColor.UNDERLINE + "compressed Sandstone"));
        hcompressedSandstoneMeta.setMaxStackSize(81);
        hcompressedSandstone.setItemMeta(hcompressedSandstoneMeta);
        ShapedRecipe hc_Sandstone = new ShapedRecipe(new NamespacedKey(stc, "hcompressed_Sandstone"), hcompressedSandstone);
        hc_Sandstone.shape("xxx", "xxx", "xxx");
        hc_Sandstone.setIngredient('x', new RecipeChoice.ExactChoice(compressedSandstone));
        stc.stoneRecipesList.add(hc_Sandstone);

        //Uncompressed Sandstone
        ItemStack uncompressedSandstone = new ItemStack(Material.SANDSTONE, 9);
        ItemMeta uncompressedSandstoneMeta = uncompressedSandstone.getItemMeta();
        uncompressedSandstoneMeta.setMaxStackSize(64);
        uncompressedSandstone.setItemMeta(uncompressedSandstoneMeta);
        ShapedRecipe uc_Sandstone = new ShapedRecipe(new NamespacedKey(stc, "uncompressed_Sandstone"), uncompressedSandstone);
        uc_Sandstone.shape("   ", "   ", "  x");
        uc_Sandstone.setIngredient('x', new RecipeChoice.ExactChoice(compressedSandstone));
        stc.stoneRecipesList.add(uc_Sandstone);

        //UnCompressed Heavy Sandstone
        ItemStack huncompressedSandstone = new ItemStack(Material.SANDSTONE, 9);
        ItemMeta huncompressedSandstoneMeta = huncompressedSandstone.getItemMeta();
        huncompressedSandstoneMeta.setDisplayName(ChatColor.BLUE + "" + ChatColor.BOLD + "Compressed Sandstone");
        huncompressedSandstoneMeta.setLore(List.of("Made of 9 Sandstone"));
        huncompressedSandstoneMeta.setMaxStackSize(81);
        huncompressedSandstone.setItemMeta(huncompressedSandstoneMeta);
        ShapedRecipe hunc_Sandstone = new ShapedRecipe(new NamespacedKey(stc, "huncompressed_Sandstone"), huncompressedSandstone);
        hunc_Sandstone.shape("   ", "   ", "  x");
        hunc_Sandstone.setIngredient('x', new RecipeChoice.ExactChoice(hcompressedSandstone));
        stc.stoneRecipesList.add(hunc_Sandstone);
    }

    private static void StoneRecipes(StoneCompressor stc){
        //Compressed Stone
        ItemStack compressedStone = new ItemStack(Material.STONE, 1);
        ItemMeta compressedStoneMeta = compressedStone.getItemMeta();
        compressedStoneMeta.setDisplayName(ChatColor.BLUE + "" + ChatColor.BOLD + "Compressed Stone");
        compressedStoneMeta.setLore(List.of("Made of 9 Stone"));
        compressedStoneMeta.setMaxStackSize(81);
        compressedStone.setItemMeta(compressedStoneMeta);
        ShapedRecipe c_Stone = new ShapedRecipe(new NamespacedKey(stc, "compressed_Stone"), compressedStone);
        c_Stone.shape("xxx", "xxx", "xxx");
        c_Stone.setIngredient('x', Material.STONE);
        stc.stoneRecipesList.add(c_Stone);

        //Heavily Compressed Stone
        ItemStack hcompressedStone = new ItemStack(Material.STONE, 1);
        ItemMeta hcompressedStoneMeta = hcompressedStone.getItemMeta();
        hcompressedStoneMeta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "Heavily Compressed Stone");
        hcompressedStoneMeta.setLore(List.of("Made of 9 " + ChatColor.UNDERLINE + "compressed Stone"));
        hcompressedStoneMeta.setMaxStackSize(81);
        hcompressedStone.setItemMeta(hcompressedStoneMeta);
        ShapedRecipe hc_Stone = new ShapedRecipe(new NamespacedKey(stc, "hcompressed_Stone"), hcompressedStone);
        hc_Stone.shape("xxx", "xxx", "xxx");
        hc_Stone.setIngredient('x', new RecipeChoice.ExactChoice(compressedStone));
        stc.stoneRecipesList.add(hc_Stone);

        //Uncompressed Stone
        ItemStack uncompressedStone = new ItemStack(Material.STONE, 9);
        ItemMeta uncompressedStoneMeta = uncompressedStone.getItemMeta();
        uncompressedStoneMeta.setMaxStackSize(64);
        uncompressedStone.setItemMeta(uncompressedStoneMeta);
        ShapedRecipe uc_Stone = new ShapedRecipe(new NamespacedKey(stc, "uncompressed_Stone"), uncompressedStone);
        uc_Stone.shape("   ", "   ", "  x");
        uc_Stone.setIngredient('x', new RecipeChoice.ExactChoice(compressedStone));
        stc.stoneRecipesList.add(uc_Stone);

        //UnCompressed Heavy Stone
        ItemStack huncompressedStone = new ItemStack(Material.STONE, 9);
        ItemMeta huncompressedStoneMeta = huncompressedStone.getItemMeta();
        huncompressedStoneMeta.setDisplayName(ChatColor.BLUE + "" + ChatColor.BOLD + "Compressed Stone");
        huncompressedStoneMeta.setLore(List.of("Made of 9 Stone"));
        huncompressedStoneMeta.setMaxStackSize(81);
        huncompressedStone.setItemMeta(huncompressedStoneMeta);
        ShapedRecipe hunc_Stone = new ShapedRecipe(new NamespacedKey(stc, "huncompressed_Stone"), huncompressedStone);
        hunc_Stone.shape("   ", "   ", "  x");
        hunc_Stone.setIngredient('x', new RecipeChoice.ExactChoice(hcompressedStone));
        stc.stoneRecipesList.add(hunc_Stone);
    }

    private static void TuffRecipes(StoneCompressor stc){
        //Compressed Tuff
        ItemStack compressedTuff = new ItemStack(Material.TUFF, 1);
        ItemMeta compressedTuffMeta = compressedTuff.getItemMeta();
        compressedTuffMeta.setDisplayName(ChatColor.BLUE + "" + ChatColor.BOLD + "Compressed Tuff");
        compressedTuffMeta.setLore(List.of("Made of 9 Tuff"));
        compressedTuffMeta.setMaxStackSize(81);
        compressedTuff.setItemMeta(compressedTuffMeta);
        ShapedRecipe c_Tuff = new ShapedRecipe(new NamespacedKey(stc, "compressed_Tuff"), compressedTuff);
        c_Tuff.shape("xxx", "xxx", "xxx");
        c_Tuff.setIngredient('x', Material.TUFF);
        stc.stoneRecipesList.add(c_Tuff);

        //Heavily Compressed Tuff
        ItemStack hcompressedTuff = new ItemStack(Material.TUFF, 1);
        ItemMeta hcompressedTuffMeta = hcompressedTuff.getItemMeta();
        hcompressedTuffMeta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "Heavily Compressed Tuff");
        hcompressedTuffMeta.setLore(List.of("Made of 9 " + ChatColor.UNDERLINE + "compressed Tuff"));
        hcompressedTuffMeta.setMaxStackSize(81);
        hcompressedTuff.setItemMeta(hcompressedTuffMeta);
        ShapedRecipe hc_Tuff = new ShapedRecipe(new NamespacedKey(stc, "hcompressed_Tuff"), hcompressedTuff);
        hc_Tuff.shape("xxx", "xxx", "xxx");
        hc_Tuff.setIngredient('x', new RecipeChoice.ExactChoice(compressedTuff));
        stc.stoneRecipesList.add(hc_Tuff);

        //Uncompressed Tuff
        ItemStack uncompressedTuff = new ItemStack(Material.TUFF, 9);
        ItemMeta uncompressedTuffMeta = uncompressedTuff.getItemMeta();
        uncompressedTuffMeta.setMaxStackSize(64);
        uncompressedTuff.setItemMeta(uncompressedTuffMeta);
        ShapedRecipe uc_Tuff = new ShapedRecipe(new NamespacedKey(stc, "uncompressed_Tuff"), uncompressedTuff);
        uc_Tuff.shape("   ", "   ", "  x");
        uc_Tuff.setIngredient('x', new RecipeChoice.ExactChoice(compressedTuff));
        stc.stoneRecipesList.add(uc_Tuff);

        //UnCompressed Heavy Tuff
        ItemStack huncompressedTuff = new ItemStack(Material.TUFF, 9);
        ItemMeta huncompressedTuffMeta = huncompressedTuff.getItemMeta();
        huncompressedTuffMeta.setDisplayName(ChatColor.BLUE + "" + ChatColor.BOLD + "Compressed Tuff");
        huncompressedTuffMeta.setLore(List.of("Made of 9 Tuff"));
        huncompressedTuffMeta.setMaxStackSize(81);
        huncompressedTuff.setItemMeta(huncompressedTuffMeta);
        ShapedRecipe hunc_Tuff = new ShapedRecipe(new NamespacedKey(stc, "huncompressed_Tuff"), huncompressedTuff);
        hunc_Tuff.shape("   ", "   ", "  x");
        hunc_Tuff.setIngredient('x', new RecipeChoice.ExactChoice(hcompressedTuff));
        stc.stoneRecipesList.add(hunc_Tuff);
    }
}
