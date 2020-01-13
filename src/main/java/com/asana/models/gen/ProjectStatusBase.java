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
import com.asana.models.gen.ProjectStatusCompact;
import com.asana.models.gen.UserCompact;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.time.OffsetDateTime;
import com.asana.models.GenResource;
/**
 * ProjectStatusBase
 */


public class ProjectStatusBase extends ProjectStatusCompact {
  @SerializedName("created_at")
  private OffsetDateTime createdAt = null;

  @SerializedName("created_by")
  private UserCompact createdBy = null;

  @SerializedName("project")
  private String project = null;

  @SerializedName("text")
  private String text = null;

  @SerializedName("html-text")
  private String htmlText = null;

  /**
   * The color associated with the status update.
   */
  @JsonAdapter(ColorEnum.Adapter.class)
  public enum ColorEnum {
    GREEN("green"),
    YELLOW("yellow"),
    RED("red");

    private String value;

    ColorEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ColorEnum fromValue(String text) {
      for (ColorEnum b : ColorEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ColorEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ColorEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ColorEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ColorEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("color")
  private ColorEnum color = null;

   /**
   * The time at which this resource was created.
   * @return createdAt
  **/
  @Schema(description = "The time at which this resource was created.")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public ProjectStatusBase createdBy(UserCompact createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @Schema(description = "")
  public UserCompact getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(UserCompact createdBy) {
    this.createdBy = createdBy;
  }

   /**
   * Globally unique identifier for the project.
   * @return project
  **/
  @Schema(example = "123456", required = true, description = "Globally unique identifier for the project.")
  public String getProject() {
    return project;
  }

  public ProjectStatusBase text(String text) {
    this.text = text;
    return this;
  }

   /**
   * The text content of the status update.
   * @return text
  **/
  @Schema(example = "The project is moving forward according to plan...", required = true, description = "The text content of the status update.")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public ProjectStatusBase htmlText(String htmlText) {
    this.htmlText = htmlText;
    return this;
  }

   /**
   * [Opt In](#input-output-options). The text content of the status update with formatting as HTML.
   * @return htmlText
  **/
  @Schema(example = "'&lt;body&gt;The project &lt;strong&gt;is&lt;/strong&gt; moving forward according to plan...&lt;/body&gt;'", description = "[Opt In](#input-output-options). The text content of the status update with formatting as HTML.")
  public String getHtmlText() {
    return htmlText;
  }

  public void setHtmlText(String htmlText) {
    this.htmlText = htmlText;
  }

  public ProjectStatusBase color(ColorEnum color) {
    this.color = color;
    return this;
  }

   /**
   * The color associated with the status update.
   * @return color
  **/
  @Schema(required = true, description = "The color associated with the status update.")
  public ColorEnum getColor() {
    return color;
  }

  public void setColor(ColorEnum color) {
    this.color = color;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectStatusBase projectStatusBase = (ProjectStatusBase) o;
    return Objects.equals(this.createdAt, projectStatusBase.createdAt) &&
        Objects.equals(this.createdBy, projectStatusBase.createdBy) &&
        Objects.equals(this.project, projectStatusBase.project) &&
        Objects.equals(this.text, projectStatusBase.text) &&
        Objects.equals(this.htmlText, projectStatusBase.htmlText) &&
        Objects.equals(this.color, projectStatusBase.color) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, createdBy, project, text, htmlText, color, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectStatusBase {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    htmlText: ").append(toIndentedString(htmlText)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
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
