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
import com.asana.models.gen.ProjectCompact;
import com.asana.models.gen.SectionCompact;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import com.asana.models.GenResource;
/**
 * SectionResponse
 */


public class SectionResponse extends SectionCompact {
  @SerializedName("created_at")
  private OffsetDateTime createdAt = null;

  @SerializedName("projects")
  private List<ProjectCompact> projects = null;

   /**
   * The time at which this resource was created.
   * @return createdAt
  **/
  @Schema(description = "The time at which this resource was created.")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public SectionResponse projects(List<ProjectCompact> projects) {
    this.projects = projects;
    return this;
  }

  public SectionResponse addProjectsItem(ProjectCompact projectsItem) {
    if (this.projects == null) {
      this.projects = new ArrayList<>();
    }
    this.projects.add(projectsItem);
    return this;
  }

   /**
   * Get projects
   * @return projects
  **/
  @Schema(description = "")
  public List<ProjectCompact> getProjects() {
    return projects;
  }

  public void setProjects(List<ProjectCompact> projects) {
    this.projects = projects;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SectionResponse sectionResponse = (SectionResponse) o;
    return Objects.equals(this.createdAt, sectionResponse.createdAt) &&
        Objects.equals(this.projects, sectionResponse.projects) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, projects, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SectionResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    projects: ").append(toIndentedString(projects)).append("\n");
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