package yapily.sdk;

import yapily.ApiException;
import yapily.ApiClient;
import yapily.Configuration;
import yapily.Pair;

import javax.ws.rs.core.GenericType;

import yapily.sdk.ApiResponseOfPaymentEmbeddedAuthorisationRequestResponse;
import yapily.sdk.PaymentEmbeddedAuthorisationRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-06-10T10:19:56.418Z")
public class EmbeddedPaymentsApi {
  private ApiClient apiClient;

  public EmbeddedPaymentsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public EmbeddedPaymentsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Initiate an embedded payment for user to authorise
   * 
   * @param paymentAuthRequest paymentAuthRequest (required)
   * @param xYapilyApiVersion Api Version (optional)
   * @param psuId PSU ID (optional)
   * @param psuCorporateId PSU ID CORPORATE (optional)
   * @param psuIpAddress PSU IP ADDRESS (optional)
   * @return ApiResponseOfPaymentEmbeddedAuthorisationRequestResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponseOfPaymentEmbeddedAuthorisationRequestResponse createEmbeddedPaymentAuthorisationUsingPOST(PaymentEmbeddedAuthorisationRequest paymentAuthRequest, String xYapilyApiVersion, String psuId, String psuCorporateId, String psuIpAddress) throws ApiException {
    Object localVarPostBody = paymentAuthRequest;
    
    // verify the required parameter 'paymentAuthRequest' is set
    if (paymentAuthRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'paymentAuthRequest' when calling createEmbeddedPaymentAuthorisationUsingPOST");
    }
    
    // create path and map variables
    String localVarPath = "/embedded-payment-auth-requests";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (xYapilyApiVersion != null)
      localVarHeaderParams.put("x-yapily-api-version", apiClient.parameterToString(xYapilyApiVersion));
if (psuId != null)
      localVarHeaderParams.put("psu-id", apiClient.parameterToString(psuId));
if (psuCorporateId != null)
      localVarHeaderParams.put("psu-corporate-id", apiClient.parameterToString(psuCorporateId));
if (psuIpAddress != null)
      localVarHeaderParams.put("psu-ip-address", apiClient.parameterToString(psuIpAddress));

    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json;charset=UTF-8"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth", "tokenAuth" };

    GenericType<ApiResponseOfPaymentEmbeddedAuthorisationRequestResponse> localVarReturnType = new GenericType<ApiResponseOfPaymentEmbeddedAuthorisationRequestResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Update an embedded payment initiation with SCA info
   * 
   * @param consentId Consent Id (required)
   * @param paymentAuthRequest paymentAuthRequest (required)
   * @param xYapilyApiVersion Api Version (optional)
   * @param psuId PSU ID (optional)
   * @param psuCorporateId PSU ID CORPORATE (optional)
   * @param psuIpAddress PSU IP ADDRESS (optional)
   * @return ApiResponseOfPaymentEmbeddedAuthorisationRequestResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponseOfPaymentEmbeddedAuthorisationRequestResponse updateEmbeddedPaymentAuthorisationUsingPUT(String consentId, PaymentEmbeddedAuthorisationRequest paymentAuthRequest, String xYapilyApiVersion, String psuId, String psuCorporateId, String psuIpAddress) throws ApiException {
    Object localVarPostBody = paymentAuthRequest;
    
    // verify the required parameter 'consentId' is set
    if (consentId == null) {
      throw new ApiException(400, "Missing the required parameter 'consentId' when calling updateEmbeddedPaymentAuthorisationUsingPUT");
    }
    
    // verify the required parameter 'paymentAuthRequest' is set
    if (paymentAuthRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'paymentAuthRequest' when calling updateEmbeddedPaymentAuthorisationUsingPUT");
    }
    
    // create path and map variables
    String localVarPath = "/embedded-payment-auth-requests/{consentId}"
      .replaceAll("\\{" + "consentId" + "\\}", apiClient.escapeString(consentId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (xYapilyApiVersion != null)
      localVarHeaderParams.put("x-yapily-api-version", apiClient.parameterToString(xYapilyApiVersion));
if (psuId != null)
      localVarHeaderParams.put("psu-id", apiClient.parameterToString(psuId));
if (psuCorporateId != null)
      localVarHeaderParams.put("psu-corporate-id", apiClient.parameterToString(psuCorporateId));
if (psuIpAddress != null)
      localVarHeaderParams.put("psu-ip-address", apiClient.parameterToString(psuIpAddress));

    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json;charset=UTF-8"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth", "tokenAuth" };

    GenericType<ApiResponseOfPaymentEmbeddedAuthorisationRequestResponse> localVarReturnType = new GenericType<ApiResponseOfPaymentEmbeddedAuthorisationRequestResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
