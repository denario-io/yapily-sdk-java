/*
 * Yapily API
 * To access endpoints that require authentication, use your application key and secret created in the Dashboard (https://dashboard.yapily.com)
 *
 * OpenAPI spec version: 0.0.182
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
import java.time.OffsetDateTime;
import yapily.sdk.Amount;
import yapily.sdk.InternationalPaymentRequest;
import yapily.sdk.Payee;
import yapily.sdk.Payer;
import yapily.sdk.PeriodicPaymentRequest;

/**
 * PaymentRequest
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class PaymentRequest {
  @JsonProperty("paymentIdempotencyId")
  private String paymentIdempotencyId = null;

  @JsonProperty("payer")
  private Payer payer = null;

  @JsonProperty("amount")
  private Amount amount = null;

  @JsonProperty("reference")
  private String reference = null;

  /**
   * Gets or Sets contextType
   */
  public enum ContextTypeEnum {
    BILL("BILL"),
    
    GOODS("GOODS"),
    
    SERVICES("SERVICES"),
    
    OTHER("OTHER"),
    
    PERSON_TO_PERSON("PERSON_TO_PERSON");

    private String value;

    ContextTypeEnum(String value) {
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
    public static ContextTypeEnum fromValue(String text) {
      for (ContextTypeEnum b : ContextTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("contextType")
  private ContextTypeEnum contextType = null;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    DOMESTIC_PAYMENT("DOMESTIC_PAYMENT"),
    
    DOMESTIC_VARIABLE_RECURRING_PAYMENT("DOMESTIC_VARIABLE_RECURRING_PAYMENT"),
    
    DOMESTIC_SCHEDULED_PAYMENT("DOMESTIC_SCHEDULED_PAYMENT"),
    
    DOMESTIC_PERIODIC_PAYMENT("DOMESTIC_PERIODIC_PAYMENT"),
    
    INTERNATIONAL_PAYMENT("INTERNATIONAL_PAYMENT"),
    
    INTERNATIONAL_SCHEDULED_PAYMENT("INTERNATIONAL_SCHEDULED_PAYMENT"),
    
    INTERNATIONAL_PERIODIC_PAYMENT("INTERNATIONAL_PERIODIC_PAYMENT"),
    
    BULK_PAYMENT("BULK_PAYMENT");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("type")
  private TypeEnum type = null;

  @JsonProperty("paymentDateTime")
  private OffsetDateTime paymentDateTime = null;

  @JsonProperty("payee")
  private Payee payee = null;

  @JsonProperty("periodicPayment")
  private PeriodicPaymentRequest periodicPayment = null;

  @JsonProperty("internationalPayment")
  private InternationalPaymentRequest internationalPayment = null;

}

