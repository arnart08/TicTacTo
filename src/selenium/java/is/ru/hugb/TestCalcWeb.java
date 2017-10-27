package is.ru.hugb.calcWeb;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;

public class TestCalcWeb extends SeleniumTestWrapper {
  @Test
  public void testTitleMatches() {
    driver.get(baseUrl);
    assertEquals("Tic Tac Toe", driver.getTitle());
  }

  @Test
  public void testSimpleAdd() throws Exception {
    driver.get(baseUrl);
    /* Remove Thread.sleep... */
    Thread.sleep(2000);
    WebElement input = driver.findElement(By.id("number"));
    input.sendKeys("1");
    /* Remove Thread.sleep... */
    Thread.sleep(2000);
    input.sendKeys(Keys.RETURN);
    Thread.sleep(2000);
    /* ... finish test! */
  }

@Test
  public void testSimpleAdds() throws Exception {
    driver.get(baseUrl);
    /* Remove Thread.sleep... */
    Thread.sleep(2000);
    WebElement input = driver.findElement(By.id("number"));
    input.sendKeys("a,b,c");
    /* Remove Thread.sleep... */
    Thread.sleep(2000);
    input.sendKeys(Keys.RETURN);
    Thread.sleep(2000);
    assertEquals("Error, Illegal string...", driver.findElement(By.id("results")).getText());
    /* ... finish test! */
  }
  
  @Test
  public void testString() throws Exception {
    driver.get(baseUrl);
    Thread.sleep(2000);
    WebElement input = driver.findElement(By.id("number"));
    input.sendKeys("1");
    input.sendKeys(Keys.RETURN);
    Thread.sleep(2000);
    assertEquals("1 = 1", driver.findElement(By.id("results")).getText());
  }
}
