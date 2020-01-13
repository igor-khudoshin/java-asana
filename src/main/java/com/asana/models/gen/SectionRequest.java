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
 * SectionRequest
 */


public class SectionRequest extends GenResource {
  @SerializedName("project")
  private String project = null;

  @SerializedName("name")
  private String name = null;

  public SectionRequest project(String project) {
    this.project = project;
    return this;
  }

   /**
   * *Create-Only* The project to create the section in
   * @return project
  **/
  @Schema(example = "13579", required = true, description = "*Create-Only* The project to create the section in")
  public String getProject() {
    return project;
  }

  public void setProject(String project) {
    this.project = project;
  }

  public SectionRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The text to be displayed as the section name. This cannot be an empty string.
   * @return name
  **/
  @Schema(example = "Next Actions", required = true, description = "The text to be displayed as the section name. This cannot be an empty string.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SectionRequest sectionRequest = (SectionRequest) o;
    return Objects.equals(this.project, sectionRequest.project) &&
        Objects.equals(this.name, sectionRequest.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(project, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SectionRequest {\n");
    
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
