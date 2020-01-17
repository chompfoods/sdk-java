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
/**
 * An object containing serving information for this item
 */
@Schema(description = "An object containing serving information for this item")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-01-17T21:20:14.019Z[GMT]")
public class BrandedFoodObjectServing {
  @SerializedName("size")
  private Integer size = null;

  @SerializedName("measurement_unit")
  private String measurementUnit = null;

  @SerializedName("size_fulltext")
  private String sizeFulltext = null;

  @SerializedName("total")
  private Integer total = null;

  public BrandedFoodObjectServing size(Integer size) {
    this.size = size;
    return this;
  }

   /**
   * Serving size
   * @return size
  **/
  @Schema(description = "Serving size")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public BrandedFoodObjectServing measurementUnit(String measurementUnit) {
    this.measurementUnit = measurementUnit;
    return this;
  }

   /**
   * Serving measurement unit (e.g. if measure is 3 tsp, the unit is tsp)
   * @return measurementUnit
  **/
  @Schema(description = "Serving measurement unit (e.g. if measure is 3 tsp, the unit is tsp)")
  public String getMeasurementUnit() {
    return measurementUnit;
  }

  public void setMeasurementUnit(String measurementUnit) {
    this.measurementUnit = measurementUnit;
  }

  public BrandedFoodObjectServing sizeFulltext(String sizeFulltext) {
    this.sizeFulltext = sizeFulltext;
    return this;
  }

   /**
   * Serving size description
   * @return sizeFulltext
  **/
  @Schema(description = "Serving size description")
  public String getSizeFulltext() {
    return sizeFulltext;
  }

  public void setSizeFulltext(String sizeFulltext) {
    this.sizeFulltext = sizeFulltext;
  }

  public BrandedFoodObjectServing total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * Total servings
   * @return total
  **/
  @Schema(description = "Total servings")
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
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
    BrandedFoodObjectServing brandedFoodObjectServing = (BrandedFoodObjectServing) o;
    return Objects.equals(this.size, brandedFoodObjectServing.size) &&
        Objects.equals(this.measurementUnit, brandedFoodObjectServing.measurementUnit) &&
        Objects.equals(this.sizeFulltext, brandedFoodObjectServing.sizeFulltext) &&
        Objects.equals(this.total, brandedFoodObjectServing.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(size, measurementUnit, sizeFulltext, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandedFoodObjectServing {\n");
    
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    measurementUnit: ").append(toIndentedString(measurementUnit)).append("\n");
    sb.append("    sizeFulltext: ").append(toIndentedString(sizeFulltext)).append("\n");
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
