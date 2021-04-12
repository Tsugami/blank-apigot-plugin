package me.yslanramos.blankplugin;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
  final static String pluginName = "BlankPlugin";

  private void sendConsoleMessage (String message) {
    Bukkit.getConsoleSender().sendMessage(message);
  }

  @Override
  public void onEnable() {
    sendConsoleMessage(ChatColor.GREEN + pluginName + " enabled!");
  }

  @Override
  public void onDisable() {
    sendConsoleMessage(ChatColor.RED + pluginName + " disabled!");
  }
}
