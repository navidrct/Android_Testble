package ir.andlearn.testble;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanResult;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import ir.andlearn.testble.BLE.BLE;

public class MainActivity extends AppCompatActivity {
    static final String TAG = "omid ansari";
    BluetoothAdapter mBluetoothAdapter;
    BluetoothLeScanner blescaner;
    BluetoothManager bluetoothManager;
    BLE ble;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ble = new BLE();
        ble.check_BLE_Support(this);
        ble.turn_ble_on(this);




    }


}
