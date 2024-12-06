package org.example;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;


/**
 * Hello world!
 *
 */
public class App
{
    private static final Logger log= Logger.getLogger(String.valueOf(App.class));
    public static void main( String[] args )


    {
        System.out.println( "Hello World!" );
        BasicConfigurator.configure();
        log.info("Hello world");
        log.info("we are in logger info mode");
        log.debug("Debug Message");
        log.info("Info message");
        log.warn("warning message");
        log.error("error message");
        log.fatal("fatal error");
        //
        myMethod();
        log.info("after calling method");
        //
    }
    private static void myMethod()
    {
        try {
            throw new Exception("My Exception");
        }
        catch (Exception e){
            log.error("This is an exception"+e);
        }
    }
}
