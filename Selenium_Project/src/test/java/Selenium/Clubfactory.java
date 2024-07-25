package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Clubfactory {

    private static List<String> testReport = new ArrayList<>();

    public static void log(String message, boolean passed) {
        testReport.add((passed ? "PASSED: " : "FAILED: ") + message);
    }

    public static boolean isValidEmail(String email) {
        return email.contains("@") && email.contains(".");
    }

    public static boolean isValidPhoneNumber(String phone) {
        return phone.matches("\\d{10}");
    }

    public static boolean isValidCreditCardNumber(String cardNumber) {
        return cardNumber.matches("\\d{16}");
    }

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            driver.get("https://theclubfactory.in/");
            Thread.sleep(3000); // Wait for the page to load
            log("Opened website", true);
        } catch (Exception e) {
            log("Failed to open website: " + e.getMessage(), false);
        }

        try {
            driver.findElement(By.xpath("//a[@class='header__action-item-link hidden-pocket hidden-lap']")).click();
            Thread.sleep(3000);
            log("Clicked login link", true);
        } catch (Exception e) {
            log("Failed to click login link: " + e.getMessage(), false);
        }

        try {
            WebElement usernameField = driver.findElement(By.id("customer[email]"));
            WebElement passwordField = driver.findElement(By.id("customer[password]"));
            String email = "karnank919@gmail.com";
            String password = "9042737202";
            if (!isValidEmail(email)) {
                log("Invalid email ID: " + email, false);
                return;
            }
            usernameField.sendKeys(email);
            Thread.sleep(5000);
            passwordField.sendKeys(password);
            Thread.sleep(5000);
            log("Entered login credentials", true);
        } catch (Exception e) {
            log("Failed to enter login credentials: " + e.getMessage(), false);
        }

        try {
            WebElement loginButton = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
            loginButton.click();
            Thread.sleep(3000);
            log("Clicked login button", true);
        } catch (Exception e) {
            log("Failed to click login button: " + e.getMessage(), false);
        }

        try {
            WebElement searchBox = driver.findElement(By.xpath("//input[@placeholder='Search...']"));
            searchBox.sendKeys("watch");
            Thread.sleep(3000);
            searchBox.submit();
            Thread.sleep(3000);
            log("Searched for 'watch'", true);
        } catch (Exception e) {
            log("Failed to search for 'watch': " + e.getMessage(), false);
        }

        try {
            driver.findElement(By.xpath("//a[contains(text(),'Smart Watch Series 7 | Logo Smart Watch | Infinity')]")).click();
            Thread.sleep(3000);
            log("Selected product", true);
        } catch (Exception e) {
            log("Failed to select product: " + e.getMessage(), false);
        }

        try {
            driver.findElement(By.xpath("//button[@title='Increase quantity by 1']")).click();
            Thread.sleep(3000);
            log("Increased quantity", true);
        } catch (Exception e) {
            log("Failed to increase quantity: " + e.getMessage(), false);
        }

        try {
            driver.findElement(By.xpath("//button[normalize-space()='Add to cart']")).click();
            Thread.sleep(3000);
            log("Added to cart", true);
        } catch (Exception e) {
            log("Failed to add to cart: " + e.getMessage(), false);
        }

        try {
            driver.findElement(By.xpath("//a[@class='button button--secondary']")).click();
            Thread.sleep(3000);
            log("Proceeded to cart", true);
        } catch (Exception e) {
            log("Failed to proceed to cart: " + e.getMessage(), false);
        }

        try {
            driver.findElement(By.xpath("//button[@name='checkout']")).click();
            Thread.sleep(3000);
            log("Clicked checkout", true);
        } catch (Exception e) {
            log("Failed to click checkout: " + e.getMessage(), false);
        }

        try {
            driver.findElement(By.xpath("//span[@class='_1fragemqz _1fragem2d _1fragemn2 _1fragemmx a8x1wug _1fragem2i a8x1wup a8x1wul a8x1wuy']//*[name()='svg']")).click();
            Thread.sleep(3000);
            log("Clicked checkout (step 2)", true);
        } catch (Exception e) {
            log("Failed to click checkout (step 2): " + e.getMessage(), false);
        }

        try {
            driver.findElement(By.xpath("//button[@class='cart-recap__note-button']")).click();
            Thread.sleep(3000);
            log("Clicked note button", true);
        } catch (Exception e) {
            log("Failed to click note button: " + e.getMessage(), false);
        }

        try {
            WebElement noteTextArea = driver.findElement(By.xpath("//textarea[@name='note']"));
            noteTextArea.sendKeys("Send Product to this location ");
            Thread.sleep(3000);
            driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
            Thread.sleep(3000);
            log("Added note and saved", true);
        } catch (Exception e) {
            log("Failed to add note and save: " + e.getMessage(), false);
        }

        try {
            driver.findElement(By.xpath("//button[@name='checkout']")).click();
            Thread.sleep(3000);
            log("Clicked checkout (step 3)", true);
        } catch (Exception e) {
            log("Failed to click checkout (step 3): " + e.getMessage(), false);
        }

        try {
            WebElement emailField = driver.findElement(By.xpath("//input[@id='email']"));
            emailField.sendKeys("karnank919@gmail.com");
            Thread.sleep(3000);
            WebElement firstNameField = driver.findElement(By.xpath("//input[@id='TextField0']"));
            firstNameField.sendKeys("Karnan");
            Thread.sleep(3000);
            WebElement lastNameField = driver.findElement(By.xpath("//input[@id='TextField1']"));
            lastNameField.sendKeys("K");
            Thread.sleep(3000);
            WebElement addressField = driver.findElement(By.xpath("//input[@id='TextField2']"));
            addressField.sendKeys("123 Main St");
            Thread.sleep(3000);
            WebElement cityField = driver.findElement(By.xpath("//input[@id='TextField4']"));
            cityField.sendKeys("Benguluru");
            Thread.sleep(3000);
            WebElement postalCodeField = driver.findElement(By.xpath("//input[@id='TextField5']"));
            postalCodeField.sendKeys("560091");
            Thread.sleep(3000);
            WebElement phoneField = driver.findElement(By.xpath("//input[@id='TextField6']"));
            String phone = "7795375472";
            if (!isValidPhoneNumber(phone)) {
                log("Invalid phone number: " + phone, false);
                return;
            }
            phoneField.sendKeys(phone);
            Thread.sleep(3000);
            driver.findElement(By.xpath("//input[@id='save_shipping_information']")).click();
            Thread.sleep(3000);
            log("Entered shipping information", true);
        } catch (Exception e) {
            log("Failed to enter shipping information: " + e.getMessage(), false);
        }

        try {
            WebElement creditCardOption = driver.findElement(By.xpath("//*[@id=\"basic-creditCards\"]"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", creditCardOption);
            wait.until(ExpectedConditions.elementToBeClickable(creditCardOption));
            creditCardOption.click();
            Thread.sleep(3000);
            log("Selected credit card payment option", true);
        } catch (Exception e) {
            log("Failed to select credit card payment option: " + e.getMessage(), false);
        }

        try {
            WebElement cardNumberField = driver.findElement(By.id("number"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", cardNumberField);
            wait.until(ExpectedConditions.elementToBeClickable(cardNumberField));
            String cardNumber = "4111111111111111";
            if (!isValidCreditCardNumber(cardNumber)) {
                log("Invalid credit card number: " + cardNumber, false);
                return;
            }
            cardNumberField.sendKeys(cardNumber);
            Thread.sleep(3000);
            log("Entered card number", true);
        } catch (Exception e) {
            log("Failed to enter card number: " + e.getMessage(), false);
        }

        try {
            WebElement expiryDateField = driver.findElement(By.id("expiry"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", expiryDateField);
            wait.until(ExpectedConditions.elementToBeClickable(expiryDateField));
            expiryDateField.sendKeys("11");
            Thread.sleep(1000);
            expiryDateField.sendKeys("11");
            Thread.sleep(1000);
            log("Entered expiry date", true);
        } catch (Exception e) {
            log("Failed to enter expiry date: " + e.getMessage(), false);
        }

        try {
            WebElement discount = driver.findElement(By.id("ReductionsInput0"));
            discount.sendKeys("7795375472");
            Thread.sleep(3000);
            log("Entered discount code", true);
        } catch (Exception e) {
            log("Failed to enter discount code: " + e.getMessage(), false);
        }

        try {
            WebElement footer = driver.findElement(By.xpath("/html"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", footer);
            Thread.sleep(1000);
            log("Scrolled to footer", true);
        } catch (Exception e) {
            log("Failed to scroll to footer: " + e.getMessage(), false);
        }

        try {
            WebElement checkoutButton = driver.findElement(By.xpath("//span[@class='_1fragemqz _1fragem2d _1fragemn2 _1fragemmx a8x1wug _1fragem2i a8x1wup a8x1wul a8x1wuy']//*[name()='svg']"));
            checkoutButton.click();
            Thread.sleep(3000);
            log("Clicked final checkout button", true);
        } catch (Exception e) {
            log("Failed to click final checkout button: " + e.getMessage(), false);
        }

        try {
            WebElement home = driver.findElement(By.xpath("//a[@class='nav-bar__link link'][normalize-space()='Home']"));
            home.click();
            Thread.sleep(3000);
            log("Navigated to home", true);
        } catch (Exception e) {
            log("Failed to navigate to home: " + e.getMessage(), false);
        } finally {
            driver.quit(); // Ensure the browser is closed after the test
            generateReport();
        }
    }

    private static void generateReport() {
        try (FileWriter writer = new FileWriter("test_report.txt")) {
            for (String entry : testReport) {
                writer.write(entry + "\n");
            }
            System.out.println("Test report generated successfully.");
            // Print the test report to the console
            for (String entry : testReport) {
                System.out.println(entry);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
