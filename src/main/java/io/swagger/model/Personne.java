package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.LocalDate;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Personne
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-10-06T10:43:47.052Z")

public class Personne   {
  @JsonProperty("nom")
  private String nom = null;

  @JsonProperty("prenom")
  private String prenom = null;

  @JsonProperty("dateNaissance")
  private LocalDate dateNaissance = null;

  @JsonProperty("email")
  private String email = null;

  public Personne nom(String nom) {
    this.nom = nom;
    return this;
  }

   /**
   * Nom du candidat
   * @return nom
  **/
  @ApiModelProperty(example = "ABID BUTT", required = true, value = "Nom du candidat")
  @NotNull


  public String getNom() {
    return nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public Personne prenom(String prenom) {
    this.prenom = prenom;
    return this;
  }

   /**
   * Prénom du candidat
   * @return prenom
  **/
  @ApiModelProperty(example = "Usman", required = true, value = "Prénom du candidat")
  @NotNull


  public String getPrenom() {
    return prenom;
  }

  public void setPrenom(String prenom) {
    this.prenom = prenom;
  }

  public Personne dateNaissance(LocalDate dateNaissance) {
    this.dateNaissance = dateNaissance;
    return this;
  }

   /**
   * Date de naissance du candidat
   * @return dateNaissance
  **/
  @ApiModelProperty(example = "16/01/1994", value = "Date de naissance du candidat")

  @Valid

  public LocalDate getDateNaissance() {
    return dateNaissance;
  }

  public void setDateNaissance(LocalDate dateNaissance) {
    this.dateNaissance = dateNaissance;
  }

  public Personne email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Adresse email du candidat
   * @return email
  **/
  @ApiModelProperty(example = "usman@abidbutt.fr", value = "Adresse email du candidat")


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Personne personne = (Personne) o;
    return Objects.equals(this.nom, personne.nom) &&
        Objects.equals(this.prenom, personne.prenom) &&
        Objects.equals(this.dateNaissance, personne.dateNaissance) &&
        Objects.equals(this.email, personne.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nom, prenom, dateNaissance, email);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Personne {\n");
    
    sb.append("    nom: ").append(toIndentedString(nom)).append("\n");
    sb.append("    prenom: ").append(toIndentedString(prenom)).append("\n");
    sb.append("    dateNaissance: ").append(toIndentedString(dateNaissance)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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

