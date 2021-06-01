package io.rosapp.rosapplication.controllers;

import io.restassured.http.ContentType;
import io.rosapp.rosapplication.entities.ItemOnMenu;
import io.rosapp.rosapplication.services.ItemOnMenuService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static io.restassured.module.mockmvc.RestAssuredMockMvc.given;
import static io.restassured.module.mockmvc.RestAssuredMockMvc.mockMvc;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.when;


@WebMvcTest(ItemOnMenuController.class)
class ItemControllerTest {

    @MockBean
    private ItemOnMenuService itemOnMenuService;

    @Autowired
    private MockMvc mockMvc;


    @Mock
    List<ItemOnMenu> menuItemList;

    @Mock
    ItemOnMenu itemOnMenu;

    @BeforeEach
    void setUp() {
        mockMvc(mockMvc);
    }

    @Test
    void should_Return_All_Items() {
        when(itemOnMenuService.getAll())
        .thenReturn( menuItemList  );
        given()
                   .auth().none()
                .when()
                  .get("/api/v1/menu-items")
                .then()
                  .statusCode(200)
                  .contentType(ContentType.JSON)
                  .body("$.size()", equalTo(2))
                  .body("[0].id", equalTo(1))
                  .body("[0].name", equalTo("Salmon"))
                  .body("[0].active", equalTo(true))
                  .body("[0].type", equalTo("Lunch"))
                  .body("[0].special_of_the_day", equalTo(false))
                  .body("[0].price", equalTo(12.00f))
                  .body("[0].menu", equalTo(1))
                  .body("[1].id", equalTo(2))
                  .body("[1].name", equalTo("BLT"))
                  .body("[1].active", equalTo(true))
                  .body("[1].type", equalTo("Brunch"))
                  .body("[1].special_of_the_day", equalTo(false))
                  .body("[1].price", equalTo(5.00f))
                   .body("[1].price", equalTo(1));
    }

    @Test
    void should_Return_One_Item() {
        when(itemOnMenuService.get(3L))
        .thenReturn(itemOnMenu);

                given()
                  .auth().none()
                .when()
                  .get("/api/v1/item/3")
                .then()
                  .statusCode(200)
                  .body("id", equalTo(3))
                  .body("name", equalTo("Salmon"))
                  .body("active", equalTo(true))
                  .body("type", equalTo("Lunch"))
                  .body("special_of_the_day", equalTo(false))
                  .body("price", equalTo(12.00f));
    }

    @Test
    void should_post_item() {

                given()
                //.auth().with(SecurityMockMvcRequestPostProcessors.user("duke").roles("ADMIN"))
                    .auth().none()
                    .contentType("application/json")
                    .body("{\"name\": \"Tea\", \"type\":\"Drink\", \"special_of_the_day\":true, \"price\":3.00, \"description\":\"true\"}")
                .when()
                  .post("/api/v1/item")
                .then()
                  .statusCode(200);
    }

    @Test
    void should_update_item() {

               given()
                  .auth().none()
               .when()
                  .get("/api/v1/menu-item")
               .then()
                  .statusCode(200)
                  .contentType(ContentType.JSON)
                  .body("$.size()", equalTo(2))
                  .body("[0].id", equalTo(1))
                  .body("[0].name", equalTo("Salmon"))
                  .body("[0].active", equalTo(true))
                  .body("[0].type", equalTo("Lunch"))
                  .body("[0].special_of_the_day", equalTo(false))
                  .body("[0].price", equalTo(12.00f));
    }

    @Test
    void should_delete_item() {
        Mockito.when(itemOnMenuService.add(itemOnMenu)).thenReturn(itemOnMenu);
         Mockito.when(itemOnMenuService.remove(itemOnMenu.getId())).thenReturn(itemOnMenu);

                 given()
                   .auth().none()
                   .contentType("application/json")
                .when()
                  .delete("/api/v1/menu-item/1")
               .then()
                  .assertThat()
                  .body(equalTo(""))
                  .statusCode(200);
    }

//    @Test
//    @WithMockUser(username = "duke", roles = {"USER", "EDITOR"})
//    void shouldBlockBookCreationForNonAdminUsers() {
//
//        RestAssuredMockMvc
//                .given()
//                .contentType("application/json")
//                .body("{\"title\": \"Effective Java\", \"isbn\":\"978-0-13-468599-1 \", \"author\":\"Joshua Bloch\"}")
//                .when()
//                .post("/api/books")
//                .then()
//                .statusCode(403);
//    }
//}

}


