/*
 * Yapily API
 * To access endpoints that require authentication, use your application key and secret created in the Dashboard (https://dashboard.yapily.com)
 *
 * OpenAPI spec version: 0.0.317
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package yapily.sdk;

import yapily.ApiException;
import yapily.sdk.AccountAuthorisationRequest;
import yapily.sdk.ApiListResponseOfAccount;
import yapily.sdk.ApiListResponseOfPaymentResponse;
import yapily.sdk.ApiResponseOfAccount;
import yapily.sdk.ApiResponseOfAuthorisationRequestResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AccountsApi
 */
@Ignore
public class AccountsApiTest {

    private final AccountsApi api = new AccountsApi();

    
    /**
     * Get account direct debits
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAccountDirectDebitsUsingGETTest() throws ApiException {
        String accountId = null;
        String consent = null;
        Integer limit = null;
        ApiListResponseOfPaymentResponse response = api.getAccountDirectDebitsUsingGET(accountId, consent, limit);

        // TODO: test validations
    }
    
    /**
     * Get account payments detail
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAccountPeriodicPaymentsUsingGETTest() throws ApiException {
        String accountId = null;
        String consent = null;
        Integer limit = null;
        ApiListResponseOfPaymentResponse response = api.getAccountPeriodicPaymentsUsingGET(accountId, consent, limit);

        // TODO: test validations
    }
    
    /**
     * Get account scheduled payments
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAccountScheduledPaymentsUsingGETTest() throws ApiException {
        String accountId = null;
        String consent = null;
        Integer limit = null;
        ApiListResponseOfPaymentResponse response = api.getAccountScheduledPaymentsUsingGET(accountId, consent, limit);

        // TODO: test validations
    }
    
    /**
     * Get account
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAccountUsingGETTest() throws ApiException {
        String consent = null;
        String accountId = null;
        ApiResponseOfAccount response = api.getAccountUsingGET(consent, accountId);

        // TODO: test validations
    }
    
    /**
     * Get accounts
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAccountsUsingGETTest() throws ApiException {
        String consent = null;
        ApiListResponseOfAccount response = api.getAccountsUsingGET(consent);

        // TODO: test validations
    }
    
    /**
     * Initiate a new account request for user to authorize
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void initiateAccountRequestUsingPOSTTest() throws ApiException {
        AccountAuthorisationRequest accountAuthRequest = null;
        String psuId = null;
        String psuCorporateId = null;
        String psuIpAddress = null;
        ApiResponseOfAuthorisationRequestResponse response = api.initiateAccountRequestUsingPOST(accountAuthRequest, psuId, psuCorporateId, psuIpAddress);

        // TODO: test validations
    }
    
    /**
     * Re-authorize account request
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void reAuthoriseAccountUsingPATCHTest() throws ApiException {
        String consent = null;
        String psuId = null;
        String psuCorporateId = null;
        String psuIpAddress = null;
        ApiResponseOfAuthorisationRequestResponse response = api.reAuthoriseAccountUsingPATCH(consent, psuId, psuCorporateId, psuIpAddress);

        // TODO: test validations
    }
    
    /**
     * Update pre authorize consent for user to authorise account
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updatePreAuthoriseAccountConsentUsingPUTTest() throws ApiException {
        String consent = null;
        AccountAuthorisationRequest accountAuthRequest = null;
        String psuId = null;
        String psuCorporateId = null;
        String psuIpAddress = null;
        ApiResponseOfAuthorisationRequestResponse response = api.updatePreAuthoriseAccountConsentUsingPUT(consent, accountAuthRequest, psuId, psuCorporateId, psuIpAddress);

        // TODO: test validations
    }
    
}
