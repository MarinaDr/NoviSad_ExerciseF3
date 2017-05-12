import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlanetExplorer {

	/*@Test
	public void test_executeCommand() {
		fail("Not yet implemented");
	}*/
	PlanetExplorer plnt=new PlanetExplorer(3, 3, "(2,2)");
	
	@Test
	public void test_Initialize() throws PlanetExplorerException {
		
		assertEquals("Incorrect position when initialize", "(0,0,N)", plnt.executeCommand(null));
	}
	
	public void test_moving_forwoard() throws PlanetExplorerException {
		
		assertEquals("Incorrect position when moving forwoard", "(1,0,N)", plnt.executeCommand("f"));
	}
	
	public void test_moving_backwoard() throws PlanetExplorerException {
				
				assertEquals("Incorrect position when moving forwoard", "(0,0,N)", plnt.executeCommand("b"));
			}
	public void test_moving_right_when_north() throws PlanetExplorerException {
		
		assertEquals("Incorrect position when moving forwoard", "(0,0,E)", plnt.executeCommand("r"));
	}
public void test_moving_right_when_east() throws PlanetExplorerException {
		
		assertEquals("Incorrect position when moving forwoard", "(0,0,W)", plnt.executeCommand("r"));
	}
}
