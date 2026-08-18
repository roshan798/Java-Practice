public class LogLine {
    private String log;
    
    public LogLine(String logLine) {
        this.log = logLine;
    }
    private String getLogLevelOriginal(){
        int start = log.indexOf('[');
        int end = log.indexOf(']');

        if (start != -1 && end != -1 && start < end) {
            return log.substring(start + 1, end); 
        }
        return "";
    }
    public LogLevel getLogLevel() {   
       return switch(getLogLevelOriginal()){
           case "TRC" -> LogLevel.TRACE;
           case "DBG" -> LogLevel.DEBUG;
            case "INF" -> LogLevel.INFO;
            case "WRN" -> LogLevel.WARNING;
          case "ERR" -> LogLevel.ERROR;
          case "FTL" -> LogLevel.FATAL;
          default -> LogLevel.UNKNOWN;
        };
    }

    public String getOutputForShortLog() {
        LogLevel logLevel = getLogLevel();
        int colonIndex = log.indexOf(':');
        return logLevel.getLevelNumber() + ":" + log.substring(colonIndex + 1).trim();
    }
}
