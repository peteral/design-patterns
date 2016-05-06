package de.peteral.desingPatterns.creational.builder;

/**
 * Created by peteral on 06.05.2016.
 */
public class UnknownTelegramHandler extends AbstractTelegramHandler {
    @Override
    protected boolean processTelegram(Telegram telegram) {
        System.out.println("Unknown telegram type: " + telegram.getType());

        return true;
    }
}
