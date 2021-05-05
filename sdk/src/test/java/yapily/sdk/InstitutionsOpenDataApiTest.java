/*
 * Yapily API
 * To access endpoints that require authentication, use your application key and secret created in the Dashboard (https://dashboard.yapily.com)
 *
 * OpenAPI spec version: 0.0.338
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package yapily.sdk;

import yapily.ApiException;
import yapily.sdk.ApiResponseOfListOfATMOpenDataResponse;
import yapily.sdk.ApiResponseOfListOfPersonalCurrentAccountData;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for InstitutionsOpenDataApi
 */
@Ignore
public class InstitutionsOpenDataApiTest {

    private final InstitutionsOpenDataApi api = new InstitutionsOpenDataApi();

    
    /**
     * Retrieves data about all ATMs of the selected institution
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getATMDataUsingGETTest() throws ApiException {
        String institutionId = null;
        ApiResponseOfListOfATMOpenDataResponse response = api.getATMDataUsingGET(institutionId);

        // TODO: test validations
    }
    
    /**
     * Retrieves details of personal current accounts for an institution
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPersonalCurrentAccountsUsingGETTest() throws ApiException {
        String institutionId = null;
        ApiResponseOfListOfPersonalCurrentAccountData response = api.getPersonalCurrentAccountsUsingGET(institutionId);

        // TODO: test validations
    }
    
}
