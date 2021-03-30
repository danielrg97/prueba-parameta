package com.parameta.controller.ws.client;

import com.parameta.controller.GetEmpleadoRequest;
import com.parameta.controller.GetEmpleadoResponse;
import com.parameta.model.entities.Empleado;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

public class EmpleadoClient extends WebServiceGatewaySupport {
    public GetEmpleadoResponse getEmpleado(Empleado empleado) {
        GetEmpleadoRequest request = new GetEmpleadoRequest();
        request.setEmpleado(empleado);
        GetEmpleadoResponse response = (GetEmpleadoResponse) getWebServiceTemplate().marshalSendAndReceive(request);
        return response;
    }
}
