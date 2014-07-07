package com.cmk.db.api.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Life2014
 * 
 */
public class TableDefine {
	/** ������ */
	private String tableCode;
	/** ������ */
	private String comment;

	/*** link attribute **/
	private List<Column> columnList = new ArrayList();

	/**
	 * @param tableCode
	 * @param comment
	 * @param columnList
	 */
	public TableDefine(String tableCode, String comment, List<Column> columnList) {
		this.tableCode = tableCode;
		this.comment = comment;
		this.columnList = columnList;
	}

	public String getTableCode() {
		return tableCode;
	}

	public String getComment() {
		return comment;
	}

	public List<Column> getColumnList() {
		return columnList;
	}
}
