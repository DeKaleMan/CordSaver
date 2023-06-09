package com.jesse.cordsaver.Utils;

import com.jesse.cordsaver.Main;

public class ConfigManager {
    private static Main main;
    public static void startConfigManager(Main main){
        ConfigManager.main = main;
        ConfigManager.main.getConfig().options().copyDefaults();
        ConfigManager.main.saveDefaultConfig();
    }

    public static Boolean getBroadcastToggle(){
        return main.getConfig().getBoolean("BroadcastToServer");
    }

    public static String getCoordsMenuName(){
        return main.getConfig().getString("CordsMenuName");
    }

    public static String getOverworldSelectorName(){
        return main.getConfig().getString("OverworldSelectorName");
    }

    public static String getNetherSelectorName(){
        return main.getConfig().getString("NetherSelectorName");
    }

    public static String getEndSelectorName(){
        return main.getConfig().getString("EndSelectorName");
    }

    public static String getActionMenuName(){
        return main.getConfig().getString("ActionMenuName");
    }

    public static String getActionMenuDelete(){
        return main.getConfig().getString("ActionMenuDelete");
    }

    public static String getActionMenuPrint(){
        return main.getConfig().getString("ActionMenuPrint");
    }

    public static String getDeleteCoordinateMessage(){
        return main.getConfig().getString("DeleteCoordinateMessage");
    }

    public static String getSaveCoordinateMessage(){
        return main.getConfig().getString("SaveCoordinateMessage");
    }

    public static String getPrintCoordinateMessage(){
        return main.getConfig().getString("PrintCoordinateMessage");
    }

    public static String getBorderCustomizationGuiName(){
        return main.getConfig().getString("CustomizeBorderGuiName");
    }

    public static String getAdminCoordsMenuName(){
        return main.getConfig().getString("AdminCoordsMenuName");
    }
}
