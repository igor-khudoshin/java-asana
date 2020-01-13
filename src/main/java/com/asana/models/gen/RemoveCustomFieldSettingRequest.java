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
 * RemoveCustomFieldSettingRequest
 */


public class RemoveCustomFieldSettingRequest extends GenResource {
  @SerializedName("custom_field")
  private String customField = null;

  public RemoveCustomFieldSettingRequest customField(String customField) {
    this.customField = customField;
    return this;
  }

   /**
   * The custom field to remove from this portfolio.
   * @return customField
  **/
  @Schema(example = "14916", required = true, description = "The custom field to remove from this portfolio.")
  public String getCustomField() {
    return customField;
  }

  public void setCustomField(String customField) {
    this.customField = customField;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemoveCustomFieldSettingRequest removeCustomFieldSettingRequest = (RemoveCustomFieldSettingRequest) o;
    return Objects.equals(this.customField, removeCustomFieldSettingRequest.customField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customField);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoveCustomFieldSettingRequest {\n");
    
    sb.append("    customField: ").append(toIndentedString(customField)).append("\n");
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