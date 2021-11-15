package com.microservice.apiservice;
import com.microservice.apiservice.entity.menu.Menu;
import com.microservice.apiservice.entity.order.Orders;
import com.microservice.apiservice.entity.store.Store;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@SpringBootTest
class ApiServiceApplicationTests {


	@Test
	void contextLoads() {
	}

	@Test
	public void createStore() {

		Store store = new Store();
		store.setStoreName("ABC");

		ResponseEntity<String> response = new TestRestTemplate().postForEntity("http://localhost:9001/stores/create", store, String.class);

		Assertions.assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
	}

	@Test
	public void findByStoreId() {

		ResponseEntity<String> response = new TestRestTemplate().getForEntity("http://localhost:9001/stores/1", String.class);

		Assertions.assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
	}

	@Test
	public void updateStore() {

		Store store = new Store();
		store.setStoreId(1L);
		store.setStoreName("EDF");

		ResponseEntity<String> response = new TestRestTemplate().postForEntity("http://localhost:9001/stores/update", store, String.class);

		Assertions.assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
	}


	@Test
	public void createMenu() {

		Menu menu = new Menu();
		menu.setMenuFoodName("ABC");
		menu.setMenuStoreId(1L);
		menu.setMenuFoodPrice(11.11);

		ResponseEntity<String> response = new TestRestTemplate().postForEntity("http://localhost:9001/menus/create", menu, String.class);

		Assertions.assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
	}

	@Test
	public void findAllByMenuStoreId() {

		ResponseEntity<String> response = new TestRestTemplate().getForEntity("http://localhost:9001/menus/1", String.class);

		Assertions.assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
	}

	@Test
	public void updateMenu() {

		Menu menu = new Menu();
		menu.setMenuId(1L);
		menu.setMenuFoodName("EDF");
		menu.setMenuStoreId(1L);
		menu.setMenuFoodPrice(11.11);

		ResponseEntity<String> response = new TestRestTemplate().postForEntity("http://localhost:9001/menus/update", menu, String.class);

		Assertions.assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
	}


	@Test
	public void createOrder() {

		Orders order = new Orders();
		order.setOrderMenuId(1L);
		order.setOrderState("waiting");

		ResponseEntity<String> response = new TestRestTemplate().postForEntity("http://localhost:9001/orders/create", order, String.class);

		Assertions.assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
	}

	@Test
	public void findByOrderId() {

		ResponseEntity<String> response = new TestRestTemplate().getForEntity("http://localhost:9001/orders/1", String.class);

		Assertions.assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
	}

	@Test
	public void updateOrder() {

		Orders order = new Orders();
		order.setOrderId(1L);
		order.setOrderMenuId(1L);
		order.setOrderState("finish");

		ResponseEntity<String> response = new TestRestTemplate().postForEntity("http://localhost:9001/orders/update", order, String.class);

		Assertions.assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
	}
}
