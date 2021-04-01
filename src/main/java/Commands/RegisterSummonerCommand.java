package Commands;

import Bot.Main;
import Models.Player;
import org.javacord.api.event.message.MessageCreateEvent;
import org.javacord.api.listener.message.MessageCreateListener;

import java.util.ArrayList;
import java.util.List;

public class RegisterSummonerCommand implements MessageCreateListener {

    List<String> summoners = new ArrayList<>();
    List<String> registrar = new ArrayList<>();
    List<Player> playersList = new ArrayList<>();


    @Override
    public void onMessageCreate(MessageCreateEvent message) {
        if(message.getMessageContent().equalsIgnoreCase(Main.PREFIX + "register")){
            message.getChannel().sendMessage("Please enter your summoner name after !register --> !register Summoner");
        }
        else if (message.getMessageContent().startsWith(Main.PREFIX + "register")) {

            String newSummoner = message.getMessageContent().substring(10).toLowerCase();

            if(summoners.contains(newSummoner)){
                message.getChannel().sendMessage("The summoner name " + newSummoner + " is already registered!");
                return;
            }
            //updateSummonersList(newSummoner);

            String discordID = message.getMessageAuthor().getIdAsString();
            String discordName = message.getMessageAuthor().getName();
            Player newPlayer = new Player(discordID, discordName, newSummoner);

            updatePlayersList(newPlayer);

            //String newRegisterer = message.getMessageAuthor().toString();
            //updateRegistrar(newRegisterer);

            message.getChannel().sendMessage("You are now registered!");
        }
    }

    public void updatePlayersList(Player newPlayer){
        playersList.add(newPlayer);
        System.out.println(playersList);
    }

    private void updateSummonersList(String newSummoner) {
        summoners.add(newSummoner);
        System.out.println(summoners);
    }

    private void updateRegistrar(String newRegisterer) {
        registrar.add(newRegisterer);
        System.out.println(registrar);
    }

    private void clearSummonersList() {
        summoners.clear();
    }

    private void clearRegistrar() {
        registrar.clear();
    }

    private List<String> getSummonersList() {
        return summoners;
    }

    private List<String> getRegistrar() {
        return registrar;
    }
}