/*
 * Yapily API
 * To access endpoints that require authentication, use your application key and secret created in the Dashboard (https://dashboard.yapily.com)
 *
 * OpenAPI spec version: 0.0.277
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package yapily.sdk;

import lombok.Data;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Enter a new code , name and description for any other location category
 */
@ApiModel(description = "Enter a new code , name and description for any other location category")
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class LocationOtherLocationCategory {
  @JsonProperty("Code")
  private String code = null;

  @JsonProperty("Description")
  private String description = null;

  @JsonProperty("Name")
  private String name = null;

}

