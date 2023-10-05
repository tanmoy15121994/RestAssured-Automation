package endpoints;

public class Routes {
	
	public static String base_url="https://petstore.swagger.io/v2";
	
	//User
	
	public static String post_url=base_url+"/user";
	public static String get_url=base_url+"/user/{username}";
	public static String update_url=base_url+"/user/{username}";
	public static String delete_url=base_url+"/user/{username}";

	//Store
	
	public static String Spost_url=base_url+"/store/order";
	public static String Sget_url=base_url+"/store/order/{orderId}";
	public static String Sdelete_url=base_url+"/store/order/{orderId}";
	
	//pet
	
	public static String Ppost_url=base_url+"/pet";
	public static String Pget_url=base_url+"/pet/{petId}";
	public static String Pupdate_url=base_url+"/pet/{petId}";
	public static String Pdelete_url=base_url+"/pet/{PetId}";
	
}

