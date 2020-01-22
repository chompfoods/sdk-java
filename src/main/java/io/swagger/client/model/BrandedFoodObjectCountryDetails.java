/*
 * Chomp Food Database API Documentation
 * __Important:__   - An __[API key](https://chompthis.com/api/)__ is required for access to this API. Get yours at __[https://chompthis.com/api](https://chompthis.com/api/)__.  -----  __Getting Started:__   - __[Subscribe](https://chompthis.com/api/#pricing)__ to the API.   - Scroll down and click the \"__Authorize__\" button.   - Enter your API key into the \"__value__\" input, click the \"__Authorize__\" button, then click the \"__Close__\" button.   - Scroll down to the section titled \"__default__\" and click on the API endpoint you wish to use.   - Click the \"__Try it out__\" button.   - Enter the information the endpoint requires.   - Click the \"__Execute__\" button.  __Example:__    - Branded Food: __[View example](https://raw.githubusercontent.com/chompfoods/examples/master/branded-food-response-object.json)__ API response object.   - Ingredient: __[View example](https://raw.githubusercontent.com/chompfoods/examples/master/ingredient-response-object.json)__ API response object.  -----  __How Do I Find My API Key?__   - Your API key was sent to the email address you used to create your subscription.   - You will also find your API key in the __[Client Center](https://chompthis.com/api/manage.php)__.   - _Read __[this article](https://desk.zoho.com/portal/chompthis/kb/articles/how-do-i-find-my-api-key)__ for more information._  ||| | ------- | -------- | | [Knowledge Base](https://desk.zoho.com/portal/chompthis/kb/chomp) | [Pricing](https://chompthis.com/api/) | | [Attribution](https://chompthis.com/api/docs/attribution.php) | [Cost Calculator](https://chompthis.com/api/cost-calculator.php) | | [Terms & License](https://chompthis.com/api/terms.php) | [Database Search](https://chompthis.com/api/lookup.php) | | [Support](https://chompthis.com/api/ticket-new.php) | [Query Builder](https://chompthis.com/api/build.php) | | [Client Center](https://chompthis.com/api/manage.php) | | 
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
 * An object containing additional information on the countries where this item is found
 */
@Schema(description = "An object containing additional information on the countries where this item is found")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-01-22T15:36:20.582Z[GMT]")
public class BrandedFoodObjectCountryDetails {
  @SerializedName("english_speaking")
  private Integer englishSpeaking = null;

  @SerializedName("non_english_speaking")
  private Integer nonEnglishSpeaking = null;

  public BrandedFoodObjectCountryDetails englishSpeaking(Integer englishSpeaking) {
    this.englishSpeaking = englishSpeaking;
    return this;
  }

   /**
   * The number of countries where English is the country&#x27;s primary language
   * @return englishSpeaking
  **/
  @Schema(description = "The number of countries where English is the country's primary language")
  public Integer getEnglishSpeaking() {
    return englishSpeaking;
  }

  public void setEnglishSpeaking(Integer englishSpeaking) {
    this.englishSpeaking = englishSpeaking;
  }

  public BrandedFoodObjectCountryDetails nonEnglishSpeaking(Integer nonEnglishSpeaking) {
    this.nonEnglishSpeaking = nonEnglishSpeaking;
    return this;
  }

   /**
   * The number of countries where English is not the country&#x27;s primary language
   * @return nonEnglishSpeaking
  **/
  @Schema(description = "The number of countries where English is not the country's primary language")
  public Integer getNonEnglishSpeaking() {
    return nonEnglishSpeaking;
  }

  public void setNonEnglishSpeaking(Integer nonEnglishSpeaking) {
    this.nonEnglishSpeaking = nonEnglishSpeaking;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandedFoodObjectCountryDetails brandedFoodObjectCountryDetails = (BrandedFoodObjectCountryDetails) o;
    return Objects.equals(this.englishSpeaking, brandedFoodObjectCountryDetails.englishSpeaking) &&
        Objects.equals(this.nonEnglishSpeaking, brandedFoodObjectCountryDetails.nonEnglishSpeaking);
  }

  @Override
  public int hashCode() {
    return Objects.hash(englishSpeaking, nonEnglishSpeaking);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandedFoodObjectCountryDetails {\n");
    
    sb.append("    englishSpeaking: ").append(toIndentedString(englishSpeaking)).append("\n");
    sb.append("    nonEnglishSpeaking: ").append(toIndentedString(nonEnglishSpeaking)).append("\n");
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
