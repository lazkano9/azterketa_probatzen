package es.ull.flights;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api. *;

import es.ull.passengers.Passenger;

@DisplayName("Test guztiak")
class hegaldiProba {

	private Flight f1;
	private Passenger julen;
	
	@BeforeEach
	void eraiki() {
		f1 = new Flight("TB", 10);
		julen = new Passenger("id1","julen","ES");
		
	}
	
	@DisplayName("Flight klasea probatuko dugu.")
	@Test
	void test() {
		f1.addPassenger(julen);
		Assertions.assertAll(
				()-> assertEquals("TB",f1.getFlightNumber()),
				() -> assertEquals(1,f1.getNumberOfPassengers())
				);
	}

}
