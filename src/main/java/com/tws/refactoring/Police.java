package com.tws.refactoring;

public class Police {

    public boolean checkDriverBeOfAge(Driver driver) {
        if(isAnAdult(driver)) return true;
        else return false;
    }

    private boolean isAnAdult(Driver driver){
        return driver.getAge() >= 18;
    }
}
