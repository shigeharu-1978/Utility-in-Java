/**
 *
 */
package com.shigeharu.date.format;

import java.time.Duration;
import java.time.LocalTime;

/**
 *
 * @author shigeharu
 *
 */
public class TestDateTimeFormatter {

	/**
	 *
	 * @param args
	 */
	public static void main(String[] args) {

		/** 過ごした時間計算(ナノ秒も計算) */
		/* 開始時刻 */
		LocalTime startIime = LocalTime.of(14, 23, 13, 117);
		/* 終了時刻 */
		LocalTime endTime = LocalTime.of(16, 17, 45, 99999);
		Duration dura1 = Duration.between(endTime, startIime);
		long seconds = dura1.getSeconds();
		long absSecounds = Math.abs(seconds);
		int nano = dura1.getNano();
		/* 経過した時間 */
		System.out.println(String.format("%02d:%02d:%02d %09d", absSecounds / 3600,
				(absSecounds % 3600) / 60, absSecounds % 60, nano));

	}

}
