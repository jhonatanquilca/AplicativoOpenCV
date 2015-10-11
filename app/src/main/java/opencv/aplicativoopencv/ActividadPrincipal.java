package opencv.aplicativoopencv;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import org.opencv.android.OpenCVLoader;

public class ActividadPrincipal extends AppCompatActivity {

    /**
     * funcion de prueva opencv
     */
    static {
        if (!OpenCVLoader.initDebug()) {
            Log.i("opencv", "Inicialization failed");
        } else {
            Log.i("opencv", "Inicialization successfull");

        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_principal);
        if (!OpenCVLoader.initDebug()) {
            Toast.makeText(getApplicationContext(),"opencv Inicialization failed",Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getApplicationContext(),"opencv Inicialization successfull",Toast.LENGTH_SHORT).show();

        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_actividad_principal, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
