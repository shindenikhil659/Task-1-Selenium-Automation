package CourseraAutomation.CourseraAutomation;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EdurekaTest {
    
    @Test
    public void testEdureka() throws InterruptedException {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\shind\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.edureka.co/");
        driver.manage().window().maximize();
        
        // Click on the login button
        WebElement loginButton = driver.findElement(By.xpath("/html/body/header/nav/ul/li[4]/span"));
        loginButton.click();
        
        // Enter email and password
        driver.findElement(By.id("si_popup_email")).sendKeys("shindenikhil659@gmail.com");
        driver.findElement(By.id("si_popup_passwd")).sendKeys("Google@7654");
        
        // Click on the login button in the login popup
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div[2]/div[3]/form/button")).click();
        Thread.sleep(5000); // Wait for login
        
        // Navigate to profile
        driver.navigate().to("https://learning.edureka.co/my-profile");
        
        // Click on edit personal details
        WebElement personalEdit = driver.findElement(By.id("personal_details"));
        personalEdit.click();
        Thread.sleep(7000);
        
        // Enter new full name
        WebElement personalDetails = driver.findElement(By.id("fullName"));
        personalDetails.clear();
        personalDetails.sendKeys("Nikhil");
        
        // Select experience
        WebElement experience = driver.findElement(By.xpath("/html/body/app-root/app-onboarding-user-details/section/div/mat-tab-group/div/mat-tab-body[1]/div/div/div/div[2]/div[1]/div[2]/ngx-select-dropdown"));
        experience.click();
        WebElement experienceInner = driver.findElement(By.xpath("/html/body/app-root/app-onboarding-user-details/section/div/mat-tab-group/div/mat-tab-body[1]/div/div/div/div[2]/div[1]/div[2]/ngx-select-dropdown/div/div/ul[2]/li[2]"));
        experienceInner.click();
        
        // Select industry
        WebElement industry = driver.findElement(By.xpath("/html/body/app-root/app-onboarding-user-details/section/div/mat-tab-group/div/mat-tab-body[1]/div/div/div/div[2]/div[1]/div[3]/ngx-select-dropdown"));
        industry.click();
        WebElement industryInner = driver.findElement(By.xpath("/html/body/app-root/app-onboarding-user-details/section/div/mat-tab-group/div/mat-tab-body[1]/div/div/div/div[2]/div[1]/div[3]/ngx-select-dropdown/div/div/ul[2]/li[5]"));
        industryInner.click();
        
        // Enter designation
        WebElement designation = driver.findElement(By.id("designation"));
        designation.clear();
        designation.sendKeys("Software Testing");
        
        // Save changes
        driver.findElement(By.xpath("/html/body/app-root/app-onboarding-user-details/section/div/mat-tab-group/div/mat-tab-body[1]/div/div/div/button")).click();
        Thread.sleep(5000);
        
        // Logout
        driver.findElement(By.xpath("/html/body/app-root/app-profile-main/app-header/header/nav/div/div[3]/ul/li[6]/div/button")).click();
        driver.findElement(By.xpath("/html/body/app-root/app-profile-main/app-header/header/nav/div/div[3]/ul/li[6]/div/ul/li[9]/a")).click();
        Thread.sleep(5000);
        
        // Navigate to blog page
        driver.navigate().to("https://www.edureka.co/blog/");
        
        // Quit browser
        driver.quit();
    }
}

