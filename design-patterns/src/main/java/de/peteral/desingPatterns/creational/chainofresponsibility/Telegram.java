package de.peteral.desingPatterns.creational.chainofresponsibility;

/**
 * Created by peteral on 06.05.2016.
 */
public class Telegram {
    private final String type;

    public Telegram(String type, String payload) {
        this.type = type;
        this.payload = payload;
    }

    private final String payload;


    public String getType() {
        return type;
    }

    public String getPayload() {
        return payload;
    }
}
