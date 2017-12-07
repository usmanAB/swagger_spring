package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Formation;
import io.swagger.model.Personne;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SubmitRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-10-06T10:43:47.052Z")

public class SubmitRequest   {
  @JsonProperty("personne")
  private Personne personne = null;

  @JsonProperty("formation")
  private Formation formation = null;

  public SubmitRequest personne(Personne personne) {
    this.personne = personne;
    return this;
  }

   /**
   * Get personne
   * @return personne
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public Personne getPersonne() {
    return personne;
  }

  public void setPersonne(Personne personne) {
    this.personne = personne;
  }

  public SubmitRequest formation(Formation formation) {
    this.formation = formation;
    return this;
  }

   /**
   * Get formation
   * @return formation
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public Formation getFormation() {
    return formation;
  }

  public void setFormation(Formation formation) {
    this.formation = formation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubmitRequest submitRequest = (SubmitRequest) o;
    return Objects.equals(this.personne, submitRequest.personne) &&
        Objects.equals(this.formation, submitRequest.formation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(personne, formation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmitRequest {\n");
    
    sb.append("    personne: ").append(toIndentedString(personne)).append("\n");
    sb.append("    formation: ").append(toIndentedString(formation)).append("\n");
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

