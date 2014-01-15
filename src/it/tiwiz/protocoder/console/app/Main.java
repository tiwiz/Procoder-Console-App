package it.tiwiz.protocoder.console.app;

public class Main {

    public static void main(String[] args) {

        Command command = buildCommand(args);
        command.execute();

    }

    private static Command buildCommand(String[] args){

        Command command;

        if(args.length == 0) command = new PrintHelp();
        else{
            int len = args.length;

            if(args[0].equalsIgnoreCase(Command.COMMANDS[0])){
                boolean startBrowser = false;
                if(len > 1){
                    if(args[1].equalsIgnoreCase("0"))
                        startBrowser = true;
                }
                command = new Set(startBrowser);
            }else if(args[0].equalsIgnoreCase(Command.COMMANDS[1])){
                command = new Remove();
            }else{
                command = new PrintHelp();
            }
        }

        return command;
    }

}
