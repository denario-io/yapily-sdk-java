/*
 * Yapily API
 * To access endpoints that require authentication, use your application key and secret created in the Dashboard (https://dashboard.yapily.com)
 *
 * OpenAPI spec version: 1.167.0
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
 * Used by a Financial Institution internally to identify the location of an ATM.
 */
@ApiModel(description = "Used by a Financial Institution internally to identify the location of an ATM.")
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Site {
  @JsonProperty("Identification")
  private String identification = null;

  @JsonProperty("Name")
  private String name = null;

}

