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

    <?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:paddingVertical="10dp"
        android:paddingLeft="15dp"
        android:paddingRight="60dp"
        android:clipToPadding="false">

<View
        android:id="@+id/avatar"
                android:layout_alignParentLeft="true"
                android:scaleType="centerInside"
                android:background="@drawable/circle"
                android:layout_width="34dp"
                android:layout_height="34dp" />

<TextView
        android:id="@+id/name"
                android:layout_marginLeft="15dp"
                android:layout_toRightOf="@+id/avatar"
                android:layout_alignTop="@+id/avatar"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:paddingBottom="4dp"
                android:text="Rose"/>

<TextView
        android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:id="@+id/message_body"
                android:layout_below="@+id/name"
                android:layout_alignLeft="@+id/name"
                android:background="@drawable/their_message"
                android:paddingVertical="12dp"
                android:paddingHorizontal="16dp"
                android:elevation="2dp"
                android:textSize="18dp"
                android:text="How are you doing? This is a long message that should probably wrap."
                />
</RelativeLayout>