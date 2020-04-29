/*
 * Yapily API
 * To access endpoints that require authentication, use your application key and secret created in the Dashboard (https://dashboard.yapily.com)
 *
 * OpenAPI spec version: 0.0.183
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package yapily.sdk;

import yapily.ApiException;
import yapily.sdk.ApiResponseOfAuthorisationRequestResponse;
import yapily.sdk.ApiResponseOfPaymentAuthorisationRequestResponse;
import yapily.sdk.ApiResponseOfPaymentResponse;
import yapily.sdk.ApiResponseOfPaymentResponses;
import yapily.sdk.PaymentAuthorisationRequest;
import yapily.sdk.PaymentRequest;
import yapily.sdk.SortCodePaymentAuthRequest;
import yapily.sdk.SortCodePaymentRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PaymentsApi
 */
@Ignore
public class PaymentsApiTest {

    private final PaymentsApi api = new PaymentsApi();

    
    /**
     * Initiate a payment for user to authorise
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createPaymentAuthorisationUsingPOSTTest() throws ApiException {
        PaymentAuthorisationRequest paymentAuthRequest = null;
        ApiResponseOfPaymentAuthorisationRequestResponse response = api.createPaymentAuthorisationUsingPOST(paymentAuthRequest);

        // TODO: test validations
    }
    
    /**
     * Initiate a new single payment for user to authorise
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createPaymentAuthorisationWithSortCodeUsingPOSTTest() throws ApiException {
        SortCodePaymentAuthRequest paymentAuthRequest = null;
        ApiResponseOfAuthorisationRequestResponse response = api.createPaymentAuthorisationWithSortCodeUsingPOST(paymentAuthRequest);

        // TODO: test validations
    }
    
    /**
     * Create a payment
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createPaymentUsingPOSTTest() throws ApiException {
        String consent = null;
        PaymentRequest paymentRequest = null;
        ApiResponseOfPaymentResponse response = api.createPaymentUsingPOST(consent, paymentRequest);

        // TODO: test validations
    }
    
    /**
     * Create a new single payment
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createPaymentWithSortCodeUsingPOSTTest() throws ApiException {
        String consent = null;
        SortCodePaymentRequest paymentRequest = null;
        ApiResponseOfPaymentResponse response = api.createPaymentWithSortCodeUsingPOST(consent, paymentRequest);

        // TODO: test validations
    }
    
    /**
     * Get status of a payment
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPaymentStatusUsingGETTest() throws ApiException {
        String paymentId = null;
        String consent = null;
        ApiResponseOfPaymentResponse response = api.getPaymentStatusUsingGET(paymentId, consent);

        // TODO: test validations
    }
    
    /**
     * Get payments detail
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPaymentsUsingGETTest() throws ApiException {
        String paymentId = null;
        String consent = null;
        ApiResponseOfPaymentResponses response = api.getPaymentsUsingGET(paymentId, consent);

        // TODO: test validations
    }
    
}
