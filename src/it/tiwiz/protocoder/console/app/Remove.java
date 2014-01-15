package it.tiwiz.protocoder.console.app;

import java.util.ArrayList;

/**
 * Created by maneatorgiu on 15/01/14.
 */
public class Remove implements Command{
    @Override
    public void execute() {
        ArrayList<String> commands = new ArrayList<String>();
        commands.add(REMOVE_ROUTE);

        ConsoleExecuter executer = new ConsoleExecuter(commands);
        executer.run();
    }
}
