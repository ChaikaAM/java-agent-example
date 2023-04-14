package com.dzone;

import java.lang.instrument.Instrumentation;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public final class JavaAgent {

	public static void premain(String args, Instrumentation inst){
		Executors.newSingleThreadExecutor().submit(()->{
			while (true) {
				try {
					TimeUnit.SECONDS.sleep(1L);
				} catch (InterruptedException e) {
					throw new RuntimeException(e);
				}
				System.out.println("lol");
			}
		});
	}

}
