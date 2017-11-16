package com.example.android.pesankopi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    TextView textJumlah;
    int jumlahPesanan1;
    int jumlahPesanan;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayJumlah(0);
        displayprice(0);
        textJumlah = (TextView) findViewById(R.id.jumlah);
        jumlahPesanan = Integer.parseInt(textJumlah.getText().toString());
    }

    public void displayJumlah(int number) {
        TextView jumlah = (TextView) findViewById(R.id.jumlah);
        jumlah.setText("" + number);
    }

    public void tambah(View v) {
        jumlahPesanan = jumlahPesanan + 1;
        displayJumlah(jumlahPesanan);
    }

    public void kurang(View v) {
        if (jumlahPesanan != 0) {
            jumlahPesanan = jumlahPesanan - 1;
        }
        displayJumlah(jumlahPesanan);
    }

    public void displayprice(int number) {
        TextView jumlah = (TextView) findViewById(R.id.price);
        jumlah.setText("Quality Summary");
    }

    public void price(View v) {
        //jumlahPesanan1 = jumlahPesanan * 5;
        String hasil="";
        TextView nama = (TextView) findViewById(R.id.r1);
        TextView namabarang = (TextView) findViewById(R.id.hasil);
        TextView jumlahpesanan = (TextView) findViewById(R.id.r2);
        TextView totalharga = (TextView) findViewById(R.id.r3);
        TextView thanks = (TextView) findViewById(R.id.r4);

        RadioButton cb1=(RadioButton) findViewById(R.id.ck1);
        RadioButton cb2=(RadioButton) findViewById(R.id.ck2);
        RadioButton cb3=(RadioButton) findViewById(R.id.ck3);
        RadioButton cb4=(RadioButton) findViewById(R.id.ck4);

        if(cb1.isChecked())
        {
            jumlahPesanan1 = jumlahPesanan * 5;
            hasil="Handphone";
        }
        if(cb2.isChecked())
        {
            jumlahPesanan1 = jumlahPesanan * 8;
            hasil="Laptop";
        }
        if(cb3.isChecked())
        {
            jumlahPesanan1 = jumlahPesanan * 4;
            hasil="Kamera";
        }
        if(cb4.isChecked())
        {
            jumlahPesanan1 = jumlahPesanan * 2;
            hasil="Hardisk";
        }


        nama.setText("Nama : Fahri Ramadhan Hasibuan");
        namabarang.setText("Anda Membeli " + hasil);
        jumlahpesanan.setText("Quantity : " + jumlahPesanan);
        totalharga.setText("Total : $ " + jumlahPesanan1);
        thanks.setText("Terima Kasih");


    }
}
