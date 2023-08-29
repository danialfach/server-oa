package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CreateOrUpdateTodolist
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-29T01:47:25.669195809Z[GMT]")


public class CreateOrUpdateTodolist   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("priority")
  private BigDecimal priority = null;

  @JsonProperty("tags")
  @Valid
  private List<String> tags = null;

  public CreateOrUpdateTodolist name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   **/
  @Schema(description = "")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreateOrUpdateTodolist priority(BigDecimal priority) {
    this.priority = priority;
    return this;
  }

  /**
   * Get priority
   * @return priority
   **/
  @Schema(description = "")
  
    @Valid
    public BigDecimal getPriority() {
    return priority;
  }

  public void setPriority(BigDecimal priority) {
    this.priority = priority;
  }

  public CreateOrUpdateTodolist tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public CreateOrUpdateTodolist addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Get tags
   * @return tags
   **/
  @Schema(description = "")
  
    public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateOrUpdateTodolist createOrUpdateTodolist = (CreateOrUpdateTodolist) o;
    return Objects.equals(this.name, createOrUpdateTodolist.name) &&
        Objects.equals(this.priority, createOrUpdateTodolist.priority) &&
        Objects.equals(this.tags, createOrUpdateTodolist.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, priority, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateOrUpdateTodolist {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
