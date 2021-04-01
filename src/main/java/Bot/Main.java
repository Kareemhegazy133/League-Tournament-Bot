package Bot;

import Commands.RegisterSummonerCommand;
import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;

public class Main {

    public static final String PREFIX = "!";

    public static void main(String[] args){
        DiscordApi Bot = new DiscordApiBuilder().setToken("ODI2MjQ0ODIxMzg3NTc1MzI2.YGJqdA.QF1Gs8WXGQWFs9PtHviycGY_Yg0").login().join();

        Bot.addMessageCreateListener(event -> {
            if (event.getMessageContent().equalsIgnoreCase("!ping")) {
                System.out.println(event.getMessageAuthor().getName());
                event.getChannel().sendMessage("Pong!");
            }
        });

        Bot.addListener(new RegisterSummonerCommand());
    }
}
