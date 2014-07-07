package com.cmk.db.api;

/**
 * @author Life2014
 * 
 */
public interface DATAServiceAPI {
	/**
	 * ------------------------------------------<br>
	 * 1.��ѯ�б�����<br>
	 * 2.��ѯ��������<br>
	 * 3.ͳ���б�����<br>
	 */
	/**
	 * ��ѯ�б�����
	 * 
	 * @param datasource
	 * @param sql
	 */
	void query(String datasource, String sql);

	/**
	 * ��ѯ��������<
	 * 
	 * @param datasource
	 * @param sql
	 */
	void queryOne(String datasource, String sql);

	/**
	 * ͳ���б�����
	 * 
	 * @param datasource
	 * @param sql
	 */
	void count(String datasource, String sql);

	/**
	 * ------------------------------------------<br>
	 * 1.ִ�е���SQL<br>
	 * 2.ִ�ж���SQL<br>
	 * 3.ִ��Ԥ����SQL<br>
	 */
	void execute(String datasource, String sql);

	/**
	 * @param datasource
	 * @param sql
	 */
	void execute(String datasource, String... sql);

	/**
	 * @param datasource
	 * @param sql
	 * @param placeValue
	 */
	void execute(String datasource, String sql, Object[] placeValue);
}
