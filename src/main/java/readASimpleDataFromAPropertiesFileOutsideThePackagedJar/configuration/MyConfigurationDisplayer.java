package readASimpleDataFromAPropertiesFileOutsideThePackagedJar.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class MyConfigurationDisplayer implements ApplicationListener<ApplicationReadyEvent> {
	@Autowired
	MyConfigurationBean myConf;
	
	public void onApplicationEvent(final ApplicationReadyEvent event) {
		System.out.println("Will display the 'myString' value from the application.properties file outside the packaged jar");
		System.out.println(myConf.getMyString());
	}
}