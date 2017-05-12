import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlanetExplorer {

	/*@Test
	public void test_executeCommand() {
		fail("Not yet implemented");
	}*/
	
	@Test
	public void test_Initialize() throws PlanetExplorerException {
		PlanetExplorer plnt=new PlanetExplorer(3, 3, "(1,1)");
		
		assertEquals("Incorrect position when initialize", "(0,0,N)", plnt.executeCommand(null));
	}
}
