package com.parameta.utils;

import org.springframework.stereotype.Component;
import org.springframework.validation.FieldError;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

@Component
public class Utilities {

    public String returnPeriod(Date date){
        LocalDate fechaNac = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate ahora = LocalDate.now();

        Period period = Period.between(fechaNac, ahora);
        System.out.printf("Periodo de tiempo es: %s años, %s meses y %s días",
                period.getYears(), period.getMonths(), period.getDays());
        return String.format("%s años, %s meses y %s días", period.getYears(), period.getMonths(), period.getDays());
    }
}
