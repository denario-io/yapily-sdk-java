/*
 * Yapily API
 * To access endpoints that require authentication, use your application key and secret created in the Dashboard (https://dashboard.yapily.com)
 *
 * OpenAPI spec version: 0.0.221
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
import yapily.sdk.OtherResidencyType;

/**
 * Countries in which an accountholder can reside and, therefore, be eligible to open an account
 */
@ApiModel(description = "Countries in which an accountholder can reside and, therefore, be eligible to open an account")
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResidencyEligibility {
  @JsonProperty("Notes")
  private List<String> notes = null;

  @JsonProperty("OtherResidencyType")
  private OtherResidencyType otherResidencyType = null;

  @JsonProperty("ResidencyIncluded")
  private List<String> residencyIncluded = null;

  /**
   * Gets or Sets residencyType
   */
  public enum ResidencyTypeEnum {
    HOUSEHOLDER("Householder"),
    
    OTHER("Other");

    private String value;

    ResidencyTypeEnum(String value) {
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
    public static ResidencyTypeEnum fromValue(String text) {
      for (ResidencyTypeEnum b : ResidencyTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("ResidencyType")
  private ResidencyTypeEnum residencyType = null;

}

