package mx.edu.tesoem.tsdmh_hml_7s21_p1p4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class PrincipalActivity extends AppCompatActivity {

    EditText txtnum1, txtnum2;

    Button btnsuma, btnresta,btndivicion, btnmultiplicacion,btnpotencias, btnpotenciasn, btnraiz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_principal);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        txtnum1 = findViewById(R.id.txtnum1);
        txtnum2 = findViewById(R.id.txtnum2);
        btnsuma = findViewById(R.id.btnsuma);
        btnresta = findViewById(R.id.btnresta);
        btndivicion = findViewById(R.id.btndivicion);
        btnmultiplicacion = findViewById(R.id.btnmultiplicacion);
        btnpotencias = findViewById(R.id.btnpotencias);
        btnpotenciasn = findViewById(R.id.btnpotenciasn);
        btnraiz = findViewById(R.id.btnraiz);

    }

    public void oneclicksumar (View V){

        int num1, num2;
        num1 = Integer.parseInt(txtnum1.getText().toString());
        num2 = Integer.parseInt(txtnum2.getText().toString());
        Intent intent = new Intent(this, ResultadoActivity.class);
        intent.putExtra("suma", String.valueOf(num1+num2));
        startActivity(intent);


    }


    public void oneclickresta (View V){

        int num1, num2;
        num1 = Integer.parseInt(txtnum1.getText().toString());
        num2 = Integer.parseInt(txtnum2.getText().toString());
        Intent intent = new Intent(this, ResultadoActivity.class);
        intent.putExtra("resta", String.valueOf(num1-num2));
        startActivity(intent);
    }

    public void oneclickdiv (View V){

        int num1, num2;
        num1 = Integer.parseInt(txtnum1.getText().toString());
        num2 = Integer.parseInt(txtnum2.getText().toString());
        Intent intent = new Intent(this, ResultadoActivity.class);
        intent.putExtra("div", String.valueOf(num1/num2));
        startActivity(intent);
    }

    public void oneclickmulti (View V) {

        int num1, num2;
        num1 = Integer.parseInt(txtnum1.getText().toString());
        num2 = Integer.parseInt(txtnum2.getText().toString());
        Intent intent = new Intent(this, ResultadoActivity.class);
        intent.putExtra("multi", String.valueOf(num1*num2));
        startActivity(intent);

    }

    public void oneclickpotencias (View V) {
        int num1, num2;
        num1 = Integer.parseInt(txtnum1.getText().toString());
        num2 = Integer.parseInt(txtnum2.getText().toString());
        Intent intent = new Intent(this, ResultadoActivity.class);
        intent.putExtra("potencia", String.valueOf(num1*num1));
        intent.putExtra("potencia2", String.valueOf(num2 * num2));
        startActivity(intent);


    }

    public void oneclickpotenciasn (View V){
        int num1, num2;
        num1 = Integer.parseInt(txtnum1.getText().toString());
        num2 = Integer.parseInt(txtnum2.getText().toString());
        long res = 1;
        for (int i = 0; i < num2; i++){
            res *= num1;
        }
        Intent intent = new Intent(this, ResultadoActivity.class);
        intent.putExtra("potencian", String.valueOf(res));
        startActivity(intent);


    }

    public void oneclickraiz (View V) {
        int num1, num2;
        num1 = Integer.parseInt(txtnum1.getText().toString());
        num2 = Integer.parseInt(txtnum2.getText().toString());
        double aprox = num1 / 2.0;
        double aprox2 = num2 / 2.0;
        for (int i = 0; i < 20; i++) {
            aprox = (aprox + num1 / aprox) / 2;
            aprox2 = (aprox2 + num2 / aprox2) / 2;
        }

        Intent intent = new Intent(this, ResultadoActivity.class);
        intent.putExtra("raiz", String.valueOf(aprox));
        intent.putExtra("raiz2", String.valueOf(aprox2));

        startActivity(intent);
    }


}