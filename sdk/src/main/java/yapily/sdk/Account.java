/*
 * Yapily API
 * To access endpoints that require authentication, use your application key and secret created in the Dashboard (https://dashboard.yapily.com)
 *
 * OpenAPI spec version: 0.0.325
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
import java.util.ArrayList;
import java.util.List;
import yapily.sdk.AccountBalance;
import yapily.sdk.AccountIdentification;
import yapily.sdk.AccountName;

/**
 * Account
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Account {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("balance")
  private BigDecimal balance = null;

  @JsonProperty("currency")
  private String currency = null;

  /**
   * Gets or Sets usageType
   */
  public enum UsageTypeEnum {
    PERSONAL("PERSONAL"),
    
    BUSINESS("BUSINESS"),
    
    OTHER("OTHER"),
    
    UNKNOWN("UNKNOWN");

    private String value;

    UsageTypeEnum(String value) {
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
    public static UsageTypeEnum fromValue(String text) {
      for (UsageTypeEnum b : UsageTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("usageType")
  private UsageTypeEnum usageType = null;

  /**
   * Gets or Sets accountType
   */
  public enum AccountTypeEnum {
    CASH_TRADING("CASH_TRADING"),
    
    CASH_INCOME("CASH_INCOME"),
    
    CASH_PAYMENT("CASH_PAYMENT"),
    
    CHARGE_CARD("CHARGE_CARD"),
    
    CHARGES("CHARGES"),
    
    COMMISSION("COMMISSION"),
    
    CREDIT_CARD("CREDIT_CARD"),
    
    CURRENT("CURRENT"),
    
    E_MONEY("E_MONEY"),
    
    LIMITED_LIQUIDITY_SAVINGS_ACCOUNT("LIMITED_LIQUIDITY_SAVINGS_ACCOUNT"),
    
    LOAN("LOAN"),
    
    MARGINAL_LENDING("MARGINAL_LENDING"),
    
    MONEY_MARKET("MONEY_MARKET"),
    
    MORTGAGE("MORTGAGE"),
    
    NON_RESIDENT_EXTERNAL("NON_RESIDENT_EXTERNAL"),
    
    OTHER("OTHER"),
    
    OVERDRAFT("OVERDRAFT"),
    
    OVERNIGHT_DEPOSIT("OVERNIGHT_DEPOSIT"),
    
    PREPAID_CARD("PREPAID_CARD"),
    
    SALARY("SALARY"),
    
    SAVINGS("SAVINGS"),
    
    SETTLEMENT("SETTLEMENT"),
    
    TAX("TAX"),
    
    UNKNOWN("UNKNOWN");

    private String value;

    AccountTypeEnum(String value) {
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
    public static AccountTypeEnum fromValue(String text) {
      for (AccountTypeEnum b : AccountTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("accountType")
  private AccountTypeEnum accountType = null;

  @JsonProperty("nickname")
  private String nickname = null;

  @JsonProperty("details")
  private String details = null;

  @JsonProperty("accountNames")
  private List<AccountName> accountNames = null;

  @JsonProperty("accountIdentifications")
  private List<AccountIdentification> accountIdentifications = null;

  @JsonProperty("accountBalances")
  private List<AccountBalance> accountBalances = null;

}

