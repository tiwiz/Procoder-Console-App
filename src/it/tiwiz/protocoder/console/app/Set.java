package it.tiwiz.protocoder.console.app;

import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by maneatorgiu on 15/01/14.
 */
public class Set implements Command{

    private boolean startBrowser;



    public Set(boolean startBrowser){
        this.startBrowser = startBrowser;
    }

    @Override
    public void execute() {

        ArrayList<String> commands = new ArrayList<String>();
        commands.add(SET_ROUTE_1);
        //commands.add(SET_ROUTE_2); //not needed most of the times

        if(startBrowser) commands.add(getBrowserCommand());

        ConsoleExecuter executer = new ConsoleExecuter(commands);
        executer.run();

    }

    private String getBrowserCommand(){

        String command;

        //checks if platform is Windows
        String os = System.getProperty("os.name");
        if(os != null && os.startsWith(WIN_ID)){
            command = WINDOWS_COMMAND;
        }else{
            command = UNIX_COMMAND_NEW;
        }
        return command;
    }

}
