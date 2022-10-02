package com.example.juego_gato;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    int turno,cont ,contador=0;
    String letra;
    //creo mi editext
    EditText etganador;

    //creo mis botones
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnreset,btnsalir;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_main);

        //jalo las referencias
        etganador=(EditText)(findViewById(R.id.etganador));

        btn1=(Button) (findViewById(R.id.btn1));
        btn2=(Button) (findViewById(R.id.btn2));
        btn3=(Button) (findViewById(R.id.btn3));
        btn4=(Button) (findViewById(R.id.btn4));
        btn5=(Button) (findViewById(R.id.btn5));
        btn6=(Button) (findViewById(R.id.btn6));
        btn7=(Button) (findViewById(R.id.btn7));
        btn8=(Button) (findViewById(R.id.btn8));
        btn9=(Button) (findViewById(R.id.btn9));
        btnreset=(Button) (findViewById(R.id.btnreset));
        btnsalir=(Button) (findViewById(R.id.btnsalir));

        //estamos haciendo que los botones los escuches mi onclick
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btnreset.setOnClickListener(this);
        btnsalir.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        cont++;
        turno=cont%2;
        String letra;

        //jugador 1
        if (turno==1)
        {
            imprimirXO('X',v);
        }
        //jugador 2
        else
        {
            imprimirXO('O',v);
        }
    }

    //fin del onclick

    public void imprimirXO(char letra, View v){
        //botones de salir y volver a jugar
        if (v.getId()==R.id.btnreset)
        {
            etganador.setEnabled(true);
            etganador.setText("");

            btn1.setEnabled(true);
            btn1.setText("");

            btn2.setEnabled(true);
            btn2.setText("");

            btn3.setEnabled(true);
            btn3.setText("");

            btn4.setEnabled(true);
            btn4.setText("");

            btn5.setEnabled(true);
            btn5.setText("");

            btn6.setEnabled(true);
            btn6.setText("");

            btn7.setEnabled(true);
            btn7.setText("");

            btn8.setEnabled(true);
            btn8.setText("");

            btn9.setEnabled(true);
            btn9.setText("");
        }

        if (v.getId()==R.id.btnsalir)
        {
            System.exit(0);
        }
        //fin de los botones


        if (v.getId()==R.id.btn1)
        {
            btn1.setText(letra+"");
            btn1.setEnabled(false);
        }
        //cierro el if
        else if (v.getId()==R.id.btn2)
        {
            btn2.setText(letra+"");
            btn2.setEnabled(false);
        }
        //cierro el if
        else if (v.getId()==R.id.btn3)
        {
            btn3.setText(letra+"");
            btn3.setEnabled(false);
        }
        //cierro el if
        else if (v.getId()==R.id.btn4)
        {
            btn4.setText(letra+"");
            btn4.setEnabled(false);
        }
        //cierro el if
        else if (v.getId()==R.id.btn5)
        {
            btn5.setText(letra+"");
            btn5.setEnabled(false);
        }
        //cierro el if
        else if (v.getId()==R.id.btn6)
        {
            btn6.setText(letra+"");
            btn6.setEnabled(false);
        }
        //cierro el if
        else if (v.getId()==R.id.btn7)
        {
            btn7.setText(letra+"");
            btn7.setEnabled(false);
        }
        //cierro el if
        else if (v.getId()==R.id.btn8)
        {
            btn8.setText(letra+"");
            btn8.setEnabled(false);
        }
        //cierro el if
        else if (v.getId()==R.id.btn9)
        {
            btn9.setText(letra+"");
            btn9.setEnabled(false);
        }

        ganador(letra);

    }//fin del metodo imprimirXO

    public void ganador(char letra)
    {
        if (btn1.getText().toString().equals(letra+"") && (btn2.getText().toString().equals(letra+"")) && (btn3.getText().toString().equals(letra+"")))
        {
            etganador.setText("El ganador es "+letra);
            etganador.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);


        }
        else if (btn4.getText().toString().equals(letra+"") && (btn5.getText().toString().equals(letra+"")) && (btn6.getText().toString().equals(letra+"")))
        {
            etganador.setText("El ganador es "+letra);
            etganador.setEnabled(false);
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
        }
        else if (btn7.getText().toString().equals(letra+"") && (btn8.getText().toString().equals(letra+"")) && (btn9.getText().toString().equals(letra+"")))
        {
            etganador.setText("El ganador es "+letra);
            etganador.setEnabled(false);
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
        }
        else if (btn1.getText().toString().equals(letra+"") && (btn4.getText().toString().equals(letra+"")) && (btn7.getText().toString().equals(letra+"")))
        {
            etganador.setText("El ganador es "+letra);
            etganador.setEnabled(false);

            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
        }
        else if (btn2.getText().toString().equals(letra+"") && (btn5.getText().toString().equals(letra+"")) && (btn8.getText().toString().equals(letra+"")))
        {
            etganador.setText("El ganador es "+letra);
            etganador.setEnabled(false);

            btn1.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn9.setEnabled(false);
        }
        else if (btn3.getText().toString().equals(letra+"") && (btn6.getText().toString().equals(letra+"")) && (btn9.getText().toString().equals(letra+"")))
        {
            etganador.setText("El ganador es "+letra);
            etganador.setEnabled(false);

            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
        }
        else if (btn1.getText().toString().equals(letra+"") && (btn5.getText().toString().equals(letra+"")) && (btn9.getText().toString().equals(letra+"")))
        {
            etganador.setText("El ganador es "+letra);
            etganador.setEnabled(false);

            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
        }
        else if (btn3.getText().toString().equals(letra+"") && (btn5.getText().toString().equals(letra+"")) && (btn7.getText().toString().equals(letra+"")))
        {
            etganador.setText("El ganador es "+letra);
            etganador.setEnabled(false);

            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn4.setEnabled(false);
            btn6.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
        }
        else if (contador<9)
        {
            contador++;
        }
        else
        {
            etganador.setText("empate");
        }


    }//fin del metodo ganador

}//fin de la clase activyty