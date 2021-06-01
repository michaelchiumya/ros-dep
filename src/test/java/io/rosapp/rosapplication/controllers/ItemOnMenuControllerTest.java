package io.rosapp.rosapplication.controllers;

import io.restassured.http.ContentType;
import io.rosapp.rosapplication.entities.ItemOnMenu;
import io.rosapp.rosapplication.services.ItemOnMenuService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.module.mockmvc.RestAssuredMockMvc.given;
import static io.restassured.module.mockmvc.RestAssuredMockMvc.mockMvc;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@WebMvcTest(ItemOnMenuController.class)
class ItemOnMenuControllerTest {

    @MockBean
    private ItemOnMenuService itemOnMenuService;

    @Autowired
    private MockMvc mockMvc;

    @Mock
    List<ItemOnMenu> menuItemList = new ArrayList<>();

    @BeforeEach
    void setUp() {
        mockMvc(mockMvc);
    }

    @Test
    void post() {
    }

    @Test
    void get() {
    }

//    @Test
//    void getAll() {
//        //when get all is triggered
//        when(itemOnMenuService.getAll())
//
//                //then return a list of items on menu
//                .thenReturn( menuItemList  );
//        given()
//                .auth().none()
//                .when()
//                .get("/api/v1/menu-items")
//                .then()
//                .statusCode(200)
//                .contentType(ContentType.JSON)
//                .body("$.size()", equalTo(2))
//                .body("[0].id", equalTo(1))
//                .body("[0].name", equalTo("Salmon"))
//                .body("[0].active", equalTo(true))
//                .body("[0].type", equalTo("Lunch"))
//                .body("[0].special_of_the_day", equalTo(false))
//                .body("[0].price", equalTo(12.00f))
//                .body("[0].description", equalTo("some info"))
//                .body("[0].menu", equalTo(1))
//                .body("[1].id", equalTo(2))
//                .body("[1].name", equalTo("BLT"))
//                .body("[1].active", equalTo(true))
//                .body("[1].type", equalTo("Brunch"))
//                .body("[1].special_of_the_day", equalTo(false))
//                .body("[1].price", equalTo(5.00f))
//                .body("[1].description", equalTo("some info"))
//                .body("[0].menu", equalTo(1));
//    }

    @Test
    void delete() {
    }

    @Test
    void update() {
    }

    @Test
    void getMenuItems() {
    }
}