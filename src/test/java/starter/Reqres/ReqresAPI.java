package starter.Reqres;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;

import java.io.File;

public class ReqresAPI {
    public static final String URL = "https://Regres.com";
    public static final String DIR = System.getProperty("user.dir");
    public static final String JSON_REQ_BODY = DIR+"/src/test/resources/JSON/RequestBody";

    public static String GET_LIST_USER = URL+"/api/users?page={page}";
    public static String POST_CREATE_NEW_USER = URL+"/api/users";
    public static String PUT_UPDATE_USER = URL+"/api/users{id}";



    public static void Getlistusers(int page){
        SerenityRest.given().pathParam("page",page);

    }
    public void PostCreateNewUsers(File Json){
        SerenityRest.given().
                contentType(ContentType.JSON).
                body(Json);
    }

    
    public void PutUpdateUser(int id, File json){
        SerenityRest.given().
                pathParam("id",id).
                contentType(ContentType.JSON).
                body(json);

    }


}
