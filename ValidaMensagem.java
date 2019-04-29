import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import static org.hamcrest.Matchers.*;
import org.junit.Test;


 public class ValidaMensagem {

   @Test
   public void Mensagem() {
 
      String uriBase = “https://jsonplaceholder.typicode.com/todos/1”;

      given()
        .relaxedHTTPSValidation();
        .param("mensagem","")  
      .when()
         .get(uriBase)
      .then()
         .statusCode(200)
         .contentType(ContentType.JSON) 
         .body("headers.host",is("typicode.com")) 
         .body("args.fool",containsString(mensagem));


   }
}

