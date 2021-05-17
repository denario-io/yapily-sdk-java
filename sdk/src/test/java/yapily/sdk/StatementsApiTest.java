/*
 * Yapily API
 * To access endpoints that require authentication, use your application key and secret created in the Dashboard (https://dashboard.yapily.com)
 *
 * OpenAPI spec version: 0.0.343
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package yapily.sdk;

import yapily.ApiException;
import yapily.sdk.ApiListResponseOfAccountStatement;
import yapily.sdk.ApiResponseOfAccountStatement;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StatementsApi
 */
@Ignore
public class StatementsApiTest {

    private final StatementsApi api = new StatementsApi();

    
    /**
     * Get account statement file
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStatementFileUsingGETTest() throws ApiException {
        String consent = null;
        String accountId = null;
        String statementId = null;
        String xYapilyApiVersion = null;
        String response = api.getStatementFileUsingGET(consent, accountId, statementId, xYapilyApiVersion);

        // TODO: test validations
    }
    
    /**
     * Get account statement
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStatementUsingGETTest() throws ApiException {
        String consent = null;
        String accountId = null;
        String statementId = null;
        String xYapilyApiVersion = null;
        ApiResponseOfAccountStatement response = api.getStatementUsingGET(consent, accountId, statementId, xYapilyApiVersion);

        // TODO: test validations
    }
    
    /**
     * Get account statements
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStatementsUsingGETTest() throws ApiException {
        String consent = null;
        String accountId = null;
        String xYapilyApiVersion = null;
        String from = null;
        String before = null;
        Integer limit = null;
        String sort = null;
        Integer offset = null;
        ApiListResponseOfAccountStatement response = api.getStatementsUsingGET(consent, accountId, xYapilyApiVersion, from, before, limit, sort, offset);

        // TODO: test validations
    }
    
}
