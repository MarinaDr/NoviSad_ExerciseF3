import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlanetExplorer {

	/*@Test
	public void test_executeCommand() {
		fail("Not yet implemented");
	}*/
	
	
	@Test
	public void test_Initialize() throws PlanetExplorerException {
		PlanetExplorer plnt=new PlanetExplorer(3, 3, "(2,2)");
		
		assertEquals("Incorrect position when initialize", "(0,0,N)", plnt.executeCommand(null));
	}
	
	@Test
	public void test_moving_forwoard() throws PlanetExplorerException {
		PlanetExplorer plnt=new PlanetExplorer(3, 3, "(2,2)");
		
		assertEquals("Incorrect position when moving forwoard", "(1,0,N)", plnt.executeCommand("f"));
	}
	@Test
	public void test_moving_backwoard() throws PlanetExplorerException {
		PlanetExplorer plnt=new PlanetExplorer(3, 3, "(2,2)");
		
				assertEquals("Incorrect position when moving forwoard", "(-1,0,N)", plnt.executeCommand("b"));
			}
	@Test
	public void test_moving_right_when_north() throws PlanetExplorerException {
		PlanetExplorer plnt=new PlanetExplorer(3, 3, "(2,2)");
		
		assertEquals("Incorrect position when moving forwoard", "(0,0,E)", plnt.executeCommand("r"));
	}
	@Test
public void test_moving_right_when_east() throws PlanetExplorerException {
	PlanetExplorer plnt=new PlanetExplorer(3, 3, "(2,2)");
	
		assertEquals("Incorrect position when moving forwoard", "(0,0,W)", plnt.executeCommand("r"));
	}
	@Test
public void test_moving_right_when_south() throws PlanetExplorerException {
	PlanetExplorer plnt=new PlanetExplorer(3, 3, "(2,2)");
	
	assertEquals("Incorrect position when moving forwoard", "(0,0,S)", plnt.executeCommand("r"));
}
	@Test
public void test_moving_right_when_west() throws PlanetExplorerException {
	PlanetExplorer plnt=new PlanetExplorer(3, 3, "(2,2)");
	
	assertEquals("Incorrect position when moving forwoard", "(0,0,N)", plnt.executeCommand("r"));
}
	@Test
public void test_moving_left_when_north() throws PlanetExplorerException {
	PlanetExplorer plnt=new PlanetExplorer(3, 3, "(2,2)");
	
	assertEquals("Incorrect position when moving forwoard", "(0,0,W)", plnt.executeCommand("l"));
}
	@Test
public void test_moving_left_when_east() throws PlanetExplorerException {
	PlanetExplorer plnt=new PlanetExplorer(3, 3, "(2,2)");
	
	assertEquals("Incorrect position when moving forwoard", "(0,0,N)", plnt.executeCommand("l"));
}
	@Test
public void test_moving_left_when_south() throws PlanetExplorerException {
	PlanetExplorer plnt=new PlanetExplorer(3, 3, "(2,2)");
	
	assertEquals("Incorrect position when moving forwoard", "(0,0,E)", plnt.executeCommand("l"));
}
	@Test
public void test_moving_left_when_west() throws PlanetExplorerException {
	PlanetExplorer plnt=new PlanetExplorer(3, 3, "(2,2)");
	
	assertEquals("Incorrect position when moving forwoard", "(0,0,S)", plnt.executeCommand("l"));
}


}
