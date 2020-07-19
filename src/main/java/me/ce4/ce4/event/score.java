package me.ce4.ce4.event;

import me.clip.placeholderapi.PlaceholderAPI;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.scoreboard.*;

public class score implements Listener {
    @EventHandler
    public void onJoin(PlayerJoinEvent event){
        Player player = (Player) event.getPlayer();
        ScoreboardManager scoreboardManager = Bukkit.getScoreboardManager();
        Scoreboard scoreboard = scoreboardManager.getNewScoreboard();
        Objective objective = scoreboard.registerNewObjective("战斗力排行榜" , "dummy");
        objective.setDisplaySlot(DisplaySlot.SIDEBAR);
        String hp = "%player_health%";
        hp = PlaceholderAPI.setPlaceholders(player, hp);
        Score a = objective.getScore("欢迎来到服务器" + hp);
        a.setScore(1);
        player.setScoreboard(scoreboard);

    }


}
