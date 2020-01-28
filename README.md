# swagger-java-client

Chomp Food Database API Documentation
- API version: 1.0.0-oas3
  - Build date: 2020-01-28T14:07:08.259Z[GMT]

## Important An **[API key](https://chompthis.com/api/)** is required for access to this API. Get yours at **[https://chompthis.com/api](https://chompthis.com/api/)**.  ### Getting Started   * **[Subscribe](https://chompthis.com/api/#pricing)** to the API.   * Scroll down and click the \"**Authorize**\" button.   * Enter your API key into the \"**value**\" input, click the \"**Authorize**\" button, then click the \"**Close**\" button.   * Scroll down to the section titled \"**default**\" and click on the API endpoint you wish to use.   * Click the \"**Try it out**\" button.   * Enter the information the endpoint requires.   * Click the \"**Execute**\" button.  ### Example    * Branded food response object: **[View example &raquo;](https://raw.githubusercontent.com/chompfoods/examples/master/branded-food-response-object.json)**   * Ingredient response object: **[View example &raquo;](https://raw.githubusercontent.com/chompfoods/examples/master/ingredient-response-object.json)**   * Error response object: **[View example &raquo;](https://raw.githubusercontent.com/chompfoods/examples/master/error-response-object.json)**  ### How Do I Find My API Key?   * Your API key was sent to the email address you used to create your subscription.   * You will also find your API key in the **[Client Center](https://chompthis.com/api/manage.php)**.   * Read **[this article](https://desk.zoho.com/portal/chompthis/kb/articles/how-do-i-find-my-api-key)** for more information.  ### Helpful Links   * **Help & Support**     * [Knowledge Base &raquo;](https://desk.zoho.com/portal/chompthis/kb/chomp)     * [Support &raquo;](https://chompthis.com/api/ticket-new.php)     * [Client Center &raquo;](https://chompthis.com/api/manage.php)   * **Pricing**     * [Subscription Options &raquo;](https://chompthis.com/api/)     * [Cost Calculator &raquo;](https://chompthis.com/api/cost-calculator.php)   * **Guidelines**     * [Terms & License &raquo;](https://chompthis.com/api/terms.php)     * [Attribution &raquo;](https://chompthis.com/api/docs/attribution.php) 


*Automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>io.swagger</groupId>
  <artifactId>swagger-java-client</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/swagger-java-client-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.DefaultApi;

import java.io.File;
import java.util.*;

public class DefaultApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi();
        String code = "code_example"; // String | #### UPC/EAN barcode  **Example** > ```&code=0842234000988``` 
        try {
            BrandedFoodObject result = apiInstance.foodBrandedBarcodePhpGet(code);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#foodBrandedBarcodePhpGet");
            e.printStackTrace();
        }
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.DefaultApi;

import java.io.File;
import java.util.*;

public class DefaultApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi();
        String name = "name_example"; // String | #### Search for branded food items using a general food name keyword. This does not have to exactly match the \"official\" name for the food.  **Example** > ```&name=Starburst``` 
        Integer limit = 56; // Integer | #### Set maximum number of records you want the API to return. The default value is \"**10**.\"  **Example** > ```&limit=10``` 
        Integer page = 56; // Integer | #### This is how you paginate the search result. By default, you will see the first 10 records. You must increment the page number to access the next 10 records, and so on. The default value is \"**1**.\"  **Example** > ```&page=1``` 
        try {
            BrandedFoodObject result = apiInstance.foodBrandedNamePhpGet(name, limit, page);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#foodBrandedNamePhpGet");
            e.printStackTrace();
        }
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.DefaultApi;

import java.io.File;
import java.util.*;

public class DefaultApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi();
        String allergen = "allergen_example"; // String | #### Filter the search to only include branded foods that contain a specific allergen.  **Example** > ```&allergen=Peanuts```  **Important Note**: This parameter cannot be used alone. It must be paired with at least 1 additional parameter. 
        String brand = "brand_example"; // String | #### Filter the search to only include branded foods that are owned by a specific brand.  **Example** > ```&brand=Starbucks``` 
        String category = "category_example"; // String | #### Filter the search to only include branded foods from a specific category.  **Example** > ```&category=Plant Based Foods``` 
        String country = "country_example"; // String | #### Filter the search to only include branded foods that are sold in a specific country.  **Example** > ```&country=United States```  **Important Note**: This parameter cannot be used alone. It must be paired with at least 1 additional parameter. 
        String diet = "diet_example"; // String | #### Filter the search to only include branded foods that are considered compatible with a specific diet.  **Important Note**: This parameter cannot be used alone. It must be paired with at least 1 additional parameter. 
        String ingredient = "ingredient_example"; // String | #### Filter the search to only include branded foods that contain a specific ingredient.  **Example** > ```&ingredient=Salt``` 
        String keyword = "keyword_example"; // String | #### Filter the search to only include branded foods that are associated with a specific keyword.  **Example** > ```&keyword=Organic```  **Important Note**: This parameter cannot be used alone. It must be paired with at least 1 additional parameter. 
        String mineral = "mineral_example"; // String | #### Filter the search to only include branded foods that contain a specific mineral.  **Example** > ```&mineral=Potassium``` 
        String nutrient = "nutrient_example"; // String | #### Filter the search to only include branded foods that contain a specific nutrient.  **Example** > ```&nutrient=Caffeine```  **Important Note**: This parameter cannot be used alone. It must be paired with at least 1 additional parameter. 
        String palmOil = "palmOil_example"; // String | #### Filter the search to only include branded foods that contain a specific ingredient made using palm oil.  **Example** > ```&palm_oil=E160a Beta Carotene``` 
        String trace = "trace_example"; // String | ### Filter the search to only include branded foods that contain a specific trace ingredient.  **Example** > ```&trace=Tree Nuts```  **Important Note**: This parameter cannot be used alone. It must be paired with at least 1 additional parameter. 
        String vitamin = "vitamin_example"; // String | #### Filter the search to only include branded foods that contain a specific vitamin.  **Example** > ```&vitamin=Biotin``` 
        Integer limit = 56; // Integer | #### Set maximum number of records you want the API to return. The default value is \"**10**.\"  **Example** > ```&limit=10``` 
        Integer page = 56; // Integer | #### This is how you paginate the search result. By default, you will see the first 10 records. You must increment the page number to access the next 10 records, and so on. The default value is \"**1**.\"  **Example** > ```&page=1``` 
        try {
            BrandedFoodObject result = apiInstance.foodBrandedSearchPhpGet(allergen, brand, category, country, diet, ingredient, keyword, mineral, nutrient, palmOil, trace, vitamin, limit, page);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#foodBrandedSearchPhpGet");
            e.printStackTrace();
        }
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.DefaultApi;

import java.io.File;
import java.util.*;

public class DefaultApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi();
        String find = "find_example"; // String | Search our database for a single ingredient or a specific set of ingredients.  **Example #1: Single Ingredient** > ```&find=raw broccoli```  **Example #2: Set of Ingredients** > ```&find=raw broccoli,raw cauliflower,mashed potatoes```  **Important Notes**    * Comma-separated lists cannot contain more than **10 ingredients**. You must perform additional API calls if you are looking up more than 10 ingredients. 
        Integer limit = 56; // Integer | #### Set maximum number of records you want the API to return, per search term. The default value is \"**1**.\"  **Example** > ```&limit=3``` 
        try {
            IngredientObject result = apiInstance.foodIngredientSearchPhpGet(find, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#foodIngredientSearchPhpGet");
            e.printStackTrace();
        }
    }
}
```

## Documentation for API Endpoints

All URIs are relative to *https://chompthis.com/api/v2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**foodBrandedBarcodePhpGet**](docs/DefaultApi.md#foodBrandedBarcodePhpGet) | **GET** /food/branded/barcode.php | Get a branded food item using a barcode
*DefaultApi* | [**foodBrandedNamePhpGet**](docs/DefaultApi.md#foodBrandedNamePhpGet) | **GET** /food/branded/name.php | Get a branded food item by name
*DefaultApi* | [**foodBrandedSearchPhpGet**](docs/DefaultApi.md#foodBrandedSearchPhpGet) | **GET** /food/branded/search.php | Get data for branded food items using various search parameters
*DefaultApi* | [**foodIngredientSearchPhpGet**](docs/DefaultApi.md#foodIngredientSearchPhpGet) | **GET** /food/ingredient/search.php | Get raw/generic food ingredient item(s)

## Documentation for Models

 - [BrandedFoodObject](docs/BrandedFoodObject.md)
 - [BrandedFoodObjectCountryDetails](docs/BrandedFoodObjectCountryDetails.md)
 - [BrandedFoodObjectDietFlags](docs/BrandedFoodObjectDietFlags.md)
 - [BrandedFoodObjectDietLabels](docs/BrandedFoodObjectDietLabels.md)
 - [BrandedFoodObjectDietLabelsGlutenFree](docs/BrandedFoodObjectDietLabelsGlutenFree.md)
 - [BrandedFoodObjectDietLabelsVegan](docs/BrandedFoodObjectDietLabelsVegan.md)
 - [BrandedFoodObjectDietLabelsVegetarian](docs/BrandedFoodObjectDietLabelsVegetarian.md)
 - [BrandedFoodObjectItems](docs/BrandedFoodObjectItems.md)
 - [BrandedFoodObjectNutrients](docs/BrandedFoodObjectNutrients.md)
 - [BrandedFoodObjectPackage](docs/BrandedFoodObjectPackage.md)
 - [BrandedFoodObjectPackagingPhotos](docs/BrandedFoodObjectPackagingPhotos.md)
 - [BrandedFoodObjectPackagingPhotosFront](docs/BrandedFoodObjectPackagingPhotosFront.md)
 - [BrandedFoodObjectPackagingPhotosIngredients](docs/BrandedFoodObjectPackagingPhotosIngredients.md)
 - [BrandedFoodObjectPackagingPhotosNutrition](docs/BrandedFoodObjectPackagingPhotosNutrition.md)
 - [BrandedFoodObjectServing](docs/BrandedFoodObjectServing.md)
 - [IngredientObject](docs/IngredientObject.md)
 - [IngredientObjectCalorieConversionFactor](docs/IngredientObjectCalorieConversionFactor.md)
 - [IngredientObjectComponents](docs/IngredientObjectComponents.md)
 - [IngredientObjectItems](docs/IngredientObjectItems.md)
 - [IngredientObjectNutrients](docs/IngredientObjectNutrients.md)
 - [IngredientObjectPortions](docs/IngredientObjectPortions.md)

## Documentation for Authorization

Authentication schemes defined for the API:
### ApiKeyAuth

- **Type**: API key
- **API key parameter name**: api_key
- **Location**: URL query string


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author


