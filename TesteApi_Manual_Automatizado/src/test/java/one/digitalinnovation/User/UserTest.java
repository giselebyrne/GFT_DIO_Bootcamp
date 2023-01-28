package one.digitalinnovation.User;

import one.digitalinnovation.Entities.User;
import io.restassured.*;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;
import org.junit.jupiter.api.*;
import org.junit.runner.Request;

import com.github.javafaker.Faker;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class);
public class UserTest {

    private static User user;
    public static Faker faker;

    @BeforeAll
    public void setup(){
        RestAssured.baseURI = "https://petstore.swagger.io";  
        
        faker = new Faker();
        user = new User(faker.name().username(),
        faker.name().firstName(),
        faker.name().lastName(),
        faker.internet().safeEmailAddress(),
        faker.internet().password(8,10),
        faker.phoneNumber().toString());
    }

    @BeforeAll
    void setRequest(){
        request = given()
        .header("api-key","special-key")
        .contentType(ContentType.JSON);
    }

    @test
    public void CreateNewUser_WithValidData_ReturnOk(){

       // given.header().when().get().then().assertThat();
       request 
       .body(user)
       .when()
       .post(path: "/user")
       .assertThat().statuscode(200).and()
       .body("code", equalTo(200))
       .body("type", equalTo(200))
       .body("message", isA(String.class))
       .body("size()", equalTo(3));   
    
    }

    @Test
    public void GetLogin_ValidUser_Return(){
        request.param("username", user.getUsername())
        .param("password", user.getPassword())
        .when()
        .get("user/login")
        .then()
        .assertThat()
        .statusCode(200)
        .and().time(lessThan()2000L)
        .and().body(matchesJsonSchemaInClasspath("loginResponseSchema.json"));
    }
    
}
