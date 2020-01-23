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
import io.swagger.client.model.BrandedFoodObjectNutrientsChomp;
import io.swagger.client.model.BrandedFoodObjectNutrientsUsda;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * An object containing nutrient information from multiple sources
 */
@Schema(description = "An object containing nutrient information from multiple sources")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-01-23T13:08:00.103Z[GMT]")
public class BrandedFoodObjectNutrients {
  @SerializedName("chomp")
  private List<BrandedFoodObjectNutrientsChomp> chomp = null;

  @SerializedName("usda")
  private List<BrandedFoodObjectNutrientsUsda> usda = null;

  public BrandedFoodObjectNutrients chomp(List<BrandedFoodObjectNutrientsChomp> chomp) {
    this.chomp = chomp;
    return this;
  }

  public BrandedFoodObjectNutrients addChompItem(BrandedFoodObjectNutrientsChomp chompItem) {
    if (this.chomp == null) {
      this.chomp = new ArrayList<BrandedFoodObjectNutrientsChomp>();
    }
    this.chomp.add(chompItem);
    return this;
  }

   /**
   * An array containing an object for each nutrient data point
   * @return chomp
  **/
  @Schema(description = "An array containing an object for each nutrient data point")
  public List<BrandedFoodObjectNutrientsChomp> getChomp() {
    return chomp;
  }

  public void setChomp(List<BrandedFoodObjectNutrientsChomp> chomp) {
    this.chomp = chomp;
  }

  public BrandedFoodObjectNutrients usda(List<BrandedFoodObjectNutrientsUsda> usda) {
    this.usda = usda;
    return this;
  }

  public BrandedFoodObjectNutrients addUsdaItem(BrandedFoodObjectNutrientsUsda usdaItem) {
    if (this.usda == null) {
      this.usda = new ArrayList<BrandedFoodObjectNutrientsUsda>();
    }
    this.usda.add(usdaItem);
    return this;
  }

   /**
   * An array containing an object for each nutrient data point as found in the USDA database
   * @return usda
  **/
  @Schema(description = "An array containing an object for each nutrient data point as found in the USDA database")
  public List<BrandedFoodObjectNutrientsUsda> getUsda() {
    return usda;
  }

  public void setUsda(List<BrandedFoodObjectNutrientsUsda> usda) {
    this.usda = usda;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandedFoodObjectNutrients brandedFoodObjectNutrients = (BrandedFoodObjectNutrients) o;
    return Objects.equals(this.chomp, brandedFoodObjectNutrients.chomp) &&
        Objects.equals(this.usda, brandedFoodObjectNutrients.usda);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chomp, usda);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandedFoodObjectNutrients {\n");
    
    sb.append("    chomp: ").append(toIndentedString(chomp)).append("\n");
    sb.append("    usda: ").append(toIndentedString(usda)).append("\n");
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
