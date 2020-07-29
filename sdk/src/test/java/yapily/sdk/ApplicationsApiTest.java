/*
 * Yapily API
 * To access endpoints that require authentication, use your application key and secret created in the Dashboard (https://dashboard.yapily.com)
 *
 * OpenAPI spec version: 0.0.216
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package yapily.sdk;

import yapily.ApiException;
import yapily.sdk.Application;
import yapily.sdk.ResponseEntity;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ApplicationsApi
 */
@Ignore
public class ApplicationsApiTest {

    private final ApplicationsApi api = new ApplicationsApi();

    
    /**
     * Returns the details of the application that owns the request credentials
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getApplicationMeUsingGETTest() throws ApiException {
        Application response = api.getApplicationMeUsingGET();

        // TODO: test validations
    }
    
    /**
     * JSON Web Key Set (JWKS) for authenticated application
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getJwksUsingGETTest() throws ApiException {
        Object response = api.getJwksUsingGET();

        // TODO: test validations
    }
    
    /**
     * Revoke existing access tokens for application, which will also generate a new public key discoverable via /jwks
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void revokeTokensUsingPOSTTest() throws ApiException {
        ResponseEntity response = api.revokeTokensUsingPOST();

        // TODO: test validations
    }
    
}
