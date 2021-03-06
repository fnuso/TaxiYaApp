package com.deinvesa.taxi.taxiya;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TabHost;

public class Menu extends AppCompatActivity {
    TabHost TbH;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        TbH = (TabHost) findViewById(R.id.tabHost); //llamamos al Tabhost
        TbH.setup();                                                         //lo activamos

        TabHost.TabSpec tab1 = TbH.newTabSpec("tab1");  //aspectos de cada Tab (pestaña)
        TabHost.TabSpec tab2 = TbH.newTabSpec("tab2");
        TabHost.TabSpec tab3 = TbH.newTabSpec("tab3");

        tab1.setIndicator("UNO");    //qué queremos que aparezca en las pestañas
        tab1.setContent(R.id.Tab1); //definimos el id de cada Tab (pestaña)

        tab2.setIndicator("DOS");
        tab2.setContent(R.id.Tab2);

        tab3.setIndicator("TRES");
        tab3.setContent(R.id.Tab3);

        TbH.addTab(tab1); //añadimos los tabs ya programados
        TbH.addTab(tab2);
        TbH.addTab(tab3);

    }
}
