package com.parameta.utils;

public class Constants {
    public static final String ENDPOINT_GET_EMPLEADO_REQUEST = "getEmpleadoRequest";
    public static final String NAMESPACE_URI="http://www.parameta.com/controller/ws/gen";
    public final static String ENTITY_EMPLEADO_NOT_NULL_FIRST_NAME = "Nombre es obligatorio";
    public final static String ENTITY_EMPLEADO_NOT_NULL_FIRST_LAST_NAME = "Primer apellido es obligatorio";
    public final static String ENTITY_EMPLEADO_NOT_NULL_SECOND_LAST_NAME = "Segundo apellido es obligatorio";
    public final static String ENTITY_EMPLEADO_NOT_NULL_DOC_TYPE = "Tipo de documento es obligatorio";
    public final static String ENTITY_EMPLEADO_NOT_NULL_DOC_NUM = "Numero de documento es obligatorio";
    public final static String ENTITY_EMPLEADO_NOT_NULL_BIRTH_DATE = "Fecha de nacimiento es obligatorio";
    public final static String ENTITY_EMPLEADO_NOT_NULL_VINCULATION_DATE = "Fecha de vinculacion es obligatorio";
    public final static String ENTITY_EMPLEADO_NOT_NULL_POSITION = "Cargo es obligatorio";
    public final static String ENTITY_EMPLEADO_NOT_NULL_SALARY = "Salario es obligatorio";
    public static final String TABLE_NAME = "T01_EMPLEADO";
    public static final String TABLE_ID = "T01_ID";
    public static final String TABLE_FIRST_NAME = "T01_NOMBRE1";
    public static final String TABLE_MIDDLE_NAME = "T01_NOMBRE2";
    public static final String TABLE_FIRST_LAST_NAME = "T01_APELLIDO1";
    public static final String TABLE_SECOND_LAST_NAME = "T01_APELLIDO2";
    public static final String TABLE_DOC_TYPE = "T01_TIPO_DOCUMENTO";
    public static final String TABLE_DOC_NUM = "T01_NUMERO_DOCUMENTO";
    public static final String TABLE_BIRTH_DATE = "T01_FECHA_NACIMIENTO";
    public static final String TABLE_VINCULATION_DATE = "T01_FECHA_VINCULACION";
    public static final String TABLE_POSITION = "T01_CARGO";
    public static final String TABLE_SALARY = "T01_SALARIO";
    public static final String FORMAT_STRING_PERIOD = "%s años, %s meses y %s días";
    public static final String WSDL_NAME = "empleadosWsdl";
    public static final String WSDL_PORT_TYPE_NAME = "EmpleadoPort";
    public static final String LOCATION_URI = "/ws";
    public static final String SERVLET_REGISTRATION_BEAN_MAPPING = "/ws/*";
    public static final String XSD_PATH = "Empleado.xsd";
}
