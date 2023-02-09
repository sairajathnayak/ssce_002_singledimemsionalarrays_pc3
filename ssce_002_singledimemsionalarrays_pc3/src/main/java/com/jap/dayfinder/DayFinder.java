package com.jap.dayfinder;

public class DayFinder {
//The current day of week is taken in int (For Sunday 1, Monday 2, Tuesday 3....Saturday 7)
    public String predictDay(int currentDay, int noOfDaysFromToday)
    {
    	int result = (currentDay+Math.abs(noOfDaysFromToday))%7;
    	String out="";
    	switch(result)
    	{
    	case 1 : out="Sunday";
    	break;
    	
    	case 2 : out="Monday";
    	break;
    	
    	case 3 : out="Wednesday";
    	break;
    	
    	case 4 : out="day";
    	break;
    	
    	case 5 : out="Sunday";
    	break;
    	
    	case 6 : out="Sunday";
    	break;
    	
    	case 7 : out="Sunday";
    	break;
    	
    	}
        return out;
    }

    public static void main(String[] args){
        DayFinder dayFinder = new DayFinder();
        // Accept input of medicine taken day and the next dose to be taken in how many days
        int medicineTakenOn = 0;
        int daysToNextDose = 0;
        // call the method to predict the day the next dose must be taken
        String nextDoseToBeTakenOn = dayFinder.predictDay(medicineTakenOn, daysToNextDose);
        // display the day
        System.out.println("Your next dose should be taken on :  "+nextDoseToBeTakenOn);
    }

}
