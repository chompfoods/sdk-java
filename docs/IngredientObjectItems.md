# IngredientObjectItems

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Item name as provided by brand owner or as shown on packaging |  [optional]
**categories** | **List&lt;String&gt;** |  |  [optional]
**nutrients** | [**List&lt;IngredientObjectNutrients&gt;**](IngredientObjectNutrients.md) | An array containing nutrient informatio objects for this food item |  [optional]
**calorieConversionFactor** | [**IngredientObjectCalorieConversionFactor**](IngredientObjectCalorieConversionFactor.md) |  |  [optional]
**proteinConversionFactor** | [**BigDecimal**](BigDecimal.md) | The multiplication factor used to calculate protein from nitrogen |  [optional]
**components** | [**List&lt;IngredientObjectComponents&gt;**](IngredientObjectComponents.md) | An array of objects containing the constituent parts of a food (e.g. bone is a component of meat) |  [optional]
**portions** | [**List&lt;IngredientObjectPortions&gt;**](IngredientObjectPortions.md) | An array of objects containing information on discrete amounts of a food found in this item |  [optional]
**commonName** | **String** | Common name associated with this item. These generally clarify what the item is (e.g. when the brand name is \&quot;BRAND&#x27;s Spicy Enchilada\&quot; the common name may be \&quot;Chicken enchilada\&quot;) |  [optional]
**footnote** | **String** | Comments on any unusual aspects of this item. Examples might include unusual aspects of the food overall |  [optional]
**searchTerm** | **String** | The original search term that found this food item |  [optional]
**score** | **String** | A value that represents how similar the name of this food item is to the original search term. The lower the value the closer this item&#x27;s name is to the original search term. |  [optional]
