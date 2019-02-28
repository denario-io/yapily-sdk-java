/*
 * Yapily API
 * To access endpoints that require authentication, use your Application key and secret created in the Dashboard (https://dashboard.yapily.com)
 *
 * OpenAPI spec version: 0.0.88
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package yapily.sdk;

import yapily.ApiException;
import yapily.sdk.ApiResponseOfConsent;
import yapily.sdk.Consent;
import yapily.sdk.CreateConsentAccessToken;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ConsentsApi
 */
@Ignore
public class ConsentsApiTest {

    private final ConsentsApi api = new ConsentsApi();

    
    /**
     * Post consent
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addConsentUsingPOSTTest() throws ApiException {
        String userUuid = null;
        CreateConsentAccessToken createConsentAccessToken = null;
        Consent response = api.addConsentUsingPOST(userUuid, createConsentAccessToken);

        // TODO: test validations
    }
    
    /**
     * Delete consent
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteUsingDELETETest() throws ApiException {
        String consentId = null;
        Object response = api.deleteUsingDELETE(consentId);

        // TODO: test validations
    }
    
    /**
     * Get consent
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getConsentByIdUsingGETTest() throws ApiException {
        String consentId = null;
        ApiResponseOfConsent response = api.getConsentByIdUsingGET(consentId);

        // TODO: test validations
    }
    
    /**
     * Get user consents
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserConsentsUsingGETTest() throws ApiException {
        String userUuid = null;
        String institutionId = null;
        List<Consent> response = api.getUserConsentsUsingGET(userUuid, institutionId);

        // TODO: test validations
    }
    
}
