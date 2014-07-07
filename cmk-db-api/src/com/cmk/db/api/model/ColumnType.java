package com.cmk.db.api.model;

/**
 * @author Life2014
 * 
 */
public class ColumnType {
	enum Type {
		/**
		 * �ַ�������<br>
		 */
		String, /**
		 * ��������<br>
		 */
		Number, /**
		 * ��������<br>
		 */
		Date, /**
		 * ���ı�����<br>
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
