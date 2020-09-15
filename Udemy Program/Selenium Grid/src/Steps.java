
/*
Stpes -

1. Download Selenium Server jars
2. Started the hub from command prompt
		java -jar selenium-server-standalone-3.141.jar -role hub
3. Login to another machine and register it as node for hub
	3.1 download the selenium server jar in node machine as well
	3.2 java -jar selenium-server-standalone-3.141.jar -role webdriver -hub >ipaddress>/grid/register -port 5566

	(Note : check if java is configuered in system variables)

4. pass chromedriver.exe file to node for chromebrowser similarly for other browsers for this do following
	4.1 download chromedriver.exe on node machine
	4.2 open command prompt pass below 
		java -Dwebdriver.chrome.driver="path to chromedriver.exe" -jar selenium-server-standalone-3.141.jar -role webdriver -hub >ipaddress>/grid/register -port 5566

*/
		