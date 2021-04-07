package com.parameta.model.entities;

import com.parameta.utils.Constants;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.Date;

@Entity
@Table(name = Constants.TABLE_NAME)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "empleado", propOrder = {
        "id",
        "primerNombre",
        "segundoNombre",
        "primerApellido",
        "segundoApellido",
        "tipoDocumento",
        "numeroDocumento",
        "fechaNacimiento",
        "fechaVinculacion",
        "cargo",
        "salario"
})
public class Empleado {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = Constants.TABLE_ID)
    @XmlElement(required = true)
    private Integer id;

    @Column(name = Constants.TABLE_FIRST_NAME)
    @NotBlank(message = Constants.ENTITY_EMPLEADO_NOT_NULL_FIRST_NAME)
    @XmlElement(required = true)
    private String primerNombre;

    @Column(name = Constants.TABLE_MIDDLE_NAME)
    @XmlElement(required = true)
    private String segundoNombre;

    @Column(name = Constants.TABLE_FIRST_LAST_NAME)
    @NotBlank(message = Constants.ENTITY_EMPLEADO_NOT_NULL_FIRST_LAST_NAME)
    @XmlElement(required = true)
    private String primerApellido;

    @Column(name = Constants.TABLE_SECOND_LAST_NAME)
    @NotBlank(message = Constants.ENTITY_EMPLEADO_NOT_NULL_SECOND_LAST_NAME)
    @XmlElement(required = true)
    private String segundoApellido;

    @Column(name = Constants.TABLE_DOC_TYPE)
    @NotBlank(message = Constants.ENTITY_EMPLEADO_NOT_NULL_DOC_TYPE)
    @XmlElement(required = true)
    private String tipoDocumento;

    @Column(name = Constants.TABLE_DOC_NUM)
    @NotBlank(message = Constants.ENTITY_EMPLEADO_NOT_NULL_DOC_NUM)
    @XmlElement(required = true)
    private String numeroDocumento;

    @Column(name = Constants.TABLE_BIRTH_DATE)
    @NotNull(message = Constants.ENTITY_EMPLEADO_NOT_NULL_BIRTH_DATE)
    @XmlElement(required = true)
    private Date fechaNacimiento;

    @Column(name = Constants.TABLE_VINCULATION_DATE)
    @NotNull(message = Constants.ENTITY_EMPLEADO_NOT_NULL_VINCULATION_DATE)
    @XmlElement(required = true)
    private Date fechaVinculacion;

    @Column(name = Constants.TABLE_POSITION)
    @NotBlank(message = Constants.ENTITY_EMPLEADO_NOT_NULL_POSITION)
    @XmlElement(required = true)
    private String cargo;

    @Column(name = Constants.TABLE_SALARY)
    @NotNull(message = Constants.ENTITY_EMPLEADO_NOT_NULL_SALARY)
    @XmlElement(required = true)
    private Double salario;

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Date getFechaVinculacion() {
        return fechaVinculacion;
    }

    public void setFechaVinculacion(Date fechaVinculacion) {
        this.fechaVinculacion = fechaVinculacion;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
