package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import endpoints.StoreEndPoints;
import io.restassured.response.Response;


public class StoreTests {
	
	public String responsebody;
	
	@Test(priority=1)
	public void testPostStore() 
	{
		Response response = StoreEndPoints.createStore();
		response.then().log().all();
		Assert.assertEquals(response.getStatusCode(), 200);
		
	}
	
	@Test(priority=2)
	public void testGetInventory()
	{
		Response response =StoreEndPoints.getStoreInventory();
		response.then().log().all();
		Assert.assertEquals(response.getStatusCode(), 200);
		responsebody = response.getBody().prettyPrint();
	}
}

