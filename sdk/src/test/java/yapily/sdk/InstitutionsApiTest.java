/*
 * Yapily API
 * To access endpoints that require authentication, use your application key and secret created in the Dashboard (https://dashboard.yapily.com)
 *
 * OpenAPI spec version: 0.0.191
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package yapily.sdk;

import yapily.ApiException;
import yapily.sdk.ApiListResponseOfFeatureDetails;
import yapily.sdk.ApiListResponseOfInstitution;
import yapily.sdk.Institution;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for InstitutionsApi
 */
@Ignore
public class InstitutionsApiTest {

    private final InstitutionsApi api = new InstitutionsApi();

    
    /**
     * Retrieve details for Yapily&#39;s institution features
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFeatureDetailsUsingGETTest() throws ApiException {
        ApiListResponseOfFeatureDetails response = api.getFeatureDetailsUsingGET();

        // TODO: test validations
    }
    
    /**
     * Retrieves details of a specific institution available in Yapily
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInstitutionUsingGETTest() throws ApiException {
        String institutionId = null;
        Institution response = api.getInstitutionUsingGET(institutionId);

        // TODO: test validations
    }
    
    /**
     * Retrieves the list of institutions available in Yapily
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInstitutionsUsingGETTest() throws ApiException {
        ApiListResponseOfInstitution response = api.getInstitutionsUsingGET();

        // TODO: test validations
    }
    
}
