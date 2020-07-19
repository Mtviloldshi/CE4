package me.ce4.ce4;

import me.ce4.ce4.command.CE;
import me.ce4.ce4.event.score;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitTask;

public final class CE4 extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new score(), this);
        getCommand("CE").setExecutor(new CE());
        BukkitTask task = new me.ce4.ce4.BukkitRun.shuaxin(this).runTaskTimer(this,0 , 60);





        System.out.println("插件已启动");

        // Plugin startup logic

        if (Bukkit.getPluginManager().getPlugin("PlaceholderAPI") != null) {
            System.out.println("插件已成功启动");
        } else {
            throw new RuntimeException("Could not find PlaceholderAPI!! Plugin can not work without it!");
        }

    }

    @Override
    public void onDisable() {
        System.out.println("插件已关闭");
    }
}
