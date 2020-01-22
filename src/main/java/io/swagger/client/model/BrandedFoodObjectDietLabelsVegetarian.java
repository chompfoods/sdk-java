/*
 * Chomp Food Database API Documentation
 * ## Important An **[API key](https://chompthis.com/api/)** is required for access to this API. Get yours at **[https://chompthis.com/api](https://chompthis.com/api/)**.  ### Getting Started   * **[Subscribe](https://chompthis.com/api/#pricing)** to the API.   * Scroll down and click the \"**Authorize**\" button.   * Enter your API key into the \"**value**\" input, click the \"**Authorize**\" button, then click the \"**Close**\" button.   * Scroll down to the section titled \"**default**\" and click on the API endpoint you wish to use.   * Click the \"**Try it out**\" button.   * Enter the information the endpoint requires.   * Click the \"**Execute**\" button.  ### Example    * Branded food response object: **[View example &raquo;](https://raw.githubusercontent.com/chompfoods/examples/master/branded-food-response-object.json)**   * Ingredient response object: **[View example &raquo;](https://raw.githubusercontent.com/chompfoods/examples/master/ingredient-response-object.json)**  ### How Do I Find My API Key?   * Your API key was sent to the email address you used to create your subscription.   * You will also find your API key in the **[Client Center](https://chompthis.com/api/manage.php)**.   * Read **[this article](https://desk.zoho.com/portal/chompthis/kb/articles/how-do-i-find-my-api-key)** for more information.  ||| | ------- | -------- | | [Knowledge Base](https://desk.zoho.com/portal/chompthis/kb/chomp) | [Pricing](https://chompthis.com/api/) | | [Attribution](https://chompthis.com/api/docs/attribution.php) | [Cost Calculator](https://chompthis.com/api/cost-calculator.php) | | [Terms & License](https://chompthis.com/api/terms.php) | [Database Search](https://chompthis.com/api/lookup.php) | | [Support](https://chompthis.com/api/ticket-new.php) | [Query Builder](https://chompthis.com/api/build.php) | | [Client Center](https://chompthis.com/api/manage.php) | | 
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
 * An object containing information on this item&#x27;s compatibility with Vegetarian diets
 */
@Schema(description = "An object containing information on this item's compatibility with Vegetarian diets")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-01-22T19:40:24.874Z[GMT]")
public class BrandedFoodObjectDietLabelsVegetarian {
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

  public BrandedFoodObjectDietLabelsVegetarian name(String name) {
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

  public BrandedFoodObjectDietLabelsVegetarian isCompatible(Boolean isCompatible) {
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

  public BrandedFoodObjectDietLabelsVegetarian compatibilityLevel(Integer compatibilityLevel) {
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

  public BrandedFoodObjectDietLabelsVegetarian confidence(Integer confidence) {
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

  public BrandedFoodObjectDietLabelsVegetarian confidenceDescription(String confidenceDescription) {
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
    BrandedFoodObjectDietLabelsVegetarian brandedFoodObjectDietLabelsVegetarian = (BrandedFoodObjectDietLabelsVegetarian) o;
    return Objects.equals(this.name, brandedFoodObjectDietLabelsVegetarian.name) &&
        Objects.equals(this.isCompatible, brandedFoodObjectDietLabelsVegetarian.isCompatible) &&
        Objects.equals(this.compatibilityLevel, brandedFoodObjectDietLabelsVegetarian.compatibilityLevel) &&
        Objects.equals(this.confidence, brandedFoodObjectDietLabelsVegetarian.confidence) &&
        Objects.equals(this.confidenceDescription, brandedFoodObjectDietLabelsVegetarian.confidenceDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, isCompatible, compatibilityLevel, confidence, confidenceDescription);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandedFoodObjectDietLabelsVegetarian {\n");
    
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
