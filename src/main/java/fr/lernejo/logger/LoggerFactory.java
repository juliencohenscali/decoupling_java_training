package fr.lernejo.logger;

public class LoggerFactory {
    public static CompositeLogger getLogger(String name){
        return new CompositeLogger(new FileLogger("/tmp/" + name), new ConsoleLogger());
    }
}
