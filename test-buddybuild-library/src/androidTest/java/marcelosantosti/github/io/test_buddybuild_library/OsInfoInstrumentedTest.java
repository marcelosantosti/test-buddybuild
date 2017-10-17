package marcelosantosti.github.io.test_buddybuild_library;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static junit.framework.Assert.assertTrue;
import static org.junit.Assert.*;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class OsInfoInstrumentedTest {
    @Test
    public void getPlatform_shouldNotBeEmpty() {
        String platform = OsInfo.getPlatform();
        System.out.println("Platform: " + platform);
        assertTrue(platform != "");
    }
}
