package marcelosantosti.github.io.test_buddybuild_library;

import android.os.Build;
import android.os.Debug;
import android.util.Log;

import java.lang.reflect.Field;

/**
 * Created by marcelosantos on 17/10/17.
 */

public class OsInfo {
    public static String getPlatform() {
        String osName = "";

        try {
            Field[] fields = Build.VERSION_CODES.class.getFields();
            int position = Build.VERSION.SDK_INT + 1;

            //if greater than KitKat, there is an additional version in 'fields' that is not actually used.
            /*if (position > 20) {
                position += 1;
            }*/

            osName = fields[position].getName();

            Log.d("OsInfo", "Gotten Platform: " + osName);

            return osName;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return osName;
    }
}
