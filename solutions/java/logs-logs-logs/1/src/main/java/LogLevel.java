public enum LogLevel {
    TRACE(1),
    DEBUG(2),
    INFO(4),
    WARNING(5),
    ERROR(6),
    FATAL(42),
    UNKNOWN(0);

    private final int levelNumber;

    // Constructor to accept the integer value
    LogLevel(int levelNumber) {
        this.levelNumber = levelNumber;
    }

    // Getter to retrieve the integer value
    public int getLevelNumber() {
        return levelNumber;
    }
}
