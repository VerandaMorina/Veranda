package class23;

public interface WebDriver {
    void openBrowser();
    void closeBrowser();
    void maxBrowser();
    void findElement();
}
class ChromeDriver implements WebDriver{
    @Override
    public void openBrowser() {
        System.out.println("Opening chrome");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing chrome");
    }

    @Override
    public void maxBrowser() {
        System.out.println("Max chrome");
    }

    @Override
    public void findElement() {
        System.out.println("Find element in browser");
    }
}
class FirefoxDriver implements WebDriver{
    @Override
    public void openBrowser() {
        System.out.println("Open firefox");
    }

    @Override
    public void maxBrowser() {
        System.out.println("Max firefox");
    }

    @Override
    public void findElement() {
        System.out.println("Find element in firefox");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Close firefox");
    }
}
