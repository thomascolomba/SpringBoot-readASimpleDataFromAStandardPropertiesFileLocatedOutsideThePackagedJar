package readASimpleDataFromAPropertiesFileOutsideThePackagedJar.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties
public class MyConfigurationBean {
    private String myString;
	public String getMyString() {
		return myString;
	}
	public void setMyString(String myString) {
		this.myString = myString;
	}
}