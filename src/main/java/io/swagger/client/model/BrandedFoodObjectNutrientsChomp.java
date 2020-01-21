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
import java.math.BigDecimal;
/**
 * BrandedFoodObjectNutrientsChomp
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-01-21T23:19:12.862Z[GMT]")
public class BrandedFoodObjectNutrientsChomp {
  @SerializedName("name")
  private String name = null;

  @SerializedName("measurement_unit")
  private String measurementUnit = null;

  @SerializedName("per_100g")
  private BigDecimal per100g = null;

  @SerializedName("per_serving")
  private BigDecimal perServing = null;

  @SerializedName("total")
  private BigDecimal total = null;

  public BrandedFoodObjectNutrientsChomp name(String name) {
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

  public BrandedFoodObjectNutrientsChomp measurementUnit(String measurementUnit) {
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

  public BrandedFoodObjectNutrientsChomp per100g(BigDecimal per100g) {
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

  public BrandedFoodObjectNutrientsChomp perServing(BigDecimal perServing) {
    this.perServing = perServing;
    return this;
  }

   /**
   * Nutrient value per serving
   * @return perServing
  **/
  @Schema(description = "Nutrient value per serving")
  public BigDecimal getPerServing() {
    return perServing;
  }

  public void setPerServing(BigDecimal perServing) {
    this.perServing = perServing;
  }

  public BrandedFoodObjectNutrientsChomp total(BigDecimal total) {
    this.total = total;
    return this;
  }

   /**
   * Total nutrient value
   * @return total
  **/
  @Schema(description = "Total nutrient value")
  public BigDecimal getTotal() {
    return total;
  }

  public void setTotal(BigDecimal total) {
    this.total = total;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandedFoodObjectNutrientsChomp brandedFoodObjectNutrientsChomp = (BrandedFoodObjectNutrientsChomp) o;
    return Objects.equals(this.name, brandedFoodObjectNutrientsChomp.name) &&
        Objects.equals(this.measurementUnit, brandedFoodObjectNutrientsChomp.measurementUnit) &&
        Objects.equals(this.per100g, brandedFoodObjectNutrientsChomp.per100g) &&
        Objects.equals(this.perServing, brandedFoodObjectNutrientsChomp.perServing) &&
        Objects.equals(this.total, brandedFoodObjectNutrientsChomp.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, measurementUnit, per100g, perServing, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandedFoodObjectNutrientsChomp {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    measurementUnit: ").append(toIndentedString(measurementUnit)).append("\n");
    sb.append("    per100g: ").append(toIndentedString(per100g)).append("\n");
    sb.append("    perServing: ").append(toIndentedString(perServing)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
