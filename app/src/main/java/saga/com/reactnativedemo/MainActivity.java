package saga.com.reactnativedemo;

import android.os.Bundle;

import com.facebook.react.ReactActivity;

import javax.annotation.Nullable;

public class MainActivity extends ReactActivity {

    private static final String MAIN_COMPONENT = "ReactNativeDemo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Nullable
    @Override
    protected String getMainComponentName() {
        return MAIN_COMPONENT;
    }
}
