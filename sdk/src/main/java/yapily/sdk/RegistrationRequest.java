/*
 * Yapily API
 * To access endpoints that require authentication, use your application key and secret created in the Dashboard (https://dashboard.yapily.com)
 *
 * OpenAPI spec version: 0.0.241
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
 * RegistrationRequest
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class RegistrationRequest {
  @JsonProperty("clientId")
  private String clientId = null;

  @JsonProperty("clientSecret")
  private String clientSecret = null;

  @JsonProperty("manual")
  private Boolean manual = null;

  @JsonProperty("tppId")
  private String tppId = null;

  @JsonProperty("softwareId")
  private String softwareId = null;

  @JsonProperty("clientName")
  private String clientName = null;

  @JsonProperty("signingKeyId")
  private String signingKeyId = null;

  @JsonProperty("signingCertificateId")
  private String signingCertificateId = null;

  @JsonProperty("transportKeyId")
  private String transportKeyId = null;

  @JsonProperty("transportCertificateId")
  private String transportCertificateId = null;

  @JsonProperty("clientUri")
  private String clientUri = null;

  @JsonProperty("termsOfServiceUri")
  private String termsOfServiceUri = null;

  @JsonProperty("ssaJwt")
  private String ssaJwt = null;

}

