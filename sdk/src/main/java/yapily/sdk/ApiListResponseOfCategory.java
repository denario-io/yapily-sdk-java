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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import yapily.sdk.Category;
import yapily.sdk.ResponseListMeta;

/**
 * ApiListResponseOfCategory
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ApiListResponseOfCategory {
  @JsonProperty("meta")
  private ResponseListMeta meta = null;

  @JsonProperty("data")
  private List<Category> data = null;

  @JsonProperty("links")
  private Map<String, String> links = null;

}

