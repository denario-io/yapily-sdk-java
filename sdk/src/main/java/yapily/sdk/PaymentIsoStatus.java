/*
 * Yapily API
 * To access endpoints that require authentication, use your application key and secret created in the Dashboard (https://dashboard.yapily.com)
 *
 * OpenAPI spec version: 0.0.342
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
 * PaymentIsoStatus
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class PaymentIsoStatus {
  /**
   * Gets or Sets code
   */
  public enum CodeEnum {
    ACCC("ACCC"),
    
    ACCP("ACCP"),
    
    ACSC("ACSC"),
    
    ACSP("ACSP"),
    
    ACTC("ACTC"),
    
    ACWC("ACWC"),
    
    ACWP("ACWP"),
    
    RCVD("RCVD"),
    
    PDNG("PDNG"),
    
    RJCT("RJCT"),
    
    CANC("CANC"),
    
    ACFC("ACFC"),
    
    PATC("PATC"),
    
    PART("PART");

    private String value;

    CodeEnum(String value) {
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
    public static CodeEnum fromValue(String text) {
      for (CodeEnum b : CodeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("code")
  private CodeEnum code = null;

  @JsonProperty("name")
  private String name = null;

}

