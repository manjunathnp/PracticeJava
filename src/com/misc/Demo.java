package com.misc;

interface WebDriver{
    void get();
    void close();
}

class ChromeDriver implements WebDriver{
    public void get(){
        System.out.println("Launches browser");
    }

    public void close(){
        System.out.println("Closes the browser");
    }
}




public class Demo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get();
        driver.close();
    }
}
