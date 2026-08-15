public class LogLevels {
    
    public static String message(String logLine) {
        int startIndex = logLine.indexOf(":");
        if(startIndex!=-1) {
            return logLine.substring(startIndex + 1).trim();
        }
        return "";
    }

    public static String logLevel(String logLine) {
        int startIndex = logLine.indexOf("[");
        int end = logLine.indexOf("]");
        if(startIndex !=-1 && end!=-1) {
            return logLine.substring(startIndex + 1,end).toLowerCase();
        }
        return "";
    }

    public static String reformat(String logLine) {
        return message(logLine) + " (" +logLevel(logLine) +")";
    }
}
