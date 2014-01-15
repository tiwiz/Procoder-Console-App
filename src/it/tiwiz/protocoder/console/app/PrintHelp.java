package it.tiwiz.protocoder.console.app;

/**
 * Created by maneatorgiu on 15/01/14.
 */
public class PrintHelp implements Command{
    @Override
    public void execute() {
        StringBuilder builder = new StringBuilder("Usage:\n\n");
        builder.append("pca ");
        builder.append(COMMANDS[0]);
        builder.append(" <s>\t\tSets TCP loopback and, if s is equal to 0, starts browser on Protocoder, doesn't start it otherwise.\n");
        builder.append("pca ");
        builder.append(COMMANDS[1]);
        builder.append("\t\tRemoves all TCP loopbacks\n");
        builder.append("pca ");
        builder.append(COMMANDS[2]);
        builder.append("\t\tShows this screen");

        System.out.println(builder.toString());
    }
}
