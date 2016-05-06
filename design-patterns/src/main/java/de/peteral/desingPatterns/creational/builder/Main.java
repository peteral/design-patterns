package de.peteral.desingPatterns.creational.builder;

/**
 * Created by peteral on 06.05.2016.
 */
public class Main {

    public static void main(String... params) {
        AbstractTelegramHandler chain = new TelegramChainBuilder()
                .append(new HelloTelegramHandler())
                .append(new UnknownTelegramHandler()).build();

        chain.process(new Telegram("Hello", "world..."));
    }
}
