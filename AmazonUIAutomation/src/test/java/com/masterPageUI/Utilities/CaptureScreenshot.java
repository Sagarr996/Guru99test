package com.masterPageUI.Utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import com.masterPageUI.testCases.BaseClass;

public class CaptureScreenshot extends BaseClass{

	public void captureSS(File takenscreenshotfile, File screenshotLocation) {
	
	try {
		FileUtils.copyFile(takenscreenshotfile, screenshotLocation);
	} catch (IOException e) {
		e.printStackTrace();
	}
}
}
