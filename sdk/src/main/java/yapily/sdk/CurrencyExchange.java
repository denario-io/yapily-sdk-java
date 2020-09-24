/*
 * Yapily API
 * To access endpoints that require authentication, use your application key and secret created in the Dashboard (https://dashboard.yapily.com)
 *
 * OpenAPI spec version: 0.0.245
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
import java.math.BigDecimal;

/**
 * CurrencyExchange
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CurrencyExchange {
  @JsonProperty("sourceCurrency")
  private String sourceCurrency = null;

  @JsonProperty("targetCurrency")
  private String targetCurrency = null;

  @JsonProperty("unitCurrency")
  private String unitCurrency = null;

  @JsonProperty("exchangeRate")
  private BigDecimal exchangeRate = null;

}

