/**
 * 
 */
package com.yeehom.ecommerseminiprog.entity;

/**
 * @author Yeehom Foo
 * 分页对应实体类
 */
public class Page {

	/**
	 * 总条数
	 */
	private int totalNum;
	/**
	 * 当前第几页
	 */
	private int currentPage;
	/**
	 * 总页数
	 */
	private int totalPage;
	/**
	 * 每页显示条数
	 */
	private int pageNum = 5;
	/**
	 * 数据库中limit的参数，从第几条开始取
	 */
	private int dbIndex;
	/**
	 * 数据库中limit的参数，一共取多少条
	 */
	private int dbNum;
	
	/**
	 * 根据当前对象中属性值计算并设置相关属性值
	 */
	public void count() {
		// 计算总页数
		int totalPageTemp = this.totalNum / this.pageNum;
		int plus = (this.totalNum % this.pageNum) == 0 ? 0 : 1;
		totalPageTemp = totalPageTemp + plus;
		if (totalPageTemp <= 0) {
			totalPageTemp = 1;
		}
		this.totalPage = totalPageTemp;
		
		// 设置当前页数
		// 总页数小于当前页数，应将当前页数设置为总页数
		if (this.totalPage < this.currentPage) {
			this.currentPage = this.totalPage;
		}
		// 当前页数小于1设置为1
		if (this.currentPage < 1) {
			this.currentPage = 1;
		}
		
		// 设置limit的参数
		this.dbIndex = (this.currentPage - 1) * this.pageNum;
		this.dbNum = this.pageNum;
	}

	public int getTotalNum() {
		return totalNum;
	}

	public void setTotalNum(int totalNum) {
		this.totalNum = totalNum;
		count();
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getDbIndex() {
		return dbIndex;
	}

	public void setDbIndex(int dbIndex) {
		this.dbIndex = dbIndex;
	}

	public int getDbNum() {
		return dbNum;
	}

	public void setDbNum(int dbNum) {
		this.dbNum = dbNum;
	}
	
}
