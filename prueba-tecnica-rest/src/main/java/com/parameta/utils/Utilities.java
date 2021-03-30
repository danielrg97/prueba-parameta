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
    public String returnEntityErrors(List<FieldError> errorList){
        StringBuilder builder = new StringBuilder();
        List<FieldError> errors = errorList;
        for (FieldError error : errors ) {
            builder.append(error.getField() + " : " + error.getDefaultMessage());
        }
        return builder.toString();
    }
    public int returnAge(Date birthdate){
        LocalDate fechaNac = birthdate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate ahora = LocalDate.now();

        Period period = Period.between(fechaNac, ahora);
        return period.getYears();
    }
}
