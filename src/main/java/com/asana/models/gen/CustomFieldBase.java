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
import com.asana.models.gen.CustomFieldCompact;
import com.asana.models.gen.EnumOptionCompact;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.asana.models.GenResource;
/**
 * CustomFieldBase
 */


public class CustomFieldBase extends CustomFieldCompact {
  @SerializedName("description")
  private String description = null;

  @SerializedName("enum_options")
  private List<EnumOptionCompact> enumOptions = null;

  @SerializedName("precision")
  private Integer precision = null;

  @SerializedName("is_global_to_workspace")
  private Boolean isGlobalToWorkspace = null;

  @SerializedName("has_notifications_enabled")
  private Boolean hasNotificationsEnabled = null;

  public CustomFieldBase description(String description) {
    this.description = description;
    return this;
  }

   /**
   * [Opt In](#input-output-options). The description of the custom field.
   * @return description
  **/
  @Schema(example = "Development team priority", description = "[Opt In](#input-output-options). The description of the custom field.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CustomFieldBase enumOptions(List<EnumOptionCompact> enumOptions) {
    this.enumOptions = enumOptions;
    return this;
  }

  public CustomFieldBase addEnumOptionsItem(EnumOptionCompact enumOptionsItem) {
    if (this.enumOptions == null) {
      this.enumOptions = new ArrayList<>();
    }
    this.enumOptions.add(enumOptionsItem);
    return this;
  }

   /**
   * *Conditional*. Only relevant for custom fields of type &#x60;enum&#x60;. This array specifies the possible values which an &#x60;enum&#x60; custom field can adopt. To modify the enum options, refer to [working with enum options](#create-an-enum-option).
   * @return enumOptions
  **/
  @Schema(description = "*Conditional*. Only relevant for custom fields of type `enum`. This array specifies the possible values which an `enum` custom field can adopt. To modify the enum options, refer to [working with enum options](#create-an-enum-option).")
  public List<EnumOptionCompact> getEnumOptions() {
    return enumOptions;
  }

  public void setEnumOptions(List<EnumOptionCompact> enumOptions) {
    this.enumOptions = enumOptions;
  }

  public CustomFieldBase precision(Integer precision) {
    this.precision = precision;
    return this;
  }

   /**
   * Only relevant for custom fields of type ‘Number’. This field dictates the number of places after the decimal to round to, i.e. 0 is integer values, 1 rounds to the nearest tenth, and so on. Must be between 0 and 6, inclusive.
   * @return precision
  **/
  @Schema(example = "2", description = "Only relevant for custom fields of type ‘Number’. This field dictates the number of places after the decimal to round to, i.e. 0 is integer values, 1 rounds to the nearest tenth, and so on. Must be between 0 and 6, inclusive.")
  public Integer getPrecision() {
    return precision;
  }

  public void setPrecision(Integer precision) {
    this.precision = precision;
  }

   /**
   * This flag describes whether this custom field is available to every container in the workspace. Before project-specific custom fields, this field was always true.
   * @return isGlobalToWorkspace
  **/
  @Schema(example = "true", description = "This flag describes whether this custom field is available to every container in the workspace. Before project-specific custom fields, this field was always true.")
  public Boolean isIsGlobalToWorkspace() {
    return isGlobalToWorkspace;
  }

  public CustomFieldBase hasNotificationsEnabled(Boolean hasNotificationsEnabled) {
    this.hasNotificationsEnabled = hasNotificationsEnabled;
    return this;
  }

   /**
   * This flag describes whether a follower of a task with this field should receive inbox notifications from changes to this field.
   * @return hasNotificationsEnabled
  **/
  @Schema(example = "true", description = "This flag describes whether a follower of a task with this field should receive inbox notifications from changes to this field.")
  public Boolean isHasNotificationsEnabled() {
    return hasNotificationsEnabled;
  }

  public void setHasNotificationsEnabled(Boolean hasNotificationsEnabled) {
    this.hasNotificationsEnabled = hasNotificationsEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomFieldBase customFieldBase = (CustomFieldBase) o;
    return Objects.equals(this.description, customFieldBase.description) &&
        Objects.equals(this.enumOptions, customFieldBase.enumOptions) &&
        Objects.equals(this.precision, customFieldBase.precision) &&
        Objects.equals(this.isGlobalToWorkspace, customFieldBase.isGlobalToWorkspace) &&
        Objects.equals(this.hasNotificationsEnabled, customFieldBase.hasNotificationsEnabled) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, enumOptions, precision, isGlobalToWorkspace, hasNotificationsEnabled, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomFieldBase {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    enumOptions: ").append(toIndentedString(enumOptions)).append("\n");
    sb.append("    precision: ").append(toIndentedString(precision)).append("\n");
    sb.append("    isGlobalToWorkspace: ").append(toIndentedString(isGlobalToWorkspace)).append("\n");
    sb.append("    hasNotificationsEnabled: ").append(toIndentedString(hasNotificationsEnabled)).append("\n");
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