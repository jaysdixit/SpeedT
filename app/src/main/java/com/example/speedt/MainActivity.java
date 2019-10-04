package com.example.speedt;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import android.Manifest;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Formatter;
import java.util.Locale;

public class MainActivity extends Activity {

/*    SwitchCompat sw_metric;
    TextView tv_speed;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*sw_metric = findViewById(R.id.sw_metric);
        tv_speed = findViewById(R.id.tv_speed);

        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M && checkSelfPermission(Manifest.permission.ACCESS_FINE_LOCATION)!= PackageManager.PERMISSION_GRANTED){
            requestPermissions(new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, 1000);
        }else{
            doStuff();
        }
        this.updateSpeed(null);
       *//* sw_metric.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                MainActivity.this.updateSpeed(null);
            }
        });*//*
    }

    @Override
    public void onLocationChanged(Location location) {
        if(location!=null){
            CLocation mylocation = new CLocation(location,true);
            this.updateSpeed(mylocation);
        }
    }

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {

    }

    @Override
    public void onProviderEnabled(String provider) {

    }

    @Override
    public void onProviderDisabled(String provider) {

    }

    @SuppressLint("MissingPermission")
    private void doStuff(){
        LocationManager locationManager = (LocationManager) this.getSystemService(LOCATION_SERVICE);
        if(locationManager!=null){
            locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER,0,0,this);
        }
        Toast.makeText(this, "Waiting for gps Connection", Toast.LENGTH_SHORT).show();
    }

    private void updateSpeed(CLocation location){
        float nCurrentSpeed = 0;

        if(location!=null){
            location.setbUseMetricUnits(true);
            nCurrentSpeed = location.getSpeed();
            if(nCurrentSpeed > 20){
                sw_metric.setChecked(true);
            }
            else{
                sw_metric.setChecked(false);
            }
        }
        Formatter fm  = new Formatter(new StringBuilder());
        fm.format(Locale.US,"%5.1f",nCurrentSpeed);
        String strCurrentSpeed = fm.toString();
        strCurrentSpeed = strCurrentSpeed.replace(" ","0");
        if(true){
            tv_speed.setText(strCurrentSpeed+" km/hr");
        }*//*else {
            tv_speed.setText(strCurrentSpeed+" miles/hr");
        }*//*

    }

*//*    private boolean useMetricUnits(){
        return sw_metric.isChecked();
    }*//*

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        if(requestCode == 1000){
            if(grantResults[0] == PackageManager.PERMISSION_GRANTED){
                doStuff();
            }else{
                finish();
            }
        }*/
    }

    public void speedCall(View view) {
        Intent s = new Intent(getApplicationContext(),Speed.class);
        startActivity(s);
    }
}
