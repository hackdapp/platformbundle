package com.cmk.db.api;

import java.util.List;

import com.cmk.db.api.model.Column;
import com.cmk.db.api.model.Constraint;
import com.cmk.db.api.model.TableDefine;

/**
 * @author Life2014
 * 
 */
public interface DBServiceAPI {
	/**
	 * ************************************************************ <br>
	 * * 接口说明 * <br>
	 * ************************************************************ <br>
	 * 1.添加表<br>
	 * 
	 * 2.修改表<br>
	 * 
	 * 3.删除表<br>
	 * 
	 * 4.清空表数据<br>
	 * 
	 * 5.表在库存在?<br>
	 * 
	 * 6.查询表结构 <br>
	 */

	/**
	 * 创建表结构
	 * 
	 * @param tableCode
	 * @param comment
	 * @param constraint
	 * @param itemList
	 */
	void createTable(String tableCode, String comment, Constraint[] constraint,
			List<Column> itemList);

	/**
	 * 修改表注释
	 * 
	 * @param tableCode
	 * @param comment
	 */
	void commentTable(String tableCode, String comment);

	/**
	 * 删除表
	 * 
	 * @param tableCode
	 */
	void dropTable(String tableCode);

	/**
	 * 清空表数据
	 * 
	 * @param tableCode
	 */
	void truncateTable(String tableCode);

	/**
	 * 数据库中是否存在此表?
	 * 
	 * @param tableCode
	 * @return
	 */
	boolean hasTable(String tableCode);

	/**
	 * 查询表结构
	 * 
	 * @param tableCode
	 * @return
	 */
	TableDefine queryTable(String tableCode);

	/**
	 * --------------------------------------------------- <br>
	 * 1.创建视图<br>
	 * 
	 * 2.修改视图<br>
	 * 
	 * 3.删除视图<br>
	 * 
	 * 4.编译视图<br>
	 * 
	 * 5.视图在库存在? <br>
	 */
	/**
	 * 创建视图
	 * 
	 * @param viewCode
	 * @param sql
	 */
	void createView(String viewCode, String sql);

	/**
	 * 修改视图
	 * 
	 * @param viewCode
	 * @param sql
	 */
	void alterView(String viewCode, String sql);

	/**
	 * 删除视图
	 * 
	 * @param viewCode
	 */
	void dropView(String viewCode);

	/**
	 * 编译视图
	 * 
	 * @param viewCode
	 */
	void complieView(String viewCode);

	/**
	 * 视图在此库中是否存在?
	 * 
	 * @param viewCode
	 */
	void hasView(String viewCode);

	/**
	 * 查询视图定义
	 * 
	 * @param viewCode
	 * @return
	 */
	String queryView(String viewCode);

	/**
	 * --------------------------------------------------- <br>
	 * 1.添加字段<br>
	 * 
	 * 2.修改字段<br>
	 * 
	 * 3.删除字段<br>
	 * 
	 * 4.修改字段注释<br>
	 * 
	 * 5.修改字段名称<br>
	 * 
	 * 6.字段在表中存在？<br>
	 * 
	 * 7.查询字段结构 <br>
	 * 
	 * 8.查询表字段列表<br>
	 */
	/**
	 * 添加表字段
	 * 
	 * @param tableCode
	 * @param column
	 */
	void addColumn(String tableCode, Column... column);

	/**
	 * 修改表字段
	 * 
	 * @param tableCode
	 * @param column
	 */
	void alterColumn(String tableCode, Column column);

	/**
	 * 删除表字段
	 * 
	 * @param tableCode
	 * @param columnCode
	 */
	void dropColumn(String tableCode, String... columnCode);

	/**
	 * 修改表字段注释
	 * 
	 * @param tableCode
	 * @param columnCode
	 * @param comment
	 */
	void commentColumn(String tableCode, String columnCode, String comment);

	/**
	 * 重命名表字段编码
	 * 
	 * @param tableCode
	 * @param oldColumnCode
	 * @param newColumnCode
	 */
	void reNameColumn(String tableCode, String oldColumnCode,
			String newColumnCode);

	/**
	 * 表字段在表中是否存在?
	 * 
	 * @param tableCode
	 * @param columnCode
	 * @return
	 */
	boolean hasColumn(String tableCode, String columnCode);

	/**
	 * 查询表字段定义
	 * 
	 * @param tableCode
	 * @param columnCode
	 * @return
	 */
	Column queryColumn(String tableCode, String columnCode);

	/**
	 * 查询表字段列表
	 * 
	 * @param tableCode
	 * @return
	 */
	List<Column> queryColumns(String tableCode);

	/**
	 * -------------------------------------------------- <br>
	 * 1.添加约束条件<br>
	 * 
	 * 2.修改约束条件<br>
	 * 
	 * 3.删除约束条件 <br>
	 * 
	 * 4.查询约束条件<br>
	 * 
	 * 5.查询约束条件列表<br>
	 * -------------------------------------------------- <br>
	 */
	/**
	 * 添加约束条件
	 * 
	 * @param tableCode
	 *            表编码
	 * @param constraint
	 *            约束条件名称
	 * @see
	 */
	void addConstraint(String tableCode, Constraint... constraint);

	/**
	 * 修改约束条件
	 * 
	 * @param tableCode
	 * @param constraintCode
	 * @param constraint
	 */
	void alterConstraint(String tableCode, String constraintCode,
			Constraint constraint);

	/**
	 * 删除约束条件
	 * 
	 * @param tableCode
	 *            表编码
	 * @param constraintName
	 *            约束条件
	 * @see
	 */
	void dropConstraint(String tableCode, String constraintCode);

	/**
	 * 查询约束条件
	 * 
	 * @param tableCode
	 * @param constraintCode
	 * @return
	 */
	Constraint queryConstraint(String tableCode, String constraintCode);

	/**
	 * 查询约束条件列表
	 * 
	 * @param tableCode
	 *            表编码
	 * @return TODO
	 * @see
	 */
	Constraint[] queryConstraint(String tableCode);

}
