/*
 * Chomp Food Database API Documentation
 * __Important:__   - An __[API key](https://chompthis.com/api/)__ is required for access to this API.   - Get yours at __[https://chompthis.com/api](https://chompthis.com/api/)__.  -----  __Getting Started:__   - __[Subscribe](https://chompthis.com/api/#pricing)__ to the API.   - Scroll down and click the \"__Authorize__\" button.   - Enter your API key into the \"__value__\" input, click the \"__Authorize__\" button, then click the \"__Close__\" button.   - Scroll down to the section titled \"__default__\" and click on the API endpoint you wish to use.   - Click the \"__Try it out__\" button.   - Enter the information the endpoint requires.   - Click the \"__Execute__\" button.  __Example:__    - Branded Food: __[View example](https://raw.githubusercontent.com/chompfoods/examples/master/branded-food-response-object.json)__ API response object.   - Ingredient: __[View example](https://raw.githubusercontent.com/chompfoods/examples/master/ingredient-response-object.json)__ API response object.  -----  __How Do I Find My API Key?__   - Your API key was sent to the email address you used to create your subscription.   - You will also find your API key in the __[Client Center](https://chompthis.com/api/manage.php)__.   - _Read __[this article](https://desk.zoho.com/portal/chompthis/kb/articles/how-do-i-find-my-api-key)__ for more information._  ||| | ------- | -------- | | [Knowledge Base](https://desk.zoho.com/portal/chompthis/kb/chomp) | [Pricing](https://chompthis.com/api/) | | [Attribution](https://chompthis.com/api/docs/attribution.php) | [Cost Calculator](https://chompthis.com/api/cost-calculator.php) | | [Terms & License](https://chompthis.com/api/terms.php) | [Database Search](https://chompthis.com/api/lookup.php) | | [Support](https://chompthis.com/api/ticket-new.php) | [Query Builder](https://chompthis.com/api/build.php) | | [Client Center](https://chompthis.com/api/manage.php) | | 
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
 * An object containing information on this item&#x27;s compatibility with Gluten Free diets
 */
@Schema(description = "An object containing information on this item's compatibility with Gluten Free diets")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-01-21T14:14:30.544Z[GMT]")
public class BrandedFoodObjectDietLabelsGlutenFree {
  @SerializedName("name")
  private String name = null;

  @SerializedName("is_compatible")
  private Boolean isCompatible = null;

  @SerializedName("compatibility_level")
  private Integer compatibilityLevel = null;

  @SerializedName("confidence")
  private Integer confidence = null;

  @SerializedName("confidence_description")
  private String confidenceDescription = null;

  public BrandedFoodObjectDietLabelsGlutenFree name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Diet name
   * @return name
  **/
  @Schema(description = "Diet name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BrandedFoodObjectDietLabelsGlutenFree isCompatible(Boolean isCompatible) {
    this.isCompatible = isCompatible;
    return this;
  }

   /**
   * Boolean describing if this item is compatible with this diet
   * @return isCompatible
  **/
  @Schema(description = "Boolean describing if this item is compatible with this diet")
  public Boolean isIsCompatible() {
    return isCompatible;
  }

  public void setIsCompatible(Boolean isCompatible) {
    this.isCompatible = isCompatible;
  }

  public BrandedFoodObjectDietLabelsGlutenFree compatibilityLevel(Integer compatibilityLevel) {
    this.compatibilityLevel = compatibilityLevel;
    return this;
  }

   /**
   * Numeric representation of how compatible this item is with this diet. Higher values indicate more compatibility
   * @return compatibilityLevel
  **/
  @Schema(description = "Numeric representation of how compatible this item is with this diet. Higher values indicate more compatibility")
  public Integer getCompatibilityLevel() {
    return compatibilityLevel;
  }

  public void setCompatibilityLevel(Integer compatibilityLevel) {
    this.compatibilityLevel = compatibilityLevel;
  }

  public BrandedFoodObjectDietLabelsGlutenFree confidence(Integer confidence) {
    this.confidence = confidence;
    return this;
  }

   /**
   * Boolean that indicates if we are confident in how this item is graded for this diet
   * @return confidence
  **/
  @Schema(description = "Boolean that indicates if we are confident in how this item is graded for this diet")
  public Integer getConfidence() {
    return confidence;
  }

  public void setConfidence(Integer confidence) {
    this.confidence = confidence;
  }

  public BrandedFoodObjectDietLabelsGlutenFree confidenceDescription(String confidenceDescription) {
    this.confidenceDescription = confidenceDescription;
    return this;
  }

   /**
   * Description of our confidence that this item was graded correctly
   * @return confidenceDescription
  **/
  @Schema(description = "Description of our confidence that this item was graded correctly")
  public String getConfidenceDescription() {
    return confidenceDescription;
  }

  public void setConfidenceDescription(String confidenceDescription) {
    this.confidenceDescription = confidenceDescription;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandedFoodObjectDietLabelsGlutenFree brandedFoodObjectDietLabelsGlutenFree = (BrandedFoodObjectDietLabelsGlutenFree) o;
    return Objects.equals(this.name, brandedFoodObjectDietLabelsGlutenFree.name) &&
        Objects.equals(this.isCompatible, brandedFoodObjectDietLabelsGlutenFree.isCompatible) &&
        Objects.equals(this.compatibilityLevel, brandedFoodObjectDietLabelsGlutenFree.compatibilityLevel) &&
        Objects.equals(this.confidence, brandedFoodObjectDietLabelsGlutenFree.confidence) &&
        Objects.equals(this.confidenceDescription, brandedFoodObjectDietLabelsGlutenFree.confidenceDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, isCompatible, compatibilityLevel, confidence, confidenceDescription);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandedFoodObjectDietLabelsGlutenFree {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isCompatible: ").append(toIndentedString(isCompatible)).append("\n");
    sb.append("    compatibilityLevel: ").append(toIndentedString(compatibilityLevel)).append("\n");
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
    sb.append("    confidenceDescription: ").append(toIndentedString(confidenceDescription)).append("\n");
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
