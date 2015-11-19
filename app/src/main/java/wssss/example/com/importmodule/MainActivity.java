package wssss.example.com.importmodule;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        naCreateABmp(300, 300, 24);
    }

    private static native void naCreateABmp(int width, int height, int depth);

    static{
        System.loadLibrary("ImportModule");
    }


}
