package com.jtv.datetimepickertest;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.Toast;

/**
 *
 * 
 */
public class DateTimePickerActivity extends Activity {
	/** Called when the activity is first created. */
	private EditText startDateTime;
	private EditText endDateTime;
	private EditText testDateTime;

	private String initStartDateTime = ""; // 初始化开始时间2017-5-26 10:27
	private String initEndDateTime = ""; // 初始化结束时间2017-5-26 17:44

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		// 两个输入框
		startDateTime = (EditText) findViewById(R.id.inputDate);
		endDateTime = (EditText) findViewById(R.id.inputDate2);
		testDateTime = (EditText) findViewById(R.id.inputDate3);

		startDateTime.setText(initStartDateTime);
		endDateTime.setText(initEndDateTime);
		testDateTime.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				DatePickDialogUtil dateTimePicKDialog = new DatePickDialogUtil(
						DateTimePickerActivity.this, initEndDateTime);
				dateTimePicKDialog.dateTimePicKDialog(testDateTime);

			}
		});

		startDateTime.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {

				DateTimePickDialogUtil dateTimePicKDialog = new DateTimePickDialogUtil(
						DateTimePickerActivity.this, initEndDateTime);
				dateTimePicKDialog.dateTimePicKDialog(startDateTime);

			}
		});

		endDateTime.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				DateTimePickDialogUtil dateTimePicKDialog = new DateTimePickDialogUtil(
						DateTimePickerActivity.this, initEndDateTime);
				dateTimePicKDialog.dateTimePicKDialog(endDateTime);

			}
		});

		getData();
	}
	public void getData()
	{
		Toast.makeText(DateTimePickerActivity.this,""+startDateTime.getText(),Toast.LENGTH_SHORT).show();

	}
}
