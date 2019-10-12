/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.employees.model;

/**
 *
 * @author estiver.alvarez
 */
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "employees")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class Employee {


@Id
private String id;
private @NonNull String Nombre; 
private @NonNull String Email;
private @NonNull String Cargo;
private @NonNull int Salario;
private @NonNull String Oficina;
private @NonNull String Dependencia;
   

}