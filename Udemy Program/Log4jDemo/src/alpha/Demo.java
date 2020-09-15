package alpha;
import org.apache.logging.log4j.*;

public class Demo {

	private static Logger log = LogManager.getLogger(Demo.class.getName());
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		log.info("Demo");
		log.debug("I am Debugging....");
		
		if(5>4)
			log.info("Object is Present");
			log.error("Object is not Present...");
			log.fatal("this is fatal");
	}

}
