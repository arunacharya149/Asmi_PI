package com.example.asmi_pi;

import android.util.Log;

import com.chaquo.python.PyObject;
import com.chaquo.python.Python;

public class AsmiInjection extends Python.Platform {

    private static final String TAG = "%%%%i am in Library---";

    public void d(String message) {

        if (! Python.isStarted()) {
            Python.start(this);
        }

        Python py = Python.getInstance();
        PyObject pyObj = py.getModule("script");
        PyObject obj = pyObj.callAttr("showMessage",message.toString());
        Log.d(TAG, obj.toString());
    }

}
