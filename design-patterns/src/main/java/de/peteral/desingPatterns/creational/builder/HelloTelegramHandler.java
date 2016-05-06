package de.peteral.desingPatterns.creational.builder;

/**
 * Created by peteral on 06.05.2016.
 */
public class HelloTelegramHandler extends AbstractTelegramHandler {

    @Override
    public boolean processTelegram(Telegram telegram) {
        if ("Hello".equalsIgnoreCase(telegram.getType())) {
            System.out.println("Hello telegram: " + telegram.getPayload());
            return true;
        }

        return false;
    }
}
