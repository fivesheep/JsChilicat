package net.chilicat.testenv.webdriver;

/**
 * Copyright (c) 2010 <chilicat>
 * <p/>
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * <p/>
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * <p/>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 * <p/>
 * User: Chilicat
 * Date: 13.11.2010
 * Time: 15:27:51
 */
public class WebDriverWrapper implements WebDriver {
    private final org.openqa.selenium.WebDriver driver;
    private final Runnable run;

    public WebDriverWrapper(org.openqa.selenium.WebDriver driver) {
        this(driver, null);
    }

    public WebDriverWrapper(org.openqa.selenium.WebDriver driver, Runnable run) {
        this.driver = driver;
        this.run = run;
    }

    public void close() {
        driver.close();

        if (run != null) {
            run.run();
        }
    }

    public void get(String location) {
        driver.get(location);
    }


}
