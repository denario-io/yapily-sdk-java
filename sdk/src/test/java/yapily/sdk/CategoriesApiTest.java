/*
 * Yapily API
 * To access endpoints that require authentication, use your application key and secret created in the Dashboard (https://dashboard.yapily.com)
 *
 * OpenAPI spec version: 0.0.401
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package yapily.sdk;

import yapily.ApiException;
import yapily.sdk.ApiListResponseOfCategory;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CategoriesApi
 */
@Ignore
public class CategoriesApiTest {

    private final CategoriesApi api = new CategoriesApi();

    
    /**
     * Retrieves a list of categories returned by the Yapily Categorisation engine for a given locale
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCategoriesUsingGETTest() throws ApiException {
        String country = null;
        String xYapilyApiVersion = null;
        ApiListResponseOfCategory response = api.getCategoriesUsingGET(country, xYapilyApiVersion);

        // TODO: test validations
    }
    
}
