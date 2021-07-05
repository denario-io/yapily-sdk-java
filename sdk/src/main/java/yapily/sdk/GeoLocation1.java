/*
 * Yapily API
 * To access endpoints that require authentication, use your application key and secret created in the Dashboard (https://dashboard.yapily.com)
 *
 * OpenAPI spec version: 0.0.361
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
import yapily.sdk.GeographicCoordinates1;

/**
 * Geographic location of the ATM specified by geographic coordinates or UTM coordinates.
 */
@ApiModel(description = "Geographic location of the ATM specified by geographic coordinates or UTM coordinates.")
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class GeoLocation1 {
  @JsonProperty("GeographicCoordinates")
  private GeographicCoordinates1 geographicCoordinates = null;

}

