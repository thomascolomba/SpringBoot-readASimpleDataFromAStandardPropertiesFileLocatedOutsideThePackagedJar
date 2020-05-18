How to read a properties from the standard application.properties located outside the packaged jar with Spring Boot.<br/>
<br/>
How to compile and execute :<br/>
mvn package<br/>
java -jar ./target/readASimpleDataFromAStandardPropertiesFileOutsideThePackagedJar-0.0.1-SNAPSHOT.jar<br/>
<br/>
<br/>
---application.properties (in src/main/resources)<br/>
myString=qwerty<br/>
---application.properties (in root project (next to pom.xml))<br/>
myString=qwertyFromOutsideThePackagedJar<br/>
---MyConfigurationBean.java<br/>
private String myString;<br/>
+getter and setter<br/>
---The class who displays the value of the 'myString' configuration<br/>
@Autowired<br/>
MyConfigurationBean myConf;<br/>
...<br/>
System.out.println(myConf.getMyString());<br/>
<br/>
<br/>
The application will read the value 'qwertyFromOutsideThePackagedJar' of the property myString in the standard application.properties file located outside the packaged jar then display it in the terminal.<br/>


