package is.ru.hugb;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TicTacToeServiceTest {
	static TicTacToeService service = new TicTacToeService();

	@Test
	public void testToString() {
		assertEquals("012\n345\n678\n", service.toString());
	}
}