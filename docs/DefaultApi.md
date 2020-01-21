# DefaultApi

All URIs are relative to *https://chompthis.com/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**foodBrandedBarcodePhpGet**](DefaultApi.md#foodBrandedBarcodePhpGet) | **GET** /food/branded/barcode.php | Get a branded food item using a barcode
[**foodBrandedIdPhpGet**](DefaultApi.md#foodBrandedIdPhpGet) | **GET** /food/branded/id.php | Get a branded food item using an ID number
[**foodBrandedNamePhpGet**](DefaultApi.md#foodBrandedNamePhpGet) | **GET** /food/branded/name.php | Get a branded food item by name
[**foodBrandedSearchPhpGet**](DefaultApi.md#foodBrandedSearchPhpGet) | **GET** /food/branded/search.php | Get data for branded food items using various search parameters
[**foodIngredientSearchPhpGet**](DefaultApi.md#foodIngredientSearchPhpGet) | **GET** /food/ingredient/search.php | Get raw/generic food ingredient item(s)

<a name="foodBrandedBarcodePhpGet"></a>
# **foodBrandedBarcodePhpGet**
> BrandedFoodObject foodBrandedBarcodePhpGet(code)

Get a branded food item using a barcode

# Get data for a branded food using the food&#x27;s UPC/EAN barcode.  __Example:__ &#x60;&#x60;&#x60;https://chompthis.com/api/v2/food/branded/barcode.php?api_key&#x3D;API_KEY&amp;code&#x3D;CODE&#x60;&#x60;&#x60; 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String code = "code_example"; // String | UPC/EAN barcode  __Example:__ &code=0842234000988  __Tips:__    - Use our [food lookup tool](https://chompthis.com/api/lookup.php).   - Read [this article](https://desk.zoho.com/portal/chompthis/kb/articles/im-having-trouble-getting-matches-for-barcodes-what-can-id-do) for general tips and tricks. 
try {
    BrandedFoodObject result = apiInstance.foodBrandedBarcodePhpGet(code);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#foodBrandedBarcodePhpGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **String**| UPC/EAN barcode  __Example:__ &amp;code&#x3D;0842234000988  __Tips:__    - Use our [food lookup tool](https://chompthis.com/api/lookup.php).   - Read [this article](https://desk.zoho.com/portal/chompthis/kb/articles/im-having-trouble-getting-matches-for-barcodes-what-can-id-do) for general tips and tricks.  |

### Return type

[**BrandedFoodObject**](BrandedFoodObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="foodBrandedIdPhpGet"></a>
# **foodBrandedIdPhpGet**
> BrandedFoodObject foodBrandedIdPhpGet(id, source)

Get a branded food item using an ID number

# Get data for a branded food using Chomp&#x27;s internal ID number.  _Alternatively, set the \&quot;source\&quot; parameter to \&quot;USDA\&quot; and use the food&#x27;s FDC ID._  __Example:__ &#x60;&#x60;&#x60;https://chompthis.com/api/v2/food/branded/id.php?api_key&#x3D;API_KEY&amp;id&#x3D;ID&#x60;&#x60;&#x60; 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer id = 56; // Integer | The ID number of a branded food item.  __Example #1:__ &id=15  __Example #2:__ &id=FDC_ID&source=USDA  ___Tip:__ Get started by using our  [ood lookup tool](https://chompthis.com/api/lookup.php)._ 
String source = "source_example"; // String | Configure the endpoint to accept food IDs from various data sources. This endpoint defaults to Chomp but can accept FDC IDs.  __Example:__ &source=Chomp  ___Important Note:__ Pass in &source=USDA if you want to look up food items using a USDA FDC ID._ 
try {
    BrandedFoodObject result = apiInstance.foodBrandedIdPhpGet(id, source);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#foodBrandedIdPhpGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| The ID number of a branded food item.  __Example #1:__ &amp;id&#x3D;15  __Example #2:__ &amp;id&#x3D;FDC_ID&amp;source&#x3D;USDA  ___Tip:__ Get started by using our  [ood lookup tool](https://chompthis.com/api/lookup.php)._  |
 **source** | **String**| Configure the endpoint to accept food IDs from various data sources. This endpoint defaults to Chomp but can accept FDC IDs.  __Example:__ &amp;source&#x3D;Chomp  ___Important Note:__ Pass in &amp;source&#x3D;USDA if you want to look up food items using a USDA FDC ID._  | [optional] [enum: Chomp, USDA]

### Return type

[**BrandedFoodObject**](BrandedFoodObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="foodBrandedNamePhpGet"></a>
# **foodBrandedNamePhpGet**
> BrandedFoodObject foodBrandedNamePhpGet(name, limit, page)

Get a branded food item by name

# Search for branded food items by name.  This API endpoint is only available to Standard and Premium API subscribers. Please consider upgrading your subscription if you are subscribed to the Limited plan. _[Read this](https://desk.zoho.com/portal/chompthis/kb/articles/can-i-upgrade-downgrade-my-subscription) if you aren&#x27;t sure how to upgrade your subscription._  __Example:__ &#x60;&#x60;&#x60;https://chompthis.com/api/v2/food/branded/name.php?api_key&#x3D;API_KEY&amp;name&#x3D;NAME&#x60;&#x60;&#x60; 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String name = "name_example"; // String | Search for branded food items using a general food name keyword. This does not have to exactly match the \"official\" name for the food.  __Example:__ &name=Starburst  ___Tip:__ Get started by using our [food lookup tool](https://chompthis.com/api/lookup.php)._ 
Integer limit = 56; // Integer | Set maximum number of records you want the API to return.  __Example:__ &limit=10 
Integer page = 56; // Integer | This is how you paginate the search result. By default, you will see the first 10 records. You must increment the page number to access the next 10 records, and so on.  __Example__: &page=1 
try {
    BrandedFoodObject result = apiInstance.foodBrandedNamePhpGet(name, limit, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#foodBrandedNamePhpGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Search for branded food items using a general food name keyword. This does not have to exactly match the \&quot;official\&quot; name for the food.  __Example:__ &amp;name&#x3D;Starburst  ___Tip:__ Get started by using our [food lookup tool](https://chompthis.com/api/lookup.php)._  |
 **limit** | **Integer**| Set maximum number of records you want the API to return.  __Example:__ &amp;limit&#x3D;10  | [optional] [enum: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
 **page** | **Integer**| This is how you paginate the search result. By default, you will see the first 10 records. You must increment the page number to access the next 10 records, and so on.  __Example__: &amp;page&#x3D;1  | [optional]

### Return type

[**BrandedFoodObject**](BrandedFoodObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="foodBrandedSearchPhpGet"></a>
# **foodBrandedSearchPhpGet**
> BrandedFoodObject foodBrandedSearchPhpGet(allergen, brand, category, country, diet, ingredient, keyword, mineral, nutrient, palmOil, trace, vitamin, limit, page)

Get data for branded food items using various search parameters

# Search for branded food items using various parameters.  This API endpoint is only available to Standard and Premium API subscribers. Please consider upgrading your subscription if you are subscribed to the Limited plan. _[Read this](https://desk.zoho.com/portal/chompthis/kb/articles/can-i-upgrade-downgrade-my-subscription) if you aren&#x27;t sure how to upgrade your subscription._  __Example:__ &#x60;&#x60;&#x60;https://chompthis.com/api/v2/food/branded/search.php?api_key&#x3D;API_KEY&amp;brand&#x3D;BRAND&amp;country&#x3D;COUNTRY&amp;page&#x3D;1&#x60;&#x60;&#x60;  ___Tip:__ Get started by using the [Query Builder](https://chompthis.com/api/build.php)._ 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String allergen = "allergen_example"; // String | Filter the search to only include branded foods that contain a specific allergen.  __Example__: &allergen=Peanuts  ___Important Note:__ This parameter cannot be used alone. It must be paired with at least 1 additional parameter._ 
String brand = "brand_example"; // String | Filter the search to only include branded foods that are owned by a specific brand.  __Example__: &brand=Starbucks 
String category = "category_example"; // String | Filter the search to only include branded foods from a specific category.  __Example__: &category=Plant Based Foods 
String country = "country_example"; // String | Filter the search to only include branded foods that are sold in a specific country.  __Example__: &country=United States  ___Important Note:__ This parameter cannot be used alone. It must be paired with at least 1 additional parameter._ 
String diet = "diet_example"; // String | Filter the search to only include branded foods that are considered compatible with a specific diet.  ___Important Note:__ This parameter cannot be used alone. It must be paired with at least 1 additional parameter._ 
String ingredient = "ingredient_example"; // String | Filter the search to only include branded foods that contain a specific ingredient.  __Example__: &ingredient=Salt 
String keyword = "keyword_example"; // String | Filter the search to only include branded foods that are associated with a specific keyword.  __Example__: &keyword=Organic  ___Important Note:__ This parameter cannot be used alone. It must be paired with at least 1 additional parameter._ 
String mineral = "mineral_example"; // String | Filter the search to only include branded foods that contain a specific mineral.  __Example__: &mineral=Potassium 
String nutrient = "nutrient_example"; // String | Filter the search to only include branded foods that contain a specific nutrient.  __Example__: &nutrient=Caffeine  ___Important Note:__ This parameter cannot be used alone. It must be paired with at least 1 additional parameter._ 
String palmOil = "palmOil_example"; // String | Filter the search to only include branded foods that contain a specific ingredient made using palm oil.  __Example__: &palm_oil=E160a Beta Carotene 
String trace = "trace_example"; // String | Filter the search to only include branded foods that contain a specific trace ingredient.  __Example__: &trace=Tree Nuts  ___Important Note:__ This parameter cannot be used alone. It must be paired with at least 1 additional parameter._ 
String vitamin = "vitamin_example"; // String | Filter the search to only include branded foods that contain a specific vitamin.  __Example__: &vitamin=Biotin 
Integer limit = 56; // Integer | Set maximum number of records you want the API to return.  __Example:__ &limit=10 
Integer page = 56; // Integer | This is how you paginate the search result. By default, you will see the first 10 records. You must increment the page number to access the next 10 records, and so on.  __Example__: &page=1 
try {
    BrandedFoodObject result = apiInstance.foodBrandedSearchPhpGet(allergen, brand, category, country, diet, ingredient, keyword, mineral, nutrient, palmOil, trace, vitamin, limit, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#foodBrandedSearchPhpGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allergen** | **String**| Filter the search to only include branded foods that contain a specific allergen.  __Example__: &amp;allergen&#x3D;Peanuts  ___Important Note:__ This parameter cannot be used alone. It must be paired with at least 1 additional parameter._  | [optional]
 **brand** | **String**| Filter the search to only include branded foods that are owned by a specific brand.  __Example__: &amp;brand&#x3D;Starbucks  | [optional]
 **category** | **String**| Filter the search to only include branded foods from a specific category.  __Example__: &amp;category&#x3D;Plant Based Foods  | [optional]
 **country** | **String**| Filter the search to only include branded foods that are sold in a specific country.  __Example__: &amp;country&#x3D;United States  ___Important Note:__ This parameter cannot be used alone. It must be paired with at least 1 additional parameter._  | [optional]
 **diet** | **String**| Filter the search to only include branded foods that are considered compatible with a specific diet.  ___Important Note:__ This parameter cannot be used alone. It must be paired with at least 1 additional parameter._  | [optional] [enum: Vegan, Vegetarian, Gluten Free]
 **ingredient** | **String**| Filter the search to only include branded foods that contain a specific ingredient.  __Example__: &amp;ingredient&#x3D;Salt  | [optional]
 **keyword** | **String**| Filter the search to only include branded foods that are associated with a specific keyword.  __Example__: &amp;keyword&#x3D;Organic  ___Important Note:__ This parameter cannot be used alone. It must be paired with at least 1 additional parameter._  | [optional]
 **mineral** | **String**| Filter the search to only include branded foods that contain a specific mineral.  __Example__: &amp;mineral&#x3D;Potassium  | [optional]
 **nutrient** | **String**| Filter the search to only include branded foods that contain a specific nutrient.  __Example__: &amp;nutrient&#x3D;Caffeine  ___Important Note:__ This parameter cannot be used alone. It must be paired with at least 1 additional parameter._  | [optional]
 **palmOil** | **String**| Filter the search to only include branded foods that contain a specific ingredient made using palm oil.  __Example__: &amp;palm_oil&#x3D;E160a Beta Carotene  | [optional]
 **trace** | **String**| Filter the search to only include branded foods that contain a specific trace ingredient.  __Example__: &amp;trace&#x3D;Tree Nuts  ___Important Note:__ This parameter cannot be used alone. It must be paired with at least 1 additional parameter._  | [optional]
 **vitamin** | **String**| Filter the search to only include branded foods that contain a specific vitamin.  __Example__: &amp;vitamin&#x3D;Biotin  | [optional]
 **limit** | **Integer**| Set maximum number of records you want the API to return.  __Example:__ &amp;limit&#x3D;10  | [optional] [enum: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
 **page** | **Integer**| This is how you paginate the search result. By default, you will see the first 10 records. You must increment the page number to access the next 10 records, and so on.  __Example__: &amp;page&#x3D;1  | [optional]

### Return type

[**BrandedFoodObject**](BrandedFoodObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="foodIngredientSearchPhpGet"></a>
# **foodIngredientSearchPhpGet**
> IngredientObject foodIngredientSearchPhpGet(find, list, raw, limit)

Get raw/generic food ingredient item(s)

# Get data for a specific ingredient or a specific set of ingredients.  This API endpoint is only available to Standard and Premium API subscribers. Please consider upgrading your subscription if you are subscribed to the Limited plan. _[Read this](https://desk.zoho.com/portal/chompthis/kb/articles/can-i-upgrade-downgrade-my-subscription) if you aren&#x27;t sure how to upgrade your subscription._  __Example:__ &#x60;&#x60;&#x60;https://chompthis.com/api/v2/ingredient/search.php?api_key&#x3D;API_KEY&amp;find&#x3D;STRING/LIST&amp;list&#x3D;BOOLEAN&amp;raw&#x3D;BOOLEAN&#x60;&#x60;&#x60; 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer find = 56; // Integer | Search our database for a single ingredient or a specific set of ingredients.  __Example #1:__ &find=broccoli  __Example #2:__ &find=broccoli,cauliflower,spinach&list=true  __Important List Notes:__    - Set the \"list\" parameter to \"true\" before passing in a comma-separated list of ingredients.   - Comma-separated lists cannot contain more than __15 ingredients__. You must perform additional API calls if you are looking up more than 15 ingredients. 
Boolean list = true; // Boolean | Setting _&list=true_ will configure this endpoint to allow searching for ingredients using a comma-separated list. By default, this endpoint will __only__ return results for the first ingredient.  __Example:__ &list=true 
Boolean raw = true; // Boolean | Optionally filter the search result to only include raw ingredients.  __Example:__ &raw=true 
Integer limit = 56; // Integer | Set maximum number of records you want the API to return, per search term.  __Example:__ &limit=3 
try {
    IngredientObject result = apiInstance.foodIngredientSearchPhpGet(find, list, raw, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#foodIngredientSearchPhpGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **find** | **Integer**| Search our database for a single ingredient or a specific set of ingredients.  __Example #1:__ &amp;find&#x3D;broccoli  __Example #2:__ &amp;find&#x3D;broccoli,cauliflower,spinach&amp;list&#x3D;true  __Important List Notes:__    - Set the \&quot;list\&quot; parameter to \&quot;true\&quot; before passing in a comma-separated list of ingredients.   - Comma-separated lists cannot contain more than __15 ingredients__. You must perform additional API calls if you are looking up more than 15 ingredients.  |
 **list** | **Boolean**| Setting _&amp;list&#x3D;true_ will configure this endpoint to allow searching for ingredients using a comma-separated list. By default, this endpoint will __only__ return results for the first ingredient.  __Example:__ &amp;list&#x3D;true  |
 **raw** | **Boolean**| Optionally filter the search result to only include raw ingredients.  __Example:__ &amp;raw&#x3D;true  | [optional]
 **limit** | **Integer**| Set maximum number of records you want the API to return, per search term.  __Example:__ &amp;limit&#x3D;3  | [optional] [enum: 1, 2, 3]

### Return type

[**IngredientObject**](IngredientObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

