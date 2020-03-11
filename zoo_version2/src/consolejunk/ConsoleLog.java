package consolejunk;

import consolejunk.Console;

public class ConsoleLog implements Console {
    @Override
    public void logger(String message) {
        System.err.println("[ACT] " + message);
    }
}
