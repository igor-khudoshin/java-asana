/*
 * Asana
 * This is the interface for interacting with the [Asana Platform](https://developers.asana.com). Our API reference is generated from our [OpenAPI spec] (https://raw.githubusercontent.com/Asana/developer-docs/master/defs/asana_oas.yaml).
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.asana.models.gen;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import com.asana.models.GenResource;
/**
 * PortfolioRemoveMembersRequest
 */


public class PortfolioRemoveMembersRequest extends GenResource {
  @SerializedName("members")
  private String members = null;

  public PortfolioRemoveMembersRequest members(String members) {
    this.members = members;
    return this;
  }

   /**
   * An array of user ids.
   * @return members
  **/
  @Schema(example = "521621,621373", required = true, description = "An array of user ids.")
  public String getMembers() {
    return members;
  }

  public void setMembers(String members) {
    this.members = members;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PortfolioRemoveMembersRequest portfolioRemoveMembersRequest = (PortfolioRemoveMembersRequest) o;
    return Objects.equals(this.members, portfolioRemoveMembersRequest.members);
  }

  @Override
  public int hashCode() {
    return Objects.hash(members);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortfolioRemoveMembersRequest {\n");
    
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
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
