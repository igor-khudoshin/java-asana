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
 * SectionTaskInsertRequest
 */


public class SectionTaskInsertRequest extends GenResource {
  @SerializedName("task")
  private String task = null;

  @SerializedName("insert_before")
  private String insertBefore = null;

  @SerializedName("insert_after")
  private String insertAfter = null;

  public SectionTaskInsertRequest task(String task) {
    this.task = task;
    return this;
  }

   /**
   * The task to add to this section.
   * @return task
  **/
  @Schema(example = "123456", required = true, description = "The task to add to this section.")
  public String getTask() {
    return task;
  }

  public void setTask(String task) {
    this.task = task;
  }

  public SectionTaskInsertRequest insertBefore(String insertBefore) {
    this.insertBefore = insertBefore;
    return this;
  }

   /**
   * An existing task within this section before which the added task should be inserted. Cannot be provided together with insert_after.
   * @return insertBefore
  **/
  @Schema(example = "86420", description = "An existing task within this section before which the added task should be inserted. Cannot be provided together with insert_after.")
  public String getInsertBefore() {
    return insertBefore;
  }

  public void setInsertBefore(String insertBefore) {
    this.insertBefore = insertBefore;
  }

  public SectionTaskInsertRequest insertAfter(String insertAfter) {
    this.insertAfter = insertAfter;
    return this;
  }

   /**
   * An existing task within this section after which the added task should be inserted. Cannot be provided together with insert_before.
   * @return insertAfter
  **/
  @Schema(example = "987654", description = "An existing task within this section after which the added task should be inserted. Cannot be provided together with insert_before.")
  public String getInsertAfter() {
    return insertAfter;
  }

  public void setInsertAfter(String insertAfter) {
    this.insertAfter = insertAfter;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SectionTaskInsertRequest sectionTaskInsertRequest = (SectionTaskInsertRequest) o;
    return Objects.equals(this.task, sectionTaskInsertRequest.task) &&
        Objects.equals(this.insertBefore, sectionTaskInsertRequest.insertBefore) &&
        Objects.equals(this.insertAfter, sectionTaskInsertRequest.insertAfter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(task, insertBefore, insertAfter);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SectionTaskInsertRequest {\n");
    
    sb.append("    task: ").append(toIndentedString(task)).append("\n");
    sb.append("    insertBefore: ").append(toIndentedString(insertBefore)).append("\n");
    sb.append("    insertAfter: ").append(toIndentedString(insertAfter)).append("\n");
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