package org.hueki.samples;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SampleLauncher {

	/** ロガー */
	private static final Logger LOGGER = LoggerFactory.getLogger(SampleLauncher.class);

	/**
	 * <p>
	 * 起動メソッドです.
	 * </p>
	 *
	 * @param args 起動引数
	 */
	public static final void main(final String... args) {
		LOGGER.info("サンプルアプリケーションを開始します.");
		LOGGER.info("Java Version: " + System.getProperty("java.version") + " / " + System.getProperty("java.vm.version"));
		LOGGER.info("Java VM Name: " + System.getProperty("java.vm.name"));
		LOGGER.info("OS Name: " + System.getProperty("os.name"));
		LOGGER.info("OS Arch: " + System.getProperty("os.arch"));

		final SampleLauncher launcher = new SampleLauncher();
		launcher.launch();
	}

	private final void launch() {
	}
}
