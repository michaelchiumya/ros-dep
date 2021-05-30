//package io.rosapp.rosapplication.controllers;
//
//import io.restassured.http.ContentType;
//import io.rosapp.rosapplication.entities.Item;
//import io.rosapp.rosapplication.entities.Menu;
//import io.rosapp.rosapplication.entities.Order;
//import io.rosapp.rosapplication.services.ItemService;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.test.web.servlet.MockMvc;
//
//import java.util.Collection;
//import java.util.Iterator;
//import java.util.List;
//import java.util.ListIterator;
//
//import static io.restassured.module.mockmvc.RestAssuredMockMvc.given;
//import static io.restassured.module.mockmvc.RestAssuredMockMvc.mockMvc;
//import static org.hamcrest.Matchers.equalTo;
//import static org.mockito.Mockito.when;
//
//
//@WebMvcTest(ItemController.class)
//class ItemControllerTest {
//
//    @MockBean
//    private ItemService itemService;
//    @Autowired
//    private MockMvc mockMvc;
//    @Mock
//    Item item;
//
//    @BeforeEach
//    void setUp() {
//        mockMvc(mockMvc);
//    }
//
//    @Test
//    void should_Return_All_Items() {
//        when(itemService.getAll())
//        .thenReturn(
//                     List.of(new Item(1L, "Salmon", true, "Lunch", false, 12.00, "Served with Chips or Rice", new Menu(), new List<Order>() {
//                                 @Override
//                                 public int size() {
//                                     return 0;
//                                 }
//
//                                 @Override
//                                 public boolean isEmpty() {
//                                     return false;
//                                 }
//
//                                 @Override
//                                 public boolean contains(Object o) {
//                                     return false;
//                                 }
//
//                                 @Override
//                                 public Iterator<Order> iterator() {
//                                     return null;
//                                 }
//
//                                 @Override
//                                 public Object[] toArray() {
//                                     return new Object[0];
//                                 }
//
//                                 @Override
//                                 public <T> T[] toArray(T[] a) {
//                                     return null;
//                                 }
//
//                                 @Override
//                                 public boolean add(Order order) {
//                                     return false;
//                                 }
//
//                                 @Override
//                                 public boolean remove(Object o) {
//                                     return false;
//                                 }
//
//                                 @Override
//                                 public boolean containsAll(Collection<?> c) {
//                                     return false;
//                                 }
//
//                                 @Override
//                                 public boolean addAll(Collection<? extends Order> c) {
//                                     return false;
//                                 }
//
//                                 @Override
//                                 public boolean addAll(int index, Collection<? extends Order> c) {
//                                     return false;
//                                 }
//
//                                 @Override
//                                 public boolean removeAll(Collection<?> c) {
//                                     return false;
//                                 }
//
//                                 @Override
//                                 public boolean retainAll(Collection<?> c) {
//                                     return false;
//                                 }
//
//                                 @Override
//                                 public void clear() {
//
//                                 }
//
//                                 @Override
//                                 public Order get(int index) {
//                                     return null;
//                                 }
//
//                                 @Override
//                                 public Order set(int index, Order element) {
//                                     return null;
//                                 }
//
//                                 @Override
//                                 public void add(int index, Order element) {
//
//                                 }
//
//                                 @Override
//                                 public Order remove(int index) {
//                                     return null;
//                                 }
//
//                                 @Override
//                                 public int indexOf(Object o) {
//                                     return 0;
//                                 }
//
//                                 @Override
//                                 public int lastIndexOf(Object o) {
//                                     return 0;
//                                 }
//
//                                 @Override
//                                 public ListIterator<Order> listIterator() {
//                                     return null;
//                                 }
//
//                                 @Override
//                                 public ListIterator<Order> listIterator(int index) {
//                                     return null;
//                                 }
//
//                                 @Override
//                                 public List<Order> subList(int fromIndex, int toIndex) {
//                                     return null;
//                                 }
//                             }),
//                             new Item(2L, "BLT", true, "Brunch", false, 5.00, "Served with Chips ", new Menu(), new List<Order>() {                                @Override
//                                 public int size() {
//                                     return 0;
//                                 }
//
//                                 @Override
//                                 public boolean isEmpty() {
//                                     return false;
//                                 }
//
//                                 @Override
//                                 public boolean contains(Object o) {
//                                     return false;
//                                 }
//
//                                 @Override
//                                 public Iterator<Order> iterator() {
//                                     return null;
//                                 }
//
//                                 @Override
//                                 public Object[] toArray() {
//                                     return new Object[0];
//                                 }
//
//                                 @Override
//                                 public <T> T[] toArray(T[] a) {
//                                     return null;
//                                 }
//
//                                 @Override
//                                 public boolean add(Order order) {
//                                     return false;
//                                 }
//
//                                 @Override
//                                 public boolean remove(Object o) {
//                                     return false;
//                                 }
//
//                                 @Override
//                                 public boolean containsAll(Collection<?> c) {
//                                     return false;
//                                 }
//
//                                 @Override
//                                 public boolean addAll(Collection<? extends Order> c) {
//                                     return false;
//                                 }
//
//                                 @Override
//                                 public boolean addAll(int index, Collection<? extends Order> c) {
//                                     return false;
//                                 }
//
//                                 @Override
//                                 public boolean removeAll(Collection<?> c) {
//                                     return false;
//                                 }
//
//                                 @Override
//                                 public boolean retainAll(Collection<?> c) {
//                                     return false;
//                                 }
//
//                                 @Override
//                                 public void clear() {
//
//                                 }
//
//                                 @Override
//                                 public Order get(int index) {
//                                     return null;
//                                 }
//
//                                 @Override
//                                 public Order set(int index, Order element) {
//                                     return null;
//                                 }
//
//                                 @Override
//                                 public void add(int index, Order element) {
//
//                                 }
//
//                                 @Override
//                                 public Order remove(int index) {
//                                     return null;
//                                 }
//
//                                 @Override
//                                 public int indexOf(Object o) {
//                                     return 0;
//                                 }
//
//                                 @Override
//                                 public int lastIndexOf(Object o) {
//                                     return 0;
//                                 }
//
//                                 @Override
//                                 public ListIterator<Order> listIterator() {
//                                     return null;
//                                 }
//
//                                 @Override
//                                 public ListIterator<Order> listIterator(int index) {
//                                     return null;
//                                 }
//
//                                 @Override
//                                 public List<Order> subList(int fromIndex, int toIndex) {
//                                     return null;
//                                 }
//                             })
//                     ));
//        given()
//                   .auth().none()
//                .when()
//                  .get("/api/v1/items")
//                .then()
//                  .statusCode(200)
//                  .contentType(ContentType.JSON)
//                  .body("$.size()", equalTo(2))
//                  .body("[0].id", equalTo(1))
//                  .body("[0].name", equalTo("Salmon"))
//                  .body("[0].active", equalTo(true))
//                  .body("[0].type", equalTo("Lunch"))
//                  .body("[0].special_of_the_day", equalTo(false))
//                  .body("[0].price", equalTo(12.00f))
//                  .body("[1].id", equalTo(2))
//                  .body("[1].name", equalTo("BLT"))
//                  .body("[1].active", equalTo(true))
//                  .body("[1].type", equalTo("Brunch"))
//                  .body("[1].special_of_the_day", equalTo(false))
//                  .body("[1].price", equalTo(5.00f));
//    }
//
//    @Test
//    void should_Return_One_Item() {
//        when(itemService.get(3L))
//        .thenReturn(  new Item(3L, "Salmon", true, "Lunch", false, 12.00, "Served with Chips or Rice", new Menu(), new List<Order>() {
//            @Override
//            public int size() {
//                return 0;
//            }
//
//            @Override
//            public boolean isEmpty() {
//                return false;
//            }
//
//            @Override
//            public boolean contains(Object o) {
//                return false;
//            }
//
//            @Override
//            public Iterator<Order> iterator() {
//                return null;
//            }
//
//            @Override
//            public Object[] toArray() {
//                return new Object[0];
//            }
//
//            @Override
//            public <T> T[] toArray(T[] a) {
//                return null;
//            }
//
//            @Override
//            public boolean add(Order order) {
//                return false;
//            }
//
//            @Override
//            public boolean remove(Object o) {
//                return false;
//            }
//
//            @Override
//            public boolean containsAll(Collection<?> c) {
//                return false;
//            }
//
//            @Override
//            public boolean addAll(Collection<? extends Order> c) {
//                return false;
//            }
//
//            @Override
//            public boolean addAll(int index, Collection<? extends Order> c) {
//                return false;
//            }
//
//            @Override
//            public boolean removeAll(Collection<?> c) {
//                return false;
//            }
//
//            @Override
//            public boolean retainAll(Collection<?> c) {
//                return false;
//            }
//
//            @Override
//            public void clear() {
//
//            }
//
//            @Override
//            public Order get(int index) {
//                return null;
//            }
//
//            @Override
//            public Order set(int index, Order element) {
//                return null;
//            }
//
//            @Override
//            public void add(int index, Order element) {
//
//            }
//
//            @Override
//            public Order remove(int index) {
//                return null;
//            }
//
//            @Override
//            public int indexOf(Object o) {
//                return 0;
//            }
//
//            @Override
//            public int lastIndexOf(Object o) {
//                return 0;
//            }
//
//            @Override
//            public ListIterator<Order> listIterator() {
//                return null;
//            }
//
//            @Override
//            public ListIterator<Order> listIterator(int index) {
//                return null;
//            }
//
//            @Override
//            public List<Order> subList(int fromIndex, int toIndex) {
//                return null;
//            }
//        }));
//
//                given()
//                  .auth().none()
//                .when()
//                  .get("/api/v1/item/3")
//                .then()
//                  .statusCode(200)
//                  .body("id", equalTo(3))
//                  .body("name", equalTo("Salmon"))
//                  .body("active", equalTo(true))
//                  .body("type", equalTo("Lunch"))
//                  .body("special_of_the_day", equalTo(false))
//                  .body("price", equalTo(12.00f));
//    }
//
//    @Test
//    void should_post_item() {
//
//                given()
//                //.auth().with(SecurityMockMvcRequestPostProcessors.user("duke").roles("ADMIN"))
//                    .auth().none()
//                    .contentType("application/json")
//                    .body("{\"name\": \"Tea\", \"type\":\"Drink\", \"special_of_the_day\":true, \"price\":3.00, \"description\":\"true\"}")
//                .when()
//                  .post("/api/v1/item")
//                .then()
//                  .statusCode(200);
//    }
//
////    @Test
////    void should_update_item() {
////
////               given()
////                  .auth().none()
////               .when()
////                  .get("/api/v1/item")
////               .then()
////                  .statusCode(200)
////                  .contentType(ContentType.JSON)
////                  .body("$.size()", equalTo(2))
////                  .body("[0].id", equalTo(1))
////                  .body("[0].name", equalTo("Salmon"))
////                  .body("[0].active", equalTo(true))
////                  .body("[0].type", equalTo("Lunch"))
////                  .body("[0].special_of_the_day", equalTo(false))
////                  .body("[0].price", equalTo(12.00f));
////    }
//
//    @Test
//    void should_delete_item() {
//        Mockito.when(itemService.add(item)).thenReturn(item);
//         Mockito.when(itemService.remove(item.getId())).thenReturn(item);
//
//                 given()
//                   .auth().none()
//                   .contentType("application/json")
//                .when()
//                  .delete("/api/v1/item/1")
//               .then()
//                  .assertThat()
//                  .body(equalTo(""))
//                  .statusCode(200);
//    }
//
////    @Test
////    @WithMockUser(username = "duke", roles = {"USER", "EDITOR"})
////    void shouldBlockBookCreationForNonAdminUsers() {
////
////        RestAssuredMockMvc
////                .given()
////                .contentType("application/json")
////                .body("{\"title\": \"Effective Java\", \"isbn\":\"978-0-13-468599-1 \", \"author\":\"Joshua Bloch\"}")
////                .when()
////                .post("/api/books")
////                .then()
////                .statusCode(403);
////    }
////}
//
//}
//
//
