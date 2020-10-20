/*
 * Yapily API
 * To access endpoints that require authentication, use your application key and secret created in the Dashboard (https://dashboard.yapily.com)
 *
 * OpenAPI spec version: 0.0.260
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
import java.util.ArrayList;
import java.util.List;

/**
 * Age eligibility that a person should be to hold this account
 */
@ApiModel(description = "Age eligibility that a person should be to hold this account")
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AgeEligibility {
  @JsonProperty("MaximumAge")
  private Float maximumAge = null;

  @JsonProperty("MinimumAge")
  private Float minimumAge = null;

  @JsonProperty("Notes")
  private List<String> notes = null;

}

