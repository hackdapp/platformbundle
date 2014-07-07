package com.cmk.db.api.model;

/**
 * @author Life2014
 * 
 */
public class ColumnType {
	enum Type {
		/**
		 * 字符串类型<br>
		 */
		String, /**
		 * 数字类型<br>
		 */
		Number, /**
		 * 日期类型<br>
		 */
		Date, /**
		 * 长文本类型<br>
		 */
		Long;
	}

	private Type type;
	private int length;
	private int dec;

	public ColumnType(Type type, int length) {
		this(type, length, 0);
	}

	public ColumnType(Type type, int length, int dec) {
		this.type = type;
		this.length = length;
		this.dec = dec;
	}

	public Type getType() {
		return type;
	}

	public int getLength() {
		return length;
	}

	public int getDec() {
		return dec;
	}
}
