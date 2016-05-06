package de.peteral.desingPatterns.creational.chainofresponsibility;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by peteral on 06.05.2016.
 */
public class TelegramChainBuilder {
    List<AbstractTelegramHandler> handlers = new ArrayList<>();

    public AbstractTelegramHandler build() {
        for (int i=0; i<handlers.size() - 2; i++)
            handlers.get(i).setSuccessor(handlers.get(i+1));

        return handlers.get(0);
    }

    public TelegramChainBuilder append(AbstractTelegramHandler handler) {
        handlers.add(handler);

        return this;
    }
}
