package com.tws.refactoring;

public class Police {

    public boolean checkDriverBeOfAge(Driver driver) {
        return isAnAdult(driver);
    }

    private boolean isAnAdult(Driver driver){
        return driver.getAge() >= 18;
    }
}
