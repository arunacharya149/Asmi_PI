package com.example.asmi_pi;

import android.util.Log;

import com.github.nkzawa.socketio.client.IO;
import com.github.nkzawa.socketio.client.Socket;

import java.net.URISyntaxException;

public class AsmiInjection {

    private static final String TAG = "%%%%i am in Library---";

    private Socket mSocket;


    public void d(String videoLink) {

        try {
            mSocket = IO.socket("http://13.233.142.241:8080/get");
            mSocket.connect();
            Log.d(TAG,"Socketttttttttttt connected");

            mSocket.emit("stream", "https://video.kumuapi.com/7e281f6fc840acb18cbee58e17f5372c_C5E4524D4BE099BD18736E1A95F625FA.m3u8");
//            mSocket.on("reply", );
        } catch (URISyntaxException e) {}
    }

}
