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
import com.asana.models.gen.CustomFieldSettingCompact;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import com.asana.models.GenResource;
/**
 * CustomFieldSettingResponse
 */


public class CustomFieldSettingResponse extends CustomFieldSettingCompact {
  @SerializedName("project")
  private Object project = null;

  @SerializedName("is_important")
  private Boolean isImportant = null;

  @SerializedName("parent")
  private Object parent = null;

  @SerializedName("custom_field")
  private Object customField = null;

  public CustomFieldSettingResponse project(Object project) {
    this.project = project;
    return this;
  }

   /**
   * Get project
   * @return project
  **/
  @Schema(description = "")
  public Object getProject() {
    return project;
  }

  public void setProject(Object project) {
    this.project = project;
  }

   /**
   * &#x60;is_important&#x60; is used in the Asana web application to determine if this custom field is displayed in the list/grid view of a project or portfolio.
   * @return isImportant
  **/
  @Schema(example = "false", description = "`is_important` is used in the Asana web application to determine if this custom field is displayed in the list/grid view of a project or portfolio.")
  public Boolean isIsImportant() {
    return isImportant;
  }

  public CustomFieldSettingResponse parent(Object parent) {
    this.parent = parent;
    return this;
  }

   /**
   * Get parent
   * @return parent
  **/
  @Schema(description = "")
  public Object getParent() {
    return parent;
  }

  public void setParent(Object parent) {
    this.parent = parent;
  }

  public CustomFieldSettingResponse customField(Object customField) {
    this.customField = customField;
    return this;
  }

   /**
   * Get customField
   * @return customField
  **/
  @Schema(description = "")
  public Object getCustomField() {
    return customField;
  }

  public void setCustomField(Object customField) {
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
    CustomFieldSettingResponse customFieldSettingResponse = (CustomFieldSettingResponse) o;
    return Objects.equals(this.project, customFieldSettingResponse.project) &&
        Objects.equals(this.isImportant, customFieldSettingResponse.isImportant) &&
        Objects.equals(this.parent, customFieldSettingResponse.parent) &&
        Objects.equals(this.customField, customFieldSettingResponse.customField) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(project, isImportant, parent, customField, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomFieldSettingResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    isImportant: ").append(toIndentedString(isImportant)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
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
