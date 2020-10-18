# SeleniumGridProject
Selenium Grid project using Java. 

<ins>Commands for parallel testing using hub and nodes<ins>

`java -jar selenium-server-standalone-3.141.59.jar -role hub`

`java -Dwebdriver.gecko.driver="</path/to/driver>/geckodriver.exe" -jar selenium-server-standalone-3.141.59.jar -role webdriver -hub http://192.168.8.159:4444/grid/register/`

`java -Dwebdriver.chrome.driver="</path/to/driver>/chromedriver.exe" -jar selenium-server-standalone-3.141.59.jar -role webdriver -hub http://192.168.8.159:4444/grid/register/`
