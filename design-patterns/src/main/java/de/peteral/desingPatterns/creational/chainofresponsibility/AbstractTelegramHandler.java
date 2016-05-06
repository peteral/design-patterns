package de.peteral.desingPatterns.creational.chainofresponsibility;

/**
 * Created by peteral on 06.05.2016.
 */
public abstract class AbstractTelegramHandler {
    private AbstractTelegramHandler successor;

    public AbstractTelegramHandler getSuccessor() {
        return successor;
    }

    public void setSuccessor(AbstractTelegramHandler successor) {
        this.successor = successor;
    }

    protected abstract boolean processTelegram(Telegram telegram);

    public boolean process(Telegram telegram) {
        if (!processTelegram(telegram))
            if (successor != null)
                return successor.process(telegram);

        return true;
    }
}
