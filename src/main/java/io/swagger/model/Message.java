package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Message
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-10-06T10:43:47.052Z")

public class Message   {
  @JsonProperty("contenue")
  private String contenue = null;

  public Message contenue(String contenue) {
    this.contenue = contenue;
    return this;
  }

   /**
   * succes de la requete
   * @return contenue
  **/
  @ApiModelProperty(example = "succes", value = "succes de la requete")


  public String getContenue() {
    return contenue;
  }

  public void setContenue(String contenue) {
    this.contenue = contenue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Message message = (Message) o;
    return Objects.equals(this.contenue, message.contenue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contenue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Message {\n");
    
    sb.append("    contenue: ").append(toIndentedString(contenue)).append("\n");
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

