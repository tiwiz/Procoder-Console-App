package it.tiwiz.protocoder.console.app;

/**
 * Created by maneatorgiu on 15/01/14.
 */
public interface Command {

    public static final String[] COMMANDS = {"set","remove","help"};
    public static final String BROWSER_PATH = "http://localhost:8585";
    // Used to identify the windows platform.
    public static final String WIN_ID = "Windows";
    // The default system browser under windows.
    public static final String WIN_PATH = "rundll32";
    // The flag to display a url.
    public static final String WIN_FLAG = "url.dll,FileProtocolHandler";
    // The default browser under unix.
    public static final String UNIX_PATH = "netscape";
    // The flag to display a url.
    public static final String UNIX_FLAG = "-remote openURL";

    //Commands
    public static final String WINDOWS_COMMAND = WIN_PATH + " " + WIN_FLAG + " " + BROWSER_PATH;
    public static final String UNIX_COMMAND_NEW = UNIX_PATH + " " + UNIX_FLAG + "(" + BROWSER_PATH + ")";
    public static final String UNIX_COMMAND_EXISTING = UNIX_PATH + " "  + BROWSER_PATH;

    //ADB
    public static final String SET_ROUTE_1 = "adb forward tcp:8585 tcp:8585";
    public static final String SET_ROUTE_2 = "adb forward tcp:8585 tcp:8587";
    public static final String REMOVE_ROUTE = "adb forward --remove-all";

    public void execute();
}
