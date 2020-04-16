/*
 * Yapily API
 * To access endpoints that require authentication, use your application key and secret created in the Dashboard (https://dashboard.yapily.com)
 *
 * OpenAPI spec version: 0.0.180
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
import yapily.sdk.ExchangeRateInformation;

/**
 * InternationalPaymentRequest
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class InternationalPaymentRequest {
  @JsonProperty("currencyOfTransfer")
  private String currencyOfTransfer = null;

  @JsonProperty("exchangeRateInformation")
  private ExchangeRateInformation exchangeRateInformation = null;

  @JsonProperty("purpose")
  private String purpose = null;

  /**
   * Gets or Sets priority
   */
  public enum PriorityEnum {
    NORMAL("NORMAL"),
    
    URGENT("URGENT");

    private String value;

    PriorityEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PriorityEnum fromValue(String text) {
      for (PriorityEnum b : PriorityEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("priority")
  private PriorityEnum priority = null;

  /**
   * Gets or Sets chargeBearer
   */
  public enum ChargeBearerEnum {
    DEBT("DEBT"),
    
    CRED("CRED"),
    
    SHAR("SHAR"),
    
    SLEV("SLEV");

    private String value;

    ChargeBearerEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ChargeBearerEnum fromValue(String text) {
      for (ChargeBearerEnum b : ChargeBearerEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("chargeBearer")
  private ChargeBearerEnum chargeBearer = null;

}

