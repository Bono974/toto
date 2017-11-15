/*
 * Swagger Petstore
 * This is a sample server Petstore server.  You can find out more about     Swagger at [http://swagger.io](http://swagger.io) or on [irc.freenode.net, #swagger](http://swagger.io/irc/).      For this sample, you can use the api key `special-key` to test the authorization     filters.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Diagnostic;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;

/**
 * Patient
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-11-15T14:05:45.222Z")
public class Patient   {
  @JsonProperty("idPatient")
  private String idPatient = null;

  @JsonProperty("nom")
  private String nom = null;

  @JsonProperty("prenom")
  private String prenom = null;

  @JsonProperty("age")
  private Integer age = null;

  @JsonProperty("sexe")
  private Integer sexe = null;

  @JsonProperty("listDiag")
  private List<Diagnostic> listDiag = null;

  public Patient idPatient(String idPatient) {
    this.idPatient = idPatient;
    return this;
  }

  /**
   * Get idPatient
   * @return idPatient
   **/
  @JsonProperty("idPatient")
  @ApiModelProperty(value = "")
  public String getIdPatient() {
    return idPatient;
  }

  public void setIdPatient(String idPatient) {
    this.idPatient = idPatient;
  }

  public Patient nom(String nom) {
    this.nom = nom;
    return this;
  }

  /**
   * Get nom
   * @return nom
   **/
  @JsonProperty("nom")
  @ApiModelProperty(value = "")
  public String getNom() {
    return nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public Patient prenom(String prenom) {
    this.prenom = prenom;
    return this;
  }

  /**
   * Get prenom
   * @return prenom
   **/
  @JsonProperty("prenom")
  @ApiModelProperty(value = "")
  public String getPrenom() {
    return prenom;
  }

  public void setPrenom(String prenom) {
    this.prenom = prenom;
  }

  public Patient age(Integer age) {
    this.age = age;
    return this;
  }

  /**
   * Get age
   * @return age
   **/
  @JsonProperty("age")
  @ApiModelProperty(value = "")
  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public Patient sexe(Integer sexe) {
    this.sexe = sexe;
    return this;
  }

  /**
   * Get sexe
   * @return sexe
   **/
  @JsonProperty("sexe")
  @ApiModelProperty(value = "")
  public Integer getSexe() {
    return sexe;
  }

  public void setSexe(Integer sexe) {
    this.sexe = sexe;
  }

  public Patient listDiag(List<Diagnostic> listDiag) {
    this.listDiag = listDiag;
    return this;
  }

  public Patient addListDiagItem(Diagnostic listDiagItem) {
    if (this.listDiag == null) {
      this.listDiag = new ArrayList<Diagnostic>();
    }
    this.listDiag.add(listDiagItem);
    return this;
  }

  /**
   * Get listDiag
   * @return listDiag
   **/
  @JsonProperty("listDiag")
  @ApiModelProperty(value = "")
  public List<Diagnostic> getListDiag() {
    return listDiag;
  }

  public void setListDiag(List<Diagnostic> listDiag) {
    this.listDiag = listDiag;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Patient patient = (Patient) o;
    return Objects.equals(this.idPatient, patient.idPatient) &&
        Objects.equals(this.nom, patient.nom) &&
        Objects.equals(this.prenom, patient.prenom) &&
        Objects.equals(this.age, patient.age) &&
        Objects.equals(this.sexe, patient.sexe) &&
        Objects.equals(this.listDiag, patient.listDiag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idPatient, nom, prenom, age, sexe, listDiag);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Patient {\n");
    
    sb.append("    idPatient: ").append(toIndentedString(idPatient)).append("\n");
    sb.append("    nom: ").append(toIndentedString(nom)).append("\n");
    sb.append("    prenom: ").append(toIndentedString(prenom)).append("\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    sexe: ").append(toIndentedString(sexe)).append("\n");
    sb.append("    listDiag: ").append(toIndentedString(listDiag)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

