/*
 * Yapily API
 * To access endpoints that require authentication, use your application key and secret created in the Dashboard (https://dashboard.yapily.com)
 *
 * OpenAPI spec version: 0.0.300
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
 * IdentityAddress
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class IdentityAddress {
  @JsonProperty("addressLines")
  private List<String> addressLines = null;

  @JsonProperty("city")
  private String city = null;

  @JsonProperty("postalCode")
  private String postalCode = null;

  @JsonProperty("country")
  private String country = null;

  @JsonProperty("streetName")
  private String streetName = null;

  @JsonProperty("buildingNumber")
  private String buildingNumber = null;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    BUSINESS("BUSINESS"),
    
    CORRESPONDENCE("CORRESPONDENCE"),
    
    DELIVERY_TO("DELIVERY_TO"),
    
    MAIL_TO("MAIL_TO"),
    
    PO_BOX("PO_BOX"),
    
    POSTAL("POSTAL"),
    
    RESIDENTIAL("RESIDENTIAL"),
    
    STATEMENT("STATEMENT"),
    
    UNKNOWN("UNKNOWN");

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

  @JsonProperty("county")
  private String county = null;

}

