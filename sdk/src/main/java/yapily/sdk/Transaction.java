/*
 * Yapily API
 * To access endpoints that require authentication, use your application key and secret created in the Dashboard (https://dashboard.yapily.com)
 *
 * OpenAPI spec version: 0.0.168-SNAPSHOT
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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import yapily.sdk.AddressDetails;
import yapily.sdk.Amount;
import yapily.sdk.Balance;
import yapily.sdk.ChargeDetails;
import yapily.sdk.CurrencyExchange;
import yapily.sdk.IsoBankTransactionCode;
import yapily.sdk.Merchant;
import yapily.sdk.ProprietaryBankTransactionCode;
import yapily.sdk.StatementReference;

/**
 * Transaction
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Transaction {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("date")
  private OffsetDateTime date = null;

  @JsonProperty("bookingDateTime")
  private OffsetDateTime bookingDateTime = null;

  @JsonProperty("valueDateTime")
  private OffsetDateTime valueDateTime = null;

  /**
   * The status of the transaction
   */
  public enum StatusEnum {
    BOOKED("BOOKED"),
    
    PENDING("PENDING");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("status")
  private StatusEnum status = null;

  @JsonProperty("amount")
  private BigDecimal amount = null;

  @JsonProperty("currency")
  private String currency = null;

  @JsonProperty("transactionAmount")
  private Amount transactionAmount = null;

  @JsonProperty("currencyExchange")
  private CurrencyExchange currencyExchange = null;

  @JsonProperty("chargeDetails")
  private ChargeDetails chargeDetails = null;

  @JsonProperty("reference")
  private String reference = null;

  @JsonProperty("statementReferences")
  private List<StatementReference> statementReferences = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("transactionInformation")
  private List<String> transactionInformation = null;

  @JsonProperty("addressDetails")
  private AddressDetails addressDetails = null;

  @JsonProperty("isoBankTransactionCode")
  private IsoBankTransactionCode isoBankTransactionCode = null;

  @JsonProperty("proprietaryBankTransactionCode")
  private ProprietaryBankTransactionCode proprietaryBankTransactionCode = null;

  @JsonProperty("balance")
  private Balance balance = null;

  @JsonProperty("merchant")
  private Merchant merchant = null;

}

