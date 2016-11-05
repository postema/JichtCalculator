package info.doktershuis.android.jichtcalculator;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import static android.R.color.holo_green_light;
import static android.R.color.holo_orange_light;
import static android.R.color.holo_red_light;

public class MainActivity extends Activity {

    double score = 0;
    double man = 2;
    double manPl = 0;
    double aanval = 2;
    double aanvalPl = 0;
    double dag = 0.5;
    double dagPl = 0;
    double rood = 1;
    double roodPl = 0;
    double mtp = 2.5;
    double mtpPl = 0;
    double cvd = 1.5;
    double cvdPl = 0;
    double urinezuur = 3.5;
    double urinePl = 0;


    public void update(View view){

        TextView punt = (TextView)findViewById(R.id.tvPunt);
        TextView perc = (TextView)findViewById(R.id.tvPercentage);
        TextView advies = (TextView)findViewById(R.id.tvToelicht);


        CheckBox geslacht = (CheckBox) findViewById(R.id.cbGeslacht);
        CheckBox ontstaan = (CheckBox) findViewById(R.id.cbOntstaan);
        CheckBox eersteAanval = (CheckBox) findViewById(R.id.cbAanval);
        CheckBox roodheid = (CheckBox) findViewById(R.id.cbRoodheid);
        CheckBox eersteMtp = (CheckBox) findViewById(R.id.cbMTP);
        CheckBox ht = (CheckBox) findViewById(R.id.cbHT);
        CheckBox ap = (CheckBox) findViewById(R.id.cbAP);
        CheckBox ami = (CheckBox) findViewById(R.id.cbAMI);
        CheckBox hartfalen = (CheckBox) findViewById(R.id.cbHartfalen);
        CheckBox tia = (CheckBox) findViewById(R.id.cbTIA);
        CheckBox cva = (CheckBox) findViewById(R.id.cbCVA);
        CheckBox pav = (CheckBox) findViewById(R.id.cbPAV);
        CheckBox uzGroter = (CheckBox) findViewById(R.id.cbUrinezuur);

        if (geslacht.isChecked()) {
            manPl = man;
        } else {
            manPl = 0;
        }
        if (ontstaan.isChecked()) {
            dagPl = dag;
        } else {
            dagPl = 0;
        }
        if (eersteAanval.isChecked()) {
            aanvalPl = aanval;
        } else {
            aanvalPl = 0;
        }
        if (roodheid.isChecked()) {
            roodPl = rood;
        } else {
            roodPl = 0;
        }
        if (eersteMtp.isChecked()) {
            mtpPl = mtp;
        } else {
            mtpPl = 0;
        }
        if (uzGroter.isChecked()) {
            urinePl = urinezuur;
        } else {
            urinePl = 0;
        }
        if (ht.isChecked()||ap.isChecked()||ami.isChecked()||hartfalen.isChecked()||tia.isChecked()||cva.isChecked()||pav.isChecked()) {
            cvdPl = cvd;
        } else {
            cvdPl = 0;
        }

        score = manPl + dagPl + aanvalPl + roodPl + mtpPl + cvdPl + urinePl;
        punt.setText(Double.toString(score));

        if (score<=4) {
            perc.setText(R.string.pt4);
            perc.setBackgroundColor(getResources().getColor(holo_green_light));
            advies.setText(R.string.pt4a);
        } else if (score<8) {
            perc.setText(R.string.pt48);
            perc.setBackgroundColor(getResources().getColor(holo_orange_light));
            advies.setText(R.string.pt48a);
        } else {
            perc.setText(R.string.pt8);
            perc.setBackgroundColor(getResources().getColor(holo_red_light));
            advies.setText(R.string.pt8a);
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView punt = (TextView)findViewById(R.id.tvPunt);
        TextView perc = (TextView)findViewById(R.id.tvPercentage);
        TextView advies = (TextView)findViewById(R.id.tvToelicht);

        punt.setText(Double.toString(score));
        perc.setText(R.string.pt4);
        perc.setBackgroundColor(getResources().getColor(holo_green_light));
        advies.setText(R.string.pt4a);


    }

}
