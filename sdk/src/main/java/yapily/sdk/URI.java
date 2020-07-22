/*
 * Yapily API
 * To access endpoints that require authentication, use your application key and secret created in the Dashboard (https://dashboard.yapily.com)
 *
 * OpenAPI spec version: 0.0.213
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
 * URI
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class URI {
  @JsonProperty("absolute")
  private Boolean absolute = null;

  @JsonProperty("authority")
  private String authority = null;

  @JsonProperty("fragment")
  private String fragment = null;

  @JsonProperty("host")
  private String host = null;

  @JsonProperty("opaque")
  private Boolean opaque = null;

  @JsonProperty("path")
  private String path = null;

  @JsonProperty("port")
  private Integer port = null;

  @JsonProperty("query")
  private String query = null;

  @JsonProperty("rawAuthority")
  private String rawAuthority = null;

  @JsonProperty("rawFragment")
  private String rawFragment = null;

  @JsonProperty("rawPath")
  private String rawPath = null;

  @JsonProperty("rawQuery")
  private String rawQuery = null;

  @JsonProperty("rawSchemeSpecificPart")
  private String rawSchemeSpecificPart = null;

  @JsonProperty("rawUserInfo")
  private String rawUserInfo = null;

  @JsonProperty("scheme")
  private String scheme = null;

  @JsonProperty("schemeSpecificPart")
  private String schemeSpecificPart = null;

  @JsonProperty("userInfo")
  private String userInfo = null;

}

