package com.parameta.model.service;

import com.parameta.controller.EmpleadoDto;
import com.parameta.controller.GetEmpleadoResponse;
import com.parameta.controller.SoapClientConfig;
import com.parameta.controller.ws.client.EmpleadoClient;
import com.parameta.exceptions.AgeException;
import com.parameta.model.entities.Empleado;
import com.parameta.utils.Constants;
import com.parameta.utils.Utilities;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class EmpleadoService {

    public EmpleadoDto getEmpleado(Empleado empleado) throws AgeException {
        if(Utilities.returnAge(empleado.getFechaNacimiento())<18)  {
                throw new AgeException(Constants.AGE_EXCEPTION, true);
        }
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(SoapClientConfig.class);
        EmpleadoClient empleadoClient = annotationConfigApplicationContext.getBean(EmpleadoClient.class);
        GetEmpleadoResponse empleadoResponse = empleadoClient.getEmpleado(empleado);
        return empleadoResponse.getEmpleado();
    }
}
