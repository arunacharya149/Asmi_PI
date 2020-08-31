package com.example.asmi_pi;

import android.content.Context;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.chaquo.python.PyObject;
import com.chaquo.python.Python;
import com.chaquo.python.android.AndroidPlatform;

public class AsmiInjection extends AppCompatActivity {

    private static final String TAG = "%%%%i am in Library---";

    public void d(String message) {

        if (! Python.isStarted()) {
            Python.start(new AndroidPlatform(this));
        }

        Python py = Python.getInstance();
        PyObject pyObj = py.getModule("script");
        PyObject obj = pyObj.callAttr("showMessage",message.toString());
        Log.d(TAG, obj.toString());
    }

}
