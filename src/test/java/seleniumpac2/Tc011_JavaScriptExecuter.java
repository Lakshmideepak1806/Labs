package seleniumpac2;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tc011_JavaScriptExecuter {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=14467275428233522536&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007741&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1");
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("alert('Hello');");
	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
}
}
