/*
 * Yapily API
 * To access endpoints that require authentication, use your application key and secret created in the Dashboard (https://dashboard.yapily.com)
 *
 * OpenAPI spec version: 0.0.227
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
 * URL
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class URL {
  @JsonProperty("authority")
  private String authority = null;

  @JsonProperty("content")
  private Object content = null;

  @JsonProperty("defaultPort")
  private Integer defaultPort = null;

  @JsonProperty("file")
  private String file = null;

  @JsonProperty("host")
  private String host = null;

  @JsonProperty("path")
  private String path = null;

  @JsonProperty("port")
  private Integer port = null;

  @JsonProperty("protocol")
  private String protocol = null;

  @JsonProperty("query")
  private String query = null;

  @JsonProperty("ref")
  private String ref = null;

  @JsonProperty("userInfo")
  private String userInfo = null;

}

