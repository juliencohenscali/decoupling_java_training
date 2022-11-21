package fr.lernejo.logger;

public class CompositeLogger implements  Logger{

    FileLogger fileLogger;
    ConsoleLogger consoleLogger;

    public CompositeLogger(FileLogger fileLogger, ConsoleLogger consoleLogger){
        this.fileLogger = fileLogger;
        this.consoleLogger = consoleLogger;
    }
    @Override
    public void log(String message) {
        fileLogger.log(message);
        consoleLogger.log(message);
    }
}
