package com.jesse.cordsaver.Utils;

import com.jesse.cordsaver.GUI.ActionGUI;
import com.jesse.cordsaver.GUI.AdminCoordsGUI;
import com.jesse.cordsaver.GUI.CoordsGUI;
import com.jesse.cordsaver.GUI.CustomizationGUI;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;
import java.util.HashMap;

public class GuiManager {
    public static CoordsGUI coordsGUI;
    public static ActionGUI actionGUI;
    public static CustomizationGUI customizationGUI;
    public static AdminCoordsGUI adminCoordsGUI;
    public static HashMap<String, String> admin_target = new HashMap<>();

    public static void startGuiManager(){
        coordsGUI = new CoordsGUI();
        actionGUI = new ActionGUI();
        customizationGUI = new CustomizationGUI();
        adminCoordsGUI = new AdminCoordsGUI();
    }


    public static ItemStack createGuiItem(Material item, String displayName, String lore){
        // Creates an item taking a material, displayname and lore (set lore to null for no lore)
        ItemStack guiItem = new ItemStack(item);
        ItemMeta guiItemMeta = guiItem.getItemMeta();
        guiItemMeta.setDisplayName(displayName);
        if (lore != null){
            guiItemMeta.setLore(Arrays.asList(lore));
        }
        guiItem.setItemMeta(guiItemMeta);
        return guiItem;
    }

}
