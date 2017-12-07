package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Formation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-10-06T10:43:47.052Z")

public class Formation   {
  @JsonProperty("nom")
  private String nom = null;

  @JsonProperty("annee")
  private Integer annee = null;

  @JsonProperty("lieu")
  private String lieu = null;

  @JsonProperty("rythme")
  private String rythme = null;

  public Formation nom(String nom) {
    this.nom = nom;
    return this;
  }

   /**
   * Nom de la formation
   * @return nom
  **/
  @ApiModelProperty(example = "ingenieur", required = true, value = "Nom de la formation")
  @NotNull


  public String getNom() {
    return nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public Formation annee(Integer annee) {
    this.annee = annee;
    return this;
  }

   /**
   * Année de formation
   * @return annee
  **/
  @ApiModelProperty(example = "3", required = true, value = "Année de formation")
  @NotNull


  public Integer getAnnee() {
    return annee;
  }

  public void setAnnee(Integer annee) {
    this.annee = annee;
  }

  public Formation lieu(String lieu) {
    this.lieu = lieu;
    return this;
  }

   /**
   * Adresse du site de formation
   * @return lieu
  **/
  @ApiModelProperty(example = "ESIPE", value = "Adresse du site de formation")


  public String getLieu() {
    return lieu;
  }

  public void setLieu(String lieu) {
    this.lieu = lieu;
  }

  public Formation rythme(String rythme) {
    this.rythme = rythme;
    return this;
  }

   /**
   * Rythme d'étude de la formation
   * @return rythme
  **/
  @ApiModelProperty(example = "alternance", value = "Rythme d'étude de la formation")


  public String getRythme() {
    return rythme;
  }

  public void setRythme(String rythme) {
    this.rythme = rythme;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Formation formation = (Formation) o;
    return Objects.equals(this.nom, formation.nom) &&
        Objects.equals(this.annee, formation.annee) &&
        Objects.equals(this.lieu, formation.lieu) &&
        Objects.equals(this.rythme, formation.rythme);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nom, annee, lieu, rythme);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Formation {\n");
    
    sb.append("    nom: ").append(toIndentedString(nom)).append("\n");
    sb.append("    annee: ").append(toIndentedString(annee)).append("\n");
    sb.append("    lieu: ").append(toIndentedString(lieu)).append("\n");
    sb.append("    rythme: ").append(toIndentedString(rythme)).append("\n");
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

