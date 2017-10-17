import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import marcelosantosti.github.io.test_buddybuild_library.OsInfo;

import static junit.framework.Assert.assertTrue;

/**
 * Created by marcelosantos on 17/10/17.
 */
@RunWith(JUnit4.class)
public class OsUnitTest {

    @Test
    public void unitTest() {

    }

    @Test
    public void getPlatform_shouldNotBeEmpty() {
        String platform = OsInfo.getPlatform();
        System.out.println("Platform: " + platform);
        assertTrue(platform != "");
    }
}
