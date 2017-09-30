package com.parkspace.util;

public class Constants {
	/**
	 * 错误码.
	 * @author lidongliang
	 *
	 */
	public enum ERRORCODE {
		/** 手机号被占用 **/
		TELEPHONE_IS_EXISTS(10001);
		/** 错误码 **/
		private int value;

		public int getValue() {
			return value;
		}
		private ERRORCODE(int val) {
            this.value = val;
        }
		@Override
		public String toString() {
			return String.valueOf(this.value);
		}
	}
	
}