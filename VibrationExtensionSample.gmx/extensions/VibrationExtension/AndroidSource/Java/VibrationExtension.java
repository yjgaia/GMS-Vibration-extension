package ${YYAndroidPackageName};

import android.os.Vibrator;
import android.content.Context;

import com.yoyogames.runner.RunnerJNILib;

public class VibrationExtension {

	public double vibrate() {
		
		Vibrator vibrator = (Vibrator) RunnerActivity.CurrentActivity.getSystemService(Context.VIBRATOR_SERVICE);
		vibrator.vibrate(500);

		return -1;
	}
}
