import org.openqa.selenium.*;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

/**
 * Created by Andre Luo on 12/5/2016.
 */
public class Main {

    public static void main(String[] args) {
        System.setProperty("webdriver.ie.driver", "C:\\Users\\aluo\\Downloads\\IEDriverServer_x64_2.53.1\\IEDriverServer.exe");

        // declaration and instantiation of objects/variables
        WebDriver driver = new InternetExplorerDriver();


        /*
        // Test 1
        // And now use this to visit Google
        driver.get("http://www.google.com");
        // Alternatively the same thing can be done like this
        // driver.navigate().to("http://www.google.com");

        // Check the title of the page
        System.out.println("Page title is: " + driver.getTitle());

        // Find the text input element by its name
        WebElement element = driver.findElement(By.name("q"));

        // Enter something to search for
        element.sendKeys("Cheese!");

        // Now submit the form. WebDriver will find the form for us from the element
        element.submit();

        // Google's search is rendered dynamically with JavaScript.
        // Wait for the page to load, timeout after 10 seconds
        (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getTitle().toLowerCase().startsWith("cheese!");
            }
        });

        // Should see: "cheese! - Google Search"
        System.out.println("Page title is: " + driver.getTitle());

        System.out.print("Test Passed!");

        //Close the browser
        driver.quit();*/

        /*//Test 2
        String baseUrl = "http://newtours.demoaut.com";
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";

        // launch Firefox and direct it to the Base URL
        driver.get(baseUrl);

        // get the actual value of the title
        actualTitle = driver.getTitle();


         * compare the actual title of the page witht the expected one and print
         * the result as "Passed" or "Failed"

        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }

        //close Firefox
        driver.close();

        // exit the program explicitly
        System.exit(0);*/


        /*String alertMessage = "";
        driver.get("http://jsbin.com/usidix/1");
        driver.findElement(By.cssSelector("input[value=\"Go!\"]")).click();
        alertMessage = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();

        System.out.println(alertMessage);*/
        //driver.quit();  // using QUIT all windows will close


        /*driver.get("http://demo.guru99.com/selenium/deprecated.html");
        driver.switchTo().frame("classFrame");
        driver.findElement(By.linkText("Deprecated")).click();
        driver.quit();*/


        /*driver.get("http://demo.guru99.com/selenium/deprecated.html");
        WebDriverWait myWaitVar = new WebDriverWait(driver, 10);
        myWaitVar.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("classFrame"));

        driver.findElement(By.linkText("Deprecated")).click();

        try {
            WebElement txtbox_username = driver.findElement(By.id("username"));
            if(txtbox_username.isEnabled()){
                txtbox_username.sendKeys("tutorial");
            }
        } catch(NoSuchElementException nsee){
            System.out.println(nsee.toString());
        }*/


        /*driver.get("http://output.jsbin.com/osebed/2");
        Select fruits = new Select(driver.findElement(By.id("fruits")));
        fruits.selectByVisibleText("Apple");

        if(fruits.isMultiple()) {
            System.out.println("This drop down element allows multiple selections.");
            fruits.selectByValue("orange");
            System.out.println("It's time to deselect all.");
            fruits.deselectAll();
        }*/


        /*List<WebElement> listOfWebElement = driver.findElements(By.tagName("a"));

        for (WebElement element : listOfWebElement) {
            element.click();

            if(driver.getTitle().equals("something")) {

            } else {

            }

            driver.navigate().back();
        }*/

        driver.get("http://www.facebook.com");

        Actions actionsBuilder = new Actions(driver);
        WebElement emailName = driver.findElement(By.id("email"));
        Action mouseOverHome = actionsBuilder.moveToElement(emailName)
                .click()
                .keyDown(emailName, Keys.SHIFT)
                .sendKeys(emailName, "hello")
                .keyUp(emailName, Keys.SHIFT)
                .doubleClick(emailName)
                .contextClick()
                .build();
        mouseOverHome.perform();
    }
}
