public class LogLevels {

    public static String[] splitLog(String log){
        return log.split(":");
    }
    public static String message(String logLine) {
        String[] messages = splitLog(logLine);
        return messages[1].trim();
    }

    public static String logLevel(String logLine) {
       String[] messages = splitLog(logLine);
        return messages[0].substring(1, messages[0].length()-1).toLowerCase();
    }

    public static String reformat(String logLine) {
        String str = String.format("%s (%s)", message(logLine), logLevel(logLine));
       return str;
    }
}
