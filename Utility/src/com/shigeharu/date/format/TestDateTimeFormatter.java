/**
 *
 */
package com.shigeharu.date.format;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author shigeharu
 *
 */
public class TestDateTimeFormatter {
	private final static DateTimeFormatter TIME_FORMAT = DateTimeFormatter.ofPattern("HH:mm:ss n");
	/**
	 *
	 * @param args
	 */
	public static void main(String[] args) throws InterruptedException {

		/** 過ごした時間計算(ナノ秒も計算) */
		/* 開始時刻 */
		LocalTime startIime = LocalTime.now();
		System.out.println("開始時刻:" + LocalTime.now().format(TIME_FORMAT));
		Thread.sleep(2000);
		/* 終了時刻 */
		LocalTime endTime = LocalTime.now();
		System.out.println("終了時刻:" + endTime.format(TIME_FORMAT));
		Duration dura1 = Duration.between(startIime, endTime);
		long seconds = dura1.getSeconds();
		int nano = dura1.getNano();
		/* 経過した時間 */
		System.out.println(String.format("時間差　:%02d:%02d:%02d %09d", seconds / 3600,
				(seconds % 3600) / 60, seconds % 60, nano));
	}

}
