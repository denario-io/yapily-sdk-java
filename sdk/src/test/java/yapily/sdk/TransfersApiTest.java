/*
 * Yapily API
 * To access endpoints that require authentication, use your application key and secret created in the Dashboard (https://dashboard.yapily.com)
 *
 * OpenAPI spec version: 0.0.245
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package yapily.sdk;

import yapily.ApiException;
import yapily.sdk.ApiResponseOfTransferResponse;
import yapily.sdk.TransferRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TransfersApi
 */
@Ignore
public class TransfersApiTest {

    private final TransfersApi api = new TransfersApi();

    
    /**
     * Transfer money from one account to another account accessible with the same consent
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void transferUsingPUTTest() throws ApiException {
        String consent = null;
        String accountId = null;
        TransferRequest transferRequest = null;
        ApiResponseOfTransferResponse response = api.transferUsingPUT(consent, accountId, transferRequest);

        // TODO: test validations
    }
    
}
