/*
 * Chomp Food Database API Documentation
 * ## Important An **[API key](https://chompthis.com/api/)** is required for access to this API. Get yours at **[https://chompthis.com/api](https://chompthis.com/api/)**.  ### Getting Started   * **[Subscribe](https://chompthis.com/api/#pricing)** to the API.   * Scroll down and click the \"**Authorize**\" button.   * Enter your API key into the \"**value**\" input, click the \"**Authorize**\" button, then click the \"**Close**\" button.   * Scroll down to the section titled \"**default**\" and click on the API endpoint you wish to use.   * Click the \"**Try it out**\" button.   * Enter the information the endpoint requires.   * Click the \"**Execute**\" button.  ### Example    * Branded food response object: **[View example &raquo;](https://raw.githubusercontent.com/chompfoods/examples/master/branded-food-response-object.json)**   * Ingredient response object: **[View example &raquo;](https://raw.githubusercontent.com/chompfoods/examples/master/ingredient-response-object.json)**   * Error response object: **[View example &raquo;](https://raw.githubusercontent.com/chompfoods/examples/master/error-response-object.json)**  ### How Do I Find My API Key?   * Your API key was sent to the email address you used to create your subscription.   * You will also find your API key in the **[Client Center](https://chompthis.com/api/manage.php)**.   * Read **[this article](https://desk.zoho.com/portal/chompthis/kb/articles/how-do-i-find-my-api-key)** for more information.  ### Helpful Links   * **Help & Support**     * [Knowledge Base &raquo;](https://desk.zoho.com/portal/chompthis/kb/chomp)     * [Support &raquo;](https://chompthis.com/api/ticket-new.php)     * [Client Center &raquo;](https://chompthis.com/api/manage.php)   * **Pricing**     * [Subscription Options &raquo;](https://chompthis.com/api/)     * [Cost Calculator &raquo;](https://chompthis.com/api/cost-calculator.php)   * **Guidelines**     * [Terms & License &raquo;](https://chompthis.com/api/terms.php)     * [Attribution &raquo;](https://chompthis.com/api/docs/attribution.php) 
 *
 * OpenAPI spec version: 1.0.0-oas3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.BrandedFoodObjectDietLabels;
import io.swagger.client.model.IngredientObjectCalorieConversionFactor;
import io.swagger.client.model.IngredientObjectComponents;
import io.swagger.client.model.IngredientObjectNutrients;
import io.swagger.client.model.IngredientObjectPortions;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
/**
 * An object containing information for this specific item.
 */
@Schema(description = "An object containing information for this specific item.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-01-27T21:18:02.282Z[GMT]")
public class IngredientObjectItems {
  @SerializedName("name")
  private String name = null;

  @SerializedName("categories")
  private List<String> categories = null;

  @SerializedName("nutrients")
  private List<IngredientObjectNutrients> nutrients = null;

  @SerializedName("calorie_conversion_factor")
  private IngredientObjectCalorieConversionFactor calorieConversionFactor = null;

  @SerializedName("protein_conversion_factor")
  private BigDecimal proteinConversionFactor = null;

  @SerializedName("diet_labels")
  private BrandedFoodObjectDietLabels dietLabels = null;

  @SerializedName("components")
  private List<IngredientObjectComponents> components = null;

  @SerializedName("portions")
  private List<IngredientObjectPortions> portions = null;

  @SerializedName("common_name")
  private String commonName = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("footnote")
  private String footnote = null;

  public IngredientObjectItems name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Item name as provided by brand owner or as shown on packaging
   * @return name
  **/
  @Schema(description = "Item name as provided by brand owner or as shown on packaging")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public IngredientObjectItems categories(List<String> categories) {
    this.categories = categories;
    return this;
  }

  public IngredientObjectItems addCategoriesItem(String categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<String>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

   /**
   * Get categories
   * @return categories
  **/
  @Schema(description = "")
  public List<String> getCategories() {
    return categories;
  }

  public void setCategories(List<String> categories) {
    this.categories = categories;
  }

  public IngredientObjectItems nutrients(List<IngredientObjectNutrients> nutrients) {
    this.nutrients = nutrients;
    return this;
  }

  public IngredientObjectItems addNutrientsItem(IngredientObjectNutrients nutrientsItem) {
    if (this.nutrients == null) {
      this.nutrients = new ArrayList<IngredientObjectNutrients>();
    }
    this.nutrients.add(nutrientsItem);
    return this;
  }

   /**
   * An array containing nutrient informatio objects for this food item
   * @return nutrients
  **/
  @Schema(description = "An array containing nutrient informatio objects for this food item")
  public List<IngredientObjectNutrients> getNutrients() {
    return nutrients;
  }

  public void setNutrients(List<IngredientObjectNutrients> nutrients) {
    this.nutrients = nutrients;
  }

  public IngredientObjectItems calorieConversionFactor(IngredientObjectCalorieConversionFactor calorieConversionFactor) {
    this.calorieConversionFactor = calorieConversionFactor;
    return this;
  }

   /**
   * Get calorieConversionFactor
   * @return calorieConversionFactor
  **/
  @Schema(description = "")
  public IngredientObjectCalorieConversionFactor getCalorieConversionFactor() {
    return calorieConversionFactor;
  }

  public void setCalorieConversionFactor(IngredientObjectCalorieConversionFactor calorieConversionFactor) {
    this.calorieConversionFactor = calorieConversionFactor;
  }

  public IngredientObjectItems proteinConversionFactor(BigDecimal proteinConversionFactor) {
    this.proteinConversionFactor = proteinConversionFactor;
    return this;
  }

   /**
   * The multiplication factor used to calculate protein from nitrogen
   * @return proteinConversionFactor
  **/
  @Schema(description = "The multiplication factor used to calculate protein from nitrogen")
  public BigDecimal getProteinConversionFactor() {
    return proteinConversionFactor;
  }

  public void setProteinConversionFactor(BigDecimal proteinConversionFactor) {
    this.proteinConversionFactor = proteinConversionFactor;
  }

  public IngredientObjectItems dietLabels(BrandedFoodObjectDietLabels dietLabels) {
    this.dietLabels = dietLabels;
    return this;
  }

   /**
   * Get dietLabels
   * @return dietLabels
  **/
  @Schema(description = "")
  public BrandedFoodObjectDietLabels getDietLabels() {
    return dietLabels;
  }

  public void setDietLabels(BrandedFoodObjectDietLabels dietLabels) {
    this.dietLabels = dietLabels;
  }

  public IngredientObjectItems components(List<IngredientObjectComponents> components) {
    this.components = components;
    return this;
  }

  public IngredientObjectItems addComponentsItem(IngredientObjectComponents componentsItem) {
    if (this.components == null) {
      this.components = new ArrayList<IngredientObjectComponents>();
    }
    this.components.add(componentsItem);
    return this;
  }

   /**
   * An array of objects containing the constituent parts of a food (e.g. bone is a component of meat)
   * @return components
  **/
  @Schema(description = "An array of objects containing the constituent parts of a food (e.g. bone is a component of meat)")
  public List<IngredientObjectComponents> getComponents() {
    return components;
  }

  public void setComponents(List<IngredientObjectComponents> components) {
    this.components = components;
  }

  public IngredientObjectItems portions(List<IngredientObjectPortions> portions) {
    this.portions = portions;
    return this;
  }

  public IngredientObjectItems addPortionsItem(IngredientObjectPortions portionsItem) {
    if (this.portions == null) {
      this.portions = new ArrayList<IngredientObjectPortions>();
    }
    this.portions.add(portionsItem);
    return this;
  }

   /**
   * An array of objects containing information on discrete amounts of a food found in this item
   * @return portions
  **/
  @Schema(description = "An array of objects containing information on discrete amounts of a food found in this item")
  public List<IngredientObjectPortions> getPortions() {
    return portions;
  }

  public void setPortions(List<IngredientObjectPortions> portions) {
    this.portions = portions;
  }

  public IngredientObjectItems commonName(String commonName) {
    this.commonName = commonName;
    return this;
  }

   /**
   * Common name associated with this item. These generally clarify what the item is (e.g. when the brand name is \&quot;BRAND&#x27;s Spicy Enchilada\&quot; the common name may be \&quot;Chicken enchilada\&quot;)
   * @return commonName
  **/
  @Schema(description = "Common name associated with this item. These generally clarify what the item is (e.g. when the brand name is \"BRAND's Spicy Enchilada\" the common name may be \"Chicken enchilada\")")
  public String getCommonName() {
    return commonName;
  }

  public void setCommonName(String commonName) {
    this.commonName = commonName;
  }

  public IngredientObjectItems description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A description of this item
   * @return description
  **/
  @Schema(description = "A description of this item")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public IngredientObjectItems footnote(String footnote) {
    this.footnote = footnote;
    return this;
  }

   /**
   * Comments on any unusual aspects of this item. Examples might include unusual aspects of the food overall.
   * @return footnote
  **/
  @Schema(description = "Comments on any unusual aspects of this item. Examples might include unusual aspects of the food overall.")
  public String getFootnote() {
    return footnote;
  }

  public void setFootnote(String footnote) {
    this.footnote = footnote;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IngredientObjectItems ingredientObjectItems = (IngredientObjectItems) o;
    return Objects.equals(this.name, ingredientObjectItems.name) &&
        Objects.equals(this.categories, ingredientObjectItems.categories) &&
        Objects.equals(this.nutrients, ingredientObjectItems.nutrients) &&
        Objects.equals(this.calorieConversionFactor, ingredientObjectItems.calorieConversionFactor) &&
        Objects.equals(this.proteinConversionFactor, ingredientObjectItems.proteinConversionFactor) &&
        Objects.equals(this.dietLabels, ingredientObjectItems.dietLabels) &&
        Objects.equals(this.components, ingredientObjectItems.components) &&
        Objects.equals(this.portions, ingredientObjectItems.portions) &&
        Objects.equals(this.commonName, ingredientObjectItems.commonName) &&
        Objects.equals(this.description, ingredientObjectItems.description) &&
        Objects.equals(this.footnote, ingredientObjectItems.footnote);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, categories, nutrients, calorieConversionFactor, proteinConversionFactor, dietLabels, components, portions, commonName, description, footnote);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IngredientObjectItems {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    nutrients: ").append(toIndentedString(nutrients)).append("\n");
    sb.append("    calorieConversionFactor: ").append(toIndentedString(calorieConversionFactor)).append("\n");
    sb.append("    proteinConversionFactor: ").append(toIndentedString(proteinConversionFactor)).append("\n");
    sb.append("    dietLabels: ").append(toIndentedString(dietLabels)).append("\n");
    sb.append("    components: ").append(toIndentedString(components)).append("\n");
    sb.append("    portions: ").append(toIndentedString(portions)).append("\n");
    sb.append("    commonName: ").append(toIndentedString(commonName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    footnote: ").append(toIndentedString(footnote)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
