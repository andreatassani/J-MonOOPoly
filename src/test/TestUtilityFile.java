package test;

import static org.junit.Assert.assertNotNull;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.junit.Test;
import controller.UtilityFile.UtilityFile;
import controller.UtilityFile.UtilityFileImpl;
/**
 * 
 * JUnit test for UtilityFile class.
 *
 */
public class TestUtilityFile {
/**
 * Check that the text file is correctly loaded into a
 * string and returned.
 * @throws FileNotFoundException : if the file is not found
 * @throws IOException : Input/Output problems
 */
@Test
        public void testIsFileLoadWorking() throws FileNotFoundException, IOException {
	
		UtilityFile file = new UtilityFileImpl();
		
		assertNotNull(file.getString());
		
		
		
}


}
