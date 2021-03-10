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
import io.swagger.client.model.RecipeObjectMetaImages;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * An object containing this item&#x27;s compatibility grades for each supported diet
 */
@Schema(description = "An object containing this item's compatibility grades for each supported diet")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-09T22:26:17.802Z[GMT]")
public class RecipeObjectMeta {
  @SerializedName("url")
  private String url = null;

  @SerializedName("images")
  private RecipeObjectMetaImages images = null;

  @SerializedName("source")
  private String source = null;

  @SerializedName("cuisine")
  private String cuisine = null;

  @SerializedName("created")
  private String created = null;

  @SerializedName("modified")
  private String modified = null;

  @SerializedName("nutrients_notice")
  private String nutrientsNotice = null;

  public RecipeObjectMeta url(String url) {
    this.url = url;
    return this;
  }

   /**
   * URL to the recipe. You must link back to the recipe when displaying it.
   * @return url
  **/
  @Schema(description = "URL to the recipe. You must link back to the recipe when displaying it.")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public RecipeObjectMeta images(RecipeObjectMetaImages images) {
    this.images = images;
    return this;
  }

   /**
   * Get images
   * @return images
  **/
  @Schema(description = "")
  public RecipeObjectMetaImages getImages() {
    return images;
  }

  public void setImages(RecipeObjectMetaImages images) {
    this.images = images;
  }

  public RecipeObjectMeta source(String source) {
    this.source = source;
    return this;
  }

   /**
   * The source of the recipe. You must attribute this source when displaying this recipe.
   * @return source
  **/
  @Schema(description = "The source of the recipe. You must attribute this source when displaying this recipe.")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public RecipeObjectMeta cuisine(String cuisine) {
    this.cuisine = cuisine;
    return this;
  }

   /**
   * This recipe&#x27;s cuisine
   * @return cuisine
  **/
  @Schema(description = "This recipe's cuisine")
  public String getCuisine() {
    return cuisine;
  }

  public void setCuisine(String cuisine) {
    this.cuisine = cuisine;
  }

  public RecipeObjectMeta created(String created) {
    this.created = created;
    return this;
  }

   /**
   * The date when this recipe was created
   * @return created
  **/
  @Schema(description = "The date when this recipe was created")
  public String getCreated() {
    return created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  public RecipeObjectMeta modified(String modified) {
    this.modified = modified;
    return this;
  }

   /**
   * The date when this recipe was most recently modified
   * @return modified
  **/
  @Schema(description = "The date when this recipe was most recently modified")
  public String getModified() {
    return modified;
  }

  public void setModified(String modified) {
    this.modified = modified;
  }

  public RecipeObjectMeta nutrientsNotice(String nutrientsNotice) {
    this.nutrientsNotice = nutrientsNotice;
    return this;
  }

   /**
   * Additional information about this recipe&#x27;s nutrients
   * @return nutrientsNotice
  **/
  @Schema(description = "Additional information about this recipe's nutrients")
  public String getNutrientsNotice() {
    return nutrientsNotice;
  }

  public void setNutrientsNotice(String nutrientsNotice) {
    this.nutrientsNotice = nutrientsNotice;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecipeObjectMeta recipeObjectMeta = (RecipeObjectMeta) o;
    return Objects.equals(this.url, recipeObjectMeta.url) &&
        Objects.equals(this.images, recipeObjectMeta.images) &&
        Objects.equals(this.source, recipeObjectMeta.source) &&
        Objects.equals(this.cuisine, recipeObjectMeta.cuisine) &&
        Objects.equals(this.created, recipeObjectMeta.created) &&
        Objects.equals(this.modified, recipeObjectMeta.modified) &&
        Objects.equals(this.nutrientsNotice, recipeObjectMeta.nutrientsNotice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, images, source, cuisine, created, modified, nutrientsNotice);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipeObjectMeta {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    cuisine: ").append(toIndentedString(cuisine)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    nutrientsNotice: ").append(toIndentedString(nutrientsNotice)).append("\n");
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
