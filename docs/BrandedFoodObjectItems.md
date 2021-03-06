# BrandedFoodObjectItems

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**barcode** | **String** | EAN/UPC barcode |  [optional]
**name** | **String** | Item name as provided by brand owner or as shown on packaging |  [optional]
**brand** | **String** | The brand name that owns this item |  [optional]
**ingredients** | **String** | This food item&#x27;s ingredients from greatest quantity to least |  [optional]
**_package** | [**BrandedFoodObjectPackage**](BrandedFoodObjectPackage.md) |  |  [optional]
**serving** | [**BrandedFoodObjectServing**](BrandedFoodObjectServing.md) |  |  [optional]
**categories** | **List&lt;String&gt;** |  |  [optional]
**nutrients** | [**List&lt;BrandedFoodObjectNutrients&gt;**](BrandedFoodObjectNutrients.md) | An array containing nutrient informatio objects for this food item |  [optional]
**dietLabels** | [**BrandedFoodObjectDietLabels**](BrandedFoodObjectDietLabels.md) |  |  [optional]
**dietFlags** | [**List&lt;BrandedFoodObjectDietFlags&gt;**](BrandedFoodObjectDietFlags.md) | An array of ingredient objects that were flagged while grading this item for compatibility with each diet |  [optional]
**packagingPhotos** | [**BrandedFoodObjectPackagingPhotos**](BrandedFoodObjectPackagingPhotos.md) |  |  [optional]
**allergens** | **List&lt;String&gt;** | An array of ingredients in this item that may cause allergic reactions in people |  [optional]
**brandList** | **List&lt;String&gt;** | An array of brands we have associated with this item. Some items are sold by more than 1 brand. |  [optional]
**countries** | **List&lt;String&gt;** | An array of countries where this item is sold |  [optional]
**countryDetails** | [**BrandedFoodObjectCountryDetails**](BrandedFoodObjectCountryDetails.md) |  |  [optional]
**palmOilIngredients** | **List&lt;String&gt;** | An array of ingredients made from palm oil |  [optional]
**ingredientList** | **List&lt;String&gt;** | An array of this item&#x27;s ingredients |  [optional]
**hasEnglishIngredients** | **Boolean** | A boolean indicating if we have English ingredients for this item |  [optional]
**minerals** | **List&lt;String&gt;** | An array of minerals that this item contains |  [optional]
**traces** | **List&lt;String&gt;** | An array of trace ingredients that may be found in this item |  [optional]
**vitamins** | **List&lt;String&gt;** | An array of vitamins that are found in this item |  [optional]
**description** | **String** | A description of this item |  [optional]
**keywords** | **List&lt;String&gt;** | An array of keywords that can be used to describe this item |  [optional]
