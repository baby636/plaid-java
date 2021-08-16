package com.plaid.client.integration;

import com.plaid.client.PlaidClient;
import com.plaid.client.request.AssetReportRemoveRequest;
import com.plaid.client.request.common.Product;
import com.plaid.client.response.AssetReportCreateResponse;
import com.plaid.client.response.AssetReportRemoveResponse;
import org.junit.Test;
import retrofit2.Response;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class AssetReportRemoveTest extends AbstractItemIntegrationTest {

  @Override
  protected List<Product> setupItemProducts() {
    return Arrays.asList(Product.ASSETS);
  }

  @Override
  protected String setupItemInstitutionId() {
    return TARTAN_BANK_INSTITUTION_ID;
  }

  @Test
  public void testAssetReportRemoveSuccess() throws Exception {
    // Create asset report to get an asset report token
    PlaidClient client = client();
    List<String> accessTokens = Arrays.asList(getItemPublicTokenExchangeResponse().getAccessToken());
    Response<AssetReportCreateResponse> createResponse = AssetReportCreateTest.createAssetReport(client, accessTokens);
    String assetReportToken = createResponse.body().getAssetReportToken();

    // Poll Plaid till report is ready
    AssetReportGetTest.waitTillReady(client, assetReportToken);

    Response<AssetReportRemoveResponse> response =
      client
        .service()
        .assetReportRemove(new AssetReportRemoveRequest(assetReportToken))
        .execute();
    assertTrue(response.body().isRemoved());
  }
}
