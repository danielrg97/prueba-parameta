package com.parameta.controller;

import com.parameta.controller.ws.client.EmpleadoClient;
import com.parameta.utils.Constants;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class SoapClientConfig {
    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller jaxb2Marshaller = new Jaxb2Marshaller();
        jaxb2Marshaller.setPackagesToScan(Constants.PACKAGE_TO_SCAN_CLASSES);
        return jaxb2Marshaller;
    }

    @Bean
    public EmpleadoClient articleClient(Jaxb2Marshaller jaxb2Marshaller) {
        EmpleadoClient empleadoClient = new EmpleadoClient();
        empleadoClient.setDefaultUri(Constants.DEFAULT_URI);
        empleadoClient.setMarshaller(jaxb2Marshaller);
        empleadoClient.setUnmarshaller(jaxb2Marshaller);
        return empleadoClient;
    }
}
