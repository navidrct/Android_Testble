package ir.andlearn.testble.BLE;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by navid on 6/13/2016.
 */
public class BLE extends AppCompatActivity {
    static final String TAG = "navid";
    BluetoothAdapter mBluetoothAdapter;
    BluetoothManager bluetoothManager;


    public boolean check_BLE_Support(Context context) {
        Log.d(TAG, "check_BLE_Support: check_BLE_Support is running");
        // Use this check to determine whether BLE is supported on the device. Then
        // you can selectively disable BLE-related features.
        if (!context.getPackageManager().hasSystemFeature(PackageManager.FEATURE_BLUETOOTH_LE)) {
            Log.d(TAG, "check_BLE_Support: ble is not supported");
            return false;
        }else {
            Log.d(TAG, "check_BLE_Support: ble is supported");
            return true;
        }
    }

    public boolean turn_ble_on(Context context){



        // Initializes Bluetooth adapter.
        bluetoothManager =
                (BluetoothManager) context.getSystemService(BLUETOOTH_SERVICE);
        mBluetoothAdapter = bluetoothManager.getAdapter();
        // Ensures Bluetooth is available on the device and it is enabled. If not,
        // displays a dialog requesting user permission to enable Bluetooth.
        if (mBluetoothAdapter == null || !mBluetoothAdapter.isEnabled()) {
            Intent enableBtIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
            context.startActivity(enableBtIntent);
            Log.d(TAG, "onCreate: BLE is Enabled");
            return true;
        }

        return false;
    }
}
