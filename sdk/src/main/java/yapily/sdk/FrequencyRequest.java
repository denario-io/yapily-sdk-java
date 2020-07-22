/*
 * Yapily API
 * To access endpoints that require authentication, use your application key and secret created in the Dashboard (https://dashboard.yapily.com)
 *
 * OpenAPI spec version: 0.0.213
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
 * FrequencyRequest
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class FrequencyRequest {
  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    DAILY("DAILY"),
    
    EVERY_WORKING_DAY("EVERY_WORKING_DAY"),
    
    CALENDAR_DAY("CALENDAR_DAY"),
    
    WEEKLY("WEEKLY"),
    
    EVERY_TWO_WEEKS("EVERY_TWO_WEEKS"),
    
    MONTHLY("MONTHLY"),
    
    EVERY_TWO_MONTHS("EVERY_TWO_MONTHS"),
    
    QUARTERLY("QUARTERLY"),
    
    SEMIANNUAL("SEMIANNUAL"),
    
    ANNUAL("ANNUAL");

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

  @JsonProperty("intervalWeek")
  private Integer intervalWeek = null;

  @JsonProperty("intervalMonth")
  private Integer intervalMonth = null;

  @JsonProperty("executionDay")
  private Integer executionDay = null;

}

