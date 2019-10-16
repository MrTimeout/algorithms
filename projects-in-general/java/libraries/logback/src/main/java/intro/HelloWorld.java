
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;

public class HelloWorld
{
    private static Logger logger = LoggerFactory.getLogger(HelloWorld.class.getCanonicalName());
    private static LoggerContext loggerCtx = (LoggerContext) LoggerFactory.getLogger(HelloWorld.class.getCanonicalName());

    public static void main(String... args)
    {
        logger.info("Hello world!");

        StatusPrinter.print(loggerCtx);
    }
}
