/**
 *
 */
package com.shigeharu.date.format;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author shigeharu
 *
 */
public class TestDateTimeFormatter {
	private final static DateTimeFormatter TIME_FORMAT = DateTimeFormatter.ofPattern("HH:mm:ss n");
	private final static DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("yyyy/MM/dd");
	/**
	 *
	 * @param args
	 */
	public static void main(String[] args) throws InterruptedException {

		/** 過ごした時間計算(ナノ秒も計算) */
		/* 開始時刻 */
		LocalTime startIime = LocalTime.of(13, 18, 58, 2);
		System.out.println("開始時刻:" + startIime.format(TIME_FORMAT));
		/* 終了時刻 */
		LocalTime endTime = LocalTime.of(14, 18, 58, 1);
		System.out.println("終了時刻:" + endTime.format(TIME_FORMAT));
		Duration dura1 = Duration.between(startIime, endTime);
		long seconds = dura1.getSeconds();
		int nano = dura1.getNano();
		/* 経過した時間 */
		System.out.println(String.format("過去時刻:%02d:%02d:%02d %09d", seconds / 3600,
				(seconds % 3600) / 60, seconds % 60, nano));

		/** 過ごした日付計算 */
		LocalDate startDate = LocalDate.of(2017, 1, 28);
		LocalDate endDate = LocalDate.of(2017, 5, 15);
		Period period1 = Period.between(startDate, endDate);
		System.out.println("開始日付:" + startDate.format(DATE_FORMAT));
		System.out.println("終了日付:" + endDate.format(DATE_FORMAT));
		System.out.println("過去日付:" + period1.getDays());

	}

}
