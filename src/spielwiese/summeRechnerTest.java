package spielwiese;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class summeRechnerTest {
	GaussRechner gaussRechner = new GaussRechner();

	@Test
	public void
			testSummeUntil() {
		assertEquals(5050, gaussRechner.summeUntil(100));

	}

}
