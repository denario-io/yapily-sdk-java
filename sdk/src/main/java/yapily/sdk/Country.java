/*
 * Yapily API
 * To access endpoints that require authentication, use your application key and secret created in the Dashboard (https://dashboard.yapily.com)
 *
 * OpenAPI spec version: 1.147.0
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
 * An array of &#x60;Country&#x60; denoting which regions the &#x60;Institution&#x60; provides coverage for
 */
@ApiModel(description = "An array of `Country` denoting which regions the `Institution` provides coverage for")
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Country {
  @JsonProperty("countryCode2")
  private String countryCode2 = null;

  @JsonProperty("displayName")
  private String displayName = null;

}

