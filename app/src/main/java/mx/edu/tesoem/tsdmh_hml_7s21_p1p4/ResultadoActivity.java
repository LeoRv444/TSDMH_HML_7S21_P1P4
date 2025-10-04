package mx.edu.tesoem.tsdmh_hml_7s21_p1p4;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ResultadoActivity extends AppCompatActivity {

    TextView lblres;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_resultado);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        lblres = findViewById(R.id.lblres);
        Bundle datos = getIntent().getExtras();
        if (datos.containsKey("suma")) {
            lblres.setText("La suma es: " + datos.getString("suma"));
        } else if (datos.containsKey("resta")) {
            lblres.setText("La resta es: " + datos.getString("resta"));
        } else if (datos.containsKey("div")) {
            lblres.setText("La división es: " + datos.getString("div"));
        } else if (datos.containsKey("multi")) {
            lblres.setText("La multiplicación es: " + datos.getString("multi"));
        } else if (datos.containsKey("potencia")){
            lblres.setText(("La potencias del primer numero es: " + datos.getString("potencia")+" y la potencia del segundo numero es: "+ datos.getString("potencia2")));
        }else if (datos.containsKey("potencian")){
            lblres.setText("El primer numero usando como exponente el segundo es: " + datos.getString("potencian"));
        }else if (datos.containsKey("raiz")){
            lblres.setText("La raiz del primer numero es: "+datos.getString("raiz")+" y la raiz del segundo numero es: " +datos.getString("raiz2"));
        }

    }

    }
