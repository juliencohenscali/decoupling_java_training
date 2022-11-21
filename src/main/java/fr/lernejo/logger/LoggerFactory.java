package fr.lernejo.logger;

public class LoggerFactory {
    public static FileLogger getLogger(String name){
        return new FileLogger("/tmp/" + name);
    }
}
