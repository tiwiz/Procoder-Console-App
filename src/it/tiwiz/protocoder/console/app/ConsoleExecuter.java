package it.tiwiz.protocoder.console.app;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by maneatorgiu on 15/01/14.
 */
public class ConsoleExecuter implements Runnable{

    private ArrayList<String> commands;
    private int commandsLen;

    public ConsoleExecuter(ArrayList<String> commands){

        this.commands = commands;
        commandsLen = commands.size();

    }

    @Override
    public void run() {

        Process process;
        Runtime runtime = Runtime.getRuntime();
        int exitCode = 0;

        for(int i = 0; i < commandsLen; i++){
            try {
                process = runtime.exec(commands.get(i));
                exitCode = process.waitFor();
            } catch (Exception e) {
                System.out.println("Error while executing: " + commands.get(i));
            }
        }

        if(commandsLen > 2){
            if(exitCode != 0 && commands.get(2).equalsIgnoreCase(Command.UNIX_COMMAND_NEW))
                try {
                    runtime.exec(Command.UNIX_COMMAND_EXISTING);
                } catch (IOException e) {
                    System.out.println("Error while opening default browser");
                }

        }
    }
}
