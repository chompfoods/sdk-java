/*
 * Chomp Food & Recipe Database API Documentation
 * ## Important An **[API key](https://chompthis.com/api/)** is required for access to this API. * Get a **Food Data API** key at **[https://chompthis.com/api](https://chompthis.com/api/)**. * Get a **Recipe Data API** key at **[https://chompthis.com/api/recipes](https://chompthis.com/api/recipes/)**.  ### Getting Started   * Subscribe to the **[Food Data API](https://chompthis.com/api/#pricing)** or the **[Recipe Data API](https://chompthis.com/api/recipes/#pricing)**.   * Scroll down and click the \"**Authorize**\" button.   * Enter your API key into the \"**value**\" input, click the \"**Authorize**\" button, then click the \"**Close**\" button.   * Scroll down to the section titled \"**default**\" and click on the API endpoint you wish to use.   * Click the \"**Try it out**\" button.   * Enter the information the endpoint requires.   * Click the \"**Execute**\" button.  ### Example    * Branded food response object: **[View example &raquo;](https://raw.githubusercontent.com/chompfoods/examples/master/branded-food-response-object.json)**   * Ingredient response object: **[View example &raquo;](https://raw.githubusercontent.com/chompfoods/examples/master/ingredient-response-object.json)**   * Recipe response object: **[View example &raquo;](https://raw.githubusercontent.com/chompfoods/examples/master/example-recipe-response.json)**   * Error response object: **[View example &raquo;](https://raw.githubusercontent.com/chompfoods/examples/master/error-response-object.json)**  ### How Do I Find My API Key?   * Your API key was sent to the email address you used to create your subscription.   * You will also find your API key in the **[Client Center](https://chompthis.com/api/manage.php)**.   * Read **[this article](https://desk.zoho.com/portal/chompthis/kb/articles/how-do-i-find-my-api-key)** for more information.  ### I'm a Premium subscriber. How do I access the API?   * All Premium subscribers must pass in a unique user ID for each user on their platform that is accessing data from the Chomp API. A user ID can be any string of letters and numbers that you assign to your user. Simply add \"user_id\" as a URL parameter when calling the API. *You must add a \"user_id\" URL parameter to every call you make to ANY endpoint.*     * **Example**        > ```ENDPOINT.php?api_key=API_KEY&code=CODE&user_id=USER_ID```  ### Helpful Links   * **Help & Support**     * [Knowledge Base &raquo;](https://desk.zoho.com/portal/chompthis/kb/chomp)     * [Support &raquo;](https://chompthis.com/api/ticket-new.php)     * [Client Center &raquo;](https://chompthis.com/api/manage.php)   * **Pricing**     * [Food Data API Subscription Options &raquo;](https://chompthis.com/api/)     * [Recipe Data API Subscription Options &raquo;](https://chompthis.com/api/recipes/)     * [Food Data API Cost Calculator &raquo;](https://chompthis.com/api/cost-calculator.php)     * [Recipe Data API Cost Calculator &raquo;](https://chompthis.com/api/recipes/cost-calculator.php)   * **Guidelines**     * [Terms & License &raquo;](https://chompthis.com/api/terms.php)     * [Attribution &raquo;](https://chompthis.com/api/docs/attribution.php) 
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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * An object containing information on an individual ingredient that was flagged as potentially not being compatible with a certain diet
 */
@Schema(description = "An object containing information on an individual ingredient that was flagged as potentially not being compatible with a certain diet")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-09T22:26:17.802Z[GMT]")
public class BrandedFoodObjectDietFlags {
  @SerializedName("ingredient")
  private String ingredient = null;

  @SerializedName("ingredient_description")
  private String ingredientDescription = null;

  @SerializedName("diet_label")
  private String dietLabel = null;

  @SerializedName("is_compatible")
  private String isCompatible = null;

  @SerializedName("compatibility_level")
  private Integer compatibilityLevel = null;

  @SerializedName("compatibility_description")
  private String compatibilityDescription = null;

  @SerializedName("is_allergen")
  private Boolean isAllergen = null;

  public BrandedFoodObjectDietFlags ingredient(String ingredient) {
    this.ingredient = ingredient;
    return this;
  }

   /**
   * Ingredient name
   * @return ingredient
  **/
  @Schema(description = "Ingredient name")
  public String getIngredient() {
    return ingredient;
  }

  public void setIngredient(String ingredient) {
    this.ingredient = ingredient;
  }

  public BrandedFoodObjectDietFlags ingredientDescription(String ingredientDescription) {
    this.ingredientDescription = ingredientDescription;
    return this;
  }

   /**
   * Description of the ingredient
   * @return ingredientDescription
  **/
  @Schema(description = "Description of the ingredient")
  public String getIngredientDescription() {
    return ingredientDescription;
  }

  public void setIngredientDescription(String ingredientDescription) {
    this.ingredientDescription = ingredientDescription;
  }

  public BrandedFoodObjectDietFlags dietLabel(String dietLabel) {
    this.dietLabel = dietLabel;
    return this;
  }

   /**
   * Name of the diet with which this ingredient may not be compatible
   * @return dietLabel
  **/
  @Schema(description = "Name of the diet with which this ingredient may not be compatible")
  public String getDietLabel() {
    return dietLabel;
  }

  public void setDietLabel(String dietLabel) {
    this.dietLabel = dietLabel;
  }

  public BrandedFoodObjectDietFlags isCompatible(String isCompatible) {
    this.isCompatible = isCompatible;
    return this;
  }

   /**
   * A description of if we believe this ingredient is compatible with the diet
   * @return isCompatible
  **/
  @Schema(description = "A description of if we believe this ingredient is compatible with the diet")
  public String getIsCompatible() {
    return isCompatible;
  }

  public void setIsCompatible(String isCompatible) {
    this.isCompatible = isCompatible;
  }

  public BrandedFoodObjectDietFlags compatibilityLevel(Integer compatibilityLevel) {
    this.compatibilityLevel = compatibilityLevel;
    return this;
  }

   /**
   * A numeric representation of if we believe this ingredient is compatible with the diet. Higher values indicate more compatibility
   * @return compatibilityLevel
  **/
  @Schema(description = "A numeric representation of if we believe this ingredient is compatible with the diet. Higher values indicate more compatibility")
  public Integer getCompatibilityLevel() {
    return compatibilityLevel;
  }

  public void setCompatibilityLevel(Integer compatibilityLevel) {
    this.compatibilityLevel = compatibilityLevel;
  }

  public BrandedFoodObjectDietFlags compatibilityDescription(String compatibilityDescription) {
    this.compatibilityDescription = compatibilityDescription;
    return this;
  }

   /**
   * A description of how we graded this ingredient for compatibility with the diet
   * @return compatibilityDescription
  **/
  @Schema(description = "A description of how we graded this ingredient for compatibility with the diet")
  public String getCompatibilityDescription() {
    return compatibilityDescription;
  }

  public void setCompatibilityDescription(String compatibilityDescription) {
    this.compatibilityDescription = compatibilityDescription;
  }

  public BrandedFoodObjectDietFlags isAllergen(Boolean isAllergen) {
    this.isAllergen = isAllergen;
    return this;
  }

   /**
   * Boolean representing if the ingredient is a known allergen
   * @return isAllergen
  **/
  @Schema(description = "Boolean representing if the ingredient is a known allergen")
  public Boolean isIsAllergen() {
    return isAllergen;
  }

  public void setIsAllergen(Boolean isAllergen) {
    this.isAllergen = isAllergen;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandedFoodObjectDietFlags brandedFoodObjectDietFlags = (BrandedFoodObjectDietFlags) o;
    return Objects.equals(this.ingredient, brandedFoodObjectDietFlags.ingredient) &&
        Objects.equals(this.ingredientDescription, brandedFoodObjectDietFlags.ingredientDescription) &&
        Objects.equals(this.dietLabel, brandedFoodObjectDietFlags.dietLabel) &&
        Objects.equals(this.isCompatible, brandedFoodObjectDietFlags.isCompatible) &&
        Objects.equals(this.compatibilityLevel, brandedFoodObjectDietFlags.compatibilityLevel) &&
        Objects.equals(this.compatibilityDescription, brandedFoodObjectDietFlags.compatibilityDescription) &&
        Objects.equals(this.isAllergen, brandedFoodObjectDietFlags.isAllergen);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ingredient, ingredientDescription, dietLabel, isCompatible, compatibilityLevel, compatibilityDescription, isAllergen);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandedFoodObjectDietFlags {\n");
    
    sb.append("    ingredient: ").append(toIndentedString(ingredient)).append("\n");
    sb.append("    ingredientDescription: ").append(toIndentedString(ingredientDescription)).append("\n");
    sb.append("    dietLabel: ").append(toIndentedString(dietLabel)).append("\n");
    sb.append("    isCompatible: ").append(toIndentedString(isCompatible)).append("\n");
    sb.append("    compatibilityLevel: ").append(toIndentedString(compatibilityLevel)).append("\n");
    sb.append("    compatibilityDescription: ").append(toIndentedString(compatibilityDescription)).append("\n");
    sb.append("    isAllergen: ").append(toIndentedString(isAllergen)).append("\n");
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
