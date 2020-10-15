/*
 * Yapily API
 * To access endpoints that require authentication, use your application key and secret created in the Dashboard (https://dashboard.yapily.com)
 *
 * OpenAPI spec version: 0.0.257
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
import java.io.File;
import yapily.sdk.InputStream;
import yapily.sdk.URI;
import yapily.sdk.URL;

/**
 * Resource
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Resource {
  @JsonProperty("description")
  private String description = null;

  @JsonProperty("file")
  private File file = null;

  @JsonProperty("filename")
  private String filename = null;

  @JsonProperty("inputStream")
  private InputStream inputStream = null;

  @JsonProperty("open")
  private Boolean open = null;

  @JsonProperty("readable")
  private Boolean readable = null;

  @JsonProperty("uri")
  private URI uri = null;

  @JsonProperty("url")
  private URL url = null;

}

