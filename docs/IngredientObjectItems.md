# IngredientObjectItems

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Item name as provided by brand owner or as shown on packaging |  [optional]
**categories** | **List&lt;String&gt;** |  |  [optional]
**nutrients** | [**IngredientObjectNutrients**](IngredientObjectNutrients.md) |  |  [optional]
**calorieConversionFactor** | [**BrandedFoodObjectCalorieConversionFactor**](BrandedFoodObjectCalorieConversionFactor.md) |  |  [optional]
**proteinConversionFactor** | [**BigDecimal**](BigDecimal.md) | The multiplication factor used to calculate protein from nitrogen |  [optional]
**dietLabels** | [**BrandedFoodObjectDietLabels**](BrandedFoodObjectDietLabels.md) |  |  [optional]
**components** | [**List&lt;IngredientObjectComponents&gt;**](IngredientObjectComponents.md) | An array of objects containing the constituent parts of a food (e.g. bone is a component of meat) |  [optional]
**portions** | [**List&lt;IngredientObjectPortions&gt;**](IngredientObjectPortions.md) | An array of objects containing information on discrete amounts of a food found in this item |  [optional]
**commonNames** | **String** | Common names associated with this item. These generally clarify what the item is (e.g. when the brand name is \&quot;BRAND&#x27;s Spicy Enchilada\&quot; the common name may be \&quot;Chicken enchilada\&quot;) |  [optional]
**description** | **String** | A description of this item |  [optional]
**footnote** | **String** | Comments on any unusual aspects of this item. Examples might include unusual aspects of the food overall. |  [optional]
