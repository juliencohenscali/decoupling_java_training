package fr.lernejo.logger;

public class LoggerFactory {
    Logger getLogger(String name){
        return new ConsoleLogger();
    }
}
