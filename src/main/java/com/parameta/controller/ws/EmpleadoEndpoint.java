package com.parameta.controller.ws;

import com.parameta.controller.ws.gen.EmpleadoDto;
import com.parameta.controller.ws.gen.GetEmpleadoRequest;
import com.parameta.controller.ws.gen.GetEmpleadoResponse;
import com.parameta.utils.Constants;
import com.parameta.utils.Utilities;
import com.parameta.model.dao.EmpleadoDAO;
import com.parameta.model.entities.Empleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class EmpleadoEndpoint {

    private EmpleadoDAO empleadoDAO;

    @Autowired
    public EmpleadoEndpoint(EmpleadoDAO empleadoDAO){
        this.empleadoDAO = empleadoDAO;
    }

    @PayloadRoot(namespace = Constants.NAMESPACE_URI, localPart = Constants.ENDPOINT_GET_EMPLEADO_REQUEST)
    @ResponsePayload
    public GetEmpleadoResponse getCountry(@RequestPayload GetEmpleadoRequest request) {
        Empleado empleado = empleadoDAO.save(request.getEmpleado());
        GetEmpleadoResponse response = new GetEmpleadoResponse();
        EmpleadoDto empleadoDto = new EmpleadoDto();
        empleadoDto.setEmpleado(empleado);
        empleadoDto.setEdad(Utilities.returnPeriod(empleado.getFechaNacimiento()));
        empleadoDto.setTiempoVinculacion(Utilities.returnPeriod(empleado.getFechaVinculacion()));

        response.setEmpleado(empleadoDto);

        return response;
    }
}
