/*
 * Yapily API
 * To access endpoints that require authentication, use your application key and secret created in the Dashboard (https://dashboard.yapily.com)
 *
 * OpenAPI spec version: 0.0.331
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package yapily.sdk;

import yapily.ApiException;
import yapily.sdk.ApiResponseOfListOfBeneficiary;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BeneficiariesApi
 */
@Ignore
public class BeneficiariesApiTest {

    private final BeneficiariesApi api = new BeneficiariesApi();

    
    /**
     * Get beneficiaries
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBeneficiariesUsingGETTest() throws ApiException {
        String accountId = null;
        String consent = null;
        ApiResponseOfListOfBeneficiary response = api.getBeneficiariesUsingGET(accountId, consent);

        // TODO: test validations
    }
    
}
