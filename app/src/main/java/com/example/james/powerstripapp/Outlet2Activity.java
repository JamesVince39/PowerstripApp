package com.example.james.powerstripapp;
import android.os.Bundle;
import android.app.Activity;
import android.widget.Button;
import android.Manifest;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import android.graphics.Color;
import java.util.List;

public class Outlet2Activity extends MainActivity implements BLEManager {

    private Button refreshButton;
    private String dataString;
    private LineChart mChart;
    private List<Entry> entries = new ArrayList<Entry>();


    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.outlet2screen);
        mChart =  findViewById(R.id.graph);

        entries.add(new Entry(1,6));
        entries.add(new Entry(2,6));
        entries.add(new Entry(3,6));
        entries.add(new Entry(4,6));
        entries.add(new Entry(5,6));
        entries.add(new Entry(6,6));

        LineDataSet dataSet = new LineDataSet(entries, "Power Usage Over Time"); // add entries to dataset
        LineData lineData = new LineData(dataSet);
        mChart.setData(lineData);
        mChart.invalidate();


        //GraphView graph = (GraphView) findViewById(R.id.graph);
        //LineGraphSeries<DataPoint> series = new LineGraphSeries<>(new DataPoint[] {
        //        new DataPoint(0, 1),
        //        new DataPoint(1, 5),
        //        new DataPoint(2, 3),
        //        new DataPoint(3, 2),
        //        new DataPoint(4, 6)
        //});
        //graph.addSeries(series);
    }





    public void refreshData(){

    }



}

