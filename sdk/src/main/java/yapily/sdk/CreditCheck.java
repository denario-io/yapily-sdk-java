/*
 * Yapily API
 * To access endpoints that require authentication, use your application key and secret created in the Dashboard (https://dashboard.yapily.com)
 *
 * OpenAPI spec version: 0.0.345
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

/**
 * Credit check criteria that the account holder will need to meet to take out the PCA product
 */
@ApiModel(description = "Credit check criteria that the account holder will need to meet to take out the PCA product")
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreditCheck {
  @JsonProperty("Notes")
  private List<String> notes = null;

  /**
   * Gets or Sets scoringType
   */
  public enum ScoringTypeEnum {
    HARD("Hard"),
    
    SOFT("Soft");

    private String value;

    ScoringTypeEnum(String value) {
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
    public static ScoringTypeEnum fromValue(String text) {
      for (ScoringTypeEnum b : ScoringTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("ScoringType")
  private ScoringTypeEnum scoringType = null;

}

