package com.ravi;

public class Grade {
    public String getGrade(double marks) {
        
        if (marks < 0) 
            throw new IllegalArgumentException("Marks cann't be negitive");
        
        if (marks >= 90)
            return "S";
        
        if (marks >= 80)
            return "A";
        
        if (marks >= 70)
            return "B";
        
        if (marks >= 60)
            return "C";
        
        if (marks >= 50)
            return "D";
        
        if (marks >= 40)
            return "E";
        

        else 
            return "F";
    }
}
