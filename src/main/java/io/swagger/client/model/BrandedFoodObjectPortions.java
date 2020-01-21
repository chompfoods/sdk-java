/*
 * Chomp Food Database API Documentation
 * __Important:__   - An __[API key](https://chompthis.com/api/)__ is required for access to this API.   - Get yours at __[https://chompthis.com/api](https://chompthis.com/api/)__.  -----  __Getting Started:__   - __[Subscribe](https://chompthis.com/api/#pricing)__ to the API.   - Scroll down and click the \"__Authorize__\" button.   - Enter your API key into the \"__value__\" input, click the \"__Authorize__\" button, then click the \"__Close__\" button.   - Scroll down to the section titled \"__default__\" and click on the API endpoint you wish to use.   - Click the \"__Try it out__\" button.   - Enter the information the endpoint requires.   - Click the \"__Execute__\" button.  __Example:__    - __[View example](https://raw.githubusercontent.com/chompfoods/examples/master/response-object.json)__ API response object.  -----  __How Do I Find My API Key?__   - Your API key was sent to the email address you used to create your subscription.   - You will also find your API key in the __[Client Center](https://chompthis.com/api/manage.php)__.   - _Read __[this article](https://desk.zoho.com/portal/chompthis/kb/articles/how-do-i-find-my-api-key)__ for more information._  ||| | ------- | -------- | | [Knowledge Base](https://desk.zoho.com/portal/chompthis/kb/chomp) | [Pricing](https://chompthis.com/api/) | | [Attribution](https://chompthis.com/api/docs/attribution.php) | [Cost Calculator](https://chompthis.com/api/cost-calculator.php) | | [Terms & License](https://chompthis.com/api/terms.php) | [Database Search](https://chompthis.com/api/lookup.php) | | [Support](https://chompthis.com/api/ticket-new.php) | [Query Builder](https://chompthis.com/api/build.php) | | [Client Center](https://chompthis.com/api/manage.php) | | 
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
 * An object containing information on a specific food portion found in this item
 */
@Schema(description = "An object containing information on a specific food portion found in this item")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-01-21T14:08:32.261Z[GMT]")
public class BrandedFoodObjectPortions {
  @SerializedName("measurement_unit")
  private String measurementUnit = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("modifier")
  private String modifier = null;

  @SerializedName("gram_weight")
  private BigDecimal gramWeight = null;

  @SerializedName("data_points")
  private Integer dataPoints = null;

  @SerializedName("footnote")
  private String footnote = null;

  public BrandedFoodObjectPortions measurementUnit(String measurementUnit) {
    this.measurementUnit = measurementUnit;
    return this;
  }

   /**
   * The unit used for measure (e.g. if mesure is 3 tsp, the unit is tsp)
   * @return measurementUnit
  **/
  @Schema(description = "The unit used for measure (e.g. if mesure is 3 tsp, the unit is tsp)")
  public String getMeasurementUnit() {
    return measurementUnit;
  }

  public void setMeasurementUnit(String measurementUnit) {
    this.measurementUnit = measurementUnit;
  }

  public BrandedFoodObjectPortions description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Comments that provide more specificity on the measure. For example, for a pizza measure the dissemination text might be 1 slice is 1/8th of a 14 inch pizza.
   * @return description
  **/
  @Schema(description = "Comments that provide more specificity on the measure. For example, for a pizza measure the dissemination text might be 1 slice is 1/8th of a 14 inch pizza.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public BrandedFoodObjectPortions modifier(String modifier) {
    this.modifier = modifier;
    return this;
  }

   /**
   * Qualifier of the measure (e.g. related to food shape or form) (e.g. melted, crushed, diced)
   * @return modifier
  **/
  @Schema(description = "Qualifier of the measure (e.g. related to food shape or form) (e.g. melted, crushed, diced)")
  public String getModifier() {
    return modifier;
  }

  public void setModifier(String modifier) {
    this.modifier = modifier;
  }

  public BrandedFoodObjectPortions gramWeight(BigDecimal gramWeight) {
    this.gramWeight = gramWeight;
    return this;
  }

   /**
   * The weight of the measure in grams
   * @return gramWeight
  **/
  @Schema(description = "The weight of the measure in grams")
  public BigDecimal getGramWeight() {
    return gramWeight;
  }

  public void setGramWeight(BigDecimal gramWeight) {
    this.gramWeight = gramWeight;
  }

  public BrandedFoodObjectPortions dataPoints(Integer dataPoints) {
    this.dataPoints = dataPoints;
    return this;
  }

   /**
   * The number of observations on which the measure is based
   * @return dataPoints
  **/
  @Schema(description = "The number of observations on which the measure is based")
  public Integer getDataPoints() {
    return dataPoints;
  }

  public void setDataPoints(Integer dataPoints) {
    this.dataPoints = dataPoints;
  }

  public BrandedFoodObjectPortions footnote(String footnote) {
    this.footnote = footnote;
    return this;
  }

   /**
   * Comments on any unusual aspects of the measure. Examples might includes caveats on the usage of a measure, or reasons why a measure gram weight is an unexpected value.
   * @return footnote
  **/
  @Schema(description = "Comments on any unusual aspects of the measure. Examples might includes caveats on the usage of a measure, or reasons why a measure gram weight is an unexpected value.")
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
    BrandedFoodObjectPortions brandedFoodObjectPortions = (BrandedFoodObjectPortions) o;
    return Objects.equals(this.measurementUnit, brandedFoodObjectPortions.measurementUnit) &&
        Objects.equals(this.description, brandedFoodObjectPortions.description) &&
        Objects.equals(this.modifier, brandedFoodObjectPortions.modifier) &&
        Objects.equals(this.gramWeight, brandedFoodObjectPortions.gramWeight) &&
        Objects.equals(this.dataPoints, brandedFoodObjectPortions.dataPoints) &&
        Objects.equals(this.footnote, brandedFoodObjectPortions.footnote);
  }

  @Override
  public int hashCode() {
    return Objects.hash(measurementUnit, description, modifier, gramWeight, dataPoints, footnote);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandedFoodObjectPortions {\n");
    
    sb.append("    measurementUnit: ").append(toIndentedString(measurementUnit)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    modifier: ").append(toIndentedString(modifier)).append("\n");
    sb.append("    gramWeight: ").append(toIndentedString(gramWeight)).append("\n");
    sb.append("    dataPoints: ").append(toIndentedString(dataPoints)).append("\n");
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
