package Models;

import java.util.ArrayList;
import java.util.List;

public class Player {

    String discordID;
    String discordName;
    String summonerNameRegistered;

    public Player(String discordID, String discordName, String summonerNameRegistered) {
        this.discordID = discordID;
        this.discordName = discordName;
        this.summonerNameRegistered = summonerNameRegistered;
    }

    public String getDiscordID() {
        return discordID;
    }

    public void setDiscordID(String discordID) {
        this.discordID = discordID;
    }

    public String getDiscordName() {
        return discordName;
    }

    public void setDiscordName(String discordName) {
        this.discordName = discordName;
    }

    public String getSummonerNameRegistered() {
        return summonerNameRegistered;
    }

    public void setSummonerNameRegistered(String summonerNameRegistered) {
        this.summonerNameRegistered = summonerNameRegistered;
    }
}
