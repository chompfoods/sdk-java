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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
/**
 * An object containing information for a specific nutrient found in this food item
 */
@Schema(description = "An object containing information for a specific nutrient found in this food item")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-01-28T13:14:15.861Z[GMT]")
public class IngredientObjectNutrients {
  @SerializedName("name")
  private String name = null;

  @SerializedName("per_100g")
  private BigDecimal per100g = null;

  @SerializedName("measurement_unit")
  private String measurementUnit = null;

  @SerializedName("min")
  private BigDecimal min = null;

  @SerializedName("max")
  private BigDecimal max = null;

  @SerializedName("median")
  private BigDecimal median = null;

  @SerializedName("rank")
  private Integer rank = null;

  @SerializedName("data_points")
  private Integer dataPoints = null;

  @SerializedName("footnote")
  private String footnote = null;

  @SerializedName("description")
  private String description = null;

  public IngredientObjectNutrients name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Nutrient name
   * @return name
  **/
  @Schema(description = "Nutrient name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public IngredientObjectNutrients per100g(BigDecimal per100g) {
    this.per100g = per100g;
    return this;
  }

   /**
   * Amount of the nutrient per 100g of food
   * @return per100g
  **/
  @Schema(description = "Amount of the nutrient per 100g of food")
  public BigDecimal getPer100g() {
    return per100g;
  }

  public void setPer100g(BigDecimal per100g) {
    this.per100g = per100g;
  }

  public IngredientObjectNutrients measurementUnit(String measurementUnit) {
    this.measurementUnit = measurementUnit;
    return this;
  }

   /**
   * The unit used for the measure of this nutrient
   * @return measurementUnit
  **/
  @Schema(description = "The unit used for the measure of this nutrient")
  public String getMeasurementUnit() {
    return measurementUnit;
  }

  public void setMeasurementUnit(String measurementUnit) {
    this.measurementUnit = measurementUnit;
  }

  public IngredientObjectNutrients min(BigDecimal min) {
    this.min = min;
    return this;
  }

   /**
   * Minimum nutrient value
   * @return min
  **/
  @Schema(description = "Minimum nutrient value")
  public BigDecimal getMin() {
    return min;
  }

  public void setMin(BigDecimal min) {
    this.min = min;
  }

  public IngredientObjectNutrients max(BigDecimal max) {
    this.max = max;
    return this;
  }

   /**
   * Maximum nutrient value
   * @return max
  **/
  @Schema(description = "Maximum nutrient value")
  public BigDecimal getMax() {
    return max;
  }

  public void setMax(BigDecimal max) {
    this.max = max;
  }

  public IngredientObjectNutrients median(BigDecimal median) {
    this.median = median;
    return this;
  }

   /**
   * Median nutrient value
   * @return median
  **/
  @Schema(description = "Median nutrient value")
  public BigDecimal getMedian() {
    return median;
  }

  public void setMedian(BigDecimal median) {
    this.median = median;
  }

  public IngredientObjectNutrients rank(Integer rank) {
    this.rank = rank;
    return this;
  }

   /**
   * Nutrient rank
   * @return rank
  **/
  @Schema(description = "Nutrient rank")
  public Integer getRank() {
    return rank;
  }

  public void setRank(Integer rank) {
    this.rank = rank;
  }

  public IngredientObjectNutrients dataPoints(Integer dataPoints) {
    this.dataPoints = dataPoints;
    return this;
  }

   /**
   * Number of observations on which the value is based
   * @return dataPoints
  **/
  @Schema(description = "Number of observations on which the value is based")
  public Integer getDataPoints() {
    return dataPoints;
  }

  public void setDataPoints(Integer dataPoints) {
    this.dataPoints = dataPoints;
  }

  public IngredientObjectNutrients footnote(String footnote) {
    this.footnote = footnote;
    return this;
  }

   /**
   * Comments on any unusual aspect of the food nutrient. Examples might include why a nutrient value is different than typically expected.
   * @return footnote
  **/
  @Schema(description = "Comments on any unusual aspect of the food nutrient. Examples might include why a nutrient value is different than typically expected.")
  public String getFootnote() {
    return footnote;
  }

  public void setFootnote(String footnote) {
    this.footnote = footnote;
  }

  public IngredientObjectNutrients description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of the nutrient source
   * @return description
  **/
  @Schema(description = "Description of the nutrient source")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IngredientObjectNutrients ingredientObjectNutrients = (IngredientObjectNutrients) o;
    return Objects.equals(this.name, ingredientObjectNutrients.name) &&
        Objects.equals(this.per100g, ingredientObjectNutrients.per100g) &&
        Objects.equals(this.measurementUnit, ingredientObjectNutrients.measurementUnit) &&
        Objects.equals(this.min, ingredientObjectNutrients.min) &&
        Objects.equals(this.max, ingredientObjectNutrients.max) &&
        Objects.equals(this.median, ingredientObjectNutrients.median) &&
        Objects.equals(this.rank, ingredientObjectNutrients.rank) &&
        Objects.equals(this.dataPoints, ingredientObjectNutrients.dataPoints) &&
        Objects.equals(this.footnote, ingredientObjectNutrients.footnote) &&
        Objects.equals(this.description, ingredientObjectNutrients.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, per100g, measurementUnit, min, max, median, rank, dataPoints, footnote, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IngredientObjectNutrients {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    per100g: ").append(toIndentedString(per100g)).append("\n");
    sb.append("    measurementUnit: ").append(toIndentedString(measurementUnit)).append("\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    median: ").append(toIndentedString(median)).append("\n");
    sb.append("    rank: ").append(toIndentedString(rank)).append("\n");
    sb.append("    dataPoints: ").append(toIndentedString(dataPoints)).append("\n");
    sb.append("    footnote: ").append(toIndentedString(footnote)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
