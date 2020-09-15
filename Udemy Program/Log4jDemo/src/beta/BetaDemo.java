package beta;
import org.apache.logging.log4j.*;

public class BetaDemo {

	private static Logger log = LogManager.getLogger(BetaDemo.class.getName());
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		log.info("BetaDemo");
		log.debug("I am Debugging....");
		
		if(5>4)
			log.info("BetaDemo is Present");
			log.error("BetaDemo is not Present...");
			log.fatal("BetaDemo is fatal");
	}

}
