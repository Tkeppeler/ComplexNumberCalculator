package tomkeppeler25.gmail.com.v33complex;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
public class Seite2 extends AppCompatActivity implements View.OnClickListener {
    private EditText Im1, Re1, r1, phi1, Im2, Re2, r2, phi2, eIm, eRe, er, ephi;
    private Button reset, berechnen, plus, minus, geteilt, mal, weiter;
    private Switch sw1;
    private Complex complex, complex2;


    public boolean ifempty(EditText a, EditText b, EditText c, EditText d, EditText e, EditText f, EditText g, EditText h , EditText i, EditText j, EditText k, EditText l) {
        return a.getText().toString().isEmpty() || b.getText().toString().isEmpty() || c.getText().toString().isEmpty() ||
                d.getText().toString().isEmpty() || e.getText().toString().isEmpty() || f.getText().toString().isEmpty() ||
                g.getText().toString().isEmpty() || h.getText().toString().isEmpty() || i.getText().toString().isEmpty() ||
                j.getText().toString().isEmpty() || k.getText().toString().isEmpty() || l.getText().toString().isEmpty();
    }

    public void plus() {
        if (ifempty(Im1, Re1, r1, phi1, Im2, Re2, r2, phi2, ephi , eIm ,er , eRe)) {
            Toast.makeText(this, "Keine Werte Angegeben", Toast.LENGTH_SHORT).show();
        } else {// wenn Werte angegeben sind
            double Test = Double.valueOf(Im1.getText().toString()) + Double.valueOf(Re1.getText().toString()) +
                    Double.valueOf(r1.getText().toString()) + Double.valueOf(phi1.getText().toString()) +
                    Double.valueOf(Im2.getText().toString()) + Double.valueOf(Re2.getText().toString()) +
                    Double.valueOf(r2.getText().toString()) + Double.valueOf(phi2.getText().toString());
            if (Test != 0.) {
                complex = new Complex(Double.parseDouble(Re1.getText().toString()), Double.parseDouble(Im1.getText().toString()));
                complex2 = new Complex(Double.parseDouble(Re2.getText().toString()), Double.parseDouble(Im2.getText().toString()));
                complex.setComplexzy(Double.valueOf(r1.getText().toString()), getphiInNormal(Double.valueOf(phi1.getText().toString())));
                complex2.setComplexzy(Double.valueOf(r2.getText().toString()), getphiInNormal(Double.valueOf(phi2.getText().toString())));

                Complex erg = complex.plus(complex2);
                eRe.setText(String.valueOf(erg.getre()));
                eIm.setText(String.valueOf(erg.getim()));
                er.setText(String.valueOf(erg.abs()));
                ephi.setText(String.valueOf(getphiIngrad(erg)));
            } else {
                Toast.makeText(this, "Keine Wert angegeben", Toast.LENGTH_SHORT).show();
            }
        }
    }

    public void minus() {
        if (ifempty(Im1, Re1, r1, phi1, Im2, Re2, r2, phi2, ephi , eIm ,er , eRe)) {
            Toast.makeText(this, "Keine Werte Angegeben", Toast.LENGTH_SHORT).show();
        } else {// wenn Werte angegeben sind
            double Test = Double.valueOf(Im1.getText().toString()) + Double.valueOf(Re1.getText().toString()) +
                    Double.valueOf(r1.getText().toString()) + Double.valueOf(phi1.getText().toString()) +
                    Double.valueOf(Im2.getText().toString()) + Double.valueOf(Re2.getText().toString()) +
                    Double.valueOf(r2.getText().toString()) + Double.valueOf(phi2.getText().toString());
            if (Test != 0.) {
                complex = new Complex(Double.parseDouble(Re1.getText().toString()), Double.parseDouble(Im1.getText().toString()));
                complex2 = new Complex(Double.parseDouble(Re2.getText().toString()), Double.parseDouble(Im2.getText().toString()));
                complex.setComplexzy(Double.valueOf(r1.getText().toString()), getphiInNormal(Double.valueOf(phi1.getText().toString())));
                complex2.setComplexzy(Double.valueOf(r2.getText().toString()), getphiInNormal(Double.valueOf(phi2.getText().toString())));
                Complex erg = complex.minus(complex2);
                eRe.setText(String.valueOf(erg.getre()));
                eIm.setText(String.valueOf(erg.getim()));
                er.setText(String.valueOf(erg.abs()));
                ephi.setText(String.valueOf(getphiIngrad(erg)));
            } else {
                Toast.makeText(this, "Keine Wert angegeben", Toast.LENGTH_SHORT).show();
            }
        }
    }

    public void mal() {
        if (ifempty(Im1, Re1, r1, phi1, Im2, Re2, r2, phi2, ephi , eIm ,er , eRe)) {
            Toast.makeText(this, "Keine Werte Angegeben", Toast.LENGTH_SHORT).show();
        } else {// wenn Werte angegeben sind
            double Test = Double.valueOf(Im1.getText().toString()) + Double.valueOf(Re1.getText().toString()) +
                    Double.valueOf(r1.getText().toString()) + Double.valueOf(phi1.getText().toString()) +
                    Double.valueOf(Im2.getText().toString()) + Double.valueOf(Re2.getText().toString()) +
                    Double.valueOf(r2.getText().toString()) + Double.valueOf(phi2.getText().toString());
            if (Test != 0.) {
                complex = new Complex(Double.parseDouble(Re1.getText().toString()), Double.parseDouble(Im1.getText().toString()));
                complex2 = new Complex(Double.parseDouble(Re2.getText().toString()), Double.parseDouble(Im2.getText().toString()));
                complex.setComplexzy(Double.valueOf(r1.getText().toString()), getphiInNormal(Double.valueOf(phi1.getText().toString())));
                complex2.setComplexzy(Double.valueOf(r2.getText().toString()), getphiInNormal(Double.valueOf(phi2.getText().toString())));
                Complex erg = complex.times(complex2);
                eRe.setText(String.valueOf(erg.getre()));
                eIm.setText(String.valueOf(erg.getim()));
                er.setText(String.valueOf(erg.abs()));
                ephi.setText(String.valueOf(getphiIngrad(erg)));
            } else {
                Toast.makeText(this, "Keine Wert angegeben", Toast.LENGTH_SHORT).show();
            }
        }
    }

    public void geteilt() {
        if (ifempty(Im1, Re1, r1, phi1, Im2, Re2, r2, phi2, ephi , eIm ,er , eRe)) {
            Toast.makeText(this, "Keine Werte Angegeben", Toast.LENGTH_SHORT).show();
        } else {// wenn Werte angegeben sind
            double Test = Double.valueOf(Im1.getText().toString()) + Double.valueOf(Re1.getText().toString()) +
                    Double.valueOf(r1.getText().toString()) + Double.valueOf(phi1.getText().toString()) +
                    Double.valueOf(Im2.getText().toString()) + Double.valueOf(Re2.getText().toString()) +
                    Double.valueOf(r2.getText().toString()) + Double.valueOf(phi2.getText().toString());
            if (Test != 0.) {
                complex = new Complex(Double.parseDouble(Re1.getText().toString()), Double.parseDouble(Im1.getText().toString()));
                complex2 = new Complex(Double.parseDouble(Re2.getText().toString()), Double.parseDouble(Im2.getText().toString()));
                complex.setComplexzy(Double.valueOf(r1.getText().toString()), getphiInNormal(Double.valueOf(phi1.getText().toString())));
                complex2.setComplexzy(Double.valueOf(r2.getText().toString()), getphiInNormal(Double.valueOf(phi2.getText().toString())));
                Complex erg = complex.divides(complex2);
                eRe.setText(String.valueOf(erg.getre()));
                eIm.setText(String.valueOf(erg.getim()));
                er.setText(String.valueOf(erg.abs()));
                ephi.setText(String.valueOf(getphiIngrad(erg)));
            } else {
                Toast.makeText(this, "Keine Wert angegeben", Toast.LENGTH_SHORT).show();
            }
        }
    }

    public double getphiIngrad(Complex phi) {
        if (sw1.isChecked()) {
            return ((phi.phase() / Math.PI) * 180);
        } else {
            return phi.phase();
        }
    }

    public double getphiInNormal(double phi) {
        if (sw1.isChecked()) {
            return ((phi * Math.PI) / 180);
        } else {
            return phi;
        }
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Im1 = (EditText) findViewById(R.id.editText10);
        Re1 = (EditText) findViewById(R.id.editText9);
        r1 = (EditText) findViewById(R.id.editText11);
        phi1 = (EditText) findViewById(R.id.editText12);
        Im2 = (EditText) findViewById(R.id.editText13);
        Re2 = (EditText) findViewById(R.id.editText14);
        r2 = (EditText) findViewById(R.id.editText16);
        phi2 = (EditText) findViewById(R.id.editText15);
        eIm = (EditText) findViewById(R.id.editText22);
        eRe = (EditText) findViewById(R.id.editText23);
        er = (EditText) findViewById(R.id.editText21);
        ephi = (EditText) findViewById(R.id.editText24);
        reset = (Button) findViewById(R.id.button2);
        berechnen = (Button) findViewById(R.id.button);
        plus = (Button) findViewById(R.id.button5);
        minus = (Button) findViewById(R.id.button3);
        mal = (Button) findViewById(R.id.button6);
        geteilt = (Button) findViewById(R.id.button7);
        sw1 = (Switch) findViewById(R.id.switch2);
        weiter = (Button) findViewById(R.id.buttonWeiter);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.buttonWeiter:
                Intent intent = new Intent(Seite2.this, MainActivity.class);
                startActivity(intent);
                break;

            case R.id.buttonrechnen: //RECHNEN
                if (ifempty(Im1, Re1, r1, phi1, Im2, Re2, r2, phi2, ephi , eIm ,er , eRe)) {
                    Toast.makeText(this, "Keine Werte Angegeben", Toast.LENGTH_SHORT).show();
                } else {// wenn Werte angegeben sind
                    double RI1 = Double.valueOf(Im1.getText().toString()) + Double.valueOf(Re1.getText().toString());
                    double RI2 = Double.valueOf(Im2.getText().toString()) + Double.valueOf(Re2.getText().toString());
                    double RI3 = Double.valueOf(eIm.getText().toString()) + Double.valueOf(eRe.getText().toString());
                    double rp1 = Double.valueOf(r1.getText().toString()) + Double.valueOf(phi1.getText().toString());
                    double rp2 = Double.valueOf(r2.getText().toString()) + Double.valueOf(phi2.getText().toString());
                    double rp3 = Double.valueOf(er.getText().toString()) + Double.valueOf(ephi.getText().toString());
                    if (RI1 != 0.) {
                        complex = new Complex(Double.parseDouble(Re1.getText().toString()), Double.parseDouble(Im1.getText().toString()));
                        r1.setText(String.valueOf(complex.abs()));
                        phi1.setText(String.valueOf(getphiIngrad(complex)));
                    }
                    if (RI2 != 0.) {
                        complex = new Complex(Double.parseDouble(Re2.getText().toString()), Double.parseDouble(Im2.getText().toString()));
                        r2.setText(String.valueOf(complex.abs()));
                        phi2.setText(String.valueOf(getphiIngrad(complex)));
                    }
                    if (RI3 !=0){
                        complex = new Complex(Double.parseDouble(eRe.getText().toString()), Double.parseDouble(eIm.getText().toString()));
                        er.setText(String.valueOf(complex.abs()));
                        ephi.setText(String.valueOf(getphiIngrad(complex)));
                    }
                    if (rp1 != 0.) {
                        complex = new Complex();
                        complex.setComplexzy(Double.valueOf(r1.getText().toString()), getphiInNormal(Double.valueOf(phi1.getText().toString())));
                        Im1.setText(String.valueOf(Math.round(complex.im())));
                        Re1.setText(String.valueOf(Math.round(complex.re())));
                    }
                    if (rp2 != 0.) {
                        complex = new Complex();
                        complex.setComplexzy(Double.valueOf(r2.getText().toString()), getphiInNormal(Double.valueOf(phi2.getText().toString())));
                        Im2.setText(String.valueOf(Math.round(complex.im())));
                        Re2.setText(String.valueOf(Math.round(complex.re())));
                    }
                    if (rp3 != 0){
                        complex = new Complex();
                        complex.setComplexzy(Double.valueOf(er.getText().toString()), getphiInNormal(Double.valueOf(ephi.getText().toString())));
                        eIm.setText(String.valueOf(Math.round(complex.im())));
                        eRe.setText(String.valueOf(Math.round(complex.re())));
                    }
                }
                break;
            case R.id.buttonreset: //RESET
                Im1.setText("0");
                Re1.setText("0");
                r1.setText("0");
                phi1.setText("0");
                Im2.setText("0");
                Re2.setText("0");
                r2.setText("0");
                phi2.setText("0");
                eRe.setText("0");
                eIm.setText("0");
                er.setText("0");
                ephi.setText("0");
                break;
            case R.id.button3plus:
                plus();
                break;
            case R.id.button4minus:
                minus();
                break;
            case R.id.button6mal:
                mal();
                break;
            case R.id.button5geteilt:
                geteilt();
                break;
        }
    }
}
