package net.yet.zxing;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.NonNull;

import com.journeyapps.barcodescanner.CaptureManager;
import com.journeyapps.barcodescanner.DecoratedBarcodeView;

/**
 * Created by entaoyang@163.com on 2016-10-29.
 */

public class QRScanFragment extends Fragment {

	private CaptureManager capture;
	private DecoratedBarcodeView barcodeScannerView;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

//		barcodeScannerView = initializeContent();

//		capture = new CaptureManager(this, barcodeScannerView);
//		capture.initializeFromIntent(getIntent(), savedInstanceState);
		capture.decode();
	}

//	/**
//	 * Override to use a different layout.
//	 *
//	 * @return the DecoratedBarcodeView
//	 */
//	public DecoratedBarcodeView initializeContent() {
//		setContentView(R.layout.zxing_capture);
//		return (DecoratedBarcodeView)findViewById(R.id.zxing_barcode_scanner);
//	}

	@Override
	public void onResume() {
		super.onResume();
		capture.onResume();
	}

	@Override
	public void onPause() {
		super.onPause();
		capture.onPause();
	}

	@Override
	public void onDestroy() {
		super.onDestroy();
		capture.onDestroy();
	}

	@Override
	public void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		capture.onSaveInstanceState(outState);
	}

	@Override
	public void onRequestPermissionsResult(int requestCode, @NonNull String permissions[], @NonNull int[] grantResults) {
		capture.onRequestPermissionsResult(requestCode, permissions, grantResults);
	}

//	@Override
//	public boolean onKeyDown(int keyCode, KeyEvent event) {
//		return barcodeScannerView.onKeyDown(keyCode, event) || super.onKeyDown(keyCode, event);
//	}

}
