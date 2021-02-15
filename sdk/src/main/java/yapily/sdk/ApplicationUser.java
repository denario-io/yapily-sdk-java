/*
 * Yapily API
 * To access endpoints that require authentication, use your application key and secret created in the Dashboard (https://dashboard.yapily.com)
 *
 * OpenAPI spec version: 0.0.308
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
import yapily.sdk.InstitutionConsent;

/**
 * ApplicationUser
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ApplicationUser {
  @JsonProperty("uuid")
  private String uuid = null;

  @JsonProperty("applicationUuid")
  private String applicationUuid = null;

  @JsonProperty("applicationUserId")
  private String applicationUserId = null;

  @JsonProperty("referenceId")
  private String referenceId = null;

  @JsonProperty("institutionConsents")
  private List<InstitutionConsent> institutionConsents = null;

}

