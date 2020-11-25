/*
 * Yapily API
 * To access endpoints that require authentication, use your application key and secret created in the Dashboard (https://dashboard.yapily.com)
 *
 * OpenAPI spec version: 0.0.280
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package yapily.sdk;

import yapily.ApiException;
import yapily.sdk.ApiResponseOfAuthorisationRequestResponse;
import yapily.sdk.PreAuthorisationRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PreAuthConsentControllerApi
 */
@Ignore
public class PreAuthConsentControllerApiTest {

    private final PreAuthConsentControllerApi api = new PreAuthConsentControllerApi();

    
    /**
     * Initiate request for user to pre authorise
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createPreAuthorisationUsingPOSTTest() throws ApiException {
        PreAuthorisationRequest preAuthorisationRequest = null;
        ApiResponseOfAuthorisationRequestResponse response = api.createPreAuthorisationUsingPOST(preAuthorisationRequest);

        // TODO: test validations
    }
    
}
