/*
 * Yapily API
 * To access endpoints that require authentication, use your application key and secret created in the Dashboard (https://dashboard.yapily.com)
 *
 * OpenAPI spec version: 0.0.353
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package yapily.sdk;

import yapily.ApiException;
import yapily.sdk.ApiListResponseOfConsent;
import yapily.sdk.ApiResponseOfAuthorisationRequestResponse;
import yapily.sdk.ApiResponseOfConsent;
import yapily.sdk.ApiResponseOfConsentDeleteResponse;
import yapily.sdk.Consent;
import yapily.sdk.ConsentAuthCodeRequest;
import yapily.sdk.CreateConsentAccessToken;
import yapily.sdk.OneTimeTokenRequest;
import yapily.sdk.PreAuthorisationRequest;
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
        String xYapilyApiVersion = null;
        Consent response = api.addConsentUsingPOST(userUuid, createConsentAccessToken, xYapilyApiVersion);

        // TODO: test validations
    }
    
    /**
     * Post auth-code and auth-state
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createConsentWithCodeUsingPOSTTest() throws ApiException {
        ConsentAuthCodeRequest consentByAuthCode = null;
        String xYapilyApiVersion = null;
        Consent response = api.createConsentWithCodeUsingPOST(consentByAuthCode, xYapilyApiVersion);

        // TODO: test validations
    }
    
    /**
     * Initiate request for user to pre authorise
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createPreAuthorisationRequestUsingPOSTTest() throws ApiException {
        PreAuthorisationRequest preAuthorisationRequest = null;
        String xYapilyApiVersion = null;
        ApiResponseOfAuthorisationRequestResponse response = api.createPreAuthorisationRequestUsingPOST(preAuthorisationRequest, xYapilyApiVersion);

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
        String xYapilyApiVersion = null;
        Boolean forceDelete = null;
        ApiResponseOfConsentDeleteResponse response = api.deleteUsingDELETE(consentId, xYapilyApiVersion, forceDelete);

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
        String xYapilyApiVersion = null;
        ApiResponseOfConsent response = api.getConsentByIdUsingGET(consentId, xYapilyApiVersion);

        // TODO: test validations
    }
    
    /**
     * Post one time token
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getConsentBySingleAccessConsentUsingPOSTTest() throws ApiException {
        OneTimeTokenRequest oneTimeToken = null;
        String xYapilyApiVersion = null;
        Consent response = api.getConsentBySingleAccessConsentUsingPOST(oneTimeToken, xYapilyApiVersion);

        // TODO: test validations
    }
    
    /**
     * Get consents sorted by creation date
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getConsentsUsingGETTest() throws ApiException {
        String xYapilyApiVersion = null;
        List<String> filterApplicationUserId = null;
        List<String> filterUserUuid = null;
        List<String> filterInstitution = null;
        List<String> filterStatus = null;
        String from = null;
        String before = null;
        Integer limit = null;
        Integer offset = null;
        ApiListResponseOfConsent response = api.getConsentsUsingGET(xYapilyApiVersion, filterApplicationUserId, filterUserUuid, filterInstitution, filterStatus, from, before, limit, offset);

        // TODO: test validations
    }
    
    /**
     * Get latest user consents
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserConsentsUsingGETTest() throws ApiException {
        String userUuid = null;
        String xYapilyApiVersion = null;
        String filterInstitution = null;
        Integer limit = null;
        List<Consent> response = api.getUserConsentsUsingGET(userUuid, xYapilyApiVersion, filterInstitution, limit);

        // TODO: test validations
    }
    
}
