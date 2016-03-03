package java;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.app.troels.testapplication.camera_modes.CaptureHighSpeedVideoMode;

/**
 * Created by troels on 2/16/16.
 */
public class HighSpeedCameraActivity extends FragmentActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_camera);
        if (null == savedInstanceState) {
            getFragmentManager().beginTransaction()
                    .replace(R.id.container, CaptureHighSpeedVideoMode.newInstance())
                    .commit();
        }
    }
}
