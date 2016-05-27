package qianfeng1605.superdemo1;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private long lastTime;
    @Override
    public void onBackPressed() {
        long ct = System.currentTimeMillis();
        if (ct - lastTime > 2000){
            lastTime = ct;
            Toast.makeText(MainActivity.this, "再次点击后退键退出", Toast.LENGTH_SHORT).show();
        }else{
            super.onBackPressed();
        }
    }
}
