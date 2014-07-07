package com.cmk.db.api.model;

import com.cmk.db.api.model.ColumnType.Type;

/**
 * @author Life2014
 * 
 */
public class Column {
	/**
	 * 
	 */
	private String columnCode;
	/**
	 * 
	 */
	private ColumnType columnType;
	/**
	 * 是否可以为null<br>
	 */
	private boolean isNullAble;

	/**
	 * 缺省值<br>
	 */
	private String defaultValue;

	/**
	 * 注释<br>
	 */
	private String comment;

	public Column(String columnCode, Type type, int length, boolean isNullAble,
			String defaultValue, String comment) {
		this(columnCode, type, length, 0, isNullAble, defaultValue, comment);
	}

	public Column(String columnCode, Type type, int length, int dec,
			boolean isNullAble, String defaultValue, String comment) {
		this.columnCode = columnCode;
		this.columnType = new ColumnType(type, length, dec);
		this.isNullAble = isNullAble;
		this.defaultValue = defaultValue;
		this.comment = comment;
	}

	public String getColumnCode() {
		return columnCode;
	}

	public ColumnType getColumnType() {
		return columnType;
	}

	public boolean isNullAble() {
		return isNullAble;
	}

	public String getDefaultValue() {
		return defaultValue;
	}

	public String getComment() {
		return comment;
	}
}
