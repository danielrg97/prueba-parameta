package com.parameta.controller;

import com.parameta.controller.ws.client.EmpleadoClient;
import com.parameta.model.entities.Empleado;
import com.parameta.utils.JsonMessage;
import com.parameta.utils.Utilities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class EmpleadoController {

    private Utilities utilities;

    @Autowired
    public EmpleadoController(Utilities utilities){
        this.utilities = utilities;
    }

    @GetMapping("/get-empleado")
    public @ResponseBody Object getEmpleado(@Valid @RequestBody Empleado empleado, BindingResult result){
        if(!result.hasErrors()){
            if(utilities.returnAge(empleado.getFechaNacimiento())<18)  {
                return ResponseEntity.badRequest().body("El empleado debe ser mayor de edad");
            }
            AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(SoapClientConfig.class);
            EmpleadoClient empleadoClient = annotationConfigApplicationContext.getBean(EmpleadoClient.class);
            GetEmpleadoResponse empleadoResponse = empleadoClient.getEmpleado(empleado);
            return empleadoResponse.getEmpleado();
        }
        return ResponseEntity.badRequest().body(utilities.returnEntityErrors(result.getFieldErrors()));
    }
}
