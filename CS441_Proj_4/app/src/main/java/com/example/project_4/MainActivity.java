package com.example.project_4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    <?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:clipToPadding="false"
    android:focusableInTouchMode="true"
    tools:context="com.example.scaledrone.chat.MainActivity">

    <ListView
    android:layout_width="match_parent"
    android:id="@+id/messages_view"
    android:layout_weight="2"
    android:divider="#fff"
    android:layout_height="wrap_content"
            />

    <LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:background="#fff"
    android:orientation="horizontal">

        <EditText
    android:id="@+id/editText"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:layout_weight="2"
    android:ems="10"
    android:hint="Write a message"
    android:inputType="text"
    android:paddingHorizontal="10dp"
    android:text="" />

        <ImageButton
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:layout_gravity="center"
    android:scaleType="fitCenter"
    android:padding="20dp"
    android:layout_marginHorizontal="10dp"
    android:background="@drawable/ic_send_black_24dp"/>
    </LinearLayout>
</LinearLayout>


    <vector xmlns:android="http://schemas.android.com/apk/res/android"
    android:width="24dp"
    android:height="24dp"
    android:viewportWidth="24.0"
    android:viewportHeight="24.0">
    <path
    android:fillColor="#FF000000"
    android:pathData="M2.01,21L23,12 2.01,3 2,10l15,2 -15,2z"/>
</vector>
}
