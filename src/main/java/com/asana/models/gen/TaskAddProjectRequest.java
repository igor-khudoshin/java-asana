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
 * TaskAddProjectRequest
 */


public class TaskAddProjectRequest extends GenResource {
  @SerializedName("project")
  private String project = null;

  @SerializedName("insert_after")
  private String insertAfter = null;

  @SerializedName("insert_before")
  private String insertBefore = null;

  @SerializedName("section")
  private String section = null;

  public TaskAddProjectRequest project(String project) {
    this.project = project;
    return this;
  }

   /**
   * The project to add the task to.
   * @return project
  **/
  @Schema(example = "13579", required = true, description = "The project to add the task to.")
  public String getProject() {
    return project;
  }

  public void setProject(String project) {
    this.project = project;
  }

  public TaskAddProjectRequest insertAfter(String insertAfter) {
    this.insertAfter = insertAfter;
    return this;
  }

   /**
   * A task in the project to insert the task after, or &#x60;null&#x60; to insert at the beginning of the list.
   * @return insertAfter
  **/
  @Schema(example = "124816", description = "A task in the project to insert the task after, or `null` to insert at the beginning of the list.")
  public String getInsertAfter() {
    return insertAfter;
  }

  public void setInsertAfter(String insertAfter) {
    this.insertAfter = insertAfter;
  }

  public TaskAddProjectRequest insertBefore(String insertBefore) {
    this.insertBefore = insertBefore;
    return this;
  }

   /**
   * A task in the project to insert the task before, or &#x60;null&#x60; to insert at the end of the list.
   * @return insertBefore
  **/
  @Schema(example = "432134", description = "A task in the project to insert the task before, or `null` to insert at the end of the list.")
  public String getInsertBefore() {
    return insertBefore;
  }

  public void setInsertBefore(String insertBefore) {
    this.insertBefore = insertBefore;
  }

  public TaskAddProjectRequest section(String section) {
    this.section = section;
    return this;
  }

   /**
   * A section in the project to insert the task into. The task will be inserted at the bottom of the section.
   * @return section
  **/
  @Schema(example = "987654", description = "A section in the project to insert the task into. The task will be inserted at the bottom of the section.")
  public String getSection() {
    return section;
  }

  public void setSection(String section) {
    this.section = section;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskAddProjectRequest taskAddProjectRequest = (TaskAddProjectRequest) o;
    return Objects.equals(this.project, taskAddProjectRequest.project) &&
        Objects.equals(this.insertAfter, taskAddProjectRequest.insertAfter) &&
        Objects.equals(this.insertBefore, taskAddProjectRequest.insertBefore) &&
        Objects.equals(this.section, taskAddProjectRequest.section);
  }

  @Override
  public int hashCode() {
    return Objects.hash(project, insertAfter, insertBefore, section);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskAddProjectRequest {\n");
    
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    insertAfter: ").append(toIndentedString(insertAfter)).append("\n");
    sb.append("    insertBefore: ").append(toIndentedString(insertBefore)).append("\n");
    sb.append("    section: ").append(toIndentedString(section)).append("\n");
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
