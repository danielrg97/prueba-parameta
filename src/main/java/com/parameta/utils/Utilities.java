package com.parameta.utils;


import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

public class Utilities {

    public static String returnPeriod(Date date){
        LocalDate fechaNac = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate ahora = LocalDate.now();

        Period period = Period.between(fechaNac, ahora);

        return String.format(Constants.FORMAT_STRING_PERIOD, period.getYears(), period.getMonths(), period.getDays());
    }
}
