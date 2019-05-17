package com.tech.selenium.driverutil;

import com.codeborne.selenide.Configuration;

/**
 * Created by Sridhar Bandi on 17/05/19.
 */
public class DriverFactory {

    public static void setBrowser() {

        String _browserName = System.getProperty("browser", DriverType.CHROME.toString()).toUpperCase();
        DriverType _driverType = DriverType.valueOf(_browserName);

        switch (_driverType) {
            case CHROME:
                System.setProperty("selenide.browser", "chrome");
                break;
            case FIREFOX:
                System.setProperty("selenide.browser", "firefox");
                break;
            case EDGE:
                System.setProperty("selenide.browser", "edge");
                break;
            case IE:
                System.setProperty("selenide.browser", "ie");
                break;
            case OPERA:
                System.setProperty("selenide.browser", "opera");
                break;
            default:
                System.setProperty("selenide.browser", "chrome");
                break;
        }
        Configuration.startMaximized = true;
        Configuration.timeout = 60000;
    }
}
